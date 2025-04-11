package com.example.semana2_sesion_2.Services;

import com.example.semana2_sesion_2.ColorResponse;
import com.example.semana2_sesion_2.Colorclass;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ColorService {
    //https://run.mocky.io/v3/314ea1f2-a40b-4fa5-af1a-66f91f81d183
    @GET("/api/colors")
    Call<ColorResponse> getColors();
}
