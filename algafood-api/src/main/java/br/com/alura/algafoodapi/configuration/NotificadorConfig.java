package br.com.alura.algafoodapi.configuration;

import br.com.alura.algafoodapi.service.Notificador;
import br.com.alura.algafoodapi.service.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificadorConfig {

    @Bean
    public Notificador notificadorEmail() {
        var notificador = new NotificadorEmail("smtp.algamail.com.br");
        notificador.setCaixaAlta(true);
        return notificador;
    }
}