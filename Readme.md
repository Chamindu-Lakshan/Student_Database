# Student Database App (Java + MySQL JDBC)

A simple **console-based Java application** that manages student information using **MySQL** and **JDBC**.  
This project is built according to lecture guidelines.

---

## 📦 Requirements
- **Java**: JDK 8 or later  
- **MySQL** (via XAMPP Control Panel)  
- **MySQL Connector/J** (JDBC Driver)  

---

## ⚙️ Setup Instructions

### 1. Start MySQL
- Open **XAMPP Control Panel**  
- Start the **MySQL service**

### 2. Create Database and Table
Open **phpMyAdmin** or MySQL CLI and import "studentdb.sql" file

or create a new data base using following code
```sql
CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (
    student_id VARCHAR(20) PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    gender ENUM('Male','Female','Other'),
    email VARCHAR(100) UNIQUE,
    phone VARCHAR(20),
    address VARCHAR(255),
    course VARCHAR(100),
    enrollment_year INT
);
````

---

### 3. Add MySQL Connector/J to IntelliJ IDEA

* In IntelliJ:

  * Right-click project → **Open Module Settings (F4)**
  * Go to **Modules → Dependencies**
  * Click **+ → JARs or Directories**
  * Select the `mysql-connector-j-8.4.0.jar` file and click **Apply**

---

### 4. Configure Database Connection in Code

The app uses default MySQL settings from XAMPP:

```java
String url = "jdbc:mysql://localhost:3306/studentdb";
String user = "root";
String password = ""; // leave blank if no password set in XAMPP
```
Run the TestDB.java file to see if the database is connected sucssesfuly .
---

### 5. Run the Application

* Open IntelliJ IDEA
* Run `StudentApp.java` (main class)
* Use the console menu to:

  * Add a student
  * View all students
  * Update student info
  * Delete student

---

## 📝 Example

```
--- Student Database Menu ---
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Choose an option: 1

Enter Student ID: S16873
First Name: Chamindu
Last Name: Lakshan
Age: 22
Gender: Male
Email: chamindu@example.com
Phone: 0771234567
Address: Colombo
Course: Computer Science
Enrollment Year: 2023

✅ Student added successfully!
```

---

## 👤 Credit

Developed by **W\.Chamindu Lakshan**
University of Colombo

