package com.example.demo.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    private Integer code;//4000/2000
    private String msg;//成功/失败
    private T data;

    public static <T> Result<T> fail(){
        return new Result<>(4000,"失败",null);
    }

    public static <T> Result<T> fail(String msg){
        return new Result<>(4000,msg,null);
    }

    public static <T> Result<T> suc(){
        return new Result<>(2000,"成功",null);
    }

    public static <T> Result<T> suc(String msg){
        return new Result<>(2000,msg,null);
    }

    public static <T> Result<T> suc(T data){
        return new Result<>(2000,"成功",data);
    }

    public static <T> Result<T> suc(String msg,T data){
        return new Result<>(2000,msg,data);
    }



    private static Result result(int code,String msg,Object data){
        Result res = new Result();
        res.setData(data);
        res.setMsg(msg);
        res.setCode(code);

        return res;
    }

}
