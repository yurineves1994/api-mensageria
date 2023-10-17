
# Messageria Microserviço

Este é um microserviço de mensageria simples desenvolvido com Spring Boot. O projeto utiliza o Spring Email e o SMTP do Gmail para enviar e-mails.

## Configuração

### Configuração do Banco de Dados

O projeto usa um banco de dados MySQL. Certifique-se de configurar as seguintes propriedades no arquivo `application-local.properties`.

    spring.datasource.url=jdbc:mysql://mysql:3306/messageria
    spring.datasource.username=root
    spring.datasource.password=myDatabasePassword

### Configuração do E-mail

As configurações de e-mail estão no arquivo application.properties. Certifique-se de configurar adequadamente as seguintes propriedades (spring.mail.username) e (spring.mail.password):

    spring.mail.host=smtp.gmail.com
    spring.mail.port=587
    spring.mail.username=seu_email@gmail.com
    spring.mail.password=sua_senha
    spring.mail.properties.mail.smtp.auth=true
    spring.mail.properties.mail.smtp.starttls.enable=true

## Executando o Projeto

Nesse projeto eu utilizei o docker-compose para rodar o sistema e o banco de dados, porém é possivel rodar separado basta editar as informações do application.properties.

  - Construa a Imagem da Aplicação Spring:

     ./mvnw clean package e ./mvnw spring-boot:build-image

  - Inicie o Docker Compose:

      docker-compose up -d

  Isso iniciará os contêineres definidos no arquivo docker-compose.yml. Aguarde até que todos os serviços estejam em execução. (se atente as portas utilizadas dentro do docker-compose para ter certeza que não estão sendo utilizadas

  - Acesse a Aplicação:

  Quando tudo estiver pronto, acesse a aplicação em http://localhost:8080.

## Tecnologias Utilizadas

### Backend (Java/Spring Boot)
- [Java](https://www.java.com/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Hibernate](https://hibernate.org/)
- [Spring Email]

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas ou enviar pull requests.

## Contato
Caso tenham duvida ou identifiquem algum erro, meu LinkedIn (https://www.linkedin.com/in/yuri-travassos/)
