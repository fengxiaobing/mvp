package com.esite.mvp.mvp.model;


import java.io.Serializable;

/**

/**
 * Created by RF
 * on 2016/12/23.
 * 实体的基类
 */
public class HttpResult<T> implements Serializable {

//    public int count;
//    public int start;
//    public String title;
//    public int total;
//    public T subjects;

        public boolean status;
    public T weather;


}
