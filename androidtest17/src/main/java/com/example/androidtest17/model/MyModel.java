package com.example.androidtest17.model;

import com.example.androidtest17.back.MyCallBack;
import com.example.androidtest17.bean.Data;
import com.example.androidtest17.utils.RetrofitUtils;
import com.google.gson.Gson;

import java.util.Map;

/**
 * <p>苏青青：<p>
 * <p>作者：${lvf}<p>
 * <p>创建时间：${2018}${12}$<p>
 * <p>更改时间：2019/1/158:59<p>
 * <p>版本号：1<p>
 */
public class MyModel implements Model {
    @Override
    public void RequestData(String url, Map<String, String> map, Class cla, final MyCallBack myCallBack) {
        RetrofitUtils.getInstance().get(url,map,cla, new RetrofitUtils.HttpListener() {
            @Override
            public void onSuccess(String jsonStr) {
                Gson gson = new Gson();
                Data data = gson.fromJson(jsonStr, Data.class);
                myCallBack.Success(data);
            }

            @Override
            public void onError(String error) {

            }
        });
    }
}
