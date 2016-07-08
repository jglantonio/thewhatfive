package com.example.android.thewhatfive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Paso3 extends AppCompatActivity {

    Button nextButton, backButton , verifyButton;
    CheckBox cbVerify ;
    TextView typeA;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paso3);

        cbVerify = (CheckBox) findViewById(R.id.cbVerify);
        backButton = (Button) findViewById(R.id.backButton);
        nextButton = (Button) findViewById(R.id.nextButton);
        verifyButton = (Button) findViewById(R.id.vfButton);
        typeA = (TextView) findViewById(R.id.textInformation);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextStep = new Intent(Paso3.this, Paso4.class);
                startActivity(nextStep);
                finish();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backStep = new Intent(Paso3.this, Paso2.class);
                startActivity(backStep);
                finish();
            }
        });

        verifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbVerify.isChecked()){
                    typeA.setText(getString(R.string.paso3));
                }else{
                    typeA.setText(getString(R.string.paso3b));
                }
            }
        });
    }
}
