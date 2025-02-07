package br.com.alura.algafoodapi.service;

import br.com.alura.algafoodapi.model.Cliente;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmissaoNotaFiscalService {

    private final List<Notificador> notificadores;

    public EmissaoNotaFiscalService(List<Notificador> notificadores) {
        this.notificadores = notificadores;
    }

    public void emitir(Cliente cliente) {
        // TODO: emite nota fiscal para o cliente
        notificadores.forEach(notificador -> notificador.notificar(cliente, "Nota fiscal do cliente " + cliente.getNome() + " emitida!"));
    }
}