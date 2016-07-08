package com.example.android.thewhatfive;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button backButton , nextButton;
    TextView tV;
    ImageView img;
    int cont = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        backButton = (Button) findViewById(R.id.backButton);
        nextButton = (Button) findViewById(R.id.nextButton);
        tV = (TextView) findViewById(R.id.textInformation);
        img = (ImageView) findViewById(R.id.img);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPasoUno = new Intent(MainActivity.this , Paso1.class);
                startActivity(intentPasoUno);
                finish();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPasoUno = new Intent(MainActivity.this , Paso5.class);
                startActivity(intentPasoUno);
                finish();
            }
        });
    }
}