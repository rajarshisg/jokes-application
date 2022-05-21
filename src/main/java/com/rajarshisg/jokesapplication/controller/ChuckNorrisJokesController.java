package com.rajarshisg.jokesapplication.controller;

import com.rajarshisg.jokesapplication.service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChuckNorrisJokesController {
    private final JokesService jokesService;
    ChuckNorrisJokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String renderJokesPage(Model model) {
        model.addAttribute("joke", jokesService.getJoke());
        return "index";
    }
}
