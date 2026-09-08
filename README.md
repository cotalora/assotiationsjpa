# assotiationsjpa

Demo of **JPA associations** with Spring Boot and hexagonal (Clean) architecture.

Relationships covered:

- **Client ↔ Address** — `@OneToMany` / `@ManyToOne`
- **Invoice → Client** — `@ManyToOne` (unidirectional)

## Stack

- Java 17
- Spring Boot 4.1.1
- Spring Data JPA + Hibernate
- SQLite
- Gradle (wrapper)

## Requirements

- JDK 17+

## How to run

```bash
./gradlew bootRun
```

On Windows:

```powershell
.\gradlew.bat bootRun
```

The API is available at `http://localhost:8080`.

On startup, Hibernate recreates the schema (`ddl-auto=create-drop`) and loads sample data from `import.sql`.

## Endpoints

| Method | Path | Description |
|--------|------|-------------|
| `GET` | `/clients` | List clients with their addresses |
| `GET` | `/invoices` | List invoices |
| `GET` | `/invoices/{id}` | Invoice by id (`404` if not found) |

Examples:

```bash
curl http://localhost:8080/clients
curl http://localhost:8080/invoices
curl http://localhost:8080/invoices/1
```

## Structure

```
com.kurisu.assotiationsjpa
├── domain/           # Models, repository ports, exceptions
├── application/      # Use cases and services
├── infrastructure/   # JPA entities, repositories, mappers, adapters
└── presentation/     # REST controllers and DTOs
```

## Tests

```bash
./gradlew test
```
