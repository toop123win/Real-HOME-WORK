package com.example.real_home_work.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import com.example.real_home_work.R;
//构建一个所有activity的父类,baseactivity
public abstract class BaseActivity extends FragmentActivity {
    private LinearLayout llbase;
    private TextView titleTv,messageTv;
    private ImageView backImage,qrImage;
    private View contentView;
    private String title;
    private Context context;

    //如果需要更改title的值的话
    public void setTitle(String title){
        this.title = title;
        if(titleTv != null){
            titleTv.setText(title);
        }
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_activity_page);
        context = this;
        llbase = this.findViewById(R.id.ll_base);
        titleTv = findViewById(R.id.title);
        backImage = findViewById(R.id.back_img);
        qrImage = findViewById(R.id.qr_image);
        initview();
        //点击扫一扫
        qrImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //弹出对话框
                Toast.makeText(context, R.string.bit_qr,Toast.LENGTH_SHORT).show();
            }
        });
        //点击返回键
        backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //弹出对话框
                Toast.makeText(context, R.string.bit_back,Toast.LENGTH_SHORT).show();
            }
        });
    }
    //让LinearLayout的数据传给contentView
    protected void contentView(int layoutId){
        contentView = getLayoutInflater().inflate(layoutId, null);
        if(contentView != null){
            llbase.addView(contentView);
        }
    }
    //创建函数,继承此类后不需初始化
    public abstract void initview();


}
