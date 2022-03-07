package com.example.TorneoBadminton;

import java.util.ArrayList;

public class Torneo {
    private String name;
    private ArrayList<String> listaPartidos;
    private ArrayList<String> listaEquipo;
    private String ganador;

    public Torneo (String a){
        name=a;
        listaPartidos=new ArrayList<>();
        listaEquipo=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<?> getListaPartidos() {
        return listaPartidos;
    }
}
