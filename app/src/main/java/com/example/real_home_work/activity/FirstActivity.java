package com.example.real_home_work.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.real_home_work.Dialog1.DiaLogOne;
import com.example.real_home_work.MainActivity;
import com.example.real_home_work.R;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener{
    private Button bm2,bm1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        initView();
    }

    private void initView() {
        bm1 = (Button)findViewById(R.id.btn_M_dialog1);
        bm2 = (Button)findViewById(R.id.btn_M_dialog2);
        //注册监听
        bm1.setOnClickListener(this);
        bm2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_M_dialog1:
                //确定后跳转|显示Toast
                //DiaLogOne diaLogOne=new DiaLogOne(this,"せかい","Hello World!");
                Toast toast=Toast.makeText(FirstActivity.this,"Toast提示消息",Toast.LENGTH_SHORT    );
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_M_dialog2:
                DiaLogOne diaLogOnes=new DiaLogOne(this,"ごきげんよう","你好世界");
                diaLogOnes.show();
                break;

        }
    }
}
