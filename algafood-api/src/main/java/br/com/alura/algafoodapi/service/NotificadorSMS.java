package br.com.alura.algafoodapi.service;

import br.com.alura.algafoodapi.model.Cliente;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador, InitializingBean, DisposableBean {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do telefone %s: %s\n", cliente.getNome(), cliente.getTelefone(), mensagem);
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("Inicializando NotificadorSMS...");
    }

    @Override
    public void destroy() {
        System.out.println("Destruindo NotificadorSMS...");
    }
}