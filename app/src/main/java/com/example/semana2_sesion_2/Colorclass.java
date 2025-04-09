package com.example.semana2_sesion_2;

public class Colorclass {
    private String name;
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
