package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button convertorButton = findViewById(R.id.button);
        EditText inputCurrency = findViewById(R.id.inputCurrency);
        TextView outputCurrency = findViewById(R.id.outputCurrency);

        convertorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(inputCurrency.getText().toString())){
                    Toast.makeText(MainActivity.this, "Please Enter a Value Amount", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String dollarCurrency = inputCurrency.getText().toString();
                    double usdDollarCurrency = Double.parseDouble(dollarCurrency);
                    double indianRupee = usdDollarCurrency*75.35;
                    outputCurrency.setText(String.format("₹ %.2f", indianRupee));
                }
            }
        });
    }
}