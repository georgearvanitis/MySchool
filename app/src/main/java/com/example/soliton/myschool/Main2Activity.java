package com.example.soliton.myschool;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

//    String[] data = {
//
//            "Kostas - Ioanides ",
//
//            "Swkraths - Arvanitis ",
//
//            "Nikos - Bekris ",
//
//            "Vangelis - Rainy ",
//
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        int position=(Integer)getIntent().getExtras().get("mathitis");
        String mname= (String)getIntent().getExtras().get("mathitisname");
        double v0=(Double)getIntent().getExtras().get("mathitisvathmoi0");
        double v1=(Double)getIntent().getExtras().get("mathitisvathmoi1");

        TextView nametextView = (TextView)findViewById(R.id.textViewname);
        TextView mathtextView = (TextView)findViewById(R.id.textViewMath);
        TextView phystextView = (TextView)findViewById(R.id.textViewphys);
    //    textView.setText(data[position]);
        nametextView.setText(mname);
        mathtextView.setText(Double.toString(v0));
        phystextView.setText(Double.toString(v1));
    }
}
