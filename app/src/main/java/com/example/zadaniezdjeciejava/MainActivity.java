package com.example.zadaniezdjeciejava;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] RValueInt = {0};
        final int[] GValueInt = {0};
        final int[] BValueInt = {0};

        SeekBar rSeekBar = findViewById(R.id.RSeekBar);
        SeekBar gSeekBar = findViewById(R.id.GSeekBar);
        SeekBar bSeekBar = findViewById(R.id.BSeekBar);
        ImageView zdj = findViewById(R.id.picture);
        SeekBar Transparency = findViewById(R.id.Transparency);
        TextView text = findViewById(R.id.RGB);

        TextView rValue = findViewById(R.id.RValue);
        TextView gValue = findViewById(R.id.GValue);
        TextView bValue = findViewById(R.id.BValue);
        zdj.setBackgroundResource(R.drawable._000200094514);

        Transparency.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                // obliczanie przezroczystosci
                zdj.setImageAlpha(i);
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
                rValue.setText(Integer.toString(i));
                int x = i;
                RValueInt[0] = x;
                ZmianaKoloru(RValueInt[0], GValueInt[0], BValueInt[0]);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        gSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                gValue.setText(Integer.toString(i));
                int x = i;
                GValueInt[0] = x;
                ZmianaKoloru(RValueInt[0], GValueInt[0], BValueInt[0]);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        bSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                bValue.setText(Integer.toString(i));
                int x = i;
                BValueInt[0] = x;
                ZmianaKoloru(RValueInt[0], GValueInt[0], BValueInt[0]);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
    public void ZmianaKoloru(int RValueInt, int GValueInt, int BValueInt) {
        TextView text = findViewById(R.id.RGB);
        text.setBackgroundColor(Color.rgb(RValueInt, GValueInt, BValueInt));
    }

}