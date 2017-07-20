package com.esite.mvp.mvp.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

import com.esite.mvp.R;

import java.lang.ref.WeakReference;

/**

/**
 * Created by RF 
 * on 2016/12/23.
 */
public class SimpleLoadDialog extends Handler {

    private Dialog load = null;

    public static final int SHOW_PROGRESS_DIALOG = 1;
    public static final int DISMISS_PROGRESS_DIALOG = 2;

    private Context context;
    private boolean cancelable;
    private final WeakReference<Context> reference;

    public SimpleLoadDialog(Context context,
                            boolean cancelable) {
        super();
        this.reference = new WeakReference<Context>(context);
        this.cancelable = cancelable;
    }

    private void create(){
        if (load == null) {
            context  = reference.get();

            load = new Dialog(context, R.style.loadstyle);
            View dialogView = LayoutInflater.from(context).inflate(
                    R.layout.custom_sload_layout, null);
            load.setCanceledOnTouchOutside(false);
            load.setCancelable(cancelable);
            load.setContentView(dialogView);
            Window dialogWindow = load.getWindow();
            dialogWindow.setGravity(Gravity.CENTER_VERTICAL
                    | Gravity.CENTER_HORIZONTAL);
        }
        if (!load.isShowing()&&context!=null) {
            load.show();
        }
    }

    public void show(){
        create();
    }

public boolean inShowing(){
    return load.isShowing();
}
    public  void dismiss() {
        context  = reference.get();
        if (load != null&&load.isShowing()&&!((Activity) context).isFinishing()) {
            String name = Thread.currentThread().getName();
            load.dismiss();
            load = null;
        }
    }

    @Override
    public void handleMessage(Message msg) {
        switch (msg.what) {
            case SHOW_PROGRESS_DIALOG:
                create();
                break;
            case DISMISS_PROGRESS_DIALOG:
                dismiss();
                break;
        }
    }
}
