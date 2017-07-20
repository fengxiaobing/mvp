package com.esite.mvp.mvp.ui.activitys.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.esite.mvp.mvp.presenter.base.BasePresenter;



/**
 * Created by Eric on 2017/1/16.
 */
public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity {
    public Activity mActivity;

    protected T mPresenter;
    protected boolean mIsHasNavigationView;

    public abstract int getLayoutId();

    public abstract void initInjector();

    public abstract void initViews();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = this;

        int layoutId = getLayoutId();
        setContentView(layoutId);
        initInjector();

        if (mPresenter != null) {
            mPresenter.onCreate();
        }
        initViews();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (mPresenter != null) {
            mPresenter.onDestroy();
        }
    }
}
