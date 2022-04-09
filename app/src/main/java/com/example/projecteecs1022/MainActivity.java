package com.example.projecteecs1022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonHowToPlay;
    private Button buttonPlayGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        buttonHowToPlay = (Button) findViewById(R.id.howToPlay);
        buttonPlayGame = (Button) findViewById(R.id.StartGame);
        buttonHowToPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHowToPlay();
            }
        });
        buttonPlayGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPLayGame();
            }
        });

    }


    public void openHowToPlay(){
        Intent howToPlayActivity = new Intent(this, howToPlay.class);
        startActivity(howToPlayActivity);
    }

    public void openPLayGame(){
        Intent playGameActivity = new Intent(this, PlayGame.class);
        startActivity(playGameActivity);
    }

}