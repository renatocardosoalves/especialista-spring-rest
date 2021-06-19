package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.NotificadorEmail;
import com.algaworks.di.notificacao.NotificadorSMS;
import com.algaworks.di.service.AtivacaoClienteService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        var joao = new Cliente("João", "joao@xyz.com", "3499998888");
        var maria = new Cliente("Maria", "maria@xyz.com", "1177772222");

        var notificadores = List.of(new NotificadorEmail(), new NotificadorSMS());

        var ativacaoCliente = new AtivacaoClienteService(notificadores);
        ativacaoCliente.ativar(joao);
        ativacaoCliente.ativar(maria);
    }

}
