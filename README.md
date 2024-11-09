ContactApplication API

ContactApplication API is a RESTful API built with Spring Boot, designed for managing contact information. This API allows users to create, retrieve, update, and delete contact information in a secure and efficient way.

Features

- Create Contact: Add a new contact with details such as name, email, and phone number.
- Retrieve Contacts: Get a list of all contacts or search for specific contacts by various fields.
- Update Contact: Edit existing contact information.
- Delete Contact: Remove a contact from the database.
- Secure Endpoints: Use JWT-based authentication for secure access.
- Database Support: Integrated with a relational database (e.g., MySQL, PostgreSQL) via JPA and Hibernate.

Tech Stack

- Java - Language
- Spring Boot - Framework
- Spring Data JPA - ORM for database access
- MySQL - Database
- Swagger - API documentation
- JWT - Authentication

 Prerequisites

- Java 11 or later
- Maven
- MySQL or any other SQL database

Setup

1. Clone the repository:
   
   git clone https://github.com/dy4485/contactApplication.git
   cd contactApplication
   
Configure the database: 
Update the database connection settings in src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/contactdb
spring.datasource.username=yourusername
spring.datasource.password=yourpassword

Build the project:

mvn clean install
Run the application:


mvn spring-boot:run
Access the API: The application will run on http://localhost:8080.

API Documentation:
Swagger UI is available at http://localhost:8080/swagger-ui.html for detailed API documentation and testing.

API Endpoints:
Method	Endpoint	Description
POST	/api/contacts	Create a new contact
GET	/api/contacts	Retrieve all contacts
GET	/api/contacts/{id}	Retrieve a specific contact
PUT	/api/contacts/{id}	Update contact information
DELETE	/api/contacts/{id}	Delete a contact

Authentication:
This API uses JWT for authentication. To access secured endpoints:
Obtain a token by authenticating with your credentials at /api/auth/login.
Include the token in the Authorization header as Bearer <token>.

Testing:
To run tests, use:

mvn test

License
This project is licensed under the MIT License.
