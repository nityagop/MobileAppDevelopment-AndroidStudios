package com.example.buttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //links activity to xml file

        b = findViewById(R.id.id_button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.setText("Hi 2.0");
            }
        });
    }

    /*
    public void MyButtonClick (View v)
    {
        //a.setText("Clicked");
        ((Button)v).setText("HI");

    }*/


}