# Java Assignment: Smart City Utility Management System


---

## Problem Statement

Create a Java program that continuously displays the following menu until the user chooses to exit.

```text
===== SMART CITY UTILITY MANAGEMENT =====

1. Water Usage Checker
2. Electricity Bill Calculator
3. Traffic Signal Simulator
4. Parking Slot Finder
5. Citizen Complaint Tracker
6. Exit

Enter your choice:
```

---

## Option 1: Water Usage Checker

Ask the user to enter the number of liters of water used in a day.

Use `if-else` statements to display:

* Less than 100 liters → **Excellent water conservation**
* 100 to 300 liters → **Normal usage**
* More than 300 liters → **High water consumption. Please conserve water**

---

## Option 2: Electricity Bill Calculator

Ask the user to enter the number of electricity units consumed.

Calculate the bill using the following rates:

| Units           | Rate         |
| --------------- | ------------ |
| First 100 units | ₹5 per unit  |
| Next 100 units  | ₹7 per unit  |
| Above 200 units | ₹10 per unit |

Display the total bill amount.

Use `if-else` statements.

---

## Option 3: Traffic Signal Simulator

Ask the user to enter a signal color:

```text
R - Red
Y - Yellow
G - Green
```

Use a `switch` statement to display:

* Red → Stop
* Yellow → Ready
* Green → Go

Display an appropriate message for invalid input.

---

## Option 4: Parking Slot Finder

Ask the user to enter the total number of parking slots.

Use a `for` loop to display available parking slots.

### Rules

* Slot numbers divisible by 4 are reserved for VIP vehicles.
* Use `continue` to skip VIP slots.
* If the slot number reaches 20, use `break` to stop checking further slots.

### Example Output

```text
Available Slots:
1
2
3
5
6
7
9
10
11
13
14
15
17
18
19
```

---

## Option 5: Citizen Complaint Tracker

Ask the user:

```text
How many complaints do you want to register?
```

Use a `do-while` loop to repeatedly accept complaint IDs.

### Rules

* If the complaint ID is negative, display:

```text
Invalid Complaint ID
```

and use `continue`.

* If the complaint ID is `999`, stop accepting complaints using `break`.
* Count and display the total number of valid complaints registered.

---

## Option 6: Exit

Display:

```text
Thank you for using Smart City Utility Management System.
```

Terminate the program.

---

### The program must:

* Continuously display the menu until the user selects Exit.

---

## Sample Run

```text
===== SMART CITY UTILITY MANAGEMENT =====

1. Water Usage Checker
2. Electricity Bill Calculator
3. Traffic Signal Simulator
4. Parking Slot Finder
5. Citizen Complaint Tracker
6. Exit

Enter your choice: 3

Enter signal color: G

Go
```

---