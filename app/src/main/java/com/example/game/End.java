package com.example.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class End extends AppCompatActivity {
    private TextView textViewScore;
    public  int Score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        Intent intentscore = getIntent();
        Score = intentscore.getIntExtra("score",Score);
        textViewScore = (TextView)findViewById(R.id.textViewScore);
        textViewScore.setText(""+Score);
    }
}
