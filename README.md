# GamesJPA

GamesJPA is a Java backend project created to practice database persistence using **Spring Boot**, **JPA**, **Hibernate**, the **DAO architecture pattern**, and **JPQL queries**.

The project focuses on implementing a structured persistence layer, separating database access logic from the rest of the application.

## Tech Stack

- Java
- Spring Boot
- JPA
- Hibernate
- JPQL
- DAO Pattern
- Maven

## Project Goals

The main goals of this project are:

- Practice object-relational mapping with JPA and Hibernate
- Implement database operations using the DAO pattern
- Use JPQL to create custom queries
- Structure a Java backend project with clear separation of responsibilities
- Improve understanding of persistence, entities, repositories and database transactions

## Architecture

This project follows a simple DAO-based architecture.

The DAO layer is responsible for handling database operations such as:

- Creating records
- Reading data
- Updating records
- Deleting records
- Running JPQL queries

This approach helps keep persistence logic isolated and makes the code easier to maintain and understand.

## Features

- Game registration
- Game listing
- Game search using JPQL
- Game update
- Game deletion
- Database integration through JPA and Hibernate

## Project Structure

```text
GamesJPA
├── src/main
│   ├── java
│   │   └── ...
│   └── resources
├── pom.xml
└── .gitignore
