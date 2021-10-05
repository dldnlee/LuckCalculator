package com.example.luckcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.luckcalculator.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    Random rand = new Random();
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.calcButton.setOnClickListener(v -> {
            count ++;
            if(count == 1) {
                luckCalc();
            } else if(count >= 1) {
                Toast.makeText(this, "한번밖에 못하지롱", Toast.LENGTH_LONG).show();
            }
        });
    }

    protected void luckCalc() {
        int num;
        num = rand.nextInt(101);
        binding.score.setText(num + "점");
    }
}