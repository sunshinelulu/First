package com.example.lujuan.first;

/**
 * Created by lujuan on 2017/2/28.
 */

public class FeedbackListItem {
    //TODO:需要添加完善的信息，包括问卷在数据库中的存储id
    private String companyName;
    private String interviewStage;
    public FeedbackListItem(String companyNameInput, String interviewStageInput){
        this.companyName = companyNameInput;
        this.interviewStage = interviewStageInput;
    }
    public String getCompanyName(){
        return companyName;
    }
    public String getInterviewStage(){
        return interviewStage;
    }

}
