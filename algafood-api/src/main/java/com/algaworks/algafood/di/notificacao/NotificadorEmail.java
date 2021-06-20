package com.algaworks.algafood.di.notificacao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotificadorEmail.class);

    private final NotificadorProperties properties;
    
    public NotificadorEmail(NotificadorProperties properties) {
		this.properties = properties;
	}

	@Override
    public void notificar(Cliente cliente, String mensagem) {
        LOGGER.info("Host: {} Porta: {}", properties.getHostServidor(), properties.getPortaServidor());
    	
    	LOGGER.info(">>> Notificando {} através do e-mail {}: {}",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

}
