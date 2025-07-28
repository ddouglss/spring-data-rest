# Spring Boot Railway API

Este é um projeto de API RESTful utilizando Spring Boot com deploy na Railway, conectando-se a um banco de dados MySQL e expondo endpoints automáticos via Spring Data REST. A documentação da API é fornecida pelo Swagger/OpenAPI.

## ✅ Lista de Tarefas

- [x] Iniciar o projeto em [Spring Initializr](https://start.spring.io)
    - Dependências:
        - Spring Web
        - Spring Data JPA
        - Spring Data REST
        - MySQL Driver
- [x] Incluir dependência do Swagger/OpenAPI
- [x] Explorar endpoints gerados automaticamente
- [x] Criar entidade `User`
- [x] Implementar CRUD automático com Spring Data REST
- [x] Criar filtros customizados na API (`findByName`)

---

## 🔧 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Data REST
- Swagger / Springdoc OpenAPI
- MySQL
- Railway (Deploy)

---

## 🗂️ Estrutura do Projeto


src/
└── main/
├── java/
│ └── deploy.railway.spring_boot_railway/
│ ├── entity/
│ │ └── User.java
│ ├── api/
│ │ └── UserRestRepository.java
│ └── SpringBootRailwayApplication.java
└── resources/


---

## ▶️ Executando Localmente

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/spring-data-rest.git
   cd seu-repo
   ```
---
## 🌐 Endpoints

- GET /users

- POST /users

- GET /users/{id}

- PUT /users/{id}

- DELETE /users/{id}

- GET /users/search/findByName?name=Douglas

---

# 📄 Swagger/OpenAPI
- Documentação interativa: http://localhost:8080/swagger-ui/index.html

---
## 👤 Autor

- Douglas Souza 
<br/>
  LinkedIn | GitHub

---

## 📝 Licença
Este projeto está sob a licença MIT.

---




