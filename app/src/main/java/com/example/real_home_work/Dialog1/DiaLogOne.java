package com.example.real_home_work.Dialog1;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.real_home_work.MainActivity;
import com.example.real_home_work.R;
import com.example.real_home_work.activity.FirstActivity;
import com.example.real_home_work.activity.SecondActivity;

public class DiaLogOne extends Dialog {
    private final String dialogTitle;
    private final String dialogMessage;
    private TextView tDot;
    private Button bDOcen;
    private Button bDOcon;
    private TextView tDom;
    private Intent intent;

    //继承Dialog实现的方法|添加参数:String dialogTitle;String dialogMessage
    public DiaLogOne(@NonNull Context context, String dialogTitle, String dialogMessage) {
        super(context);
        //实现构造方法
        this.dialogTitle=dialogTitle;
        this.dialogMessage=dialogMessage;
    }
    //复写onCreat方法
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //引入布局文件
        setContentView(R.layout.dialog_1);
        //初始化
        iniView();
        //设置按钮的点击事件
        initLinstener();
        //设置控件显示的内容
        tDot.setText(dialogTitle);
        tDom.setText(dialogMessage);
    }
    /**
     * 事件按钮监听
     */
    private void initLinstener() {
        //确定按钮-多余代码
        bDOcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //确定按钮的点击事件
                dismiss();
                }
        });
        //取消按钮
        bDOcen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //取消按钮的点击事件
                dismiss();
            }
        });
    }

    private void iniView() {
        tDom =(TextView)findViewById(R.id.tv_DO_message);
        tDot =(TextView)findViewById(R.id.tv_DO_title);
        bDOcen =(Button)findViewById(R.id.btn_DO_cancel);
        bDOcon =(Button)findViewById(R.id.btn_DO_confirm);
    }
}
