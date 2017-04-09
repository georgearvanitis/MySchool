package com.example.soliton.myschool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    String[] data = {

            "Kostas - Ioanides ",

            "Swkraths - Arvanitis ",

            "Nikos - Bekris ",

            "Vangelis - Rainy ",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        int position=(Integer)getIntent().getExtras().get("mathitis");

        TextView textView = (TextView)findViewById(R.id.textView3);
        textView.setText(data[position]);
    }
}
