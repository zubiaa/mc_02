package com.example.quizzapp_mc_02;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class question extends AppCompatActivity implements View.OnClickListener {
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private TextView Question;
    private TextView qCount, timer;
    private List<Q_> QList;
    int questionNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);


        Question = findViewById(R.id.Q);
        qCount = findViewById(R.id.Qno);
        timer = findViewById(R.id.counter);
        b1 = findViewById(R.id.opt1);
        b2 = findViewById(R.id.opt2);
        b3 = findViewById(R.id.opt3);
        b4 = findViewById(R.id.opt4);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        getQList();

    }


    private void getQList() {
        QList = new ArrayList<>();
        QList.add(new Q_("Very first product use in makeup ,is ", "primer", "fondation", "concealer", "highlighter", 1));
        QList.add(new Q_("For shine product use in makeup, is ", "primer", "concealer", "highlighter", "fondation", 3));
        QList.add(new Q_("White pencil is ususally use for ____ ", "eye", "lips", "eyebrows", "contour", 1));
        QList.add(new Q_("If someone has a dark complexion ,what color of lipstick will you use for her ", "baby pink", "light brown", "shockinng pink", "maroon", 4));
        QList.add(new Q_("Most popular face shape is ", "heart", "round", "oval", "all of these", 3));
        QList.add(new Q_("Does skin tone matter for foundation selection? ", "yes", "no", "maybe", "skin tone has no concern with foundation", 1));
        QList.add(new Q_("blending improves by applying ", "mascara", "highlighter", "concealer", "moisturizer", 4));
        QList.add(new Q_("Can we do wadu with nailpaints? ", "yes", "no", "maybe", "i don't know", 2));
        QList.add(new Q_("What does a liner do?", "enhance eye boarder", "enlongate eye", "give eye a fine shape", "all of these", 4));
        QList.add(new Q_("What needs the most,but never find on time?", "hair pin", "nailcutter", "both of these", "none of these", 3));
        setQList();

    }

    private void setQList() {
        timer.setText(String.valueOf(10));


        Question.setText(QList.get(0).getQuestion());
        b1.setText(QList.get(0).getOptionA());
        b2.setText(QList.get(0).getOptionB());
        b3.setText(QList.get(0).getOptionC());
        b4.setText(QList.get(0).getOptionD());


        qCount.setText(String.valueOf(1) + "/" + String.valueOf(10));

        startTimer();
        questionNumber = 0;
    }

    private void startTimer() {
        final CountDownTimer countDown = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timer.setText(String.valueOf(millisUntilFinished / 1000));
            }

            @Override
            public void onFinish() {
                changeQuestion();
            }
        };
        countDown.start();
    }


    @Override
    public void onClick(View v) {
        int selectedOption = 0;
        switch (v.getId()) {
            case R.id.opt1:
                selectedOption = 1;
                break;
            case R.id.opt2:
                selectedOption = 2;
                break;
            case R.id.opt3:
                selectedOption = 3;
                break;
            case R.id.opt4:
                selectedOption = 4;
                break;
            default:
        }
        checkAnswer(selectedOption);
    }

    private void checkAnswer(int selectedoption) {
        if (selectedoption == QList.get(questionNumber).getCorrect())
        {
            //right
        }
    else
        { //wrong
        }
        changeQuestion();
    }

    private void changeQuestion() {
        if (questionNumber < QList.size() - 1) {
            playanim(b1,0);
            playanim(Question,0);
            playanim(b1,0);
            playanim(b2,0);
            playanim(b3,0);
            playanim(b4,0);
        }
        else
        {
            Intent intent=new Intent(question.this,score.class);
            //go for score activity
            startActivity(intent);
            question.this.finish();
        }
    }
    private void playanim(final View view, final int value, final int viewnum)
    {

        view.animate().alpha(value).scaleX(0).scaleY(0).setDuration(500).setStartDelay(100).setInterpolator(new DecelerateInterpolator()).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
     if(value==0)
{     switch(viewnum)
{
    case 0:
        



}}
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });









    }




























}