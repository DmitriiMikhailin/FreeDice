package ru.mikhailin.freedice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button diceButton;
    ImageView diceImageView;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceButton = findViewById(R.id.diceButton);
        diceImageView = findViewById(R.id.diceImageView);
        diceButton.setOnClickListener(new DiceButtonClickListener());
    }

    class DiceButtonClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Integer randNum = random.nextInt(5) + 1;
            switch (randNum){
                case 1:
                    diceImageView.setImageResource(R.drawable.dice1);
                    break;
                case 2:
                    diceImageView.setImageResource(R.drawable.dice2);
                    break;
                case 3:
                    diceImageView.setImageResource(R.drawable.dice3);
                    break;
                case 4:
                    diceImageView.setImageResource(R.drawable.dice4);
                    break;
                case 5:
                    diceImageView.setImageResource(R.drawable.dice5);
                    break;
                case 6:
                    diceImageView.setImageResource(R.drawable.dice6);
                    break;
            }
        }
    }
}
