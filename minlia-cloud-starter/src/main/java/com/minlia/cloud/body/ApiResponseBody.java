package com.minlia.cloud.body;

public  class ApiResponseBody<T> extends Response {

    public ApiResponseBody(){
        super();
    }

    public ApiResponseBody(Integer status, Integer code, String message,T payload){
        super(status,code,message,payload);
    }

}
