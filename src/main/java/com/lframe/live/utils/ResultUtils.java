package com.lframe.live.utils;

import com.lframe.live.domain.Result;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于规范结果，你可以自定义很多种返回的结果类型，然后在控制器中调用。
 *
 * @author home-pc
 * @create2018 -02 -05 -7:30
 */
public class ResultUtils {

    public static Result success(Object object){
        Result result=new Result();
        result.setMeg("成功");
        result.setCode(200);
        List<Object> list=new ArrayList<>();
        list.add(object);
        result.setData(list);
        return result;
    }
    public static Result success(Object object,Object object1){
        Result result=new Result();
        result.setCode(200);
        result.setMeg("成功");
        List<Object> objects=new ArrayList<>();
        objects.add(object);
        objects.add(object1);
        result.setData(objects);
        return result;
    }
}
