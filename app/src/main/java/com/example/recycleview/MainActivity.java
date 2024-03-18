package com.example.recycleview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

public class MainActivity extends AppCompatActivity {

    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_data);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new RecyclerViewAdapter();
        recyclerView.setAdapter(adapter);

        adapter.addMhs(new RecyclerView("Abmi Sukma Edri", "12250120341", R.drawable.amiii));
        adapter.addMhs(new RecyclerView("Ahmad Kurniawan", "12250111514", R.drawable.ahmed));
        adapter.addMhs(new RecyclerView("Aufa Hajati", "12250120338", R.drawable.aufa));
        adapter.addMhs(new RecyclerView("Daffa Finanda", "12250111603", R.drawable.dapin));
        adapter.addMhs(new RecyclerView("Daffa Ikhwan Nurfauzan", "12250110979", R.drawable.dafuq));
        adapter.addMhs(new RecyclerView("Diki Afdol", "12250110383", R.drawable.mahasiswa1));
        adapter.addMhs(new RecyclerView("Dwi Jelita Adhliyah", "12250120331", R.drawable.jelita));
        adapter.addMhs(new RecyclerView("Dwi Mahdini", "12250111298", R.drawable.dwik));
        adapter.addMhs(new RecyclerView("Fajri", "12250110382", R.drawable.fajri));
        adapter.addMhs(new RecyclerView("Fakhri", "12250111381", R.drawable.fakhri));
        adapter.addMhs(new RecyclerView("Farras Lathief", "12250111328", R.drawable.farras));
        adapter.addMhs(new RecyclerView("Gilang Ramadhan Indra", "12250111323", R.drawable.gilang));
        adapter.addMhs(new RecyclerView("Hafidz Alhadid Rahman", "1225111794", R.drawable.hafidz));
        adapter.addMhs(new RecyclerView("Haritsah Naufaldy", "12250110361", R.drawable.aldy));
        adapter.addMhs(new RecyclerView("M.Nabil Dawami", "12250111527", R.drawable.nabil));
        adapter.addMhs(new RecyclerView("Muh. Zaki Erbai Syas", "12250111134", R.drawable.zaki));
        adapter.addMhs(new RecyclerView("M. Aditya Rinaldi", "12250111048", R.drawable.adit));
        adapter.addMhs(new RecyclerView("M. Dhimas Hadid", "12250111231", R.drawable.dms));
        adapter.addMhs(new RecyclerView("Muhammad Faruq", "12250111791", R.drawable.faruqhz));
        adapter.addMhs(new RecyclerView("M. Rafly Wirayudha", "12250111489", R.drawable.rafly));
        adapter.addMhs(new RecyclerView("Nurika Dwi Wahyuni", "12250120360", R.drawable.nurika));
        adapter.addMhs(new RecyclerView("Ogya Secio Noegroho.S", "12250111346", R.drawable.ogi));
        adapter.addMhs(new RecyclerView("Rahma Laksita", "12250124357", R.drawable.rahma));
        adapter.addMhs(new RecyclerView("Raka Sabri", "12250110342", R.drawable.mahasiswa1));
        adapter.addMhs(new RecyclerView("Surya Hidayatullah Firdaus", "12250111759", R.drawable.srya));

        adapter.notifyDataSetChanged();
    }
}
