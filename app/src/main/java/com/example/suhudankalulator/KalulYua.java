package com.example.suhudankalulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KalulYua extends AppCompatActivity {

    Button satu,dua,tiga,empat,lima,enam,tujuh,delapan,sembilan,nol,kurang,tambah,bagi,samadengan,titik,kali,hapus;
    EditText Tulisan;
    String tanda;
    String str,str1,str2,str3,hasil;
    Double bilangan1,bilangan2;
    boolean pertambahan,perkurangan,perkalian,pembagian;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalul_yua);


        hapus = findViewById(R.id.ButtonAC);

        //TektView
        Tulisan = findViewById(R.id.tvMasukkanBilangan);

        //nomber
        satu = findViewById(R.id.btn1);
        dua = findViewById(R.id.btn2);
        tiga = findViewById(R.id.btn3);
        empat = findViewById(R.id.btn4);
        lima = findViewById(R.id.btn5);
        enam = findViewById(R.id.btn6);
        tujuh = findViewById(R.id.btn7);
        delapan = findViewById(R.id.btn8);
        sembilan = findViewById(R.id.btn9);
        nol = findViewById(R.id.btn0);
        //operator
        tambah = findViewById(R.id.btnPlus);
        kurang = findViewById(R.id.btnMinus);
        bagi = findViewById(R.id.btnBagi);
        kali = findViewById(R.id.btnKali);
        samadengan = findViewById(R.id.btnSamaDengan);
        titik = findViewById(R.id.btnTitik);

        satu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Tulisan.setText(Tulisan.getText()+"1");
            }
        });
        dua.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Tulisan.setText(Tulisan.getText()+"2");
            }
        });
        tiga.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Tulisan.setText(Tulisan.getText()+"3");
            }
        });
        empat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Tulisan.setText(Tulisan.getText()+"4");
            }
        });
        lima.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Tulisan.setText(Tulisan.getText()+"5");
            }
        });
        enam.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Tulisan.setText(Tulisan.getText()+"6");
            }
        });
        tujuh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Tulisan.setText(Tulisan.getText()+"7");
            }
        });
        delapan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Tulisan.setText(Tulisan.getText()+"8");
            }
        });
        sembilan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Tulisan.setText(Tulisan.getText()+"9");
            }
        });
        nol.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Tulisan.setText(Tulisan.getText()+"0");
            }
        });
        tambah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (Tulisan == null){
                    Tulisan.setText("");
                }else {
                    bilangan1 = Double.parseDouble(Tulisan.getText()+"");
                    pertambahan = true;
                    Tulisan.setText(null);
                }
            }
        });
        kurang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (Tulisan == null){
                    Tulisan.setText("");
                }else {
                    bilangan1 = Double.parseDouble(Tulisan.getText()+"");
                    perkurangan = true;
                    Tulisan.setText(null);
                }
            }
        });
        kali.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (Tulisan == null){
                    Tulisan.setText("");
                }else {
                    bilangan1 = Double.parseDouble(Tulisan.getText()+"");
                    perkalian = true;
                    Tulisan.setText(null);
                }
            }
        });
        bagi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (Tulisan == null){
                    Tulisan.setText("");
                }else {
                    bilangan1 = Double.parseDouble(Tulisan.getText()+"");
                    pembagian = true;
                    Tulisan.setText(null);
                }
            }
        });
        samadengan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                bilangan2 = Double.parseDouble(Tulisan.getText() + "");
                if (pertambahan==true){
                    Tulisan.setText(bilangan1+bilangan2+"");
                    pertambahan=false;
                }else if (perkurangan==true){
                    Tulisan.setText(bilangan1-bilangan2+"");
                    perkurangan=false;
                }else if (pembagian==true){
                    Tulisan.setText(bilangan1/bilangan2+"");
                    pembagian=false;
                }else if (perkalian==true){
                    Tulisan.setText(bilangan1*bilangan2+"");
                    perkalian=false;
                }
            }
        });
        hapus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Tulisan.setText("");
            }
        });
        titik.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Tulisan.setText(Tulisan.getText()+".");
            }
        });

    }
}
