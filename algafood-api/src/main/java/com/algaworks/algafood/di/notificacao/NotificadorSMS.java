package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("normal")
@Component
public class NotificadorSMS implements Notificador {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotificadorSMS.class);

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        LOGGER.info(">>> Notificando {} por SMS através do telefone {}: {}",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }

}
