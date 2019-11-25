package com.example.administrator.myapplication;

/**
 * Created by Administrator on 2019/11/20.
 */

public class LoginResult {

    /**
     * ResultObj : {"UserID":1,"UserName":"sample string 2","Email":"sample string 3","Telphone":"sample string 4","Gender":true,"CollegeID":6,"CollegeName":"sample string 7","RoleName":"sample string 8","RoleID":9,"AccessToken":"sample string 10","AccessTokenErrCode":11,"ReturnUrl":"sample string 12","DataToken":"sample string 13"}
     * Status : 0
     * StatusCode : 1
     * Msg : sample string 2
     * ErrorObj : {}
     */

    private ResultObjBean ResultObj;
    private int Status;
    private int StatusCode;
    private String Msg;
    private ErrorObjBean ErrorObj;

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

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    public ErrorObjBean getErrorObj() {
        return ErrorObj;
    }

    public void setErrorObj(ErrorObjBean ErrorObj) {
        this.ErrorObj = ErrorObj;
    }

    public static class ResultObjBean {
        /**
         * UserID : 1
         * UserName : sample string 2
         * Email : sample string 3
         * Telphone : sample string 4
         * Gender : true
         * CollegeID : 6
         * CollegeName : sample string 7
         * RoleName : sample string 8
         * RoleID : 9
         * AccessToken : sample string 10
         * AccessTokenErrCode : 11
         * ReturnUrl : sample string 12
         * DataToken : sample string 13
         */

        private int UserID;
        private String UserName;
        private String Email;
        private String Telphone;
        private boolean Gender;
        private int CollegeID;
        private String CollegeName;
        private String RoleName;
        private int RoleID;
        private String AccessToken;
        private int AccessTokenErrCode;
        private String ReturnUrl;
        private String DataToken;

        public int getUserID() {
            return UserID;
        }

        public void setUserID(int UserID) {
            this.UserID = UserID;
        }

        public String getUserName() {
            return UserName;
        }

        public void setUserName(String UserName) {
            this.UserName = UserName;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String Email) {
            this.Email = Email;
        }

        public String getTelphone() {
            return Telphone;
        }

        public void setTelphone(String Telphone) {
            this.Telphone = Telphone;
        }

        public boolean isGender() {
            return Gender;
        }

        public void setGender(boolean Gender) {
            this.Gender = Gender;
        }

        public int getCollegeID() {
            return CollegeID;
        }

        public void setCollegeID(int CollegeID) {
            this.CollegeID = CollegeID;
        }

        public String getCollegeName() {
            return CollegeName;
        }

        public void setCollegeName(String CollegeName) {
            this.CollegeName = CollegeName;
        }

        public String getRoleName() {
            return RoleName;
        }

        public void setRoleName(String RoleName) {
            this.RoleName = RoleName;
        }

        public int getRoleID() {
            return RoleID;
        }

        public void setRoleID(int RoleID) {
            this.RoleID = RoleID;
        }

        public String getAccessToken() {
            return AccessToken;
        }

        public void setAccessToken(String AccessToken) {
            this.AccessToken = AccessToken;
        }

        public int getAccessTokenErrCode() {
            return AccessTokenErrCode;
        }

        public void setAccessTokenErrCode(int AccessTokenErrCode) {
            this.AccessTokenErrCode = AccessTokenErrCode;
        }

        public String getReturnUrl() {
            return ReturnUrl;
        }

        public void setReturnUrl(String ReturnUrl) {
            this.ReturnUrl = ReturnUrl;
        }

        public String getDataToken() {
            return DataToken;
        }

        public void setDataToken(String DataToken) {
            this.DataToken = DataToken;
        }
    }

    public static class ErrorObjBean {
    }
}
