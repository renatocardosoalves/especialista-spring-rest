package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.NivelUrgencia;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.TipoDoNotificador;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class AtivacaoClienteService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AtivacaoClienteService.class);

    @Autowired
    @TipoDoNotificador(NivelUrgencia.URGENTE)
    private Notificador notificador;

//    @PostConstruct
    public void init() {
        LOGGER.info(">>> init() {}", notificador);
    }

//    @PreDestroy
    public void destroy() {
        LOGGER.info(">>> destroy()");
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

}
