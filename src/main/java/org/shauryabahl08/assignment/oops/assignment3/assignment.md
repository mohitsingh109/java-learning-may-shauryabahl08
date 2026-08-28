## **CampusCare — Build a Smart Campus Management System**

### 🎯 Your Mission

Imagine that you have been hired as a **Junior Java Developer** by a company called **CampusCare**.

CampusCare wants to build a small Java application that can help a university manage its students, courses, clubs, events, and campus services.

The university does not want a simple program that only prints information. They want an **interactive application** where a user can log in, choose different options, perform actions, and see updated information.

Your job is to design and develop this system using **Core Java and Object-Oriented Programming**.


---

# 🏫 The Story

It is the beginning of a new semester at **Green Valley University**.

The university has thousands of students. Every student can:

- View their profile
- Enroll in courses
- Drop courses
- Join clubs
- Register for campus events
- View their enrolled courses
- Search for other students
- View their activity summary

The university also has different types of users:

- **Student**
- **Faculty Member**
- **Administrator**

Each type of user has some common information, but their responsibilities are different.

For example:

A student can enroll in courses, while a faculty member can manage courses.

An administrator can add students, remove students, and view university statistics.

The university wants you to create the first working version of this application.

---

# 🚪 Application Start

When the application starts, display something similar to:

```text
=========================================
       WELCOME TO CAMPUSCARE
=========================================

1. Login
2. Register New Student
3. Exit

Enter your choice:
```

The user should be able to select an option.

Your application should continue running until the user chooses **Exit**.

---

# 👤 Part 1 — User System

Create a general concept of a **User**.

Every user should have information such as:

- User ID
- Name
- Email
- Phone Number

However, not every user behaves in the same way.

Create appropriate classes for:

- `Student`
- `Faculty`
- `Administrator`

Think carefully about what should be **common** and what should be **specific** to each type of user.

### Example

A student might have:

```text
Student ID: ST101
Name: Aryan
Email: aryan@example.com
Major: Computer Science
```

A faculty member might have:

```text
Faculty ID: FC201
Name: Dr. Smith
Email: smith@example.com
Department: Computer Science
```

---

# 🧬 Part 2 — OOP Requirement: Inheritance

The university expects you to avoid repeating the same code.

For example, if every user has:

- name
- email
- phone

you should not copy these variables and methods into every class.

Design your classes so that the common functionality can be reused.

### Your design must demonstrate:

- Inheritance
- Constructor usage
- `super`
- Method overriding

---

# 🎭 Part 3 — OOP Requirement: Polymorphism

CampusCare wants to display a welcome message differently depending on the type of user.

For example:

```text
Student:
Welcome Aryan! You have 4 courses enrolled.

Faculty:
Welcome Dr. Smith! You are teaching 3 courses.

Administrator:
Welcome Admin! You currently manage 125 students.
```

The application should be able to work with a general user reference while still executing the correct behavior for the actual object.

### Challenge

Design at least one meaningful example of **runtime polymorphism**.

Also include at least one example of **compile-time polymorphism (method overloading)**.

For example, you might allow searching using:

```text
searchStudent(String name)
searchStudent(int studentId)
```

You are free to design your own overloaded methods.

---

# 🔐 Part 4 — Encapsulation

The university does not want other classes directly changing important student information.

For example, this should **not** be allowed:

```java
student.email = "something";
```

Instead, protect important data and provide appropriate methods for accessing or modifying it.

Use:

- `private` variables
- Getters
- Setters where appropriate

Think about which fields should be allowed to change and which should not.

---

# 📚 Part 5 — Course Management

The university offers multiple courses.

Each course should contain information such as:

- Course ID
- Course Name
- Instructor
- Credits
- Maximum Students
- Current Students

Example:

```text
CS101 - Introduction to Programming
Instructor: Dr. Smith
Credits: 3
Available Seats: 18
```

A student should be able to:

```text
1. View available courses
2. Enroll in a course
3. Drop a course
4. View my courses
```

---

# 📦 Part 6 — Arrays

CampusCare's first version does not use a database.

Therefore, you must store information using **arrays**.

You should use arrays to store things such as:

- Students
- Courses
- Clubs
- Events

For example:

```java
Student[] students;
Course[] courses;
```

