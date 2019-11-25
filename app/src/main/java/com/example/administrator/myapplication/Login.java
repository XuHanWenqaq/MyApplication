package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Administrator on 2019/11/25.
 */



public class Login extends Activity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
        et_user = findViewById(R.id.et_user);
        et_pass = findViewById(R.id.et_pass);
    }
    EditText et_user,et_pass;
    String Token="";

    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            Gson gson =new Gson();
            super.handleMessage(msg);
            switch (msg.what) {
                case 1:
                    LoginResult loginResult=gson.fromJson(msg.obj.toString(),LoginResult.class);
                    LoginResult.ResultObjBean resultObjBean=loginResult.getResultObj();
                    Token=resultObjBean.getAccessToken();
                    Intent intent=new Intent();
                    intent.putExtra("Token",Token);
                    intent.setClass(Login.this,MainActivity.class);
                    startActivity(intent);
                    break;
                case 0:
                    //登录失败，通过Toast显示登录失败的原因
//                    Toast.makeText(MainActivity.this, (String) message.obj, Toast.LENGTH_SHORT).show();
                    break;

            }
        }
    };




    private void Login(final String zhang,final String mi){
        new Thread(new Runnable() {
            public void run() {
                HttpURLConnection connection = null;
                BufferedReader reader = null;
                try {
                    URL url = new URL("http://api.nlecloud.com/Users/Login");
                    connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("POST");
                    connection.setRequestProperty("connection", "Keep-Alive");
                    connection.setRequestProperty("Charset", "UFT-8");
                    connection.setRequestProperty("Content-Type", "application/json");
                    connection.setConnectTimeout(5000);
                    connection.setReadTimeout(5000);
                    OutputStream outputStream = connection.getOutputStream();


                    Gson gson =new Gson();
                    User userB=new User();

                    userB.setAccount(zhang);
                    userB.setPassword(mi);
                    userB.setRememberMe(false);


                    String body=gson.toJson(userB).toString();
                    outputStream.write(body.getBytes());
                    outputStream.flush();
                    outputStream.close();
                    if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                        reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
                        String result = reader.readLine();
                        Message msg = new Message();
                        msg.obj=result;
                        msg.what=1;
                        mHandler.sendMessage(msg);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }


    public void b1_click(View view)
    {
        String user = et_user.getText().toString();
        String pass = et_pass.getText().toString();
        Login(user,pass);
    }
}