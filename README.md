# ToDoList_based_on_JAVA
Task Management Memo App 
📝 Todo List Memo App

This is a Java-based GUI application for managing a personal to-do list using the Swing framework. It allows users to add, display, and delete tasks in a simple interface, and also shows the current time updated in real-time. This project demonstrates practical use of Java GUI components and event-driven programming.

📌 Features

	•	Add new to-do items
	•	Delete the most recent to-do item
	•	Display all current tasks in a scrollable text area
	•	Real-time digital clock showing current date and time
	•	Input validation with warning dialogs

🧱 Code Structure

TodoListApp (Main Class)

	•	GUI Elements:
	•	JTextField: Input field for entering tasks
	•	JTextArea: Read-only area showing the to-do list
	•	JButton: “Add” and “Delete” buttons
	•	JLabel: Current time display at bottom
	•	Data Structure:
	•	ArrayList<String> to manage the to-do items dynamically
	•	Event Handling:
	•	ActionListener for button clicks
	•	Timer for real-time clock updates
	•	Validation:
	•	Prevents adding empty items
	•	Prevents deleting when the list is empty

🖥️ Example Screenshot

할 일을 입력하세요: [ 공부하기               ] [추가] [삭제]

- 공부하기
- 프로젝트 마무리하기

현재 시각: 2025-06-04 14:23:45

🔍 Java Concepts Demonstrated

Concept	Usage
Swing GUI	JFrame, JTextField, JTextArea, JButton, JLabel, Timer
Event-driven Programming	ActionListener, Timer for real-time updates
Data Structures	ArrayList<String> for storing tasks
Input Validation	Dialog messages using JOptionPane for edge cases
Layout Management	BorderLayout, FlowLayout for clean and responsive GUI

🚀 How to Run

	1.	Clone or download the project
	2.	Compile the Java file:

javac TodoListApp.java


	3.	Run the application:

java TodoListApp

📈 Future Improvements

	•	Allow editing or reordering of tasks
	•	Add checkbox support for completed tasks
	•	Persist to-do items using file I/O or database
	•	Add search/filter functionality
	•	Improve UI with custom themes or icons

📎 Requirements

	•	Java 8 or higher
	•	Any Java IDE (e.g., IntelliJ, Eclipse) or terminal/command-line

🧠 Inspiration

This project was built to practice Java GUI programming fundamentals and create a lightweight productivity tool.
