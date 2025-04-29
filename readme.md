Projeto Spring
Descrição
Este é um aplicativo Spring Boot que fornece uma API REST para gerenciar usuários. Ele permite operações CRUD (Criar, Ler, Atualizar, Excluir) em entidades de usuário, tornando-o uma base sólida para aplicações de gerenciamento de dados.
Tecnologias

Spring Boot 2.7.0: Framework para desenvolvimento de aplicações Java com configurações simplificadas.
Java 11: Versão do Java utilizada para a construção do projeto.
Spring Data JPA: Para operações de persistência de dados com suporte a JPA/Hibernate.
H2 Database: Banco de dados em memória para desenvolvimento.
Maven: Gerenciador de dependências e build tool.

Configuração

Certifique-se de ter o Java 11 instalado.
Clone o repositório:  git clone https://github.com/Guiziin227/projeto spring.git


Navegue até o diretório do projeto:  cd projeto spring


Compile o projeto usando Maven:  mvn clean install



Executando a Aplicação

Execute a aplicação usando seu IDE ou pela linha de comando:  java -jar target/projeto-spring-0.0.1-SNAPSHOT.jar


Acesse a API em:  http://localhost:8080



Pontos de Extremidade da API



Método
Endpoint
Descrição



GET
/users
Listar todos os usuários (suporta paginação, e.g., /users?page=0&size=10)


GET
/users/{id}
Obter usuário por ID


POST
/users
Criar um novo usuário


PUT
/users/{id}
Atualizar usuário por ID


DELETE
/users/{id}
Excluir usuário por ID


Documentação da API

Swagger UI: Acesse a documentação da API em:  http://localhost:8080/swagger-ui.html



Executando com MySQL
Para usar MySQL em vez do H2:

Adicione a dependência do conector MySQL no pom.xml:  <dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
</dependency>


Atualize o application.yml com os detalhes de conexão do MySQL.
Execute a aplicação com o perfil mysql:  java -jar -Dspring.profiles.active=mysql target/projeto-spring-0.0.1-SNAPSHOT.jar



Depuração Remota
Para habilitar a depuração remota:

Execute com:  mvn spring-boot:run -Drun.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005"


Ou:  java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -Dspring.profiles.active=test -jar target/projeto spring-0.0.1-SNAPSHOT.jar


Conecte-se a localhost:5005 usando o recurso de depuração remota do seu IDE.

Contribuições
Se você deseja contribuir para este projeto, por favor, abra um issue ou envie um pull request no [repositório GitHub](https://github.com/Guiziin227/projeto spring.git).
Licença
Este projeto está licenciado sob a Licença MIT.
Contato
Para mais informações, entre em contato com [insira seu e-mail ou outro contato aqui].

Spring Project
Description
This is a Spring Boot application that provides a REST API for managing users. It supports CRUD operations (Create, Read, Update, Delete) on user entities, making it a solid foundation for data management applications.
Technologies

Spring Boot 2.7.0: A framework for building Java applications with simplified configurations.
Java 11: The Java version used for the project.
Spring Data JPA: For data persistence operations with JPA/Hibernate support.
H2 Database: An in-memory database for development.
Maven: Dependency manager and build tool.

Setup

Ensure you have Java 11 installed.
Clone the repository:  git clone https://github.com/Guiziin227/projeto spring.git


Navigate to the project directory:  cd projeto spring


Build the project using Maven:  mvn clean install



Running the Application

Run the application using your IDE or from the command line:  java -jar target/projeto spring-0.0.1-SNAPSHOT.jar


Access the API at:  http://localhost:8080



API Endpoints



Method
Endpoint
Description



GET
/users
List all users (supports pagination, e.g., /users?page=0&size=10)


GET
/users/{id}
Get user by ID


POST
/users
Create a new user


PUT
/users/{id}
Update user by ID


DELETE
/users/{id}
Delete user by ID


API Documentation

Swagger UI: Access the API documentation at:  http://localhost:8080/swagger-ui.html



Running with MySQL
To use MySQL instead of H2:

Add the MySQL connector dependency in pom.xml:  <dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
</dependency>


Update the application.yml with your MySQL connection details.
Run the application with the mysql profile:  java -jar -Dspring.profiles.active=mysql target/projeto spring-0.0.1-SNAPSHOT.jar



Remote Debugging
To enable remote debugging:

Run with:  mvn spring-boot:run -Drun.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005"


Or:  java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -Dspring.profiles.active=test -jar target/projeto spring-0.0.1-SNAPSHOT.jar


Connect to localhost:5005 using your IDE's remote debugging feature.

Contributing
If you want to contribute to this project, please open an issue or submit a pull request on the [GitHub repository](https://github.com/Guiziin227/projeto spring.git).
License
This project is licensed under the MIT License.
Contact
For more information, contact [insert your email or other contact here].
