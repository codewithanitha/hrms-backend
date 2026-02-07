# HRMS Backend – Spring Boot

This repository contains the **backend implementation** of the HR Management System (HRMS).
The backend is responsible for handling business logic, database operations, and exposing REST APIs
used by the frontend application.

## Project Description

The HRMS backend is built using **Spring Boot** and follows a layered architecture.
It provides RESTful APIs to manage employee data such as creating employees,
fetching employee lists, updating salaries, and deleting records.

The backend is containerized using **Docker** and deployed on **Render**.
It also integrates **SonarQube** for code quality analysis and **GitHub Actions**
for CI/CD automation.

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- REST API
- H2 Database
- Maven
- Docker (Multi-stage build)
- GitHub Actions (CI/CD)
- SonarQube (Code Quality)
- Render (Cloud Deployment)

## Backend Modules

### Controller Layer
- Handles HTTP requests
- Exposes REST APIs
- Manages CORS configuration for frontend access

### Service Layer
- Contains business logic
- Salary increment calculation
- Employee operations handling

### Repository Layer
- JPA Repository for database access
- CRUD operations

### Entity Layer
- Employee entity definition
- Maps database table structure

## REST API Endpoints

| Method | Endpoint | Description |
|------|---------|------------|
| POST | `/api/employees` | Add new employee |
| GET | `/api/employees` | Get all employees |
| PUT | `/api/employees/{id}` | Update salary |
| DELETE | `/api/employees/{id}` | Delete employee |

## Docker Implementation

- Backend application is dockerized
- Multi-stage Dockerfile used
- Maven build happens inside Docker
- Optimized image size

  <img width="1920" height="1080" alt="Screenshot 2026-01-31 184002" src="https://github.com/user-attachments/assets/c6d2fb83-ec3f-4198-a7a8-2e4a1846b084" />
  
  <img width="1920" height="1080" alt="Screenshot 2026-01-31 190042" src="https://github.com/user-attachments/assets/9451372a-a48e-4c83-b888-4917ef29cf1b" />

## SonarQube Analysis

- Static code analysis performed
- Code smells and bugs analyzed
- Quality Gate passed successfully

<img width="1920" height="1080" alt="Screenshot 2026-02-07 194051" src="https://github.com/user-attachments/assets/c5c16943-517a-4e59-9330-927747e66689" />

## Deployment Details

- Platform: Render
- Deployment type: Docker-based

## Backend URL:
https://hrms-backend-abyl.onrender.com


