# 📖 Scenario

A school wants to build a small Library Management System.

Every book has:

- Book ID
- Title
- Author
- Price
- Availability Status

All books belong to the **same library**, therefore the library name should not be stored separately for every book.

---

# 📋 Requirements

## 1. Create a class named `Book`

The class should contain the following private instance variables:

| Variable | Type |
|----------|------|
| bookId | int |
| title | String |
| author | String |
| price | double |
| available | boolean |

---

## 2. Create one Static Variable

All books belong to the same library.

Create

```java
static String libraryName = "City Central Library";
```

This variable should be shared by every object.

---

## 3. Create Getter & Setter Methods

Create getters and setters for every private variable.

### Validation Rules

### Book ID

- Must be greater than 0.

---

### Title

- Cannot be empty.

---

### Author

- Cannot be empty.

---

### Price

- Cannot be negative.

---

### Availability

Can only be

```text
true
false
```

---

## 4. Create Instance Methods

### displayBookDetails()

Print

```text
Book ID :
Title :
Author :
Price :
Available :
Library :
```

---

### borrowBook()

If the book is available

```text
Book borrowed successfully.
```

Change

```text
available = false
```

Otherwise

```text
Book is already issued.
```

---

### returnBook()

If the book is already borrowed

```text
Book returned successfully.
```

Change

```text
available = true
```

Otherwise

```text
Book is already available.
```

---

### applyDiscount(double percentage)

Reduce the book price.

Example

```
Price = 1000

Discount = 20%

New Price = 800
```

---

## 5. Create Static Methods

### displayLibraryName()

Print

```text
Library Name : City Central Library
```

---

### changeLibraryName(String newName)

Update the library name.

This should affect every Book object.

---

## 6. Create Objects

Create three books.

Example

```text
Book 1

Java Programming

Author : James Gosling

Price : 650

----------------------

Book 2

Python Basics

Price : 500

----------------------

Book 3

Data Structures

Price : 800
```

---

## 7. Perform the Following Operations

### Book 1

- Display details
- Borrow book
- Display details again

---

### Book 2

- Apply 15% discount
- Display details

---

### Book 3

- Borrow book
- Return book
- Display details

---

### Static Demonstration

Print library name.

Change library name to

```text
ABC Public Library
```

Print library name again.

Display details of all books and verify that every book shows the updated library name.

---

# 💻 Expected Concepts Used

You **must** use the following:

- Class
- Objects
- Constructors (Optional Bonus)
- Instance Variables
- Static Variable
- Private Variables
- Getter Methods
- Setter Methods
- Instance Methods
- Static Methods
- Validation

---

# 📌 Sample Output

```text
Library Name : City Central Library

--------------------------------

Book ID : 101
Title : Java Programming
Author : James Gosling
Price : 650.0
Available : true
Library : City Central Library

--------------------------------

Book borrowed successfully.

--------------------------------

Book ID : 101
Title : Java Programming
Author : James Gosling
Price : 650.0
Available : false
Library : City Central Library

--------------------------------

15% Discount Applied

New Price : 425.0

--------------------------------

Library Name changed successfully.

Library Name : ABC Public Library
```

---

# ⭐ Bonus Challenge (Optional)

Implement a static variable

```java
static int totalBooks;
```

Every time a new `Book` object is created, increment this variable automatically.

Create a static method

```java
displayTotalBooks()
```

Output:

```text
Total Books in System : 3
```

---

# 🌟 Super Bonus Challenge (Optional)

Add the following features:

### 1. Check Expensive Book

Create an instance method

```java
isExpensiveBook()
```

Return `true` if price is greater than **1000**.

---

### 2. Compare Book Prices

Create a static method

```java
comparePrice(Book b1, Book b2)
```

Print which book is more expensive.

---

### 3. Search by Book Title

Create an instance method

```java
hasTitle(String title)
```

Return `true` if the book title matches the given title.

---
