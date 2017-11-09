package com.example.sedar.simplecalculatorstarter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button sumButton;
    int number1,number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //First we search for the Buttons in our layout and create an Object.
        sumButton = findViewById(R.id.calculateSumButton);

        //Then we add an OnClickListener.
        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readNumbers();
                calculateSum();
            }
        });


        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readNumbers();
                calculateSum();
            }
        });
    }

    public void readNumbers(){
        EditText number1EditText = findViewById(R.id.number1Text);
        EditText number2EditText = findViewById(R.id.number2Text);

        number1 = Integer.parseInt(number1EditText.getText().toString());
        number2 = Integer.parseInt(number2EditText.getText().toString());
    }

    private void calculateSum(){
        Integer sum = number1 + number2;
        Toast.makeText(getApplicationContext(),sum + "",Toast.LENGTH_LONG).show();
    }
}
