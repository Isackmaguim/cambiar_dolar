package br.com.unipe.aluno_cambio.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("br.com.unipe.aluno_cambio")
@EnableWebMvc
public class RootConfig {

}
