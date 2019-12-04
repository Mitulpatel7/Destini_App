package com.example.destiniapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView question_text_view;
    private Button ans1 , ans2;
    private int index = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question_text_view = findViewById(R.id.question_text_view);
        ans1 = findViewById(R.id.ans1);
        ans2 = findViewById(R.id.ans2);

        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index == 1 || index == 2) {
                    question_text_view.setText(R.string.T3_Story);
                    ans1.setText(R.string.T3_Ans1);
                    ans2.setText(R.string.T3_Ans2);
                    index = 3;
                }
                else{
                    question_text_view.setText(R.string.T6_End);
                    ans1.setVisibility(View.GONE);
                    ans2.setVisibility(View.GONE);
                }


            }
        });

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index == 1) {
                    question_text_view.setText(R.string.T2_Story);
                    ans1.setText(R.string.T2_Ans1);
                    ans2.setText(R.string.T2_Ans2);
                    index = 2;
                }
                else if (index == 2)
                {
                    question_text_view.setText(R.string.T4_End);
                    ans2.setVisibility(View.GONE);
                    ans1.setVisibility(View.GONE);
                }
                else
                {
                    question_text_view.setText(R.string.T5_End);
                    ans2.setVisibility(View.GONE);
                    ans1.setVisibility(View.GONE);
                }
            }
        });
    }

    private void updateStory()
    {

    }
}
