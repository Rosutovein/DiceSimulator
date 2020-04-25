package com.rosutovein.dicesimulator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.security.SecureRandom;

public class DiceActivity extends Activity implements View.OnClickListener {

    //On initialise textResult ici afin de pouvoir l'utiliser dans onCreate et OnClick
    private TextView textResult;
    //On crée une variable max qui va stocké la valeur de l'extra contenu dans l'intent
    private int max;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        //On récupère l'extra
        //max est le nom de l'extra qui nous a été envoyé
        //0 est la valeur retournée si l'extra n'est pas présent dans l'intent
        max = getIntent().getIntExtra("max",0);

        //On récupère les vues
        TextView textTitle = (TextView) findViewById(R.id.textTitle);
        textResult = (TextView) findViewById(R.id.textResult);
        Button buttonRoll = (Button) findViewById(R.id.buttonRoll);

        //On change le contenu des zones de texte
        textTitle.setText(max + " sided dice");
        textResult.setText("");
        buttonRoll.setOnClickListener(this);
    }

    //On a cette forme car on a implémenté View.OnClickListener
    @Override
    public void onClick(View v) {
        SecureRandom random = new SecureRandom();
        int result = random.nextInt(max) + 1;
        textResult.setText(String.valueOf(result));
    }
}
