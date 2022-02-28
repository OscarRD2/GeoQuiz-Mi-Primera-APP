package com.androidpprog2.com.model;

public class Question {

    private int mTextResId;
    private boolean answer;

    public Question(int mTextResId, boolean answer) {
        this.mTextResId = mTextResId;
        this.answer = answer;
    }

    public int getmTextResId() {
        return mTextResId;
    }

    public void setmTextResId(int mTextResId) {
        this.mTextResId = mTextResId;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
}
