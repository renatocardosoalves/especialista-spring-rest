package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AtivacaoClienteService.class);

    @Autowired(required = false)
    private Notificador notificador;

    public void ativar(Cliente cliente) {
        cliente.ativar();

        if (notificador != null) {
            notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
        } else {
            LOGGER.info(">>> Não existe notificador, mas o cliente foi ativado");
        }
    }

}
