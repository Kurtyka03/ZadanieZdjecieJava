package com.example.zadaniezdjeciejava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] RValueInt = {0};
        final int[] GValueInt = {0};
        final int[] BValueInt = {0};

        SeekBar rSeekBar = findViewById(R.id.RSeekBar);
        ImageView zdj = findViewById(R.id.picture);
        SeekBar Transparency = findViewById(R.id.Transparency);

        Transparency.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                // obliczanie przezroczystosci
                int x = i/10;
                zdj.setImageAlpha(x);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        rSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                RValueInt[0] = i;
                ZmianaKoloru();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    private void ZmianaKoloru() {
    }
}