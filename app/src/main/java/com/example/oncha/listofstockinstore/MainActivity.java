package com.example.oncha.listofstockinstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[]  stock = {
            "Kifaru Ngano 2Kg",
            "Kifaru Ngano 1Kg",
            "Kifaru Ugali 2Kg",
            "Kifaru Ugali 1Kg",
            "Pembe Ngano 2Kg",
            "Pembe Ngano 1Kg"
    };;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.stock);
        arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_view, stock);
        listView.setAdapter(arrayAdapter);
    }
}
