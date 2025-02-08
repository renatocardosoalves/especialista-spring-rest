package br.com.alura.algafoodapi.service;

import br.com.alura.algafoodapi.model.Cliente;
import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {

    private final NotificadorProperties notificadorProperties;

    public NotificadorEmail(NotificadorProperties notificadorProperties) {
        this.notificadorProperties = notificadorProperties;
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("Host: " + notificadorProperties.getHostServidor() + " Porta: " + notificadorProperties.getPortaServidor());
        System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
    }
}