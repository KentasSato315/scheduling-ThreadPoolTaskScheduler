# Scheduling with ThreadPoolTaskScheduler

This project demonstrates how to use Spring Boot 3 with Java 21 to schedule tasks using `ThreadPoolTaskScheduler`. The application is configured to run periodic tasks in a simple and efficient way using an in-memory H2 database.

## Project Structure

- **Spring Boot 3**
- **Java 21**
- **Gradle 8.5**
- **H2 In-Memory Database**
- **ThreadPoolTaskScheduler**

## Features

- **Task Scheduling**: Periodic task execution using `ThreadPoolTaskScheduler`.
- **H2 Database Integration**: Uses an in-memory database for lightweight persistence.
- **Spring Boot Actuator**: Provides endpoints for managing scheduled tasks.
- **RESTful API**: Provides basic API endpoints to start, cancel, and check task status.

## Getting Started

### Prerequisites

- **JDK 21** or later
- **Gradle 8.5** or later
- **Git**

### Clone the Repository

```bash
git clone https://github.com/KentasSato315/scheduling-ThreadPoolTaskScheduler.git
cd scheduling-ThreadPoolTaskScheduler
