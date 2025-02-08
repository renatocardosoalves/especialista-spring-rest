package br.com.alura.algafoodapi.service;

import br.com.alura.algafoodapi.model.Cliente;

@TipoDoNotificador(NivelUrgencia.NORMAL)
public class NotificadorEmail implements Notificador {

    public void init() {
        System.out.println("Inicializando NotificadorEmail...");
    }

    public void destroy() {
        System.out.println("Destruindo NotificadorEmail...");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
    }
}