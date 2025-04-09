package com.example.semana2_sesion_2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.semana2_sesion_2.adapters.BasicAdapter;
import com.example.semana2_sesion_2.adapters.BasicAdapterColor;

import java.util.ArrayList;
import java.util.List;

public class ColorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_color);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.color), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        List<Colorclass> data = new ArrayList<>();
        Colorclass color1 = new Colorclass();
        Colorclass color2 = new Colorclass();
        Colorclass color3 = new Colorclass();
        color1.setName("Rojo");
        color1.setHex("##FF0000");
        color2.setName("Azul");
        color2.setHex("#0000FF");
        color3.setName("Verde");
        color3.setHex("#008000");
        data.add(color1);
        data.add(color2);
        data.add(color3);

        RecyclerView rvBasic = findViewById(R.id.rvBasiccolor);
        rvBasic.setLayoutManager(new LinearLayoutManager(this));
        BasicAdapterColor adapter = new BasicAdapterColor(data);
        rvBasic.setAdapter(adapter);
    }
}
