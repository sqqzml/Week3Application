package com.example.androidtest17;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.androidtest17.adapter.MyAdapter;
import com.example.androidtest17.bean.Data;
import com.example.androidtest17.contacts.Contacts;
import com.example.androidtest17.presenter.MyPresenter;
import com.example.androidtest17.vew.MyView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity<T> extends AppCompatActivity implements MyView<T> {

    @BindView(R.id.recy)
    RecyclerView recy;
    private List<Data.DataBean> Mdata=new ArrayList<>();
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        MyPresenter myPresenter = new MyPresenter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recy.setLayoutManager(linearLayoutManager);

        myAdapter = new MyAdapter(this, Mdata);
        recy.setAdapter(myAdapter);

        HashMap<String, String> map = new HashMap<>();
        map.put("keywords","笔记本");
        map.put("page",1+"");
        myPresenter.RequestData(Contacts.SHOW_URL,map,Data.class);

    }

    @Override
    public void Success(T data) {
        if (data instanceof Data){
           Data data1 = (Data) data;
           Mdata.addAll(data1.getData());
           myAdapter.setMdata(Mdata);
        }
    }

    @Override
    public void Error(T error) {

    }
}
