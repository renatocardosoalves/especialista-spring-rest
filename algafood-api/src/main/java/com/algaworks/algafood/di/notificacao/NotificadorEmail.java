package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class NotificadorEmail implements Notificador {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotificadorEmail.class);

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        LOGGER.info(">>> Notificando {} através do e-mail {}: {}",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

}
