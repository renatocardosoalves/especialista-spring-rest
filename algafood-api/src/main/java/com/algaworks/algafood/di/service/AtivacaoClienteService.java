package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.NotificadorEmail;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private final NotificadorEmail notificadorEmail;

    public AtivacaoClienteService(NotificadorEmail notificadorEmail) {
        this.notificadorEmail = notificadorEmail;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
        notificadorEmail.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

}
