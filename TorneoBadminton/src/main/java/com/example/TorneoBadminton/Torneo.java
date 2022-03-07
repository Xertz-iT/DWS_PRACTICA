package com.example.TorneoBadminton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Torneo {
    private String name;
    private ArrayList<Match> listaPartidos;
    private Map<Equipo, Integer> listaEquipo;
    private String ganador;
    private int id;

    public Torneo (String a){
        name=a;
        listaPartidos=new ArrayList<>();
        listaEquipo=new HashMap<>();
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
    public void addEquipo(Equipo a){listaEquipo.put(a, 0);}
    public ArrayList<Match> getListaPartidos() {
        return listaPartidos;
    }

    public Map<Equipo, Integer> getListaEquipo() {
        return listaEquipo;
    }
}
