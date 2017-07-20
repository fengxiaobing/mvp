package com.esite.mvp.mvp.rx;/**
 * Created by RF
 * on 2017/7/3.
 */

/**
 * Created by RF 
 * on 2017/7/3.
 */
public interface CallBack<T> {
    void onSuccess(T t);

    void onFail(String message);
}
