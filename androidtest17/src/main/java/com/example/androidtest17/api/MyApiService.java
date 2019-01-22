package com.example.androidtest17.api;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;
import rx.Observable;

/**
 * <p>苏青青：<p>
 * <p>作者：${lvf}<p>
 * <p>创建时间：${2018}${12}$<p>
 * <p>更改时间：2019/1/158:52<p>
 * <p>版本号：1<p>
 */
public interface MyApiService {

    @GET
    Observable<ResponseBody> get(@Url String url, @QueryMap Map<String,String> map);
}
