package com.test.devajyoti.dice_dice_baby;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.Random;

public class DiceActivity extends AppCompatActivity {

    ImageView iv;
    Button roll_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);
        iv = (ImageView) findViewById(R.id.imageView);
        roll_btn = (Button) findViewById(R.id.button);
    }

    public void rollDice(View view) {
        Log.d("Dice-Dice-baby", "In rollDice Function");
        roll_btn.setEnabled(false);
        Glide.with(this).load(R.drawable.progress).into(iv);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Random rv = new Random();
                int roll_result = rv.nextInt(6) + 1;
                Log.d("Dice-Dice-baby", "Roll Result: " + roll_result);

                switch (roll_result)
                {
                    case 1:
                        iv.setImageResource(R.drawable.d01);
                        break;
                    case 2:
                        iv.setImageResource(R.drawable.d02);
                        break;
                    case 3:
                        iv.setImageResource(R.drawable.d03);
                        break;
                    case 4:
                        iv.setImageResource(R.drawable.d04);
                        break;
                    case 5:
                        iv.setImageResource(R.drawable.d05);
                        break;
                    case 6:
                        iv.setImageResource(R.drawable.d06);
                        break;
                    default:
                        iv.setImageResource(R.drawable.bitmap);
                        break;
                }        //Do something after 100ms
                roll_btn.setEnabled(true);
            }
        }, 500);
    }
}
