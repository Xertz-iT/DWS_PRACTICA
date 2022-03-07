package com.example.TorneoBadminton;

import java.util.ArrayList;

public class Torneo {
    private String name;
    private ArrayList<String> listaPartidos;
    private ArrayList<String> listaEquipo;
    private String ganador;
    private int id;

    public Torneo (String a){
        name=a;
        listaPartidos=new ArrayList<>();
        listaEquipo=new ArrayList<>();
        id=0;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addEquipo(String a){listaEquipo.add(a);}
    public ArrayList<String> getListaPartidos() {
        return listaPartidos;
    }
}
