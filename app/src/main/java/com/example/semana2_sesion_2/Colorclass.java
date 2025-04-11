package com.example.semana2_sesion_2;

import com.google.gson.annotations.SerializedName;

public class Colorclass {


    private String name;
    @SerializedName("hex")
    private String hex;

    public Colorclass(String name, String hex) {
        this.name = name;
        this.hex = hex;
    }
    public Colorclass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }
}
