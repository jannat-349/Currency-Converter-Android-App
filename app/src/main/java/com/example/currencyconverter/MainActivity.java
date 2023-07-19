package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    Button btnCalculate, btnClear;
    EditText edtAmount;
    RadioButton rdUSDtoBDT, rdBDTtoUSD, rdINRtoUSD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculate = findViewById(R.id.btnCalculate);
        btnClear = findViewById(R.id.btnClear);
        edtAmount = findViewById(R.id.edtAmount);
        rdBDTtoUSD = findViewById(R.id.rdBDTtoUSD);
        rdUSDtoBDT = findViewById(R.id.rdUSDtoBDT);
        rdINRtoUSD = findViewById(R.id.rdINRtoUSD);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double amount = new Double(edtAmount.getText().toString());
                if (rdBDTtoUSD.isChecked()) {
                    double result = ConvertCurrency.bdtUSD(amount);
                    edtAmount.setText(new Double(result).toString());
                } else if (rdUSDtoBDT.isChecked()) {
                    double result = ConvertCurrency.usdBDT(amount);
                    edtAmount.setText(new Double(result).toString());
                } else if (rdINRtoUSD.isChecked()) {
                    double result = ConvertCurrency.inrUSD(amount);
                    edtAmount.setText(new Double(result).toString());
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtAmount.setText("");
            }
        });
    }
}