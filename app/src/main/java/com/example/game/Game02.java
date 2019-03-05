package com.example.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Game02 extends AppCompatActivity {

    private ImageView pig1hdpi;
    private ImageView fish1hdpi;
    private ImageView house1hdpi;
    private ImageView cat1hdpi;
    public int Score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game02);
        house1hdpi = (ImageView)findViewById(R.id.imageViewHouse);
        house1hdpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score += 10;
                Toast.makeText(Game02.this, "correct! Score +10", Toast.LENGTH_SHORT).show();
                house1hdpi.setImageResource(R.mipmap.housegreen1hdpi);
                Intent intent = new Intent();
                intent.setClass(Game02.this, End.class);
                intent.putExtra("score",Score);
                startActivity(intent);
            }
        });
        pig1hdpi = (ImageView)findViewById(R.id.imageViewPig);
        pig1hdpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score -= 10;
                Toast.makeText(Game02.this, "Wrong! Score -10", Toast.LENGTH_SHORT).show();
                house1hdpi.setImageResource(R.mipmap.piggray1hdpi);
                Intent intent = new Intent();
                intent.setClass(Game02.this, End.class);
                intent.putExtra("score",Score);
                startActivity(intent);
            }
        });
        fish1hdpi = (ImageView)findViewById(R.id.imageViewFish);
        fish1hdpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score -= 10;
                Toast.makeText(Game02.this, "Wrong! Score -10", Toast.LENGTH_SHORT).show();
                fish1hdpi.setImageResource(R.mipmap.fishgray1hdpi);
                Intent intent = new Intent();
                intent.setClass(Game02.this, End.class);
                intent.putExtra("score",Score);
                startActivity(intent);
            }
        });
        cat1hdpi = (ImageView)findViewById(R.id.imageViewCat);
        cat1hdpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score -= 10;
                Toast.makeText(Game02.this, "Wrong! Score -10", Toast.LENGTH_SHORT).show();
                cat1hdpi.setImageResource(R.mipmap.catgray1hdpi);
                Intent intent = new Intent();
                intent.setClass(Game02.this, End.class);
                intent.putExtra("score",Score);
                startActivity(intent);
            }
        });

    }

    }

