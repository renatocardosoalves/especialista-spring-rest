package br.com.alura.algafoodapi.service;

import br.com.alura.algafoodapi.model.Cliente;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {

    private final ApplicationEventPublisher eventPublisher;

    public EmissaoNotaFiscalService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @EventListener
    public void clienteAtivado(ClienteAtivadoEvent event) {
        emitir(event.cliente());

    }

    public void emitir(Cliente cliente) {
        // TODO: emite nota fiscal para o cliente
        eventPublisher.publishEvent(new NotaFiscalEmitidaEvent(cliente));
    }
}