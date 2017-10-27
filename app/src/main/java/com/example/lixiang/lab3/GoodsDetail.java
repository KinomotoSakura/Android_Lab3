package com.example.lixiang.lab3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

public class GoodsDetail extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_list);

        LinearLayout sec=(LinearLayout)findViewById(R.id.shop_cart);
        sec.setVisibility(View.INVISIBLE);
        FloatingActionButton flt=(FloatingActionButton)findViewById(R.id.switch_button);
        flt.setVisibility(View.INVISIBLE);
        Intent intent=getIntent();

        final String ShowName=intent.getStringExtra("Name");
        final String Price=intent.getStringExtra("Price");
        final String info=intent.getStringExtra("Info");

        DetailAdapter mAdapter;
        mRecyclerView = (RecyclerView) findViewById(R.id.shop_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter = new DetailAdapter(ShowName,Price,info,GoodsDetail.this,GoodsDetail.this));

    }
}
