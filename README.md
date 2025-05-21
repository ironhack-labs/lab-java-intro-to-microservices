![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB Java | Intro to Microservices

## Introduction

We have just learned how to create an application that works with microservices and use Rest Template to call external APIs so let's practice a bit more.

<br>

## Requirements

1. Fork this repo.
2. Clone this repo.
3. Add your instructor and the class graders as collaborators to your repository. If you are unsure who your class graders are, ask your instructor or refer to the day 1 slide deck.
4. In the repository, create a Java project and add the code for the following prompts.

## Submission

Once you finish the assignment, submit a URL link to your repository or your pull request in the field below.

<br>

## Instructions

Using Eureka and Rest Templates complete the following microservices application:

- Create a `discovery-service` that will act as Eureka Discovery Server.
- Create 3 services that will act as Eureka Clients:

  1. `student-info-service` will be responsible for holding the students’ information.
  
     + **https://github.com/MPacheca7/student-info**
     
     - **Models:**
       - `Student`: that will hold the id, the student's name and the student's age.
     - **Controllers:**
       - `StudentController`: that will contain a single endpoint to get a student by id.
     - **Repositories:**
       - `StudentRepository`.

  2. `grades-data-service` will be responsible for holding the grades of each course.
  
     + **https://github.com/MPacheca7/grades-data**
     
     - **Models:**
       - `Course`: that will hold the course code and the course name.
       - `Grade`: that will hold the id, grade and the studentId.
     - **DTO:**
       - `CourseGrade`.
     - **Controllers:**
       - `GradeController`: that will contain an endpoint to get all the grades.
       - `CourseController`: that will contain an endpoint to get a course by course code and an endpoint to get the grades based on the course code.
     - **Repositories:**
       - `CourseRepository`.
       - `GradeRepository`.
     - **Services:**
       - `CourseService`.

  3. `student-catalog-service` will be responsible for communicating with the other services and return a catalog containing the list of grades grouped by course name and showing all the students' information per grade.
     
      + **https://github.com/MPacheca7/student-catalog**
     
     - **Models:**
       - `Catalog`: that will hold the course name and a list of the students' grades.
       - `StudentGrade`: that will hold the student's name, age and the respective grade.
       - All other needed models.
     - **Controllers:**
       - `CatalogController`: that will contain a single endpoint to get the students' catalog per course based on the course code.

**Note:** You can add data for each service using the `CommandLineRunner` for simpler data insertion and testing.