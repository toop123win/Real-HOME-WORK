package com.example.real_home_work.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.real_home_work.ListAdapter;
import com.example.real_home_work.R;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    private ListView listView;
    private ListAdapter listAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sconed_page);
        listView = findViewById(R.id.first_list);

        List<String> data = new ArrayList<>();
    
        data.add("星期一");
        data.add("星期二");
        data.add("星期三");
        data.add("星期四");
        data.add("星期五");
        data.add("星期六");
        data.add("星期天");

        listAdapter = new ListAdapter(SecondActivity.this,data);
        listView.setAdapter(listAdapter);
    }
}














            /*隐式跳转外部浏览器
                Intent intent1 = new Intent("android.intent.action.VIEW");
                intent1.setData(Uri.parse("https://www.baidu.com"));
                startActivity(intent1);*/

                /*隐式跳转电话
                Intent intent2 = new Intent("android.intent.action.DIAL");
                intent2.setData(Uri.parse("tel:15954221227"));
                startActivity(intent2);*/
