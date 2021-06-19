package com.algaworks.di.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.Notificador;

import java.util.List;

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
