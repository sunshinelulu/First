package com.example.lujuan.first;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by lujuan on 2017/2/28.
 * 自定的标题样式
 */

public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context, AttributeSet attr){
        super(context, attr);
        LayoutInflater.from(context).inflate(R.layout.title, this);
        Button titleBack = (Button)findViewById(R.id.title_back);
        Button titleEdit = (Button)findViewById(R.id.title_edit);
        titleBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
        titleEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "you click the edit button!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
