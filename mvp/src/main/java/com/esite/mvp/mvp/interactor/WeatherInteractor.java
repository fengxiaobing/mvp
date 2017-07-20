package com.esite.mvp.mvp.interactor;

import android.app.Activity;
import android.util.Log;

import com.esite.mvp.callback.NewsCallback;
import com.esite.mvp.http.Url;
import com.esite.mvp.mvp.model.HttpResult;
import com.esite.mvp.mvp.model.MovieBean;
import com.esite.mvp.mvp.rx.CallBack;
import com.esite.mvp.utils.Utils;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.model.Response;

import java.util.List;

/**
 * Created by SSH on 2017/7/2.
 */

public class WeatherInteractor {
    private boolean isInitCache = false;
    private Activity mActvity;

    public WeatherInteractor(Activity mActvity) {
        this.mActvity = mActvity;
    }

    /**
     * 请求网络获取天气信息
     **/
//    public void getWeather(final WeatherCallback weatherCallBack) {
    public void getWeather(final CallBack<List<MovieBean>> weatherCallBack) {
        OkGo.<HttpResult<List<MovieBean>>>get(Url.BASE_URL + "all?city=" + "CHBJ000600")//
                .tag(this)
                .cacheKey("WeatherInteractor")       //由于该fragment会被复用,必须保证key唯一,否则数据会发生覆盖
                .cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)  //缓存模式先使用缓存,然后使用网络数据
                .execute(new NewsCallback<HttpResult<List<MovieBean>>>(mActvity) {

                    @Override
                    public void onSuccess(Response<HttpResult<List<MovieBean>>> response) {
                        super.onSuccess(response);
                        List<MovieBean> movieBeen = response.body().weather;
                        weatherCallBack.onSuccess(movieBeen);
                    }

                    @Override
                    public void onError(Response<HttpResult<List<MovieBean>>> response) {
                        if (!Utils.isNetworkAvailable(mActvity) && !Utils.isWiFiActive(mActvity)) {
                            weatherCallBack.onFail("没有可用网络");
                            return;
                        }
                        weatherCallBack.onFail(response.getException().getMessage());
                    }

                    @Override
                    public void onCacheSuccess(Response<HttpResult<List<MovieBean>>> response) {
                        //一般来说,只需呀第一次初始化界面的时候需要使用缓存刷新界面,以后不需要,所以用一个变量标识
                        if (!isInitCache) {
                            //一般来说,缓存回调成功和网络回调成功做的事情是一样的,所以这里直接回调onSuccess
                            onSuccess(response);
                            isInitCache = true;
                        }
                    }

                    @Override
                    public void onFinish() {
                        super.onFinish();
                        Log.e("", "");
                    }
                });
    }
}
