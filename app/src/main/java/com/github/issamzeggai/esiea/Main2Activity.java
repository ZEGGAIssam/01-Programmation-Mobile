package com.github.issamzeggai.esiea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    Button previous;
    TextView RandomTV;
    int max = 16;
    int min = 0;
    Random numberCreated = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        previous = (Button) findViewById(R.id.previousButton);
        RandomTV = (TextView) findViewById(R.id.Number);


        int intrandomtextview = numberCreated.nextInt(max - min) + min;
        // Le nextInt cree le nb de valeur qu'il y aura dans l'intervalle et le +min indique a partir de cb nous démarrrons,
        // par exemple si int max =20 et que int min = 5, grace au nextInt(max-min), cela creera un intervalle de 15 valeurs de facon aleatoire.
        // le +min sert a indiquer la valeur de départ, donc 5 dans cette exemple ci-contre : 5,6,7...17,18,19
        //int i1 = r.nextInt(80 - 65) + 65;
        //This gives a random integer between 65 (inclusive) and 80 (exclusive), one of 65,66,...,78,79.

        RandomTV.setText(Integer.toString(intrandomtextview));

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //openMainActivity();
                finish();
            }

        });


    }
/*
    public void openMainActivity() {
        Intent previousPage = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(previousPage);

    }

 */
}

