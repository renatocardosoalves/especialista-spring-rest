package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotificadorEmail.class);

    @Value("${notificador.email.host-servidor}")
    private String host;
    
    @Value("${notificador.email.porta-servidor}")
    private Integer porta;
    
    @Override
    public void notificar(Cliente cliente, String mensagem) {
        LOGGER.info("Host: {} Porta: {}", host, porta);
    	
    	LOGGER.info(">>> Notificando {} através do e-mail {}: {}",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

}
