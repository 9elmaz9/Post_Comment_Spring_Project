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
- **H2 Database**: In-memory database for testing.

## Project Structure

src/
├── main/
│ ├── java/
│ │ └── be/
│ │ └── intecbrussel/
│ │ └── jpaonetomanydemo/
│ │ ├── controller/
│ │ │ ├── CommentController.java
│ │ │ └── PostController.java
│ │ ├── model/
│ │ │ ├── Comment.java
│ │ │ └── Post.java
│ │ ├── repository/
│ │ │ ├── CommentRepository.java
│ │ │ └── PostRepository.java
│ │ └── service/
│ │ ├── CommentServiceImpl.java
│ │ └── PostServiceImpl.java
│ ├── resources/
│ │ ├── templates/
│ │ │ ├── comments.html
│ │ │ ├── edit_comment.html
│ │ │ ├── edit_post.html
│ │ │ ├── index.html
│ │ │ └── new_post.html
│ │ └── application.properties
│ └── webapp/
│ └── WEB-INF/
│ └── web.xml
└── test/
└── java/
└── be/
└── intecbrussel/
└── jpaonetomanydemo/
└── PostCommentApplicationTests.java


## Getting Started

### Prerequisites

- Java 11 or higher
- Maven
- An IDE like IntelliJ IDEA or Eclipse

### Installation

1. **Clone the repository**:
    ```sh
    git clone https://github.com/yourusername/jpaonetomanydemo.git
    cd jpaonetomanydemo
    ```

2. **Build the project**:
    ```sh
    mvn clean install
    ```

3. **Run the application**:
    ```sh
    mvn spring-boot:run
    ```

4. **Access the application**:
    Open your web browser and navigate to `http://localhost:8080`.

## Endpoints

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



