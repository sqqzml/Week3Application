package com.example.androidtest17.presenter;

import com.example.androidtest17.back.MyCallBack;

import java.util.Map;

/**
 * <p>苏青青：<p>
 * <p>作者：${lvf}<p>
 * <p>创建时间：${2018}${12}$<p>
 * <p>更改时间：2019/1/159:00<p>
 * <p>版本号：1<p>
 */
public interface Presenter {

    void RequestData(String url, Map<String,String> map, Class cla);
}
