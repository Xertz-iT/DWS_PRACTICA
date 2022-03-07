package com.example.TorneoBadminton;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        lista.add(new Equipo("a", "b", "c", "d"));
        model.addAttribute("torneo", torneo);
        model.addAttribute("equipos", lista);
        return "mostrarEquipos";
    }
}
