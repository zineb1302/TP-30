package com.example.Point.of.sale.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Contrôleur REST pour gérer les endpoints de base de l'application.
 * Fournit des endpoints pour les salutations et informations générales.
 * @author Zineb
 * @version 1.0
 */
@RestController
@RequestMapping("/")
public class HelloController {
    /**
     * Retourne un message de salutation.
     * @return message de bienvenue
     */
    @GetMapping
    public String hello() {
        return "Hello from New Test :)";
    }

    /**
     * Retourne les informations des utilisateurs.
     * @return chaîne représentant les utilisateurs
     */
    @GetMapping("/user")
    public String getUsers(){
        return "Users";
    }

    /**
     * Retourne la page de présentation.
     * @return chaîne représentant la présentation
     */
    @GetMapping("/presentation")
    public String getPresentation(){
        return "presentation";
    }

}
