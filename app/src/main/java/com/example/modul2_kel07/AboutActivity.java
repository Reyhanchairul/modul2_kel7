package com.example.modul2_kel07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AboutActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        listView =findViewById(R.id.listview);

        ArrayList<anggota> arrayList = new ArrayList<>();

        arrayList.add(new anggota(R.drawable.tujuh,"Kelompok","7"));
        arrayList.add(new anggota(R.drawable.viona,"Khoirun Nisa","21120119120006"));
        arrayList.add(new anggota(R.drawable.shrek,"Sayid Miqdad","21120119130046"));
        arrayList.add(new anggota(R.drawable.shrek,"Pramudya Anggara","21120119130061"));
        arrayList.add(new anggota(R.drawable.shrek,"Reyhan Chairul","21120119140140"));

        //customadaptor
        anggotaadaptor anggotaadaptor = new anggotaadaptor(this, R.layout.activity_wajah,arrayList);
        listView.setAdapter(anggotaadaptor);
    }

}