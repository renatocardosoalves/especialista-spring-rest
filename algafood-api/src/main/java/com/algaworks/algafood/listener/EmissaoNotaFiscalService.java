package com.algaworks.algafood.listener;

import com.algaworks.algafood.di.service.ClienteAtivadoEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmissaoNotaFiscalService.class);

    @EventListener
    public void clienteAtivadoEvent(ClienteAtivadoEvent evento) {
        var cliente = evento.getCliente();
        LOGGER.info(">>> Emitindo nota fiscal para o cliente {}", cliente.getNome());
    }

}
