package com.esite.mvp.mvp.ui.activitys;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.esite.mvp.R;
import com.esite.mvp.mvp.model.MovieBean;
import com.esite.mvp.mvp.presenter.impl.LoginPresenterImpl;
import com.esite.mvp.mvp.ui.activitys.base.BaseActivity;
import com.esite.mvp.mvp.view.LoginView;

import java.util.List;


public class Main2Activity extends BaseActivity implements LoginView {
    TextView textView;
    private LoginPresenterImpl loginPresenter;
    Button button;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initInjector() {
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.getNet();
            }
        });
    }

    @Override
    public void initViews() {
        loginPresenter = new LoginPresenterImpl(this, this);
        mPresenter = loginPresenter;
        mPresenter.attachView(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void showMsg(List<MovieBean> message) {
        String str = "";
        for (int i = 0; i < message.get(0).getFuture().size(); i++) {
            MovieBean movieBean = message.get(0);
            str += movieBean.getFuture().get(i).getDay() + ":   最低" + movieBean.getFuture().get(i).getLow() +
                    "---最高" + movieBean.getFuture().get(i).getHigh() + "   " + movieBean.getFuture().get(i).getText() + "\n";
        }
        textView.setText(str);
    }

    @Override
    public void showErrorMsg(String message) {
        Toast.makeText(mActivity, message, Toast.LENGTH_SHORT).show();
    }

}
