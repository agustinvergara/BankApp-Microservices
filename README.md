
# BankApp-Microservices

Este proyecto es una aplicación de cuentas bancarias que gestiona cuentas de ahorro y cuentas corrientes. La aplicación está dividida en tres microservicios: deposits, savings y currents.

## Requerimientos

- Java JDK 21
- Maven 3.9.8
- MySQL

## Inicialización

1. Clona este repositorio:
   ```bash
   git clone https://github.com/agustinvergara/Reto2-Vergara.git
   cd Reto2-Vergara

2. Importa la base de datos y crea el usuario:
    ```bash
    mysql -u (usuario con permisos de creación de db y usuarios) -p < export.sql
Este archivo export.sql crea la base de datos, un usuario que administrará la misma, y la data inicial de la base de datos. También incluye los procedimientos almacenados get_savings_accounts y get_currents_accounts.


3. Inicia los microservicios usando Maven en diferentes terminales:
- Microservicio de depósitos:

    ```bash
    cd deposits
    mvn spring-boot:run

- Microservicio de cuentas de ahorro:

    ```bash
    cd savings
    mvn spring-boot:run

- Microservicio de cuentas corrientes:

    ```bash
    cd currents
    mvn spring-boot:run

Asegúrate de que los tres microservicios estén corriendo simultáneamente.

## Endpoints

Puedes utilizar Postman u otra herramienta similar para interactuar con los endpoints del microservicio de depósitos.

Obtener todas las cuentas de ahorro:

    
    GET http://localhost:8081/deposit-account/saving

Obtener todas las cuentas corrientes:

    
    GET http://localhost:8081/deposit-account/current
Estos endpoints devolverán las cuentas de ahorro y las cuentas corrientes de la base de datos respectivamente.

## Work in Progress

Estoy implementando una librería de entidades comunes (common-entities) en la aplicación. Esta librería aún necesita depuración (debugging) para ser completamente funcional. Sin embargo, los microservicios ya funcionan correctamente y se comunican entre ellos utilizando OpenFeign.

