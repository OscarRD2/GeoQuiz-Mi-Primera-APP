package com.androidpprog2.com.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.androidpprog2.com.R;
import com.androidpprog2.com.model.Question;


public class QuizActivity extends AppCompatActivity {

    //Creacion de los Button's
    private Button mTrueButton;
    private Button mFalseButton;
    private Button mPreviousButton;
    private Button mNextButton;
    //private TextView mQuestionTextView;

    //Array de preguntas
    private Question[] mQuestionBank = new Question[]{
      new Question(R.string.question_muralla,false),
            new Question(R.string.question_Zuckerberg,true),
            new Question(R.string.question_conejos,false),
            new Question(R.string.question_reloj,true),
            new Question(R.string.question_hormigas,false),
            new Question(R.string.question_Charles,true),
    };


    private int mCurrentIndex = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Vinculamos los Buttons con la View, referenciandolos con el id
        mTrueButton = (Button) findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Ha clicado en el boton de TRUE
                Toast toast= Toast.makeText(getApplicationContext(),
                        R.string.correct_toast, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP,0,250);
                toast.show();
            }
        });
        mFalseButton = (Button) findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Ha clicado en el boton de FALSE
                Toast toast= Toast.makeText(getApplicationContext(),
                        R.string.incorrect_toast, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP,0,250);
                toast.show();
            }
        });
    }





}