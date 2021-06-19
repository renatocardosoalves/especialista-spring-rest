package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificadorEmail implements Notificador {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotificadorEmail.class);

    private boolean caixaAlta;
    private final String hostServidorSmtp;

    public NotificadorEmail(String hostServidorSmtp) {
        this.hostServidorSmtp = hostServidorSmtp;
        LOGGER.info(">>> NotificadorEmail");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        if (caixaAlta) {
            mensagem = mensagem.toUpperCase();
        }

        LOGGER.info(">>> Notificando {} através do e-mail {} usando SMTP {}: {}",
                cliente.getNome(), cliente.getEmail(), hostServidorSmtp, mensagem);
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }

}
