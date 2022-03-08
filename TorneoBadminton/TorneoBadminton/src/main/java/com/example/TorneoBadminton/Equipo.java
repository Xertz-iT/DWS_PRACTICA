package com.example.TorneoBadminton;

public class Equipo {
    private String name;
    private String integrante1;
    private String integrante2;
    private String patrocinador;
    public Equipo(String name, String a, String b, String c){
        this.name = name;
        integrante1=a;
        integrante2=b;
        patrocinador=c;
    }
    public Equipo(){}

    @Override
    public String toString() {
        return name;
    }
}
