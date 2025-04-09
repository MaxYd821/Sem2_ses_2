package com.example.semana2_sesion_2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
        Colorclass color4 = new Colorclass();
        Colorclass color5 = new Colorclass();
        Colorclass color6 = new Colorclass();
        Colorclass color7 = new Colorclass();
        Colorclass color8 = new Colorclass();
        Colorclass color9 = new Colorclass();
        Colorclass color10 = new Colorclass();
        Colorclass color11 = new Colorclass();
        Colorclass color12 = new Colorclass();
        Colorclass color13 = new Colorclass();
        Colorclass color14 = new Colorclass();
        Colorclass color15 = new Colorclass();
        Colorclass color16 = new Colorclass();
        Colorclass color17 = new Colorclass();
        Colorclass color18 = new Colorclass();
        color1.setName("Lavender");
        color1.setHex("#E6E6FA");
        color2.setName("Thistle");
        color2.setHex("#D8BFD8");
        color3.setName("Plum");
        color3.setHex("#DDA0DD");
        color4.setName("Violet");
        color4.setHex("#EE82EE");
        color5.setName("Orchid");
        color5.setHex("#DA70D6");
        color6.setName("Fuchsia");
        color6.setHex("#FF00FF");
        color7.setName("MediumOrchid");
        color7.setHex("#BA55D3");
        color8.setName("MediumPurple");
        color8.setHex("#9370DB");
        color9.setName("RebeccaPurple");
        color9.setHex("#663399");
        color10.setName("BlueViolet");
        color10.setHex("#8A2BE2");
        color11.setName("DarkViolet");
        color11.setHex("#9400D3");
        color12.setName("DarkOrchid");
        color12.setHex("#9932CC");
        color13.setName("DarkMagenta");
        color13.setHex("#8B008B");
        color14.setName("Purple");
        color14.setHex("#800080");
        color15.setName("Indigo");
        color15.setHex("#4B0082");
        color16.setName("SlateBlue");
        color16.setHex("#6A5ACD");
        color17.setName("DarkSlateBlue");
        color17.setHex("#483D8B");
        color18.setName("MediumSlateBlue");
        color18.setHex("#7B68EE");

        data.add(color1);
        data.add(color2);
        data.add(color3);
        data.add(color4);
        data.add(color5);
        data.add(color6);
        data.add(color7);
        data.add(color8);
        data.add(color9);
        data.add(color10);
        data.add(color11);
        data.add(color12);
        data.add(color13);
        data.add(color14);
        data.add(color15);
        data.add(color16);
        data.add(color17);
        data.add(color18);

        RecyclerView rvBasic = findViewById(R.id.rvBasiccolor);
        rvBasic.setLayoutManager(new LinearLayoutManager(this));
        BasicAdapterColor adapter = new BasicAdapterColor(data);
        rvBasic.setAdapter(adapter);
    }
}
