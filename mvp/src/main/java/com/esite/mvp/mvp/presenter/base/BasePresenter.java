package com.esite.mvp.mvp.presenter.base;

import android.support.annotation.NonNull;

import com.esite.mvp.mvp.view.base.BaseView;


public interface BasePresenter {
//    void onResume();

    void onCreate();

    void attachView(@NonNull BaseView view);

    void onDestroy();

}
