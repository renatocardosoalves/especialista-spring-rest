package com.algaworks.algafood;

import com.algaworks.algafood.di.notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificacaoConfig {

    @Bean
    public NotificadorEmail notificadorEmail() {
        var hostServidorSmtp = "smtp.algamail.com.br";
        var notificadorEmail = new NotificadorEmail(hostServidorSmtp);
        notificadorEmail.setCaixaAlta(true);
        return notificadorEmail;
    }

}
