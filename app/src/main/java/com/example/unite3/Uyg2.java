package com.example.unite3;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        byte kucukSayi = 127;
        short kısaSayi = 32767;
        int tamSayi = 2147483647;
        long uzunSayi = 9223372036854775807L;
        System.out.println("byte: " + kucukSayi );
        System.out.println("short: " + kısaSayi);
        System.out.println("int: " + tamSayi);
        System.out.println("long: "+ uzunSayi);


    }
}
