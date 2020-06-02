package com.example.multipleactivitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    /*public void goNext()
    {
        Intent intent =new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("name", name);
                startActivity(intent);
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView =findViewById(R.id.listView);
        final ArrayList<String> friends= new ArrayList<String>();
        friends.add("fido");
        friends.add("saun");
        friends.add("sarah");
        friends.add("jane");
        ArrayAdapter arrayAdapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1, friends);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent intent =new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("name", friends.get(i));
                startActivity(intent);


            }
        });

    }
}
