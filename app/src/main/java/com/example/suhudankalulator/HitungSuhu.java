package com.example.suhudankalulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;


public class HitungSuhu extends AppCompatActivity implements View.OnClickListener{

    Button HitungSuhu;
    EditText Fahrenheit,Reamur,Kelvin,celcius;
  protected   Double Hasil,Hasil2,Hasil3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_suhu);

        HitungSuhu = findViewById(R.id.ButtonKonversi);
        HitungSuhu.setOnClickListener(this);

        celcius = findViewById(R.id.editTextCelcius);

        Fahrenheit = findViewById(R.id.editFahrenheit);
        Reamur = findViewById(R.id.EditReamur);
        Kelvin = findViewById(R.id.editKelvin);
    }

    @Override
    public void onClick(View view) {
        Double konvCelcius = Double.parseDouble(celcius.getText().toString());

        switch (view.getId()){
            case R.id.ButtonKonversi:
                Hasil = konvCelcius * 9/5 + 32;
                Fahrenheit.setText(Double.toString(Hasil));
                Hasil2 = konvCelcius + 273.15;
                Kelvin.setText(Double.toString(Hasil2));
                Hasil3 =  konvCelcius * 4/5;
                Reamur.setText(Double.toString(Hasil3));
                break;
        }
    }
}
