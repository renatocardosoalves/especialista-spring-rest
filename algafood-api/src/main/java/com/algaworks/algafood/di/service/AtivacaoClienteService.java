package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private final ApplicationEventPublisher eventPublisher;

    public AtivacaoClienteService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
        eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
    }

}
