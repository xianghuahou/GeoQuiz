package com.example.administrator.geoquiz;

/**
 * Created by Administrator on 2016/5/22 0022.
 */
public class TrueFalse {
    private boolean mTrueQustion;
    private int mQustion;

    public TrueFalse(int qustion, boolean truequstion) {
        this.mTrueQustion = truequstion;
        this.mQustion = qustion;

    }

    public int getmQustion() {
        return mQustion;
    }

    public void setmQustion(int mQustion) {
        this.mQustion = mQustion;
    }


    public boolean ismTrueQustion() {
        return mTrueQustion;
    }

    public void setmTrueQustion(boolean mTrueQustion) {
        this.mTrueQustion = mTrueQustion;
    }


}

