package com.Test.model.DBmodel;

public class HelpFeedbackListWithBLOBs extends HelpFeedbackList {
    private String content;

    private String checkText;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCheckText() {
        return checkText;
    }

    public void setCheckText(String checkText) {
        this.checkText = checkText == null ? null : checkText.trim();
    }
}