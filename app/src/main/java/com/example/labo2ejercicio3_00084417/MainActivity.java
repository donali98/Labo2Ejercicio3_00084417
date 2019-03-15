package com.example.labo2ejercicio3_00084417;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private int iterator = 0;
    private TextView txtRed,txtGreen,txtBlue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtRed = findViewById(R.id.txtRed);
        txtRed.setOnClickListener(this);

        txtGreen = findViewById(R.id.txtGreen);
        txtGreen.setOnClickListener(this);

        txtBlue = findViewById(R.id.txtBlue);
        txtBlue.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId  = v.getId();
        switch (viewId){
            case R.id.txtRed:
                changeColor(1);
            break;
            case R.id.txtGreen:
                changeColor(2);
            break;
            case R.id.txtBlue:
                changeColor(3);
            break;
        }
    }

    private void changeColor(int which){
        switch (which) {
            case 1:
                if (iterator == 6)
                    iterator = 0;
                switch (iterator) {
                    case 0:
                        txtRed.setBackgroundColor(getResources().getColor(R.color.redType1));
                        break;
                    case 1:
                        txtRed.setBackgroundColor(getResources().getColor(R.color.redType2));
                        break;
                    case 2:
                        txtRed.setBackgroundColor(getResources().getColor(R.color.redType3));
                        break;
                    case 3:
                        txtRed.setBackgroundColor(getResources().getColor(R.color.redType4));
                        break;
                    case 4:
                        txtRed.setBackgroundColor(getResources().getColor(R.color.redType5));
                        break;
                    case 5:
                        txtRed.setBackgroundColor(getResources().getColor(R.color.redType6));
                        break;
                }
                break;
            case 2:
                if (iterator == 6)
                    iterator = 0;
                switch (iterator) {
                    case 0:
                        txtGreen.setBackgroundColor(getResources().getColor(R.color.greenType1));
                        break;
                    case 1:
                        txtGreen.setBackgroundColor(getResources().getColor(R.color.greenType2));
                        break;
                    case 2:
                        txtGreen.setBackgroundColor(getResources().getColor(R.color.greenType3));
                        break;
                    case 3:
                        txtGreen.setBackgroundColor(getResources().getColor(R.color.greenType4));
                        break;
                    case 4:
                        txtGreen.setBackgroundColor(getResources().getColor(R.color.greenType5));
                        break;
                    case 5:
                        txtGreen.setBackgroundColor(getResources().getColor(R.color.greenType6));
                        break;
                }
                break;
            case 3:
                if (iterator == 6)
                    iterator = 0;
                switch (iterator) {
                    case 0:
                        txtBlue.setBackgroundColor(getResources().getColor(R.color.blueType1));
                        break;
                    case 1:
                        txtBlue.setBackgroundColor(getResources().getColor(R.color.blueType2));
                        break;
                    case 2:
                        txtBlue.setBackgroundColor(getResources().getColor(R.color.blueType3));
                        break;
                    case 3:
                        txtBlue.setBackgroundColor(getResources().getColor(R.color.blueType4));
                        break;
                    case 4:
                        txtBlue.setBackgroundColor(getResources().getColor(R.color.blueType5));
                        break;
                    case 5:
                        txtBlue.setBackgroundColor(getResources().getColor(R.color.blueType6));
                        break;
                }
            break;
        }

        iterator++;
    }
}
