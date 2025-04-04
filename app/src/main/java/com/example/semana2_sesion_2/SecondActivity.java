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

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.second), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        List<Contacto> data = new ArrayList<>();
        Contacto contacto1 = new Contacto();
        Contacto contacto2 = new Contacto();
        Contacto contacto3 = new Contacto();
        contacto1.setName("Persona1");
        contacto1.setTel(957182736);
        contacto2.setName("Persona2");
        contacto2.setTel(957169587);
        contacto3.setName("Persona3");
        contacto3.setTel(845963251);
        data.add(contacto1);
        data.add(contacto2);
        data.add(contacto3);

        RecyclerView rvBasic = findViewById(R.id.rvBasic);
        rvBasic.setLayoutManager(new LinearLayoutManager(this));
        BasicAdapter adapter = new BasicAdapter(data);
        rvBasic.setAdapter(adapter);
    }
}
