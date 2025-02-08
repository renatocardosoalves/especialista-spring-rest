package br.com.alura.algafoodapi.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    private final Notificador notificador;

    public NotificacaoService(@TipoDoNotificador(NivelUrgencia.NORMAL) Notificador notificador) {
        this.notificador = notificador;
    }

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
        notificador.notificar(event.cliente(), "Seu cadastro no sistema está ativo!");
    }

    @EventListener void notaFiscalEmitidaListener(NotaFiscalEmitidaEvent event) {
        var cliente = event.cliente();
        notificador.notificar(cliente, "Nota fiscal do cliente " + cliente.getNome() + " emitida!");
    }
}