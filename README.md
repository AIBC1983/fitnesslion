- Visualización de datos en la base de datos

---

##  Requisitos

Para ejecutar el proyecto es necesario tener instalado:

- Java 21
- MySQL
- Maven

---

##  Configuración

1. Crear una base de datos en MySQL con el nombre:


fitnesslion


2. Configurar el archivo:


src/main/resources/application.properties


Ejemplo:


spring.datasource.url=jdbc:mysql://localhost:3306/fitnesslion
spring.datasource.username=root
spring.datasource.password=tu_password


---

##  Ejecución del proyecto

1. Clonar o descargar el repositorio
2. Importar el proyecto en Eclipse como proyecto Maven
3. Ejecutar la clase principal:


FitnesslionApplication.java


4. Abrir el navegador y acceder a:


http://localhost:8080


---

##  Metodología

El desarrollo del proyecto se ha realizado siguiendo una metodología iterativa, organizando las tareas en fases (análisis, desarrollo y pruebas) y utilizando un tablero Kanban para el control del progreso.

---

##  Notas finales

Este proyecto representa una primera versión funcional (MVP), cumpliendo con los requisitos principales definidos en el diseño inicial. Se ha priorizado la funcionalidad básica y la correcta integración con la base de datos.

---

##  Autor

Alumno: Antonio Iván Baeza Castillo  
Ciclo: 2º DAM  
Proyecto: Fitness Lion
