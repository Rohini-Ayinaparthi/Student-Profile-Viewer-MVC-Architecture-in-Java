# Student Profile Viewer – MVC Architecture in Java

This project is a basic implementation of the **MVC (Model-View-Controller)** design pattern in Java. It represents a student's profile using clear separation of concerns through Model, View, and Controller classes.

## 📁 Project Structure

StudentProfileViewer/
│
├── Main.java # Entry point of the application
├── Model/
│ └── Student.java # The Student model class containing student details
├── View/
│ └── StudentView.java # Responsible for displaying student data
└── Controller/
└── StudentController.java # Controls data flow between model and view

markdown
Copy
Edit

## 🛠️ Technologies Used

- Java (JDK 8 or higher)
- Object-Oriented Programming (OOP)
- MVC Design Pattern

## 🔍 How It Works

- **Model (Student.java):**  
  Stores the student’s data such as ID, name, and address.

- **View (StudentView.java):**  
  Responsible for presenting the student data in a user-friendly format.

- **Controller (StudentController.java):**  
  Acts as a bridge between the Model and the View. It gets data from the model and updates the view accordingly.

## 🚀 Getting Started

### ✅ Prerequisites

- Java installed on your system (JDK 8 or higher)
- Any Java IDE (optional) or command-line terminal

### 🧾 Steps to Run

1. Make sure your file structure is like this:
Main.java
Model/Student.java
View/StudentView.java
Controller/StudentController.java

less
Copy
Edit

2. Open a terminal in the project root folder.

3. Compile all Java files:
```bash
javac Main.java Model/Student.java View/StudentView.java Controller/StudentController.java
Run the program:

bash
Copy
Edit
java Main
You will see output like:

yaml
Copy
Edit
Student Details:
ID: 77
Name: Vaishu
Address: GNT
