package com.entreprise.sbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SBdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SBdemoApplication.class, args);
    }


}

/*
    Controller : partie de l'application qui gère les requêtes du client (HTTP). Appel les fonction service

    Service : responsable de la logique métier. Elle est utilisée pour encapsuler les règles métier et les opérations. Appel les fonctions Repository.

    Repository : est responsable de l'accès aux données (CRUD : Create, Read, Update, Delete) en utilisant un ORM (comme JPA/Hibernate) ou en envoyant des requêtes SQL.

    Entity : Une entité est une classe qui représente une structure de données dans la base de données. Utilise par JPA

    DTO : utilisée pour transférer des données entre les couches de l'application ou pour exposer les données via une API.
 */