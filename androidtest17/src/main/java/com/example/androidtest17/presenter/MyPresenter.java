package com.example.androidtest17.presenter;

import com.example.androidtest17.back.MyCallBack;
import com.example.androidtest17.model.MyModel;
import com.example.androidtest17.vew.MyView;

import java.util.Map;

/**
 * <p>苏青青：<p>
 * <p>作者：${lvf}<p>
 * <p>创建时间：${2018}${12}$<p>
 * <p>更改时间：2019/1/159:00<p>
 * <p>版本号：1<p>
 */
public class MyPresenter implements Presenter {
    private MyView myView;
    private MyModel myModel;

    public MyPresenter(MyView myView) {
        this.myView = myView;
        myModel=new MyModel();
    }

    @Override
    public void RequestData(String url, Map<String, String> map, Class cla) {
        myModel.RequestData(url, map, cla, new MyCallBack() {
            @Override
            public void Success(Object data) {
                myView.Success(data);
            }

            @Override
            public void Error(Object error) {

                myView.Error(error);
            }
        });

    }
}
