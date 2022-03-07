package com.example.TorneoBadminton;

public class Match {
    private int id;
    private Equipo equipo1;
    private Equipo equipo2;
    private Equipo ganador;

    public Match(Equipo a, Equipo b){
        equipo1=a;
        equipo2=b;
        ganador=null;
        id=0;
    }

    public Match(){}

    @Override
    public String toString() {
        if (ganador==null){
        return id+": "+equipo1+" vs. " +equipo2;
    }
        return id+": "+equipo1+" vs. " +equipo2 + ". " + "Ganador: "+ ganador;
    }
}
