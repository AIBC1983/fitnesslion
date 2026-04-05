# Fitness Lion

Aplicación web desarrollada como prototipo (MVP) para la gestión de usuarios, clases y reservas en un gimnasio.

---

## Tecnologías utilizadas

- Java 21
- Spring Boot
- Thymeleaf
- MySQL
- Maven

---

## Evolución del proyecto

Durante el desarrollo del proyecto se realizó una transición tecnológica, pasando de una implementación inicial en C# a una versión final desarrollada en Java con Spring Boot.

Este cambio permitió una mejor adaptación al desarrollo de aplicaciones web y una integración más sencilla con la base de datos mediante el uso de JPA y Thymeleaf.

---

## Funcionalidades

- Registro de usuarios
- Inicio de sesión
- Visualización de clases
- Reserva de clases
- Cancelación de reservas
- Visualización de datos en la base de datos

---

## Requisitos

Para ejecutar el proyecto es necesario tener instalado:

- Java 21
- MySQL
- Maven
- Eclipse (o cualquier IDE compatible)

---

## Configuración

1. Crear una base de datos en MySQL con el nombre:

fitnesslion

2. Configurar el archivo:

src/main/resources/application.properties

Ejemplo:

spring.datasource.url=jdbc:mysql://localhost:3306/fitnesslion  
spring.datasource.username=root  
spring.datasource.password=tu_password  

---

## Ejecución del proyecto

1. Clonar o descargar el repositorio:

git clone https://github.com/AIBC1983/fitnesslion

2. Importar el proyecto en Eclipse como proyecto Maven

3. Ejecutar la clase principal:

FitnesslionApplication.java

4. Abrir el navegador y acceder a:

http://localhost:8081

---

## Metodología

El desarrollo del proyecto se ha realizado siguiendo una metodología iterativa, organizada en fases (análisis, desarrollo y pruebas), utilizando un tablero Kanban para la gestión del progreso.

---

## Notas finales

Este proyecto representa una primera versión funcional (MVP), cumpliendo con los requisitos principales definidos en el diseño inicial. Se ha priorizado la funcionalidad básica y la correcta integración con la base de datos.

---

## Autor

Alumno: Antonio Iván Baeza Castillo  
Ciclo: 2º DAM  
Proyecto: Fitness Lion
