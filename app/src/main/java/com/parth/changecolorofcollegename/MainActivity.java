package com.parth.changecolorofcollegename;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


//Create an Android Application that will change color of the College Name on click of Push
//Button and change the font size, font style of text view using xml.

public class MainActivity extends AppCompatActivity {

    private TextView CollegeName;

    private Button red,yellow,green,blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CollegeName = findViewById(R.id.CollegeNameTxtV);

        red = findViewById(R.id.btn_red);
        yellow = findViewById(R.id.btn_yellow);
        green = findViewById(R.id.btn_green);
        blue = findViewById(R.id.btn_blue);


        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CollegeName.setTextColor(getResources().getColor(R.color.red));
                CollegeName.setTextSize(20);
                CollegeName.setTypeface(Typeface.MONOSPACE);
                CollegeName.setText("K.T.H.M College Nashik");
            }
        });

        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CollegeName.setTextColor(Color.YELLOW);
                CollegeName.setTextSize(20);
                CollegeName.setTypeface(Typeface.MONOSPACE);
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CollegeName.setTextColor(Color.GREEN);
                CollegeName.setTextSize(20);
                CollegeName.setTypeface(Typeface.MONOSPACE);
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CollegeName.setTextColor(Color.BLUE);
                CollegeName.setTextSize(20);
                CollegeName.setTypeface(Typeface.MONOSPACE);
            }
        });


    }
}