package com.example.lujuan.first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by lujuan on 2017/2/28.
 * 提供对已经创建的面试反馈记录的信息的浏览
 */
public class FeedbackView extends BaseActivity {
    private ListView feedbackListView;
    private List<FeedbackListItem> feedbackList= new ArrayList<FeedbackListItem>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback_view);
        initFeedbackList();
        initView();
        FeedbackListViewAdapter feedbackListViewAdapter = new FeedbackListViewAdapter(FeedbackView.this, R.layout.feeback_listitem, feedbackList);
        feedbackListView.setAdapter(feedbackListViewAdapter);
        feedbackListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FeedbackListItem item = feedbackList.get(position);
                // TODO: 需要编写完整的面试结果反馈页面
                Intent i = new Intent(FeedbackView.this, FeedbackPage.class);
                startActivity(i);
            }
        });
    }
    private void initView(){
        feedbackListView = (ListView)findViewById(R.id.feedbackListView);
    }
    private void initFeedbackList(){
        FeedbackListItem a = new FeedbackListItem("阿里巴巴", "一面");
        feedbackList.add(a);
        FeedbackListItem b = new FeedbackListItem("阿里巴巴", "二面");
        feedbackList.add(b);
        FeedbackListItem c = new FeedbackListItem("阿里巴巴", "三面");
        feedbackList.add(c);

        FeedbackListItem d = new FeedbackListItem("大众点评", "一面");
        feedbackList.add(d);
        FeedbackListItem e = new FeedbackListItem("大众点评", "二面");
        feedbackList.add(e);
        FeedbackListItem f = new FeedbackListItem("大众点评", "三面");
        feedbackList.add(f);

        FeedbackListItem g = new FeedbackListItem("腾讯", "一面");
        feedbackList.add(g);
        FeedbackListItem h = new FeedbackListItem("腾讯", "二面");
        feedbackList.add(h);
        FeedbackListItem i = new FeedbackListItem("腾讯", "三面");
        feedbackList.add(i);
    }
}
