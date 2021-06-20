package com.algaworks.algafood.listener;

import com.algaworks.algafood.di.notificacao.NivelUrgencia;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.TipoDoNotificador;
import com.algaworks.algafood.di.service.ClienteAtivadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    private final Notificador notificador;

    public NotificacaoService(@TipoDoNotificador(NivelUrgencia.URGENTE) Notificador notificador) {
        this.notificador = notificador;
    }

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent evento) {
        var cliente = evento.getCliente();
        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

}
