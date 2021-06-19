package com.algaworks.algafood;

import com.algaworks.algafood.di.notificacao.NotificadorEmail;
import com.algaworks.algafood.di.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;

// @Configuration
public class AlgaConfig {

    @Bean
    public NotificadorEmail notificadorEmail() {
        var hostServidorSmtp = "smtp.algamail.com.br";
        var notificadorEmail = new NotificadorEmail(hostServidorSmtp);
        notificadorEmail.setCaixaAlta(true);
        return notificadorEmail;
    }

    @Bean
    public AtivacaoClienteService ativacaoClienteService() {
        return new AtivacaoClienteService(notificadorEmail());
    }

}
