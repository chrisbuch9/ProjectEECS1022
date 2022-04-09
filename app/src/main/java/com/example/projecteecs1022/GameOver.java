package com.example.projecteecs1022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioTrack;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOver extends AppCompatActivity {

    private Button buttonMainMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        PlayGame total = new PlayGame();
        int totalScore = total.max;

        TextView score = findViewById(R.id.totalScore);
        score.setText("TOTAL SCORE: " + String.valueOf(totalScore));


        buttonMainMenu = (Button) findViewById(R.id.button);
        buttonMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });
    }
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}