package com.dbcont.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.dbcont.api.utils.SenhaUtils;

@SpringBootApplication
public class SpringProjectApplication {

	@Value("${paginacao.qtd_por_pagina}")
	private int qtdPorPagina;

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			String senhaEncode = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha Encoded: " + senhaEncode);

			senhaEncode = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha encoded novamente: " + senhaEncode);
			
			boolean senhaVerdadeira = SenhaUtils.senhaValida("123456", senhaEncode);

			if (senhaVerdadeira) {

				System.out.println("Senha Válida: " + SenhaUtils.CONST_TRUE);

			} else {

				System.out.println("Senha Válida: " + SenhaUtils.CONST_FALSE);
			}
		};
	}

}
