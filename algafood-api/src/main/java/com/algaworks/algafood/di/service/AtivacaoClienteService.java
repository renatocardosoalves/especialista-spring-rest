package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AtivacaoClienteService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AtivacaoClienteService.class);

    private final Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        LOGGER.info(">>> AtivaçãoClienteService: {}", notificador);
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

}
