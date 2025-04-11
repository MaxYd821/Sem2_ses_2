package com.example.semana2_sesion_2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.semana2_sesion_2.Services.ColorService;
import com.example.semana2_sesion_2.adapters.BasicAdapterColor;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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
        Colorclass color1 = new Colorclass("Lavender","#E6E6FA");
        Colorclass color2 = new Colorclass("Thistle","#D8BFD8");
        Colorclass color3 = new Colorclass("Plum","#DDA0DD");
        Colorclass color4 = new Colorclass("Violet","#EE82EE");
        Colorclass color5 = new Colorclass("Orchid","#DA70D6");
        Colorclass color6 = new Colorclass("Fuchsia","#FF00FF");
        Colorclass color7 = new Colorclass("MediumOrchid","#BA55D3");
        Colorclass color8 = new Colorclass("MediumPurple","#9370DB");
        Colorclass color9 = new Colorclass("RebeccaPurple","#663399");
        Colorclass color10 = new Colorclass("BlueViolet","#8A2BE2");
        Colorclass color11 = new Colorclass("DarkViolet","#9400D3");
        Colorclass color12 = new Colorclass("DarkOrchid","#9932CC");
        Colorclass color13 = new Colorclass("DarkMagenta","#8B008B");
        Colorclass color14 = new Colorclass("Purple","#800080");
        Colorclass color15 = new Colorclass("Indigo","#4B0082");
        Colorclass color16 = new Colorclass("SlateBlue","#6A5ACD");
        Colorclass color17 = new Colorclass("DarkSlateBlue","#483D8B");
        Colorclass color18 = new Colorclass("MediumSlateBlue","#7B68EE");

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

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://run.mocky.io")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ColorService service = retrofit.create(ColorService.class);

        service.getColors().enqueue(new Callback<List<Colorclass>>() {
            @Override
            public void onResponse(Call<List<Colorclass>> call, Response<List<Colorclass>> response) {
                List<Colorclass> data1 = new ArrayList<>();
                data1 = response.body();

                BasicAdapterColor adapter = new BasicAdapterColor(data1);
                rvBasic.setAdapter(adapter);
            }

            @Override
            //ingresa si no ingresó al servidor, ejm: servidor apagado
            public void onFailure(Call<List<Colorclass>> call, Throwable throwable) {

            }
        });

        //RecyclerView rvBasic = findViewById(R.id.rvBasiccolor);
        //rvBasic.setLayoutManager(new LinearLayoutManager(this));
        //BasicAdapterColor adapter = new BasicAdapterColor(data);
        //rvBasic.setAdapter(adapter);
    }
}
