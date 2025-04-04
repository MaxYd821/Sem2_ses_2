package com.example.semana2_sesion_2;

public class Contacto {
    private String name;
    private int tel;

    public Contacto(String name, int tel) {
        this.name = name;
        this.tel = tel;
    }

    public Contacto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
}
