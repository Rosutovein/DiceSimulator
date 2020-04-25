package com.rosutovein.dicesimulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button firstChoice = (Button)findViewById(R.id.button6);
        Button secondChoice = (Button)findViewById(R.id.button20);

        firstChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSixActivity = new Intent(MainActivity.this, DiceActivity.class);
                //On envoie l'intent avec pour paramètre la valeur 6 (on met cette valeur dans ce qu'on appelle un extra)
                goToSixActivity.putExtra("max", 6);
                startActivity(goToSixActivity);
            }
        });

        secondChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTwentyActivity = new Intent(MainActivity.this, DiceActivity.class);
                //On envoie l'intent avec pour paramètre la valeur 20 (on met cette valeur dans ce qu'on appelle un extra)
                goToTwentyActivity.putExtra("max", 20);
                startActivity(goToTwentyActivity);
            }
        });
    }
}
