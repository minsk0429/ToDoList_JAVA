# ToDoList_based_on_JAVA
This is a Java-based task management memo application implemented using Swing. It features a simple and intuitive GUI that allows users to manage to-do items in real-time. This project demonstrates core Java GUI programming concepts including event-driven programming, dynamic UI updates, and time-based functionalities.

---

## 📌 Features

- Add new to-do items via input field
- Delete the most recently added task
- Display current to-do list in a text area
- Show real-time clock updated every second
- Input validation and warning dialogs
- Simple and clean UI with layout managers

---

## 🧱 Code Structure

### `TodoListApp` (Main Class)

The entire application is handled in a single class that organizes the UI and logic.

---

### `UI Components`:
- JFrame: Main application window
- JTextField: Input field for tasks
- JTextArea: Area displaying to-do items
- JButton: Buttons for adding and deleting tasks
- JLabel: Real-time clock display

---

### `Logic Components`:
- ArrayList<String>: Stores all to-do tasks dynamically
- Timer: Updates current time every second
- ActionListener: Handles button click events
- JOptionPane: Displays warning dialogs when necessary

---

## 🔄 Example Output

Enter your task: [ Data structure review ] [Add] [Delete]

- Data structure review
- Java project completion

 current time: 2025-06-04 14:25:17

---

## 🔍 Java Concepts Demonstrated

| Concept           | Usage                                                                 |
|-------------------|------------------------------------------------------------------------|
| GUI Programming   | Implemented using Swing components (`JFrame`, `JTextField`, etc.)     |
| Event Handling    | Button clicks handled with `ActionListener`                           |
| Timer & Real-Time | `javax.swing.Timer` for updating the clock every second               |
| Data Structures   | `ArrayList` used to manage dynamic to-do items                         |
| Layout Management | `BorderLayout`, `FlowLayout` used for organizing components           |
| Input Validation  | Dialogs shown with `JOptionPane` for empty input or invalid actions   |

---

## 📈 Future Improvements

- Allow editing and marking tasks as completed
- Save and load tasks using file I/O
- Use ArrayList<String> with filtering/search feature
- Support for multi-line task descriptions
- Add GUI theme customization or dark mode
- Add keyboard shortcuts (e.g., Enter to add)

---

## 📎 Requirements

- Java 8 or higher
- Any IDE (e.g., IntelliJ, Eclipse) or command-line environment

---

## ✅ How to Run

	1. Clone the repository or download the source file
	2. Compile the Java file:

javac TodoListApp.java

	3. Run the program:

java TodoListApp
