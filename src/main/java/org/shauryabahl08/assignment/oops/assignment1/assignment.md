# Java Assignment: Functions (Methods)

# Question 1: Calculator Using Methods

Create a calculator that performs the following operations:

* Addition
* Subtraction
* Multiplication
* Division

## Requirements

Create the following methods:

```java
add()
subtract()
multiply()
divide()
```

Each method should:

* Accept two numbers as parameters.
* Return the calculated result.

### Sample Output

```text
Enter first number: 20
Enter second number: 5

Addition       : 25
Subtraction    : 15
Multiplication : 100
Division       : 4
```

---

# Question 2: Student Report Card

Take input for:

* Student Name
* Roll Number
* Marks of 5 Subjects

Create the following methods:

```java
calculateTotal()
calculatePercentage()
calculateGrade()
displayReport()
```

### Grade Rules

| Percentage | Grade |
| ---------- | ----- |
| 90+        | A     |
| 75–89      | B     |
| 60–74      | C     |
| 40–59      | D     |
| Below 40   | F     |

### Sample Output

```text
Student Name : Mohit
Roll No      : 101

Total Marks  : 438
Percentage   : 87.6%

Grade        : B
```

---

# Question 3: Shopping Bill Generator

Take input for:

* Product Name
* Price
* Quantity

Create methods:

```java
calculateSubtotal()
calculateGST()
calculateFinalAmount()
printBill()
```

**GST = 18%**

### Sample Output

```text
Product   : Laptop

Subtotal  : ₹50000
GST        : ₹9000

Total      : ₹59000
```

---

# Question 4: Employee Salary Calculator

Take input for:

* Employee Name
* Basic Salary

Create methods:

```java
calculateHRA()
calculateDA()
calculateTax()
calculateNetSalary()
printSalarySlip()
```

### Rules

* HRA = 20%
* DA = 10%
* Tax = 5%

Display the complete salary slip.

---

# Question 5: Electricity Bill Calculator

Take input for:

* Customer Name
* Units Consumed

Create methods:

```java
calculateBill()
calculateTax()
printReceipt()
```

### Billing Rules

* First 100 Units → ₹5/unit
* Next 100 Units → ₹7/unit
* Remaining Units → ₹10/unit
* Tax = 5%

---

# Question 6: Bank Account Simulator

Display the following menu repeatedly until the user exits:

```text
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
```

Create methods:

```java
displayMenu()
deposit()
withdraw()
checkBalance()
```

---

# Question 7: Number Utility

Take one integer as input.

Create methods:

```java
isEven()
isPrime()
reverseNumber()
sumOfDigits()
```

Display all the results.

---

# Question 8: String Utility

Take one sentence as input.

Create methods:

```java
countCharacters()
countWords()
reverseString()
convertUpperCase()
convertLowerCase()
```

Display the result of each method.

---

# Question 9: Temperature Converter

Display the following menu:

```text
1. Celsius → Fahrenheit
2. Fahrenheit → Celsius
3. Celsius → Kelvin
4. Exit
```

Create separate methods for each conversion.

---

# Question 10: Restaurant Bill Generator

Take input for:

* Customer Name
* Food Item
* Price
* Quantity

Create methods:

```java
calculateAmount()
calculateGST()
calculateDiscount()
printInvoice()
```

### Rules

* GST = 5%
* Discount = 10% if bill amount is greater than ₹2000

---

# Mini Project: Online Shopping System

Create a console-based shopping application.

### Menu

```text
1. Add Product
2. View Cart
3. Checkout
4. Exit
```

Create **at least 12 methods**.

Suggested methods:

```java
displayMenu()
addProduct()
removeProduct()
displayProducts()
searchProduct()
calculateSubtotal()
calculateGST()
calculateDiscount()
calculateFinalAmount()
printInvoice()
checkout()
exitProgram()
```

> **Note:** Do not use arrays or collections. Store values in variables. The goal of this assignment is to practice creating and calling methods.

---

# Challenge Question ⭐

## Movie Ticket Booking System

Take input for:

* Movie Name
* Number of Tickets
* Ticket Price
* Customer Age

### Rules

* Children (Age < 12): 50% Discount
* Senior Citizens (Age > 60): 30% Discount
* GST = 12%

Create methods:

```java
calculateTicketAmount()
calculateDiscount()
calculateGST()
calculateFinalAmount()
printTicket()
```

---

