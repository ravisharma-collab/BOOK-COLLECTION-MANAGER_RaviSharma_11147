# How to Run Book Collection Manager

## 1. Prerequisites

Before running the project, make sure you have:

- Java JDK 8 or higher installed.
- Visual Studio Code (VS Code) or any Java-supported IDE.
- Java Extension Pack installed in VS Code (recommended).

## 2. Project Structure

Make sure your project folder contains the following files:

```text
BookCollectionManager/
│
├── Book.java
├── BookCollectionManager.java
├── README.md
└── run.md
```

## 3. Open the Project

1. Open Visual Studio Code.
2. Click on **File → Open Folder**.
3. Select the `BookCollectionManager` folder.
4. Open the terminal using **Terminal → New Terminal**.

## 4. Check Java Installation

Open the terminal and execute:

```bash
java -version
```

Check the Java compiler:

```bash
javac -version
```

If both commands display version numbers, Java is installed correctly.

If Java is not recognized, install the JDK and configure the system PATH.

## 5. Compile the Java Files

Navigate to the project directory if necessary:

```bash
cd BookCollectionManager
```

Skip this command if your terminal is already inside the project folder.

Compile both Java files:

```bash
javac Book.java BookCollectionManager.java
```

After successful compilation, Java generates:

```text
Book.class
BookCollectionManager.class
```

## 6. Run the Application

Execute the following command:

```bash
java BookCollectionManager
```

The application will start and display the main menu.

## 7. Expected Output

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

Enter choice:
```

## 8. How to Use the Application

### Option 1: Add Book

Enter `1` to add a new book.

Example:

```text
Enter choice: 1

Enter Book Title: Java Programming
Enter Author Name: James Gosling
Enter ISBN: 123456

Book added successfully!
```

### Option 2: Display All Books

Enter `2` to display the collection.

Example:

```text
Enter choice: 2

--- BOOK COLLECTION ---
1. Title: Java Programming | Author: James Gosling | ISBN: 123456
```

### Option 3: Sort Books by Title

Enter `3` to sort all books alphabetically.

```text
Enter choice: 3

Books sorted successfully!
```

The sorted book collection will also be displayed.

### Option 4: Search Book by Title

Enter `4` to search for a book using Linear Search.

```text
Enter choice: 4

Enter Book Title: Java Programming

Book Found!
Title: Java Programming | Author: James Gosling | ISBN: 123456
```

### Option 5: Exit

Enter `5` to close the application.

```text
Enter choice: 5

Thank you! Goodbye.
```

## 9. Common Errors and Solutions

### Error: 'javac' is not recognized

**Solution:**
- Install Java JDK.
- Configure the JAVA_HOME environment variable.
- Add the JDK `bin` directory to the system PATH.
- Restart the terminal.

### Error: Could not find or load main class

**Solution:**

Make sure you are inside the correct project directory.

Compile again:

```bash
javac Book.java BookCollectionManager.java
```

Run:

```bash
java BookCollectionManager
```

### Error: Cannot find symbol Book

**Solution:**

Ensure that `Book.java` and `BookCollectionManager.java` are in the same directory and use compatible package declarations.

Compile both files together.

### Error: Class BookCollectionManager is public, should be declared in a file named BookCollectionManager.java

**Solution:**

Ensure the Java filename exactly matches the public class name.

## 10. Quick Run Commands

For Windows, Linux, and macOS terminals:

```bash
javac Book.java BookCollectionManager.java
java BookCollectionManager
```

Both commands must be executed from the project directory.

## 11. Important Notes

- The application uses an ArrayList to store book objects.
- All book information is stored temporarily in memory.
- Data will be lost when the program closes.
- Duplicate ISBN entries are not allowed.
- Book searching uses the Linear Search algorithm.
- Sorting is performed alphabetically using Comparator.
- The application continues running until the user selects Exit.

## 12. Conclusion

The Book Collection Manager can be compiled and executed using the Java Development Kit and a terminal. It demonstrates basic Java programming, Object-Oriented Programming, ArrayList operations, searching, and sorting.

**Project:** Book Collection Manager  
**Programming Language:** Java  
**Execution Mode:** Console-Based Application  
**Main Class:** BookCollectionManager