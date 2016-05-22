package com.example.administrator.geoquiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends Activity {
    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;
    private TextView mQuestionTextView;
    private TrueFalse[] mQustionBank=new TrueFalse[]{
            new TrueFalse(R.string.question_1,true),
            new TrueFalse(R.string.question_2,true),
            new TrueFalse(R.string.question_3,true),
            new TrueFalse(R.string.question_4,true),
            new TrueFalse(R.string.question_5,false),
            new TrueFalse(R.string.question_6,true),
    };
    private int mCurrentIndex=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mQuestionTextView=(TextView)this.findViewById(R.id.question_text_View);
        mTrueButton=(Button)this.findViewById(R.id.true_button);
        mFalseButton=(Button)this.findViewById(R.id.false_button);
        mNextButton=(Button)this.findViewById(R.id.next_button);
        mTrueButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                checkAnswer(true);


            }
        });
        mFalseButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                 checkAnswer(false);
            }
        });
        mNextButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mCurrentIndex=(mCurrentIndex+1)%mQustionBank.length;
                int question=mQustionBank[mCurrentIndex].getmQustion();
                mQuestionTextView.setText(question);
            }
        });
    }
    private void checkAnswer(boolean userPressedTrue){
        boolean answerIsTrue=mQustionBank[mCurrentIndex].ismTrueQustion();
        int messageResId = 0;
        if(userPressedTrue==answerIsTrue) messageResId=R.string.correct_toast;
        else messageResId=R.string.incorrect_toast;

        Toast.makeText(QuizActivity.this,messageResId,Toast.LENGTH_SHORT).show();

    }
}
