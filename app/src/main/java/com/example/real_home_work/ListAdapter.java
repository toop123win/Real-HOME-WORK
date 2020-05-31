package com.example.real_home_work;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.real_home_work.activity.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends BaseAdapter {
    //上下文,设置数据来源
    private Context context;
    private List<String> myData = new ArrayList<>();

    public ListAdapter(Context context, List<String> data ) {
        this.context = context;
        this.myData = data;
    }

    @Override
    //数据的和,判断大小
    public int getCount() {
        return myData.size();
    }

    @Override
    //返回的集合的哪条
    public Object getItem(int position) {
        return myData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        ViewHolder viewHolder;
        if(convertView == null){
            view = LayoutInflater.from(context).inflate(R.layout.first_list_itrm,null);
            viewHolder = new ViewHolder();
            viewHolder.textView = view.findViewById(R.id.text_item);
            view.setTag(viewHolder);
        }else{
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }
        String str = myData.get(position);
        viewHolder.textView.setText(str);

        return view;
    }
    //如果加载后就不用加载了
    class ViewHolder{
        TextView textView;

    }
}
