package com.devsuperior.sistemaEventos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaeventosApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SistemaeventosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("******** Sistema de eventos no AR!! *********** ");
		
	}

}
