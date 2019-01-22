package com.example.androidtest17.model;

import com.example.androidtest17.back.MyCallBack;

import java.util.Map;

/**
 * <p>苏青青：<p>
 * <p>作者：${lvf}<p>
 * <p>创建时间：${2018}${12}$<p>
 * <p>更改时间：2019/1/158:56<p>
 * <p>版本号：1<p>
 */
public interface Model {
    void RequestData(String url, Map<String,String> map, Class cla, MyCallBack myCallBack);
}
