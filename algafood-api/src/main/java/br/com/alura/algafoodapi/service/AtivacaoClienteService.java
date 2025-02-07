package br.com.alura.algafoodapi.service;

import br.com.alura.algafoodapi.model.Cliente;
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
        notificadores.forEach(notificador -> notificador.notificar(cliente, "Seu cadastro no sistema está ativo!"));
    }
}