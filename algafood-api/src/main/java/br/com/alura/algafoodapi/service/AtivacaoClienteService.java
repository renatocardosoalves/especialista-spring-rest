package br.com.alura.algafoodapi.service;

import br.com.alura.algafoodapi.model.Cliente;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private final Notificador notificador;

    public AtivacaoClienteService(@TipoDoNotificador(NivelUrgencia.URGENTE) Notificador notificador) {
        this.notificador = notificador;
    }

    @PostConstruct
    public void init() {
        System.out.println("Inicializando AtivacaoClienteService...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destruindo AtivacaoClienteService...");
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}