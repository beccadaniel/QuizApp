package com.example.android.quizapp;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;

import android.widget.EditText;
import android.widget.Toast;

import android.content.Context;

public class MainActivity extends AppCompatActivity {

    public static final String FIRST_ANSWER = "ethiopia";
    public static final String SECOND_ANSWER = "camel";
    public static final String THIRD_ANSWER = "sun";
    public static final String FOURTH_ANSWER = "cheetah";
    public static final String FIFTH_ANSWER = "skin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateScore(View view) {
        int score = 0;

        EditText firstQuestion = (EditText) findViewById(R.id.first_question);
        if (firstQuestion.getText().toString().toLowerCase().trim().equals(FIRST_ANSWER)) {
            score += 1;
        }

        EditText secondQuestion = (EditText) findViewById(R.id.second_question);
        if (secondQuestion.getText().toString().toLowerCase().trim().equals(SECOND_ANSWER)) {
            score += 1;
        }

        EditText thirdQuestion = (EditText) findViewById(R.id.third_question);
        if (thirdQuestion.getText().toString().toLowerCase().trim().equals(THIRD_ANSWER)) {
            score += 1;
        }

        EditText fourthQuestion = (EditText) findViewById(R.id.fourth_question);
        if (fourthQuestion.getText().toString().toLowerCase().trim().equals(FOURTH_ANSWER)) {
            score += 1;
        }

        EditText fifthQuestion = (EditText) findViewById(R.id.fifth_question);
        if (fifthQuestion.getText().toString().toLowerCase().trim().equals(FIFTH_ANSWER)) {
            score += 1;
        }

        Context context = getApplicationContext();
        CharSequence result = getString(R.string.result, score);
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, result, duration);
        toast.show();
    }
}
