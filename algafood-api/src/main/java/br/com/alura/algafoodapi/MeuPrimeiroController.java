package br.com.alura.algafoodapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    @GetMapping("/ola")
    @ResponseBody
    public String ola() {
        return "Olá, mundo!";
    }
}
