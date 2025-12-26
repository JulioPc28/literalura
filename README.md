# 📚 Proyecto Literalura

Este proyecto es parte del **Challenger Literalura**, desarrollado con **Spring Boot** y **Java**.  
El objetivo es construir una aplicación que gestione libros y autores, permitiendo consultas y registros a través de una API REST.

---

## 🚀 Tecnologías utilizadas
- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database** (para pruebas en memoria)
- **Maven**

---

## ⚙️ Configuración del proyecto

El archivo `application.properties` está configurado para usar **H2 en memoria**, lo que permite ejecutar el proyecto sin necesidad de instalar una base de datos externa.

```properties
spring.application.name=literalura
spring.datasource.url=jdbc:h2:mem:literalura;DB_CLOSE_DELAY=-1;MODE=PostgreSQL
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
