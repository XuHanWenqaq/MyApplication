package com.example.administrator.myapplication;

/**
 * Created by Administrator on 2019/11/20.
 */

public class DATA {

    /**
     * ResultObj : {"Unit":"℃","ApiTag":"z_temperature","Groups":1,"Protocol":2,"Name":"温度","CreateDate":"2019-11-20 13:38:15","TransType":0,"DataType":1,"TypeAttrs":"","DeviceID":60820,"SensorType":"temperature","Value":20,"RecordTime":"2019-11-20 15:25:22"}
     * Status : 0
     * StatusCode : 0
     * Msg : null
     * ErrorObj : null
     */

    private ResultObjBean ResultObj;
    private int Status;
    private int StatusCode;
    private Object Msg;
    private Object ErrorObj;

    public ResultObjBean getResultObj() {
        return ResultObj;
    }

    public void setResultObj(ResultObjBean ResultObj) {
        this.ResultObj = ResultObj;
    }

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

    public static class ResultObjBean {
        /**
         * Unit : ℃
         * ApiTag : z_temperature
         * Groups : 1
         * Protocol : 2
         * Name : 温度
         * CreateDate : 2019-11-20 13:38:15
         * TransType : 0
         * DataType : 1
         * TypeAttrs :
         * DeviceID : 60820
         * SensorType : temperature
         * Value : 20
         * RecordTime : 2019-11-20 15:25:22
         */

        private String Unit;
        private String ApiTag;
        private int Groups;
        private int Protocol;
        private String Name;
        private String CreateDate;
        private int TransType;
        private int DataType;
        private String TypeAttrs;
        private int DeviceID;
        private String SensorType;
        private String Value;
        private String RecordTime;

        public String getUnit() {
            return Unit;
        }

        public void setUnit(String Unit) {
            this.Unit = Unit;
        }

        public String getApiTag() {
            return ApiTag;
        }

        public void setApiTag(String ApiTag) {
            this.ApiTag = ApiTag;
        }

        public int getGroups() {
            return Groups;
        }

        public void setGroups(int Groups) {
            this.Groups = Groups;
        }

        public int getProtocol() {
            return Protocol;
        }

        public void setProtocol(int Protocol) {
            this.Protocol = Protocol;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getCreateDate() {
            return CreateDate;
        }

        public void setCreateDate(String CreateDate) {
            this.CreateDate = CreateDate;
        }

        public int getTransType() {
            return TransType;
        }

        public void setTransType(int TransType) {
            this.TransType = TransType;
        }

        public int getDataType() {
            return DataType;
        }

        public void setDataType(int DataType) {
            this.DataType = DataType;
        }

        public String getTypeAttrs() {
            return TypeAttrs;
        }

        public void setTypeAttrs(String TypeAttrs) {
            this.TypeAttrs = TypeAttrs;
        }

        public int getDeviceID() {
            return DeviceID;
        }

        public void setDeviceID(int DeviceID) {
            this.DeviceID = DeviceID;
        }

        public String getSensorType() {
            return SensorType;
        }

        public void setSensorType(String SensorType) {
            this.SensorType = SensorType;
        }

        public String getValue() {
            return Value;
        }

        public void setValue(String Value) {
            this.Value = Value;
        }

        public String getRecordTime() {
            return RecordTime;
        }

        public void setRecordTime(String RecordTime) {
            this.RecordTime = RecordTime;
        }
    }
}
