package com.example.hesapmakinesi;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.hesapmakinesi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        binding.sayiGir.setShowSoftInputOnFocus(false);
        binding.sayGir2.setShowSoftInputOnFocus(false);

        binding.sayiGir.setSelection(binding.sayiGir.getSelectionStart());

        binding.btn1.setOnClickListener(view1 -> {
            if (binding.sayiGir.hasFocus()){
                binding.sayiGir.setText(binding.sayiGir.getText()+"1");
            } else if (binding.sayGir2.hasFocus()) {
                binding.sayGir2.setText(binding.sayGir2.getText()+"1");
            }
        } );  binding.btn.setOnClickListener(view1 ->{
            if (binding.sayiGir.hasFocus()){
                binding.sayiGir.setText(binding.sayiGir.getText()+"2");
            } else if (binding.sayGir2.hasFocus()) {
                binding.sayGir2.setText(binding.sayGir2.getText()+"2");
            }
        } );
        binding.btn3.setOnClickListener(view1 ->{
            if (binding.sayiGir.hasFocus()){
                binding.sayiGir.setText(binding.sayiGir.getText()+"3");
            } else if (binding.sayGir2.hasFocus()) {
                binding.sayGir2.setText(binding.sayGir2.getText()+"3");
            }
        } );
        binding.btn4.setOnClickListener(view1 ->{
            if (binding.sayiGir.hasFocus()){
                binding.sayiGir.setText(binding.sayiGir.getText()+"4");
            } else if (binding.sayGir2.hasFocus()) {
                binding.sayGir2.setText(binding.sayGir2.getText()+"4");
            }
        } );
        binding.btn5.setOnClickListener(view1 ->{
            if (binding.sayiGir.hasFocus()){
                binding.sayiGir.setText(binding.sayiGir.getText()+"5");
            } else if (binding.sayGir2.hasFocus()) {
                binding.sayGir2.setText(binding.sayGir2.getText()+"5");
            }
        } );
        binding.btn6.setOnClickListener(view1 ->{
            if (binding.sayiGir.hasFocus()){
                binding.sayiGir.setText(binding.sayiGir.getText()+"6");
            } else if (binding.sayGir2.hasFocus()) {
                binding.sayGir2.setText(binding.sayGir2.getText()+"6");
            }
        } ); binding.btn7.setOnClickListener(view1 ->{
            if (binding.sayiGir.hasFocus()){
                binding.sayiGir.setText(binding.sayiGir.getText()+"7");
            } else if (binding.sayGir2.hasFocus()) {
                binding.sayGir2.setText(binding.sayGir2.getText()+"7");
            }
        } ); binding.btn8.setOnClickListener(view1 ->{
            if (binding.sayiGir.hasFocus()){
                binding.sayiGir.setText(binding.sayiGir.getText()+"8");
            } else if (binding.sayGir2.hasFocus()) {
                binding.sayGir2.setText(binding.sayGir2.getText()+"8");
            }
        } ); binding.btn9.setOnClickListener(view1 ->{
            if (binding.sayiGir.hasFocus()){
                binding.sayiGir.setText(binding.sayiGir.getText()+"9");
            } else if (binding.sayGir2.hasFocus()) {
                binding.sayGir2.setText(binding.sayGir2.getText()+"9");
            }
        } );
        binding.btn0.setOnClickListener(view1 ->{
            if (binding.sayiGir.hasFocus()){
                binding.sayiGir.setText(binding.sayiGir.getText()+"0");
            } else if (binding.sayGir2.hasFocus()) {
                binding.sayGir2.setText(binding.sayGir2.getText()+"0");
            }
        } );
        binding.btnTopla.setOnClickListener(view1 ->{
            int sayi1 = Integer.parseInt(binding.sayiGir.getText().toString());
            int sayi2 = Integer.parseInt(binding.sayGir2.getText().toString());
            int topla = sayi1+sayi2;
                binding.sonuc.setText("Toplam : "+topla);

        } );
        binding.btnCikar.setOnClickListener(view1 ->{
            int sayi1 = Integer.parseInt(binding.sayiGir.getText().toString());
            int sayi2 = Integer.parseInt(binding.sayGir2.getText().toString());
            int cikar = sayi1-sayi2;
            binding.sonuc.setText("Çıkan : "+cikar);

        } );
        binding.btnBol.setOnClickListener(view1 ->{
            double sayi1 = Integer.parseInt(binding.sayiGir.getText().toString());
            double sayi2 = Integer.parseInt(binding.sayGir2.getText().toString());
            double bolme = sayi1/sayi2;
            binding.sonuc.setText("Bölüm : "+bolme);

        } );binding.btnCarp.setOnClickListener(view1 ->{
            int sayi1 = Integer.parseInt(binding.sayiGir.getText().toString());
            int sayi2 = Integer.parseInt(binding.sayGir2.getText().toString());
            int carp = sayi1*sayi2;
            binding.sonuc.setText("Çarpım : "+carp);

        } );


    }



}