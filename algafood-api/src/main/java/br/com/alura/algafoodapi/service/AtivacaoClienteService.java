package br.com.alura.algafoodapi.service;

import br.com.alura.algafoodapi.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Autowired(required = false)
    private Notificador notificador;

    public void ativar(Cliente cliente) {
        cliente.ativar();
        if (notificador != null) {
            notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
            return;
        }
        System.out.println("Não existe um notificador configurado, mas o cliente foi ativado.");
    }
}