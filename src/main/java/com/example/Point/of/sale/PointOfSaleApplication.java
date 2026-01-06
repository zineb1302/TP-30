package com.example.Point.of.sale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Classe principale de l'application Point of Sale.
 * Cette classe initialise et démarre l'application Spring Boot.
 * @author Zineb
 * @version 1.0
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PointOfSaleApplication {
	/**
	 * Méthode principale qui démarre l'application Spring Boot.
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		SpringApplication.run(PointOfSaleApplication.class, args);
	}
}
