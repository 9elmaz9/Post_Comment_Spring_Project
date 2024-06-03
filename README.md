# Posts and Comments Management System

## Overview

This project is a Spring Boot application that demonstrates a simple web-based system for managing posts and comments. It showcases a one-to-many relationship between posts and comments using Spring Data JPA and Thymeleaf for the frontend.

## Features

- **CRUD Operations for Posts**: Create, read, update, and delete posts.
- **CRUD Operations for Comments**: Create, read, update, and delete comments associated with posts.
- **Pagination**: Paginated display of posts and comments.
- **Bootstrap UI**: User-friendly interface using Bootstrap.

## Technologies Used

- **Java**: Programming language.
- **Spring Boot**: Framework for building the application.
- **Spring Data JPA**: For database interactions.
- **Thymeleaf**: Template engine for rendering the UI.
- **Bootstrap**: For responsive and styled web pages.
- **MySQL Database**: In-memory database for testing.


### Prerequisites

- Java 11 or higher
- Maven
- An IDE like IntelliJ IDEA or Eclipse

### PostController

- `GET /` - Redirects to the first page of paginated posts.
- `GET /showNewPostForm` - Displays the form to create a new post.
- `POST /createPost` - Handles form submission for creating a new post.
- `GET /updatePost/{id}` - Displays the form to update an existing post.
- `POST /updatePost/{id}` - Handles form submission for updating an existing post.
- `GET /deletePost/{id}` - Deletes a post by its ID.
- `GET /page/{pageNo}` - Handles pagination for displaying posts.

### CommentController

- `GET /posts/{postId}/comments` - Displays all comments for a specific post.
- `POST /posts/{postId}/comments` - Handles form submission for creating a new comment.
- `GET /posts/{postId}/comments/{commentId}/edit` - Displays the form to edit a specific comment.
- `POST /posts/{postId}/comments/{commentId}/edit` - Handles form submission for updating an existing comment.
- `GET /posts/{postId}/comments/{commentId}/delete` - Deletes a specific comment by its ID.
# Learning Outcomes

## Through the development of this project, I have acquired and enhanced several skills and knowledge areas:

## Technical Skills

1. **Spring Boot Framework**: 
   - Gained hands-on experience in creating a Spring Boot application from scratch.
   - Implemented RESTful APIs using Spring MVC and managed application configuration with Spring Boot.

2. **Spring Data JPA**:
   - Learned to use Spring Data JPA for database operations, including CRUD operations.
   - Managed entity relationships, specifically the one-to-many relationship between posts and comments.

3. **Thymeleaf**:
   - Used Thymeleaf as a template engine for rendering dynamic web pages.
   - Created forms for data input and used model attributes to bind data between the controller and the view.

4. **Bootstrap**:
   - Utilized Bootstrap for responsive and visually appealing UI design.
   - Integrated Bootstrap components to enhance user experience.

5.  **MySQL Database**:
   - Configured MySQL as the database for persistent storage.
   - Implemented database schema design, including tables for posts and comments.

6. **Pagination**:
   - Implemented pagination to handle large sets of data efficiently.
   - Enhanced user experience by allowing users to navigate through paginated lists of posts and comments.

## Software Development Practices

### MVC Architecture
```java
// Applied the Model-View-Controller (MVC) design pattern to structure the application logically.
// Ensured separation of concerns by dividing the application into layers (Controller, Service, Repository).


Dependency Injection
// Leveraged Spring’s dependency injection to manage dependencies and reduce tight coupling between components.

Testing
// Wrote unit tests for various components to ensure the reliability and correctness of the application.
// Used JUnit for writing and running tests.

Project Management with Maven
// Managed project dependencies and build lifecycle using Maven.
// Created and executed build scripts for the application.



Soft Skills
Problem-Solving
// Tackled various technical challenges during the development process and devised effective solutions.
// Improved my ability to troubleshoot and debug issues systematically.

Time Management
// Managed my time effectively to complete the project within the given timeframe.
// Prioritized tasks and milestones to ensure steady progress.


Collaboration
// Although this project was individual, I practiced collaboration skills by seeking feedback and discussing solutions with peers and mentors.

Documentation
// Documented the project thoroughly, including writing a comprehensive README and in-line code comments.
// Ensured that the documentation was clear and helpful for future reference and other developers.













