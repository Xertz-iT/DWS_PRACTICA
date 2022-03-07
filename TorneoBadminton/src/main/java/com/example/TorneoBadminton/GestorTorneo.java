package com.example.TorneoBadminton;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Part;
import java.util.*;

@Controller
public class GestorTorneo {
    ArrayList<Torneo> torneos;
    public  GestorTorneo(){torneos=new ArrayList<>();}
    @GetMapping("/")
    public String inicio(Model model){
        model.addAttribute("torneos", torneos);
        return "inicio";
    }
    @PostMapping("/creado")
    public String addTorneo(Model model, Torneo a){
        torneos.add(a);
        return "TorneoCreado";
    }
    @GetMapping("/torneo/{num}")
    public String mostrarTorneo(Model model, @PathVariable int num){
        Torneo torneo = torneos.get(num-1);
        torneo.setId(num);
        model.addAttribute("torneo", torneo);
        return "mostrarTorneo";
    }
    @GetMapping("torneo/{num}/equipos")
    public String mostrarEquipos(Model model, @PathVariable int num){
        Torneo torneo = torneos.get(num-1);
        Map<Equipo, Integer> mapa = torneo.getListaEquipo();
        Set<Equipo> equipos = mapa.keySet();
        List<Equipo> lista = equipos.stream().toList();
        model.addAttribute("torneo", torneo);
        model.addAttribute("equipos", lista);
        return "mostrarEquipos";
    }
    @GetMapping("torneo/{num}/partidos")
    public String mostrarPartidos(Model model, @PathVariable int num){
        Torneo torneo = torneos.get(num-1);
        ArrayList<Match> lista = torneo.getListaPartidos();
        model.addAttribute("torneo", torneo);
        model.addAttribute("partidos", lista);
        return "mostrarPartidos";

    }
}
