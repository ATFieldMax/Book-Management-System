package com.example.controller.utils;

import lombok.Data;

@Data
public class R {
    private Boolean flag;
    private Object data;
    private String msg;

    public R(){}

    public R(boolean flag){
        this.flag=flag;
    }

    public R(boolean flag,Object data){
        this.flag=flag;
        this.data=data;
    }

    public R(String msg){
        this.flag=false;
        this.msg=msg;
    }
}
