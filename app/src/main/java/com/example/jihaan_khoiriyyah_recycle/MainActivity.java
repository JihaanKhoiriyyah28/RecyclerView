package com.example.jihaan_khoiriyyah_recycle;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa("2312500123", "Nurul", "nurul@gmail.com", "05-05-2000"));
        mahasiswaList.add(new Mahasiswa("2312500678", "Septi Zahrani", "szahrani@gmail.com", "14-09-1995"));
        mahasiswaList.add(new Mahasiswa("2312500021", "Nisa Fitri", "fitri28@gmail.com", "28-03-1999"));
        mahasiswaList.add(new Mahasiswa("2312500973", "Alya Rahma", "alra@gmail.com", "06-04-2005"));
        mahasiswaList.add(new Mahasiswa("2312500963", "Amelia", "amelias@gmail.com", "14-02-2003"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MahasiswaAdapter(mahasiswaList));
    }
}