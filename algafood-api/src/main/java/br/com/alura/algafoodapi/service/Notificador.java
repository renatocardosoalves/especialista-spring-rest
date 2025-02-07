package br.com.alura.algafoodapi.service;

import br.com.alura.algafoodapi.model.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);
}
