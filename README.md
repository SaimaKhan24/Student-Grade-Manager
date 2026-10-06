Student Grade Manager

An interactive Java console application that collects student data, validates input, calculates grades, and computes the class average.

Features
- Takes user input dynamically using `Scanner` (no hardcoded data)
- Stores student records using a `HashMap<String, Integer>`
- Validates marks (must be between 0–100) using a `while` loop that re-prompts until valid input is given
- Calculates and displays each student's letter grade (A/B/C/D) based on marks
- Computes and displays the overall class average

Built With
- Java (core language features: loops, conditionals, collections, Scanner)

Concepts Used
- `HashMap` for key-value data storage
- `Scanner` for interactive user input
- Input validation using `while` loops
- Conditional logic (if/else if/else) for grade calculation
- Accumulator pattern for calculating averages

How to Run
1. Make sure you have Java installed ([download here](https://www.oracle.com/java/technologies/downloads/))
2. Clone this repository:
```bash
   git clone https://github.com/yourusername/student-grade-manager.git
```
3. Navigate into the folder and compile:
```bash
   javac Project.java
```
4. Run it:
```bash
   java Project
```
5. Follow the prompts to enter the number of students, their names, and marks.

## 📸 Example Run
```
Enter number of students: 2
Enter Name: Priya
Enter marks: 105
Invalid marks. Enter correct marks: 88
Enter Name: Raj
Enter marks: 60

Name: Priya Marks: 88
Grade A
Name: Raj Marks: 60
Grade B
Average: 74
```

What I Learned
Building this project helped me practice combining multiple core Java concepts — collections, user input, validation loops, and conditional logic — into a single working, interactive program.

Future Improvements
- Add file storage so data persists between runs
- Add a GUI instead of console-only interaction
- Support editing/deleting a student's record after entry
