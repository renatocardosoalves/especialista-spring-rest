package com.algaworks.algafood;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.service.AtivacaoClienteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeuPrimeiroController.class);

    private final AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
        LOGGER.info("MeuPrimeiroController: {}", ativacaoClienteService);
        this.ativacaoClienteService = ativacaoClienteService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        var cliente = new Cliente("João", "joao@xyz.com", "1122223333");
        ativacaoClienteService.ativar(cliente);
        return "Hello!";
    }

}
