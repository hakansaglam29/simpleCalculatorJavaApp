package com.hakansaglam.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editNumber1;
    EditText editNumber2;
    TextView resultText;
    double number1;
    double number2;
    double result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNumber1 = findViewById(R.id.editNumber1);
        editNumber2 = findViewById(R.id.editNumber2);
        resultText = findViewById(R.id.resultText);
    }

    public void sum(View view){

        if (editNumber1.getText().toString().matches("") || editNumber2.getText().toString().matches("")) {

            resultText.setText("Enter Number!");

        } else {

            number1 = Integer.parseInt(editNumber1.getText().toString());
            number2 = Integer.parseInt(editNumber2.getText().toString());

            result = number1 + number2;

            resultText.setText("Result: "+ result);
        }


    }

    public void subtract(View view){

        if (editNumber1.getText().toString().matches("") || editNumber2.getText().toString().matches("")) {

            resultText.setText("Enter Number!");

        } else {

            number1 = Integer.parseInt(editNumber1.getText().toString());
            number2 = Integer.parseInt(editNumber2.getText().toString());

            result = number1 - number2;

            if (result < 0) {
                resultText.setText("Enter Number!");
            }

            resultText.setText("Result: " + result);
        }

    }

    public void multiply(View view){

        if (editNumber1.getText().toString().matches("") || editNumber2.getText().toString().matches("")) {

            resultText.setText("Enter Number!");

        } else {

            number1 = Integer.parseInt(editNumber1.getText().toString());
            number2 = Integer.parseInt(editNumber2.getText().toString());

            result = number1 * number2;

            resultText.setText("Result: " + result);

        }

    }

    public void divide(View view){
        if (editNumber1.getText().toString().matches("") || editNumber2.getText().toString().matches("")) {

            resultText.setText("Enter Number!");

        } else {

            number1 = Integer.parseInt(editNumber1.getText().toString());
            number2 = Integer.parseInt(editNumber2.getText().toString());

            result = number1 / number2;

            resultText.setText("Result: " + result);

        }

    }
}