You should decide the appropriate array sizes.

### Array Challenge

Your application should be able to:

- Add an object to an array
- Search an array
- Display all objects
- Find an object by ID
- Count objects
- Check whether an array is full

Do not simply create an array and never use it.

---

# 🔎 Part 7 — Student Search

The administrator wants to search for students.

Create a search feature.

The user should be able to choose:

```text
========== STUDENT SEARCH ==========

1. Search by Student ID
2. Search by Name
3. Search by Email
4. Back

Enter your choice:
```

The search should examine the student array and display matching information.

### Bonus Challenge

Make the name search **case-insensitive**.

For example:

```text
Search: aryan
```

should be able to find:

```text
Aryan
ARYAN
Aryan Singh
```

---

# ✍️ Part 8 — String Handling

CampusCare receives user information as text, so your program must perform meaningful String operations.

Use Java's `String` functionality to do things such as:

- Compare names
- Search names
- Validate email format
- Convert text to uppercase/lowercase
- Remove unnecessary spaces
- Check whether a string is empty
- Extract information from a string when appropriate

For example:

```text
Enter your email:
  aryan@example.com
```

Your program should be able to clean unnecessary spaces before storing the email.

### Requirement

Use **at least 5 meaningful String methods** in your application.

Do not use String methods only for the sake of satisfying the requirement.

---

# 🛠️ Part 9 — Methods / Functions

Your program should not contain everything inside `main()`.

Break the application into meaningful methods.

Examples:

```java
displayMainMenu()
login()
registerStudent()
displayCourses()
enrollInCourse()
dropCourse()
searchStudent()
displayStudentProfile()
```

These are only examples.

You should decide what methods your application actually needs.

### Method Requirement

Your program must contain:

- Instance methods
- Static methods
- Methods with parameters
- Methods that return values
- At least one overloaded method

---

# 🏛️ Part 10 — Clubs

Students can join university clubs.

Examples:

```text
1. Coding Club
2. Photography Club
3. Robotics Club
4. Music Club
5. Sports Club
```

Each club should contain information such as:

- Club ID
- Club Name
- Club President
- Maximum Members
- Current Members

A student should be able to:

```text
1. View clubs
2. Join a club
3. Leave a club
4. View my clubs
```

Think about how you will store club information.

---

# 🎫 Part 11 — Campus Events

The university also organizes events.

Examples:

```text
Tech Fest
Career Fair
Hackathon
Sports Day
Coding Competition
Cultural Festival
```

Each event should have:

- Event ID
- Event Name
- Date
- Location
- Maximum Participants
- Current Participants

Students should be able to register for events.

The program should prevent a student from registering if the event is already full.

---

# 🧑‍💼 Part 12 — Administrator Mode

If an administrator logs in, they should see a different menu.

For example:

```text
=========================================
       ADMINISTRATOR DASHBOARD
=========================================

1. Add Student
2. Remove Student
3. Search Student
4. Display All Students
5. Add Course
6. Display Courses
7. Display University Statistics
8. Logout

Enter your choice:
```

The administrator should have more control than a normal student.

---

# 📊 Part 13 — University Statistics

The administrator wants to see a summary.

For example:

```text
=========================================
       UNIVERSITY STATISTICS
=========================================

Total Students       : 125
Total Faculty        : 24
Total Courses        : 38
Total Clubs          : 12
Total Events         : 7
```

You should calculate these values from your actual data.

Do not simply hard-code:

```java
System.out.println("Total Students: 125");
```

---

# 🧠 Part 14 — Static Members

CampusCare wants to generate unique IDs automatically.

For example:

```text
ST1001
ST1002
ST1003
ST1004
```

Use an appropriate **static variable** to help generate unique IDs.

Think about why a static variable makes sense here.

You may also use static methods where appropriate.

---

# 🔄 Part 15 — Menu Navigation

Your application should feel like a real application.

A user should be able to move through menus:

```text
Main Menu
   ↓
Login
   ↓
Student Dashboard
   ↓
Course Management
   ↓
Enroll Course
   ↓
Back
   ↓
Student Dashboard
```

The user should not have to restart the application after every operation.

Use loops and conditional statements to create the menu system.

---

# ⚠️ Part 16 — Validation

