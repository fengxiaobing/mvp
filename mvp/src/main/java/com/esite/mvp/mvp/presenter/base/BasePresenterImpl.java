package com.esite.mvp.mvp.presenter.base;

import android.support.annotation.NonNull;

import com.esite.mvp.mvp.view.base.BaseView;
import com.lzy.okgo.OkGo;


/**
 * Created by Eric on 2017/1/17.
 */
public class BasePresenterImpl<T extends BaseView> implements BasePresenter {
    protected T mView;

    @Override
    public void onCreate() {

    }



    @Override
    public void attachView(@NonNull BaseView view) {
        mView = (T) view;
    }

    @Override
    public void onDestroy() {
        //根据 Tag 取消网络请求
        OkGo.getInstance().cancelTag(this);
    }




}
