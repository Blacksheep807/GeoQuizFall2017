package com.bignerdranch.android.geoquiz;

/**
 * Created by Jonas on 8/21/2017.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;


    public Question(int textResId, boolean answerTrue){

        mTextResId = textResId;

        mAnswerTrue = answerTrue;

    }

    public int getTextResId() {
        return mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

}