Your application should handle invalid input.

For example:

```text
Enter your choice: 99

Invalid choice!
Please select an option from the menu.
```

Also consider situations such as:

- Empty name
- Invalid email
- Duplicate student
- Student does not exist
- Course does not exist
- Course is full
- Student already enrolled
- Student tries to drop a course they are not enrolled in
- Club is full
- Student tries to join the same club twice
- Event is full
- User enters an invalid menu option

You don't need to make the application perfect, but it should behave sensibly.

---


# 🎯 Minimum Class Suggestions

You are encouraged to design your own architecture.

However, your solution will probably need classes similar to:

```text
User
 ├── Student
 ├── Faculty
 └── Administrator

Course
Club
Event
CampusCareSystem
```

These are **suggestions, not mandatory class names**.

You may create additional classes if they make your design better.

---

# 🖥️ Example User Journey

Your application might behave like this:

```text
=========================================
       WELCOME TO CAMPUSCARE
=========================================

1. Login
2. Register New Student
3. Exit

Enter your choice: 2


========== STUDENT REGISTRATION ==========

Enter your name: Aryan Singh
Enter your email: aryan@example.com
Enter your phone: 9876543210
Enter your major: Computer Science

Registration successful!

Your Student ID is: ST1007


Press Enter to continue...
```

Then:

```text
========== STUDENT DASHBOARD ==========

Welcome, Aryan Singh!

1. My Profile
2. View Courses
3. Enroll in Course
4. Drop Course
5. My Courses
6. View Clubs
7. Join Club
8. My Clubs
9. View Events
10. Register for Event
11. Logout

Enter your choice:
```

The exact menu design is up to you.

---

# 🏆 Challenge Levels

## ⭐ Level 1 — Basic

Complete:

- Student registration
- Student login
- Course listing
- Course enrollment
- Course dropping
- Student search
- Arrays
- Strings
- Methods
- Basic OOP

---

## ⭐⭐ Level 2 — Intermediate

Add:

- Faculty
- Administrator
- Clubs
- Events
- Runtime polymorphism
- Method overloading
- Validation
- Statistics
- Unique ID generation

---

## ⭐⭐⭐ Level 3 — Advanced

Add your own features.

Ideas:

### 💳 Campus Wallet

Students have a campus wallet.

```text
Current Balance: ₹2,500

1. Add Money
2. Pay
3. Check Balance
```

### 🍔 Campus Cafeteria

Students can order food.

```text
1. Burger       ₹120
2. Pizza        ₹180
3. Sandwich     ₹100
4. Coffee       ₹80
```

### 🏅 Student Rewards

Students earn points for participating in events and clubs.

```text
Aryan Singh
Reward Points: 450
Level: Gold
```

### 📈 Student Performance

Store marks and calculate:

- Total
- Average
- Highest mark
- Lowest mark
- Grade

---

# 🚫 Important Restrictions

For this assignment:

### Do NOT use:

- Database
- Spring Boot
- Hibernate
- External frameworks
- GUI libraries

The goal is to demonstrate your understanding of **Core Java and OOP**.

You may use:

```text
Java
Arrays
String
Scanner
Loops
Conditions
Classes
Objects
Methods
Inheritance
Polymorphism
Encapsulation
```

---

# 📁 Suggested Project Structure

You may organize your project like this:

```text
CampusCare/
│
├── src/
│   ├── User.java
│   ├── Student.java
│   ├── Faculty.java
│   ├── Administrator.java
│   ├── Course.java
│   ├── Club.java
│   ├── Event.java
│   └── CampusCareSystem.java
│
└── README.md
```

You are free to choose a different structure.

---

# 📝 Final Submission Requirements

Submit:

### 1. Java Source Code

All `.java` files required to run the application.

### 2. README.md

Your README should explain:

- Application overview
- How to run the program
- Available features
- Class diagram
- OOP concepts used
- Example screenshots/output
- Challenges you faced
- Any additional features you implemented

### 3. Class Diagram

Create a class diagram showing relationships between your classes.

For example:

```text
                 User
                  |
        -----------------------
        |          |          |
     Student    Faculty   Administrator
        |
   -------------
   |     |     |
Course  Club  Event
```

Your actual diagram should represent your final design.

---