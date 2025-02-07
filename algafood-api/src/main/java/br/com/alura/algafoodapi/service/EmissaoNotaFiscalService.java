package br.com.alura.algafoodapi.service;

import br.com.alura.algafoodapi.model.Cliente;

public class EmissaoNotaFiscalService {

    private final Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente) {
        // TODO: emite nota fiscal para o cliente
        notificador.notificar(cliente, "Nota fiscal do cliente " + cliente.getNome() + " emitida!");
    }
}
