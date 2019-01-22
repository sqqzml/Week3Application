package com.example.androidtest17.back;

/**
 * <p>苏青青：<p>
 * <p>作者：${lvf}<p>
 * <p>创建时间：${2018}${12}$<p>
 * <p>更改时间：2019/1/158:57<p>
 * <p>版本号：1<p>
 */
public interface MyCallBack<T> {

    void Success(T data);
    void Error(T error);

}
