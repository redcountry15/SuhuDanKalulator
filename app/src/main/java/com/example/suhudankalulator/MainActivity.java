package com.example.suhudankalulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Ke1,Ke2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ke1= findViewById(R.id.ButtonSuhu);
        Ke2 = findViewById(R.id.ButtonKalulator);

        Ke2.setOnClickListener(this);

        Ke1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ButtonSuhu:
                Intent niatan = new Intent(MainActivity.this,HitungSuhu.class);
                startActivity(niatan);
                break;
            case R.id.ButtonKalulator:
                Intent niat = new Intent(MainActivity.this,KalulYua.class);
                startActivity(niat);
                break;

        }
    }
}
