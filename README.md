# Student_Management_System

## Overview
The **Student Management System** is a Spring Boot application that allows users to manage student records, including adding, updating, viewing, and deleting student details.

## Features
- Add new students
- View student details
- Update student information
- Delete student records


## Technologies Used
- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL 
- Thymeleaf 
- Maven
- Git & GitHub

## Installation & Setup
### Prerequisites
- Java 17+
- Maven
- MySQL (or any database of your choice)
- Git

### Steps to Run the Project
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/student-management-system.git
   cd student-management-system
   ```

2. Configure the database in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/student_db
   spring.datasource.username=root
   spring.datasource.password=*****
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

3. Build and run the application:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. Access the application:
   - API: `http://localhost:8080/api/students`
   - UI : `http://localhost:8080`

## API Endpoints
| Method | Endpoint          | Description              |
|--------|-------------------|--------------------------|
| GET    | /api/students     | Get all students         |
| GET    | /api/students/{id}| Get student by ID        |
| POST   | /api/students     | Add a new student        |
| PUT    | /api/students/{id}| Update student by ID     |
| DELETE | /api/students/{id}| Delete student by ID     |

## Contribution
Feel free to fork this repository and submit pull requests. Contributions are welcome!

## License
This project is licensed under the MIT License.

---

### Author
- **BOOPATHIRAJ M**
- GitHub: [BoopathiRaj0073]((https://github.com/BoopathiRaj0073/Student_Management_System))

