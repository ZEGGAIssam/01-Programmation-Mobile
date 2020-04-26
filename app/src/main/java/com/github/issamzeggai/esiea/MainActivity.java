package com.github.issamzeggai.esiea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button toast, augmenter, random, diminuer, reset;
    TextView CounterText;
    int intcounter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast = (Button) findViewById(R.id.toast_button);
        augmenter = (Button) findViewById(R.id.buttonCount);
        random = (Button) findViewById(R.id.random_button);
        diminuer= (Button) findViewById(R.id.decreaseButton);
        reset= (Button) findViewById(R.id.resetButton);
        CounterText = (TextView)findViewById(R.id.textview_first);

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "J'aurais 15/20 au projet!", Toast.LENGTH_SHORT).show();
            }
        });
        augmenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intcounter++;
                CounterText.setText(Integer.toString(intcounter));
            }
        });
        diminuer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intcounter--;
                CounterText.setText(Integer.toString(intcounter));
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intcounter = 0;
                CounterText.setText(Integer.toString(intcounter));
            }
        });
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity2();
            }
        });
    }

    public void openMainActivity2() {
        Intent newPage=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(newPage);
    }

}
