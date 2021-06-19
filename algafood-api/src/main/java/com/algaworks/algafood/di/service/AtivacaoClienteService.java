package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AtivacaoClienteService {

    private final List<Notificador> notificadores;

    public AtivacaoClienteService(List<Notificador> notificadores) {
        this.notificadores = notificadores;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificadores.forEach(notificador ->
                notificador.notificar(cliente, "Seu cadastro no sistema está ativo!"));
    }

}
