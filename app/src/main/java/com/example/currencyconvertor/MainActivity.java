package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.app.assist.AssistStructure;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void currencyConvert (View view){
        EditText inputCurrency = (EditText) findViewById(R.id.inputCuurency);
        TextView outputCurrency = (TextView) findViewById(R.id.outputCurrency);
        String dollarCurrency = inputCurrency.getText().toString();
        double usdDollarCurrency = Double.parseDouble(dollarCurrency);
        double indianRupee = usdDollarCurrency*75.35;
//        String indianRupeeCurrency = String.valueOf(indianRupee);
        outputCurrency.setText(String.format("₹ %.2f", indianRupee));
    }
}