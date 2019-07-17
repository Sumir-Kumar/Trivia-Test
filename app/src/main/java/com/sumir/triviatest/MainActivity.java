package com.sumir.triviatest;

import android.app.DownloadManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.RequestQueue;
import com.sumir.triviatest.controller.AppController;
import com.sumir.triviatest.data.QuestionBank;

public class MainActivity extends AppCompatActivity {
    RequestQueue queue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new QuestionBank().getQuestions();



    }


}
