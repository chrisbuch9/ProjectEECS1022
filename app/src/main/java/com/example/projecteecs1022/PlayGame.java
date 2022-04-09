package com.example.projecteecs1022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PlayGame extends AppCompatActivity {


    //public int range = 2;
    int min = 1;
    public int max = 2;
    int num;
    private TextView result;
    private Button buttonGuess;
    private EditText guess;
    private TextView range;
    public TextView livesView;
    int lives = 3;
    private Button buttonMainMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);
        num = getRandomNumber(min, max);
        guess = (EditText) findViewById(R.id.guess);
        result = (TextView) findViewById(R.id.guessResult);
        range = (TextView) findViewById(R.id.range);
        buttonGuess = (Button) findViewById(R.id.guessButton);
        livesView = (TextView) findViewById(R.id.LiveCount);
        range.setText("RANGE: 1-"+max);
        livesView.setText("Lives: "+lives);

        buttonGuess.setOnClickListener(new View.OnClickListener() {
            @Override


           public void onClick(View view) {
                GuessingFunction();
            }
        });
    }

    static int getRandomNumber(int max, int min){
        return (int)((Math.random() * (max - min)) + min);
    }

    public void GuessingFunction(){
        num = getRandomNumber(min, max);
        System.out.println(("in gesssingF. 1"));
        int userGuessing;
        //EditText guess = (EditText)findViewById(R.id.guess);
        userGuessing = Integer.parseInt(guess.getText().toString());
        System.out.println(("in gesssingF. 1" + guess.getText().toString()));
        if (userGuessing != num){
            result.setText("INCORRECT!");
            lives --;
            livesView.setText("Lives: "+lives);
            if(lives == 0){
                openGameOver();
            }
        }else{
            result.setText("CORRECT!");
            max++;
            range.setText("RANGE: 1-"+max);
        }

       //}

    }
    public void openGameOver(){
        Intent intent = new Intent(this, GameOver.class);
        startActivity(intent);
    }


    }
