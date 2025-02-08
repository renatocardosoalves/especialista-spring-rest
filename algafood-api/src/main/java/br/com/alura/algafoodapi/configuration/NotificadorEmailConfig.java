package br.com.alura.algafoodapi.configuration;

import br.com.alura.algafoodapi.service.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificadorEmailConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public NotificadorEmail notificadorEmail() {
        return new NotificadorEmail();
    }
}
