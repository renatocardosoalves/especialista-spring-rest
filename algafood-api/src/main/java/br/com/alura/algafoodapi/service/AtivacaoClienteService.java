package br.com.alura.algafoodapi.service;

import br.com.alura.algafoodapi.model.Cliente;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private final Notificador notificador;

    public AtivacaoClienteService(@TipoDoNotificador(NivelUrgencia.URGENTE) Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}