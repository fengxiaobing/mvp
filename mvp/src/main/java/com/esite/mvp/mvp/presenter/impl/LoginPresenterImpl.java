package com.esite.mvp.mvp.presenter.impl;/**
 * Created by RF
 * on 2017/6/30.
 */

import android.app.Activity;

import com.esite.mvp.mvp.interactor.WeatherInteractor;
import com.esite.mvp.mvp.model.HttpResult;
import com.esite.mvp.mvp.model.MovieBean;
import com.esite.mvp.mvp.presenter.LoginPresenter;
import com.esite.mvp.mvp.presenter.base.BasePresenterImpl;
import com.esite.mvp.mvp.rx.CallBack;
import com.esite.mvp.mvp.view.LoginView;

import java.util.List;

public class LoginPresenterImpl extends BasePresenterImpl<LoginView> implements LoginPresenter {
    private HttpResult httpResult;
    private LoginView loginView;
    private Activity mActvity;
    private boolean isInitCache = false;

    public LoginPresenterImpl(Activity mActvity, LoginView loginView) {
        this.loginView = loginView;
        this.mActvity = mActvity;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void getNet() {
        new WeatherInteractor(mActvity).getWeather(new CallBack<List<MovieBean>>() {
            @Override
            public void onSuccess(List<MovieBean> movieBeen) {
                loginView.showMsg(movieBeen);
            }

            @Override
            public void onFail(String message) {
                loginView.showErrorMsg(message);
            }
        });
    }
}
