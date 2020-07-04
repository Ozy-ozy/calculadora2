package com.example.calculadora2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String number ="";
    private double num1 = 0;
    private double num2 = 0;
    private String symbol;


    private TextView solucion;
    private Button keyPad0, keyPad1,keyPad2,keyPad3,keyPad4, keyPad5,keyPad6,keyPad7, keyPad8, keyPad9;
    private Button keyPadSum, keyPadSubstract, keyPadMultiply, keyPadDivision, keyPadClear, keyPadEqual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Bienvenido a mi calculadora!", Toast.LENGTH_SHORT).show();


        solucion =  findViewById(R.id.resultado);

        keyPad1 = findViewById(R.id.uno);
        keyPad2 = findViewById(R.id.dos);
        keyPad3 = findViewById(R.id.tres);
        keyPad4 = findViewById(R.id.cuatro);
        keyPad5 = findViewById(R.id.cinco);
        keyPad6 = findViewById(R.id.seis);
        keyPad7 = findViewById(R.id.siete);
        keyPad8 = findViewById(R.id.ocho);
        keyPad9 = findViewById(R.id.nueve);
        keyPad0 = findViewById(R.id.cero);



        keyPadSum = findViewById(R.id.suma);
        keyPadSubstract = findViewById(R.id.resta);
        keyPadMultiply = findViewById(R.id.multiplicacion);
        keyPadDivision = findViewById(R.id.division);
        keyPadClear = findViewById(R.id.igual);
        keyPadEqual = findViewById(R.id.clear);

        keyPad0.setOnClickListener(this);
        keyPad1.setOnClickListener(this);
        keyPad2.setOnClickListener(this);
        keyPad3.setOnClickListener(this);
        keyPad4.setOnClickListener(this);
        keyPad5.setOnClickListener(this);
        keyPad6.setOnClickListener(this);
        keyPad7.setOnClickListener(this);
        keyPad8.setOnClickListener(this);
        keyPad9.setOnClickListener(this);




        keyPadSum.setOnClickListener(this);
        keyPadSubstract.setOnClickListener(this);
        keyPadMultiply.setOnClickListener(this);
        keyPadDivision.setOnClickListener(this);
        keyPadClear.setOnClickListener(this);
        keyPadEqual.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.cero:
                number = number + "0";
                solucion.setText(number);
                break;

            case R.id.uno:
                number = number + "1";
                solucion.setText(number);
                break;

            case R.id.dos:
                number = number + "2";
                solucion.setText(number);
                break;

            case R.id.tres:
                number = number + "3";
                solucion.setText(number);
                break;

            case R.id.cuatro:
                number = number + "4";
                solucion.setText(number);
                break;

            case R.id.cinco:
                number = number + "5";
                solucion.setText(number);
                break;

            case R.id.seis:
                number = number + "6";
                solucion.setText(number);
                break;

            case R.id.siete:
                number = number + "7";
                solucion.setText(number);
                break;

            case R.id.ocho:
                number = number + "8";
                solucion.setText(number);
                break;

            case R.id.nueve:
                number = number + "9";
                solucion.setText(number);
                break;

            case R.id.suma:
                symbol = "+";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.resta:
                symbol = "-";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.division:
                symbol = "/";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.multiplicacion:
                symbol = "X";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.clear:
                symbol = "";
                num1 = 0;
                num2 = 0;
                number = "";
                solucion.setText("");
                break;

            case R.id.igual:
                num2 = Integer.parseInt(number);

                switch (symbol){
                    case "+":
                        solucion.setText("" + (num1 + num2));
                        break;
                    case "-":
                        solucion.setText("" + (num1 - num2));
                        break;
                    case "/":
                        solucion.setText("" + (num1 / num2));
                        break;
                    case "X":
                        solucion.setText("" + (num1 * num2));
                        break;
                }

                num1 = 0;
                num2 = 0;
                number = "";

                break;



        }
    }
}

