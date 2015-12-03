package com.example.iem.testunitaire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText valeur1;
    EditText valeur2;
    Button boutonPlus;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valeur1=(EditText)findViewById(R.id.etV1);
        valeur2=(EditText)findViewById(R.id.etV2);
        tvResult=(TextView)findViewById(R.id.Result);
        boutonPlus=(Button)findViewById(R.id.adition);
        boutonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double v1=Double.parseDouble(valeur1.getText().toString());
                double v2=Double.parseDouble(valeur2.getText().toString());
                tvResult.setText(""+adition(v1,v2));
            }
        });
    }

    public double adition(double v1, double v2){
        double result;
        result=v1+v2;
        return result;
    }




}
