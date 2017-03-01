package com.example.lujuan.first;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
/**
 * Created by lujuan on 2017/2/22.
 */

public class MainActivity extends BaseActivity implements OnClickListener{

    public static final String EXTRA_MESSAGE = "message";
    private Button feedbackButton;
    private EditText edittextCompanyName;
    private EditText edittextInterviewStage;
    private Button feedbackView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView(){
        feedbackButton = (Button)findViewById(R.id.interviewFeedback);
        feedbackButton.setOnClickListener(this);
        edittextCompanyName = (EditText)findViewById(R.id.companyNameInput);
        edittextInterviewStage = (EditText)findViewById(R.id.interviewStageInput);
        feedbackView = (Button) findViewById(R.id.feedbackView);
        feedbackView.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.interviewFeedback:
                if(edittextCompanyName.getText().length() == 0 || edittextInterviewStage.getText().length() == 0){
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("提示信息：");
                    dialog.setMessage("请输入公司和面试阶段信息！");
                    dialog.setCancelable(false);
                    dialog.setPositiveButton("确认", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog, int which){

                        }
                    });
                    dialog.setNegativeButton("取消", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog, int which){

                        }
                    });
                    dialog.show();
                }else{
                    //TODO:需要添加网络功能，向服务器提交请求创建反馈问卷
                    Intent i = new Intent(MainActivity.this, FeedbackInputPage.class);
                    startActivity(i);
                }
                break;
            case R.id.feedbackView:
                Intent i = new Intent(MainActivity.this, FeedbackView.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.menu_main_item1:
                Toast.makeText(MainActivity.this, "hello 1!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_main_item2:
                Toast.makeText(MainActivity.this, "hello 2", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return true;
    }
}
