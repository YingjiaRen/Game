package com.example.game;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Game01 extends AppCompatActivity {

    private ImageView bird1hdpi;
    private ImageView bee1hdpi;
    private ImageView fish1hdpi;
    private ImageView cat1hdpi;
    public int i=0;
    public int Score = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game01);
        bird1hdpi = (ImageView)findViewById(R.id.imageViewbird);
        bird1hdpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score += 10;
                Toast.makeText(Game01.this, "correct! Score +10", Toast.LENGTH_SHORT).show();
                bird1hdpi.setImageResource(R.mipmap.birdgreen1hdpi);
                Intent intent = new Intent();
                intent.setClass(Game01.this, Game02.class);
                intent.putExtra("score",Score);
                startActivity(intent);
            }
        });
        bee1hdpi = (ImageView)findViewById(R.id.imageViewbee);
        bee1hdpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score -= 10;
                Toast.makeText(Game01.this, "Wrong! Score -10", Toast.LENGTH_SHORT).show();
                bee1hdpi.setImageResource(R.mipmap.beegray1hdpi);
                Intent intent = new Intent();
                intent.setClass(Game01.this, Game02.class);
                intent.putExtra("score",Score);
                startActivity(intent);
            }
        });
        fish1hdpi = (ImageView)findViewById(R.id.imageViewfish);
        fish1hdpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score -= 10;
                Toast.makeText(Game01.this, "Wrong! Score -10", Toast.LENGTH_SHORT).show();
                fish1hdpi.setImageResource(R.mipmap.fishgray1hdpi);
                Intent intent = new Intent();
                intent.setClass(Game01.this, Game02.class);
                intent.putExtra("score",Score);
                startActivity(intent);
            }
        });
        cat1hdpi = (ImageView)findViewById(R.id.imageViewcat);
        cat1hdpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score -= 10;
                Toast.makeText(Game01.this, "Wrong! Score -10", Toast.LENGTH_SHORT).show();
                cat1hdpi.setImageResource(R.mipmap.catgray1hdpi);
                Intent intent = new Intent();
                intent.setClass(Game01.this, Game02.class);
                intent.putExtra("score",Score);
                startActivity(intent);
            }
        });


    }
}
