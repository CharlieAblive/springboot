package com.atividade.springboot.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/")
public class ExController {
    @GetMapping("/api")
    public String home(){
        return "Olá, aplicação Spring!";

    }
public String getMethodName(@RequestParam String param) {
    return new String();
}

@GetMapping("/api/teste/soma/{numUm}/{numDois}")
public int testesoma(@PathVariable int numUm, @PathVariable int numDois){
    int soma = numUm + numDois;
    return soma;

    }

@GetMapping("/api/teste/sub/{numUm}/{numDois}")
public int testesub(@PathVariable int numUm, @PathVariable int numDois){
    int sub = numUm - numDois;
    return sub;

    }
}

