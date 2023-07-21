# Todo Application using MVC Architecture
> This README file provides an overview of the Todo Application developed using Java Spring Boot with the Model-View-Controller (MVC) architecture. The application allows users to manage their tasks by adding, updating, and marking tasks as completed. Below are the key components and details of the application:
---
## Frameworks and Languages
The Instagram backend project is developed using the following frameworks and languages:

* **Spring Boot:** A Java-based framework for building web applications.
* **Spring MVC:** A module of the Spring Framework that supports building web applications.
* **Java:** The programming language used for backend development.
* **MySQL:** The chosen database management system.
---
## Data flow
The project is structured into the following components:

  ### 1) Model
  The Model represents the data of the application. It encapsulates the application's data. The data structure for a task includes:
  
  * id: Unique identifier for each task.
  * task: The title of the task.
  * task Description: Detailed description of the task.
  * status: Indicates whether the task is "completed" or "incomplete."
  
  ### 2) Controller:
  Handles incoming HTTP requests, manages the data flow, and sends responses back to the client.
    
  * Create a todo: Handles the creation of a new task.
  * Create todos: Handles the creation of a list of tasks.
  * getAllTodos: Retrieves and returns the list of tasks.
  * getAlldoneTodos: Retrieves and returns the list of all done tasks.
  * getAllundoneTodos: Retrieves and returns the list of all undone tasks.
  * getTodoById: Retrieves and returns the task by its id.
  * updateTodoByStatus: update the status of a task.
  * updateTodoByDescription: update the description of a task.
  * deleteTodoById: Deletes a task from the database by its id.
    
  ### 3) Service:
  The Service layer acts as an intermediary between the Controller and the Repository. It contains business logic and additional services that may be required for handling tasks before interacting with the Repository.
  
  ### 4) Repository:
  The Repository is responsible for interacting with the database or data storage. It provides an abstraction layer between the Model and the data storage. The Repository handles operations like adding, updating, deleting, and retrieving tasks from the database. It implements the JPA Repository for the crud operations.
  
  ### 5) Database Design
  The project uses MySQL as the database management system. The following entity is mapped to a database table:
  * Todo - The table schema will include columns for id, task, task description, and status.
---
## Data Structure
The project utilizes several data structures, including:

* **Strings:** Used for storing text-based data, such as task and task description.
* **Long:** Used for storing numerical data, such as ID.
* **Boolean:** Used for storing the status as true or false.
---
## Project Summary
The Todo Application is built using Java Spring Boot and the MVC architecture provides for managing tasks efficiently. Users can add, edit, delete, and mark tasks as complete through a well-organized and responsive web application.

---
## Conclusion
> The Todo Application demonstrates the power and flexibility of the Java Spring Boot framework and the MVC architecture, which separates concerns and provides a structured approach to building applications. It allows for easy maintenance and scalability, making it a suitable choice for developing task management systems and various other web applications.
If you have any feedback or suggestions, feel free to reach out and contribute to the project's improvement.
---

