package com.example.suhudankalulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KalulatorBagus extends AppCompatActivity implements View.OnClickListener {

    Button satu,dua,tiga,empat,lima,enam,tujuh,delapan,sembilan,nol,kurang,tambah,bagi,samadengan,titik,kali,hapus;
    EditText Tulisan;
    String tanda;
    String str,str1,str2,str3,hasil;
    Double bilangan1,bilangan2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalulator_bagus);


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
        //Listener Angka
        satu.setOnClickListener(this);
        dua.setOnClickListener(this);
        tiga.setOnClickListener(this);
        empat.setOnClickListener(this);
        lima.setOnClickListener(this);
        enam.setOnClickListener(this);
        tujuh.setOnClickListener(this);
        delapan.setOnClickListener(this);
        sembilan.setOnClickListener(this);
        nol.setOnClickListener(this);

        tambah.setOnClickListener(this);
        kurang.setOnClickListener(this);
        kali.setOnClickListener(this);
        bagi.setOnClickListener(this);
        samadengan.setOnClickListener(this);
        hapus.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn0:
                str = nol.getText().toString();
                Tulisan.setText(str);
                bilangan1 = Double.parseDouble(str);
                break;
            case R.id.btn1:
                str = satu.getText().toString();
                Tulisan.setText(str);
                bilangan1 = Double.parseDouble(str);

                break;
            case R.id.btn2:
                str = dua.getText().toString();
                Tulisan.setText(str);
                bilangan1 = Double.parseDouble(str);

                break;
            case R.id.btn3:
                str = tiga.getText().toString();
                Tulisan.setText(str);
                bilangan1 = Double.parseDouble(str);

                break;
            case R.id.btn4:
                str = empat.getText().toString();
                Tulisan.setText(str);
                bilangan1 = Double.parseDouble(str);

                break;
            case R.id.btn5:
                str = lima.getText().toString();
                Tulisan.setText(str);
                bilangan1 = Double.parseDouble(str);

                break;
            case R.id.btn6:
                str = enam.getText().toString();
                Tulisan.setText(str);
                bilangan1 = Double.parseDouble(str);

                break;
            case R.id.btn7:
                str = tujuh.getText().toString();
                Tulisan.setText(str);
                bilangan1 = Double.parseDouble(str);

                break;
            case R.id.btn8:
                str = delapan.getText().toString();
                Tulisan.setText(str);
                bilangan1 = Double.parseDouble(str);
                break;
            case R.id.btn9:
                str = sembilan.getText().toString();
                Tulisan.setText(str);
                bilangan1 = Double.parseDouble(str);
                break;
            case R.id.ButtonAC:
                Tulisan.setText("");
                break;
            case R.id.btnBagi:
                tanda = bagi.getText().toString();
                Tulisan.setText(tanda);
                break;
            case R.id.btnPlus:
                tanda = tambah.getText().toString();
                Tulisan.setText(tanda);
                break;
            case R.id.btnMinus:
                tanda = kurang.getText().toString();
                Tulisan.setText(tanda);
                break;
            case R.id.btnKali:
                tanda=kali.getText().toString();
                Tulisan.setText(tanda);
                break;
        }






    }



    public void Hitung(View view){
        Button button = (Button) view;
        str2 = Tulisan.getText().toString();
        bilangan2 = Double.parseDouble(str2);
            if (tanda.equals("+")){
                hasil = bilangan1+bilangan2+"";
            }else if (tanda.equals("-")){
                hasil = bilangan1-bilangan2+"";
            }else if(tanda.equals("*")){
                hasil = bilangan1*bilangan2+"";
            }else if(tanda.equals("/")){
                hasil = bilangan1/bilangan2+"";
            }else {
                hasil = "hmmm,Mungkin Ada Yang salah";
            }
            Tulisan.setText(hasil);
        }



}
