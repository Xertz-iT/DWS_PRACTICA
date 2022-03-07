package com.example.TorneoBadminton;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class GestorTorneo {
    ArrayList<Torneo> torneos;
    public  GestorTorneo(){torneos=new ArrayList<>();}
    @GetMapping("/")
    public String inicio(Model model){
        model.addAttribute("torneo", torneos);
        return "inicio";
    }
    @GetMapping("/torneoNuevo")
    public String addTorneo(Model model, @RequestParam Torneo a){
        torneos.add(a);
        return "inicio";
    }





}
