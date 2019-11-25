package com.example.administrator.myapplication;

import java.util.List;

/**
 * Created by Administrator on 2019/11/20.
 */

public class Status {

    /**
     * ResultObj : [{"DeviceID":60820,"Name":"cloud","IsOnline":false,"LastOnlineIP":""}]
     * Status : 0
     * StatusCode : 0
     * Msg : null
     * ErrorObj : null
     */

    private int Status;
    private int StatusCode;
    private Object Msg;
    private Object ErrorObj;
    private List<ResultObjBean> ResultObj;

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public int getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(int StatusCode) {
        this.StatusCode = StatusCode;
    }

    public Object getMsg() {
        return Msg;
    }

    public void setMsg(Object Msg) {
        this.Msg = Msg;
    }

    public Object getErrorObj() {
        return ErrorObj;
    }

    public void setErrorObj(Object ErrorObj) {
        this.ErrorObj = ErrorObj;
    }

    public List<ResultObjBean> getResultObj() {
        return ResultObj;
    }

    public void setResultObj(List<ResultObjBean> ResultObj) {
        this.ResultObj = ResultObj;
    }

    public static class ResultObjBean {
        /**
         * DeviceID : 60820
         * Name : cloud
         * IsOnline : false
         * LastOnlineIP :
         */

        private int DeviceID;
        private String Name;
        private boolean IsOnline;
        private String LastOnlineIP;

        public int getDeviceID() {
            return DeviceID;
        }

        public void setDeviceID(int DeviceID) {
            this.DeviceID = DeviceID;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public boolean isIsOnline() {
            return IsOnline;
        }

        public void setIsOnline(boolean IsOnline) {
            this.IsOnline = IsOnline;
        }

        public String getLastOnlineIP() {
            return LastOnlineIP;
        }

        public void setLastOnlineIP(String LastOnlineIP) {
            this.LastOnlineIP = LastOnlineIP;
        }
    }
}
