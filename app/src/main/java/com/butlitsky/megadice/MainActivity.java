package com.butlitsky.megadice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button) findViewById(R.id.button_rollButton);
        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Diccc", "Шалом лекулям!");
                Random randGen = new Random();
                int number1 = randGen.nextInt(6);
                int number2 = randGen.nextInt(6);

                leftDice.setImageResource(diceArray[number1]);
                rightDice.setImageResource(diceArray[number2]);
            }
        });
    }
}


