# Projeto Spring

## Descrição

Este é um aplicativo Spring Boot que fornece uma API REST para gerenciar usuários. Ele permite operações CRUD (Criar, Ler, Atualizar, Excluir) em entidades de usuário, tornando-o uma base sólida para aplicações de gerenciamento de dados.

## Tecnologias

- **Spring Boot 2.7.0**: Framework para desenvolvimento de aplicações Java com configurações simplificadas.
- **Java 11**: Versão do Java utilizada para a construção do projeto.
- **Spring Data JPA**: Para operações de persistência de dados com suporte a JPA/Hibernate.
- **H2 Database**: Banco de dados em memória para desenvolvimento.
- **Maven**: Gerenciador de dependências e build tool.

## Configuração

1. Certifique-se de ter o **Java 11** instalado.
2. Clone o repositório:
   ```bash
   git clone https://github.com/Guiziin227/projeto-spring.git
   ```
3. Navegue até o diretório do projeto:
   ```bash
   cd projeto spring
   ```
4. Compile o projeto usando Maven:
   ```bash
   mvn clean install
   ```

## Executando a Aplicação

1. Execute a aplicação usando seu IDE ou pela linha de comando:
   ```bash
   java -jar target/projeto spring-0.0.1-SNAPSHOT.jar
   ```
2. Acesse a API em:
   ```
   http://localhost:8080
   ```

## Pontos de Extremidade da API

| Método | Endpoint            | Descrição                          |
|--------|---------------------|------------------------------------|
| GET    | `/users`            | Listar todos os usuários (suporta paginação, e.g., `/users?page=0&size=10`) |
| GET    | `/users/{id}`       | Obter usuário por ID               |
| POST   | `/users`            | Criar um novo usuário              |
| PUT    | `/users/{id}`       | Atualizar usuário por ID           |
| DELETE | `/users/{id}`       | Excluir usuário por ID             |

## Documentação da API

- **Swagger UI**: Acesse a documentação da API em:
  ```
  http://localhost:8080/swagger-ui.html
  ```

## Executando com MySQL

Para usar MySQL em vez do H2:

1. Adicione a dependência do conector MySQL no `pom.xml`:
   ```xml
   <dependency>
       <groupId>mysql</groupId>
       <artifactId>mysql-connector-java</artifactId>
   </dependency>
   ```
2. Atualize o `application.yml` com os detalhes de conexão do MySQL.
3. Execute a aplicação com o perfil `mysql`:
   ```bash
   java -jar -Dspring.profiles.active=mysql target/projeto spring-0.0.1-SNAPSHOT.jar
   ```

## Depuração Remota

Para habilitar a depuração remota:

- Execute com:
  ```bash
  mvn spring-boot:run -Drun.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005"
  ```
- Ou:
  ```bash
  java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -Dspring.profiles.active=test -jar target/projeto spring-0.0.1-SNAPSHOT.jar
  ```
- Conecte-se a `localhost:5005` usando o recurso de depuração remota do seu IDE.

## Contribuições

Se você deseja contribuir para este projeto, por favor, abra um issue ou envie um pull request no [repositório GitHub](https://github.com/Guiziin227/projeto spring.git).

## Licença

Este projeto está licenciado sob a **Licença MIT**.

## Contato

Para mais informações, entre em contato com [insira seu e-mail ou outro contato aqui].

---

# Spring Project

## Description

This is a Spring Boot application that provides a REST API for managing users. It supports CRUD operations (Create, Read, Update, Delete) on user entities, making it a solid foundation for data management applications.

## Technologies

- **Spring Boot 2.7.0**: A framework for building Java applications with simplified configurations.
- **Java 11**: The Java version used for the project.
- **Spring Data JPA**: For data persistence operations with JPA/Hibernate support.
- **H2 Database**: An in-memory database for development.
- **Maven**: Dependency manager and build tool.

## Setup

1. Ensure you have **Java 11** installed.
2. Clone the repository:
   ```bash
   git clone https://github.com/Guiziin227/projeto spring.git
   ```
3. Navigate to the project directory:
   ```bash
   cd projeto spring
   ```
4. Build the project using Maven:
   ```bash
   mvn clean install
   ```

## Running the Application

1. Run the application using your IDE or from the command line:
   ```bash
   java -jar target/projeto spring-0.0.1-SNAPSHOT.jar
   ```
2. Access the API at:
   ```
   http://localhost:8080
   ```

## API Endpoints

| Method | Endpoint            | Description                        |
|--------|---------------------|------------------------------------|
| GET    | `/users`            | List all users (supports pagination, e.g., `/users?page=0&size=10`) |
| GET    | `/users/{id}`       | Get user by ID                     |
| POST   | `/users`            | Create a new user                  |
| PUT    | `/users/{id}`       | Update user by ID                  |
| DELETE | `/users/{id}`       | Delete user by ID                  |

## API Documentation

- **Swagger UI**: Access the API documentation at:
  ```
  http://localhost:8080/swagger-ui.html
  ```

## Running with MySQL

To use MySQL instead of H2:

1. Add the MySQL connector dependency in `pom.xml`:
   ```xml
   <dependency>
       <groupId>mysql</groupId>
       <artifactId>mysql-connector-java</artifactId>
   </dependency>
   ```
2. Update the `application.yml` with your MySQL connection details.
3. Run the application with the `mysql` profile:
   ```bash
   java -jar -Dspring.profiles.active=mysql target/projeto spring-0.0.1-SNAPSHOT.jar
   ```

## Remote Debugging

To enable remote debugging:

- Run with:
  ```bash
  mvn spring-boot:run -Drun.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005"
  ```
- Or:
  ```bash
  java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -Dspring.profiles.active=test -jar target/projeto spring-0.0.1-SNAPSHOT.jar
  ```
- Connect to `localhost:5005` using your IDE's remote debugging feature.
