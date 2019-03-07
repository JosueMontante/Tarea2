package com.example.tarea2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity {
    ImageButton like;
    Button btn1,btn2, btn3, btn4, car;
    int btnstate1 = 0,btnstate2 = 0 ,btnstate3 = 0 ,btnstate4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            onRestoreInstanceState(savedInstanceState);
            //No insta carga
        }
        setContentView(R.layout.activity_main);
        like = findViewById(R.id.like_btn);
        btn1 = findViewById(R.id.btn_small);
        btn2 = findViewById(R.id.btn_med);
        btn3 = findViewById(R.id.btn_L);
        btn4 = findViewById(R.id.btn_XL);
        car = findViewById(R.id.btn_add_to_car);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityMain.this, R.string.toast_like_button, Toast.LENGTH_SHORT).show();
            }
        });


        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });


    }

    public void onClick(View view){
        if (view == btn1 || btnstate1 == 1){
            btn1.setBackgroundResource(R.color.colorPrimary);
            btn1.setTextColor(getResources().getColor(R.color.colorWhite));
            btnstate1 = 1;

        }
        if (view == btn2 || btnstate2 == 1){
            btn2.setBackgroundResource(R.color.colorPrimary);
            btn2.setTextColor(getResources().getColor(R.color.colorWhite));

            btnstate2 = 1;
        }
        if (view == btn3 || btnstate3 == 1){
            btn3.setBackgroundResource(R.color.colorPrimary);
            btn3.setTextColor(getResources().getColor(R.color.colorWhite));

            btnstate3 = 1;
        }
        if (view == btn4 || btnstate4 == 1){
            btn4.setBackgroundResource(R.color.colorPrimary);
            btn4.setTextColor(getResources().getColor(R.color.colorWhite));

            btnstate4 = 1;
        }

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("btn1",btnstate1);
        outState.putInt("btn2",btnstate2);
        outState.putInt("btn3",btnstate3);
        outState.putInt("btn4",btnstate4);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        btnstate1 = savedInstanceState.getInt("btn1");
        btnstate2 = savedInstanceState.getInt("btn2");
        btnstate3 = savedInstanceState.getInt("btn3");
        btnstate4 = savedInstanceState.getInt("btn4");
    }

    public class UndoListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {

        }
    }
}
