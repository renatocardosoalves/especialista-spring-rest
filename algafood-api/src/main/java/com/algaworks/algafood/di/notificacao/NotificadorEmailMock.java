package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmailMock implements Notificador {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotificadorEmailMock.class);

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        LOGGER.info(">>> MOCK: Notificando {} através do e-mail {}: {}",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

}
