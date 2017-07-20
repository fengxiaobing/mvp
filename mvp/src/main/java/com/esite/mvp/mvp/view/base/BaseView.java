package com.esite.mvp.mvp.view.base;

import com.esite.mvp.mvp.model.MovieBean;

import java.util.List;

/**
 * Created by Eric on 2017/1/16.
 */

public interface BaseView {

    void showMsg(List<MovieBean> message);
    void showErrorMsg(String message);
}
