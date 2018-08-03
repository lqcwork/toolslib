package com.amj.mylib;

import android.text.TextUtils;
import android.util.Log;

/**
 * Created by LiuQiCong
 * date 2018-08-02 13:58
 * version 1.0
 * dsc 描述
 */
public class MyLog {

    private static final String TAG="MyLog";


    public static final void e(String str){
        if(!TextUtils.isEmpty(str)){
            Log.e(TAG,str);
        }
    }


}
