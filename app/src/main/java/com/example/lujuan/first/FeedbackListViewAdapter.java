package com.example.lujuan.first;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lujuan on 2017/2/28.
 */

public class FeedbackListViewAdapter extends ArrayAdapter<FeedbackListItem>{
    private int resourceId;
    public FeedbackListViewAdapter(Context context, int textViewResourceId, List<FeedbackListItem> objects){
        //这里的三个参数的含义分别为：context表示当前所在的上下文环境中，textViewResourceId 表示没一个lIst中的item使用的布局，就是一个个下的布局，
        //objects就是我们的ListView中所使用相关信息的集合使用List进行存储
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        FeedbackListItem item = getItem(position);
        class ViewHolder{
            ImageView imageCompany;
            TextView companyName;
            TextView iterviewStage;
        }
        View v ;
        ViewHolder viewHolder;
        if(convertView == null){
            v = LayoutInflater.from(getContext()).inflate(resourceId, null);
            viewHolder = new ViewHolder();
            viewHolder.imageCompany = (ImageView)v.findViewById(R.id.imageCompany);
            viewHolder.companyName  = (TextView)v.findViewById(R.id.textViewCompanyName);
            viewHolder.iterviewStage = (TextView)v.findViewById(R.id.textViewInterviewStage);
            v.setTag(viewHolder);
        }else{
            v = convertView;
            viewHolder = (ViewHolder)v.getTag();
        }

        viewHolder.imageCompany.setImageResource(R.drawable.image);
        viewHolder.companyName.setText(item.getCompanyName());
        viewHolder.iterviewStage.setText(item.getInterviewStage());
        return v;
    }
}
