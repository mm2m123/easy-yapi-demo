package com.example.demo.Result;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ResultUtil
 * @Description
 * @Date 2019-10-27 10:56
 **/
public class ResultUtil {

    public static Result success(Object object, String msg) {
        Result result = new Result();
        result.setCode(0);
        if (msg == null) {
            result.setMsg("成功");
        }else {
            result.setMsg(msg);
        }
        result.setData(object);
        return result;
    }

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success(String msg) {
        Result result = new Result();
        List<Integer> list = new ArrayList<Integer>();
        result.setCode(0);
        result.setMsg(msg);
        result.setData(list);
        return result;
    }

    public static Result success() {
        Result result = new Result();
        List<Integer> list = new ArrayList<Integer>();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(list);
        return result;
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        List<Integer> list = new ArrayList<Integer>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(list);
        return result;
    }

    public static Result error(String msg) {
        Result result = new Result();
        List<Integer> list = new ArrayList<Integer>();
        result.setCode(1);
        result.setMsg(msg);
        result.setData(list);
        return result;
    }

    public static Result error() {
        Result result = new Result();
        List<Integer> list = new ArrayList<Integer>();
        result.setCode(1);
        result.setMsg("error");
        result.setData(list);
        return result;
    }
}
