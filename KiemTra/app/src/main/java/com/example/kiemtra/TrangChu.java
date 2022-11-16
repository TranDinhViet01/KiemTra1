package com.example.kiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TrangChu extends AppCompatActivity {
    ListView lv;
    ArrayList<CongAn> ArrayDS;
    AdapterList adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);

        lv = (ListView) findViewById(R.id.listview);
        ArrayDS = new ArrayList<>();
        ArrayDS.add(new CongAn( R.drawable.items_congan,"Tran Dinh Viet","Sĩ Quan","Da Nang","2 sao"));
        ArrayDS.add(new CongAn( R.drawable.items_congan,"Dong Hai Long","Sĩ Quan","Da Nang","2 sao"));
        ArrayDS.add(new CongAn( R.drawable.items_congan,"Nguyen Van Khoa","Sĩ Quan","Da Nang","2 sao"));
        adapter = new AdapterList(TrangChu.this, R.layout.items, ArrayDS);
        lv.setAdapter(adapter);

    }
}