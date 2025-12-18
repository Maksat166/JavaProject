# Student Management System — Assignment 1

## A. Project Overview

This project is an Object-Oriented Student Management System developed in Java. The goal of the project is to practice Java fundamentals and Object-Oriented Programming (OOP) concepts by building a simple system to manage student records and course data.

The project demonstrates the use of classes, objects, constructors, methods, arrays, loops, and conditional logic. Core OOP principles such as encapsulation, data hiding, and composition are applied to create clean, structured, and maintainable code.

---

## B. Class Descriptions

### Student Class

The `Student` class represents a student entity in the system. It contains private fields for the student’s full name, ID, major, GPA, and total earned credits. Encapsulation is ensured by using private fields along with public getters and setters.

The class includes methods to update GPA, add earned credits, check whether a student qualifies as an honors student (GPA ≥ 3.5), and display student information using the `toString()` method.

### Course Class

The `Course` class represents a university course and demonstrates composition by containing an array of `Student` objects. It stores the course name, instructor name, and enrolled students.

This class provides functionality to add students to the course, calculate the average GPA of all enrolled students, identify the student with the highest number of credits, and display a course summary using the `toString()` method.

---

## C. Instructions to Compile and Run

To compile and run the program using the terminal, navigate to the project directory and use the following commands:

```bash
javac src/*.java
java -cp src Main
```

Make sure Java is properly installed and configured on your system before running the program.

---

## D. Screenshots

Screenshots demonstrating the program’s functionality are included in the GitHub repository. These screenshots show:

* Output of student information
* Average GPA calculation for a course
* Student with the highest number of credits

Screenshots can be found in the `docs/screenshots` folder.

---

## E. Reflection

During this assignment, I learned how to design and implement Java programs using Object-Oriented Programming principles. I gained practical experience working with classes, objects, constructors, and arrays of objects. This project also helped me better understand encapsulation and how getters and setters protect and manage object state.

One of the main challenges was managing relationships between classes and correctly processing arrays of objects. Overcoming these challenges improved my problem-solving skills and reinforced the importance of writing clean, well-structured code. Overall, this assignment strengthened my understanding of OOP concepts and their real-world application in software development.

---

## F. Repository Structure

```
assignment1-student-management/
├── src/
│   ├── Student.java
│   ├── Course.java
│   └── Main.java
├── docs/
│   └── screenshots/
├── README.md
└── .gitignore
```
