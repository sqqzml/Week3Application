package com.example.androidtest17.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.androidtest17.R;
import com.example.androidtest17.bean.Data;

import java.util.List;

/**
 * <p>苏青青：<p>
 * <p>作者：${lvf}<p>
 * <p>创建时间：${2018}${12}$<p>
 * <p>更改时间：2019/1/159:02<p>
 * <p>版本号：1<p>
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private Context context;
    private List<Data.DataBean> mdata;

    public MyAdapter(Context context, List<Data.DataBean> mdata) {
        this.context = context;
        this.mdata = mdata;
    }

    public void setMdata(List<Data.DataBean> mdata) {
        this.mdata = mdata;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View inflate = View.inflate(context, R.layout.item_list, null);
        MyViewHolder myViewHolder = new MyViewHolder(inflate);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.price.setText(mdata.get(i).getBargainPrice()+"");
        myViewHolder.title.setText(mdata.get(i).getTitle());
        String images = mdata.get(i).getImages();
        String[] split = images.split("\\|");
        String s = split[0];
        Glide.with(context).load(s).into(myViewHolder.img);
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private  ImageView img;
        private TextView title;
        private  TextView price;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
             img = itemView.findViewById(R.id.img);
             title = itemView.findViewById(R.id.title);
             price = itemView.findViewById(R.id.price);
        }
    }
}
