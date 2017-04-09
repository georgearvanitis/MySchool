package com.example.soliton.myschool;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      final  MySxoleio ms =new MySxoleio();
        String[] data = ms.getNames();



//        String[] data = {
//
//                "Kostas - Sunny ",
//
//                "Swkraths - Foggy ",
//
//                "Nikos - Cloudy ",
//
//                "Vangelis - Rainy ",
//
//        };

        List<String> students = new ArrayList<String>(Arrays.asList(data));

       ArrayAdapter<String> studentAdapter =new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,students);

        ListView listView = (ListView) findViewById(R.id.listviewStudentID);

        listView.setAdapter(studentAdapter);

        AdapterView.OnItemClickListener onItemClickListener= new AdapterView.OnItemClickListener(){public void onItemClick(AdapterView<?>listView,
                                                                                                                           View v,
                                                                                                                           int position,
                                                                                                                            long id){
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("mathitis",position);
            intent.putExtra("mathitisname",ms.getNames()[position]);
            intent.putExtra("mathitisvathmoi0",ms.getMathites().get(position).getVathmoi()[0]);
            intent.putExtra("mathitisvathmoi1",ms.getMathites().get(position).getVathmoi()[1]);
            startActivity(intent);
        }};

  listView.setOnItemClickListener(onItemClickListener);
    }
}
