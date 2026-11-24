# 📚 Book Collection Manager

## 1. Project Overview
The **Book Collection Manager** is a menu-driven Java application designed to manage a collection of books. It allows users to add books, display all available books, sort books alphabetically by title, and search for books using Linear Search.

This project demonstrates the practical implementation of **Data Structures and Algorithms (DSA)** along with Object-Oriented Programming (OOP) concepts in Java.

## 2. Objectives
- To understand and implement ArrayList in Java.
- To apply Linear Search for finding books.
- To implement sorting using Comparator.
- To understand Encapsulation and Constructors.
- To develop a menu-driven Java application.

## 3. Technologies Used
- **Programming Language:** Java
- **Data Structure:** ArrayList
- **Searching Algorithm:** Linear Search
- **Sorting:** Comparator
- **Input Handling:** Scanner
- **IDE:** IntelliJ IDEA / Eclipse / VS Code

## 4. Project Structure

```text
BookCollectionManager/
│
├── Book.java
├── BookCollectionManager.java
└── README.md
```

### File Description

**Book.java**
- Defines the Book class.
- Stores book title, author, and ISBN.
- Uses private variables for Encapsulation.
- Contains a constructor and getter methods.
- Overrides the toString() method.

**BookCollectionManager.java**
- Contains the main method.
- Manages the collection using ArrayList.
- Implements adding, displaying, sorting, and searching operations.
- Provides a menu-driven user interface.

## 5. Features

### 1. Add Book
Allows users to enter the title, author name, and ISBN of a book. It also prevents duplicate ISBN entries.

### 2. Display All Books
Displays all books stored in the collection with their details.

### 3. Sort Books by Title
Sorts books alphabetically by title using Java Comparator. Sorting is case-insensitive.

### 4. Search Book by Title
Searches for a particular book using Linear Search and displays matching book details.

### 5. Exit
Terminates the application safely.

## 6. DSA Concepts Implemented

| Concept | Application |
|---|---|
| ArrayList | Stores book objects dynamically |
| Linear Search | Searches books by title |
| Sorting | Arranges books alphabetically |
| Traversal | Displays all books |
| Encapsulation | Protects book data using private variables |
| Constructor | Initializes book objects |

## 7. Time Complexity Analysis

| Operation | Time Complexity |
|---|---|
| Add Book | O(n) including duplicate ISBN checking |
| Display Books | O(n) |
| Linear Search | O(n) |
| Sorting | O(n log n) |
| Access by Index | O(1) |

Here, n represents the total number of books in the collection.

## 8. How to Run the Project

**Step 1:** Install Java JDK on your computer.

**Step 2:** Create a project folder named `BookCollectionManager`.

**Step 3:** Create two Java files:
- Book.java
- BookCollectionManager.java

**Step 4:** Copy the respective source codes into the files.

**Step 5:** Open the terminal in the project folder.

**Step 6:** Compile the program:

```bash
javac Book.java BookCollectionManager.java
```

**Step 7:** Run the application:

```bash
java BookCollectionManager
```

## 9. Sample Output

```text
====================================
   BOOK COLLECTION MANAGER
====================================

--- MAIN MENU ---
1. Add Book
2. Display All Books
3. Sort Books by Title
4. Search Book by Title
5. Exit

Enter choice: 1

Enter Book Title: Java Programming
Enter Author Name: James Gosling
Enter ISBN: 123456

Book added successfully!

Enter choice: 2

--- BOOK COLLECTION ---
1. Title: Java Programming |
   Author: James Gosling |
   ISBN: 123456

Enter choice: 5

Thank you! Goodbye.
```

## 10. Advantages
- Simple and user-friendly interface.
- Dynamic storage using ArrayList.
- Efficient searching and sorting operations.
- Prevents duplicate ISBN entries.
- Demonstrates practical DSA and OOP implementation.

## 11. Future Enhancements
- Add book deletion functionality.
- Add book update functionality.
- Search books by author or ISBN.
- Implement file handling for permanent storage.
- Develop a graphical user interface (GUI).
- Implement Binary Search after sorting.

## 12. Conclusion

The Book Collection Manager project demonstrates how Java programming and Data Structures can be used to solve a real-world problem. It provides practical knowledge of ArrayList, Linear Search, Sorting, Encapsulation, and Object-Oriented Programming.

This project helps strengthen programming fundamentals and provides a foundation for developing more advanced library management systems.

---

**Project Type:** Data Structures and Algorithms (DSA)  
**Language:** Java  
**Domain:** Book Management System