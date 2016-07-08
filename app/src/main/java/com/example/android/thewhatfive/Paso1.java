package com.example.android.thewhatfive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Paso1 extends AppCompatActivity {
    Button nextButton , backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paso1);

        backButton = (Button) findViewById(R.id.backButton);
        nextButton = (Button) findViewById(R.id.nextButton);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPasoUno = new Intent(Paso1.this , Paso2.class);
                startActivity(intentPasoUno);
                finish();
            }

        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backStep = new Intent(Paso1.this, MainActivity.class);
                startActivity(backStep);
                finish();
            }

        });
    }
}
