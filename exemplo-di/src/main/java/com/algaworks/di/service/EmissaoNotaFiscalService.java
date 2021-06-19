package com.algaworks.di.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.modelo.Produto;
import com.algaworks.di.notificacao.NotificadorEmail;

public class EmissaoNotaFiscalService {

    private final NotificadorEmail notificadorEmail;

    public EmissaoNotaFiscalService(NotificadorEmail notificadorEmail) {
        this.notificadorEmail = notificadorEmail;
    }

    public void emitir(Cliente cliente, Produto produto) {
        // TODO emite a nota fiscal aqui...
        notificadorEmail.notificar(cliente, "Nota fiscal do produto " + produto.getNome() + " foi emitida!");
    }

}
