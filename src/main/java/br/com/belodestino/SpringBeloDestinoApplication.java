package br.com.belodestino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringBeloDestinoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeloDestinoApplication.class, args);
		
		System.out.println("Aplicação rodando...");
		
	}

}

