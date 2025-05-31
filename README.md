




# LAB Java | Intro to Microservices

## Descripción

Este laboratorio tiene como objetivo consolidar los conocimientos sobre arquitectura de microservicios usando **Spring Boot**, **Spring Cloud Eureka** y **RestTemplate**. Consiste en desarrollar una aplicación compuesta por varios microservicios que se comunican entre sí para gestionar información de estudiantes, cursos y calificaciones.

---
# Enlaces a Github de los micro Servicios
-[student-catalog-service](https://github.com/planetWeb252/student-catalog-service)  
-[grades-data-service](https://github.com/planetWeb252/grades-data-service)  
-[student-info-service](https://github.com/planetWeb252/student-info-service)  
-[discovery-service](https://github.com/planetWeb252/discovery-service)

## 🛠️ Tecnologías utilizadas
Java 21

Spring Boot

Spring Cloud Gateway

Eureka Client

Maven

## 🧪 Postman
- Tienes la collection de Postman en el repositorio, puedes importarla para probar los endpoints de los microservicios.
- [Lab intro microservice.postman_collection.json](Postman/Lab%20intro%20microservice.postman_collection.json)


## 🧱 Estructura del proyecto

### 🔍 discovery-service
- **Rol**: Servidor Eureka para descubrimiento de servicios.
- **Tecnología**: Spring Cloud Eureka Server.

### 🎓 student-info-service
- **Rol**: Gestiona la información básica de los estudiantes.


### 📊 grades-data-service
- **Rol**: Gestiona las notas de los estudiantes por curso.
`.

### 📚 student-catalog-service
- **Rol**: Orquestador. Se comunica con los otros servicios y construye un catálogo de cursos y notas con información detallada del estudiante.

---

## 🚀 Cómo ejecutar

1. Clona los repositorios de cada microservicio.:
2. Crear una base de datos MySQL para cada microservicio.
3. Configura el archivo `application.properties` de cada microservicio con los datos de conexión a la base de datos MySQL.
4. Asegúrate de que el servidor Eureka esté corriendo.
5. Asegúrate de que cada microservicio esté corriendo.
6. Usa la collection de Postman para probar los endpoints de cada microservicio.


## 👨‍💻 Autor
-[DevJerryX](https://github.com/planetWeb252)