package com.hd.epac.util;

import java.util.List;

/**
 * @program: epac
 * @description: 通用返回实例
 * @author: Mr.Shi
 * @create: 2019-03-19 00:42
 **/
public class ResultUtil {
    private int code;
    private String msg;
    private List<?> list;
    private Object object;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
