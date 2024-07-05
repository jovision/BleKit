package com.jovisionapp.blekit.ble.data;

import java.util.List;

public class BleWifiListWarp {


    private String method;
    private ParamDTO param;
    private ResultDTO result;
    private ErrorDTO error;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public ParamDTO getParam() {
        return param;
    }

    public void setParam(ParamDTO param) {
        this.param = param;
    }

    public ResultDTO getResult() {
        return result;
    }

    public void setResult(ResultDTO result) {
        this.result = result;
    }

    public ErrorDTO getError() {
        return error;
    }

    public void setError(ErrorDTO error) {
        this.error = error;
    }

    public static class ResultDTO {
        private int ct;
        private String vc;

        public int getCt() {
            return ct;
        }

        public void setCt(int ct) {
            this.ct = ct;
        }

        public String getVc() {
            return vc;
        }

        public void setVc(String vc) {
            this.vc = vc;
        }
    }

    public static class ParamDTO {
        private int result;

        public int getResult() {
            return result;
        }

        public void setApList(int result) {
            this.result = result;
        }

    }

    public static class ErrorDTO {
        private Integer errorcode;

        public Integer getErrorcode() {
            return errorcode;
        }

        public void setErrorcode(Integer errorcode) {
            this.errorcode = errorcode;
        }
    }
}
