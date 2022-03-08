package com.example.TorneoBadminton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class TorneoRESTController {

    @Autowired
    Torneo torneo ;

}
