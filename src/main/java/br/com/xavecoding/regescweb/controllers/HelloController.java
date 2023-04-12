package br.com.xavecoding.regescweb.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView("hello"); //nome do arquivo a html a ser exibido
        mv.addObject("nome", "Zézão");
        return mv; // o Spring vai renderizar o arquivo templates/hello.html
    }

    @GetMapping("/hello-model")
    public String hello(Model model) {
        model.addAttribute("nome", "Zezin");
        return "hello"; // o Spring vai renderizar o arquivo templates/hello.html
    }

    @GetMapping("/hello-servlet")
    public String hello(HttpServletRequest request){
        request.setAttribute("nome", "Greg");
        return "hello"; // o Spring vai renderizar o arquivo templates/hello.html
    }



}
