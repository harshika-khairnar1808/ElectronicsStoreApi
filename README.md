# Electronics Store API
A RESTful API developed using *Spring Boot* and *Spring Data JPA* to manage electronics products and categories. This project demonstrates CRUD operations, database integration with MySQL, and REST API development.

## Features:
### Category Management
- Create Category
- Get All Categories
- Get Category by ID
- Update Category
- Delete Category

### Product Management
- Create Product
- Get All Products
- Get Product by ID
- Update Product
- Delete Product

## Technologies Used
- Java 17 (or your Java version)
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman

## Project Structure
ElectronicsStoreApi
│
├── controller
├── service
├── repository
├── entity
├── exception
├── src/main/resources
│      └── application.properties
├── postman
│      └── ElectronicsStoreApi.postman_collection.json
├── README.md
└── pom.xml

## API Endpoints:

### Category APIs
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /categories | Create Category |
| GET | /categories | Get All Categories |
| GET | /categories/{id} | Get Category By ID |
| PUT | /categories/{id} | Update Category |
| DELETE | /categories/{id} | Delete Category |

### Product APIs
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /products | Create Product |
| GET | /products | Get All Products |
| GET | /products/{id} | Get Product By ID |
| PUT | /products/{id} | Update Product |
| DELETE | /products/{id} | Delete Product |

## Database Configuration
Create a MySQL database.
Example:
sql
CREATE DATABASE electronics_store;

Update the database configuration in:
src/main/resources/application.properties

Example:
properties
spring.datasource.url=jdbc:mysql://localhost:3306/electronics_store
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

## How to Run
1. Clone the repository
git clone https://github.com/your-username/ElectronicsStoreApi.git
2. Open the project in IntelliJ IDEA or Eclipse.
3. Create the MySQL database.
4. Configure the database credentials in application.properties.
5. Run the Spring Boot application.
6. Open Postman and import the Postman Collection.
7. Test all APIs.

## Postman Collection
The Postman Collection is available in the *postman* folder.
postman/
└── ElectronicsStoreApi.postman_collection.json

Import this collection into Postman to test all API endpoints.

## Future Enhancements
User Authentication using Spring Security
JWT Authentication
Product Search & Filtering
Pagination & Sorting
Swagger API Documentation
Image Upload
Unit Testing


## Author
*Harshika Khairnar*
Aspiring Java Full Stack Developer
Spring Boot | Java | REST API | MySQL | Hibernate | Data JPA

If you found this project useful, feel free to star the repository.
