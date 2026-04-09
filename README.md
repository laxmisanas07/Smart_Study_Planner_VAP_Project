# Smart Study Planner with Burnout Detection

## Project Description

This project is a simple Java-based study planner developed to help students manage their daily study activities. Along with planning tasks, the system also tries to detect burnout by analyzing study hours and patterns.

Many students study continuously without taking proper breaks, which can lead to stress and reduced productivity. This project attempts to solve that problem by giving warnings when study time becomes too high and suggesting the user take rest.

---

## Prerequisites

To run this project, you need:

* JDK 17 or above
* Any Java IDE like Eclipse, IntelliJ, or VS Code
* Basic understanding of Java

---

## How to Run the Application

### Using Eclipse

1. Open Eclipse
2. Import the project
3. Go to `SmartStudyPlanner.java`
4. Right-click and select **Run As → Java Application**

---

### Using Command Line

1. Open terminal

2. Go to the project folder:

   ```bash
   cd src
   ```

3. Compile the files:

   ```bash
   javac *.java
   ```

4. Run the program:

   ```bash
   java SmartStudyPlanner
   ```

---

## Project Structure

```text
src/
│
├── SmartStudyPlanner.java   (Main class)
├── StudyTracker.java        (Manages tasks and logs)
├── StudyTask.java           (Task details)
└── BurnoutDetector.java     (Burnout checking logic)
```

---

## Features

* Add study tasks
* View all tasks
* Log daily study hours
* Track study activity
* Detect burnout
* Give basic suggestions

---

## Build Information

This is a basic Java project and does not use Maven or Gradle.
However, it can be extended in the future if needed.

---

## Sample Output

```text
Enter Subject Name: Mathematics
Enter Study Hours: 4
Task added successfully!

Average study hours: 9
Warning: High risk of burnout!
```

---

## Authors

* Ketan V. Zode
* Divya A. Shinde
* Laxmi A. Sanas

---

## Note

This project was developed as part of the Value Added Program on Advanced Java Programming.
