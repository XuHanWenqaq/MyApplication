package com.example.administrator.myapplication;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.spec.PSSParameterSpec;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2= (Button)findViewById(R.id.b2);
        button3=(Button)findViewById(R.id.b3);
        button4= (Button)findViewById(R.id.b4);
        button5= (Button)findViewById(R.id.b5);
        button6=(Button)findViewById(R.id.b6);
        button7=(Button)findViewById(R.id.b7);
        button8=(Button)findViewById(R.id.b8);
        button9=(Button)findViewById(R.id.b9);
        T1=(TextView)findViewById(R.id.t1);
        Intent intent=getIntent();
        Token=intent.getStringExtra("Token");
    }
    String Token="";

    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    TextView T1;

    List<String> Name=new ArrayList<String>();
    List<String> ApiTag=new ArrayList<String>();

    Handler handler=new Handler(){
        public void handleMessage(Message msg) {
            Gson gson=new Gson();
            switch (msg.what){
//
                case 2:
                    T1.setText("");
                    String data="";
                    //T1.setText(msg.obj.toString());
                    sensor Sensor=gson.fromJson(msg.obj.toString(),sensor.class);
                    List<sensor.ResultObjBean> list=Sensor.getResultObj();
                    for (int i = 0; i < list.size(); i++) {
                        Name.add(list.get(i).getName());
                        ApiTag.add(list.get(i).getApiTag());
                        data+=list.get(i).getName()+":"+list.get(i).getApiTag()+"\n";
                    }
                    T1.setText(data);
                    break;
                case 3:
                    Status status=gson.fromJson(msg.obj.toString(),Status.class);
                    List<Status.ResultObjBean> list1 = status.getResultObj();
                    if(list1.get(0).isIsOnline()){
                        T1.setText("在线");
                    }else {
                        T1.setText("不在线");
                    }
                    break;
                case 4:T1.setText(msg.obj.toString());
                    break;
                case 5:
                    DATA data1=gson.fromJson(msg.obj.toString(),DATA.class);
                    DATA.ResultObjBean resultObjBean =data1.getResultObj();
                    String name=resultObjBean.getName();
                    String va=resultObjBean.getValue();
                    T1.setText(name+":"+va);
                    break;
            }
        }
    };





    private void GET(final String Url, final int What){
        new Thread(new Runnable() {
            public void run() {
                HttpURLConnection connection = null;
                BufferedReader reader = null;
                try {
                    URL url = new URL(Url);
                    connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    connection.setConnectTimeout(5000);
                    connection.setReadTimeout(5000);
                    if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                        reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
                        String result = reader.readLine();
                        Message msg = new Message();
                        msg.obj=result;
                        msg.what=What;
                        handler.sendMessage(msg);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void POST(final String ApiTag, final String body){
        new Thread(new Runnable() {
            public void run() {
                HttpURLConnection connection = null;
                BufferedReader reader = null;
                try {
                    URL url = new URL("http://api.nlecloud.com/Cmds?deviceId=60828&apiTag="+ApiTag+"&AccessToken="+Token);
                    connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("POST");
                    connection.setRequestProperty("connection", "Keep-Alive");
                    connection.setRequestProperty("Charset", "UFT-8");
                    connection.setRequestProperty("Content-Type", "application/json");
                    connection.setConnectTimeout(5000);
                    connection.setReadTimeout(5000);
                    OutputStream outputStream = connection.getOutputStream();
                    //String body = "{\"Account\":\"18358243102\",\"Password\":\"132465798\",\"IsRememberMe\":false}";
                    outputStream.write(body.getBytes());
                    outputStream.flush();
                    outputStream.close();
                    if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                        reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
                        String result = reader.readLine();
                        Message msg = new Message();
                        msg.obj=result;
                        msg.what=4;
                        handler.sendMessage(msg);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }





    public void b2_click(View view)
    {
        GET("http://api.nlecloud.com/Projects/47497/Sensors?AccessToken="+Token,2);
        //Sensor();
    }

    public void b3_click(View view)
    {
        GET("http://api.nlecloud.com/Devices/Status?devIds=60828&AccessToken="+Token,3);
    }

    public void b4_click(View view)
    {
        POST("fen","1");
    }

    public void b5_click(View view)
    {
        POST("fen","0");
    }

    public void b6_click(View view)
    {
        POST("led","1");
    }

    public void b7_click(View view)
    {
        POST("led","0");
    }

    public void b8_click(View view)
    {
        GET("http://api.nlecloud.com/devices/60828/Sensors/z_temperature?AccessToken="+Token,5);
    }

    public void b9_click(View view)
    {
        GET("http://api.nlecloud.com/devices/60828/Sensors/z_humidity?AccessToken="+Token,5);
    }

}
