# Raina’s Java Coding Practice
## Week 3: MOOC.fi Part 4 — Objects, Lists, and Files

**Recommended schedule:** 6 days  
**Daily practice time:** 30–45 minutes  
**Goal:** Practice the main concepts from MOOC.fi Part 4: object-oriented programming, objects in lists, and reading data from files.

## Before you begin

This week you will model a robotics team and its robots. In Python you used variables, lists, and functions. A Java **object** keeps related information together and provides methods that work with that information. A **class** describes what each object stores and can do. A **constructor** sets up a new object; a **getter** returns one stored value without changing it. An **instance variable** belongs to an individual object, so two robots can have different battery levels.

Days 1–2 introduce objects. Days 3–4 reuse your `TeamMember` class in a list. Day 5 introduces file reading. Day 6 combines objects, lists, and files. These exercises continue the MOOC.fi learning path requested by your robotics teacher; use the related Part 4 lessons when a concept is new. Allow extra time for reading and setup—the 30–45 minutes is a guide.

### How to organize your work

- Use a separate practice folder for Week 3, with the Java and text files together. Keep these beginner exercises in the default package (no `package` line).
- Put each public class in a file with the same name, including capitalization.
- A **driver** is a small program with `public static void main(String[] args)` that creates and tests objects. Days 1–2 use drivers; `TeamRoster`, `TeamPerformance`, `ReadScores`, and `RobotInventory` each have their own `main`.
- Keep `TeamMember.java` available for Days 2–4. Day 6 uses a new `Robot` class, separate from Day 1's `RobotBattery`.
- Days 1, 2, and 4 use values written in your driver, not keyboard input. Day 3 uses keyboard input. Days 5–6 read text files.
- For lists, import `java.util.ArrayList`. For input, import `java.util.Scanner`. For the file exercises, also import `java.nio.file.Paths`.
- A relative filename such as `scores.txt` is looked up in the program's **working directory**—the folder from which it runs. Set your editor's run directory to the Week 3 folder if the file cannot be found.

The method lists below are specifications, not complete Java code to paste into a class. You write their bodies. Sample results show expected behavior, not implementation solutions.

---

# Day 1 — First Custom Class

## Problem 1: Robot Battery

### Situation and goal

Your robotics team wants to simulate battery use before a practice session. Each robot has its own name and battery percentage. Running a task uses battery; plugging in a charger adds battery. Write a class that remembers the current level after each action.

### Input and expected behavior

In `RobotBatteryDemo.java`, create an object using the constructor `RobotBattery(String robotName, int batteryLevel)`. For this exercise, starting levels are whole numbers from 0 to 100 and all action amounts are nonnegative whole numbers. You do not need to handle invalid inputs yet.

`useBattery(amount)` subtracts that many percentage points; if there is not enough charge, the level becomes 0. `chargeBattery(amount)` adds percentage points, stopping at 100. These methods update the object but do not print. Getters return the current values. `toString()` returns the description shown below; your driver prints it.

### Sample input and output

Sample input is a sequence of actions: create Atlas at 80%, use 25 points, print, charge 60 points, print. No keyboard input is required. The example below shows the expected output: 55% after use and 100% after charging, because 115% exceeds the limit.

### Think Before Coding

1. Which two pieces of information must each battery object remember?
2. What is the difference between changing a value and printing it?
3. What should happen if Atlas has 10% remaining and uses 30 points?
4. If you create a second robot, should charging Atlas change the second robot's battery?

### Class requirements

Create a class named:

```text
RobotBattery.java
```

Instance variables:

```java
private String robotName;
private int batteryLevel;
```

Create a constructor and these methods:

```java
public String getRobotName()
public int getBatteryLevel()
public void useBattery(int amount)
public void chargeBattery(int amount)
public String toString()
```

Rules:

- Battery cannot go below `0`.
- Battery cannot go above `100`.

Example:

```java
RobotBattery robot = new RobotBattery("Atlas", 80);

robot.useBattery(25);
System.out.println(robot);

robot.chargeBattery(60);
System.out.println(robot);
```

Expected output:

```text
Atlas — battery 55%
Atlas — battery 100%
```

### Test

Test:

- normal use
- battery trying to go below zero
- battery trying to go above 100

---

# Day 2 — Objects with Behavior

## Problem 2: Robotics Team Member

### Situation and goal

The team mentor wants to track completed jobs, such as testing a sensor or fixing a wheel. Each member has a name, a role, and a task count. Your class should let a driver record completed work without directly changing the fields.

### Input and expected behavior

Use the constructor `TeamMember(String name, String role)`. Every new member starts with **0 tasks completed**. `completeTask()` adds one task; `completeTasks(int amount)` adds a nonnegative whole number of tasks. Assume valid amounts, including zero. Getters return stored values; `toString()` returns a description. None of these methods should print by themselves.

In `TeamMemberDemo.java`, create the three members below and apply the listed actions. No keyboard input is required.

### Sample input

| Name | Role | Actions after creation |
| --- | --- | --- |
| Raina | Coding Lead | Complete one task, then complete three tasks |
| Maya | Mechanical | Complete two tasks |
| Alex | Driver | No tasks yet |

### Sample output

Print each object after those actions:

```text
Raina — Coding Lead — 4 tasks completed
Maya — Mechanical — 2 tasks completed
Alex — Driver — 0 tasks completed
```

Use the same wording even when the count is 1; handling singular/plural wording is optional.

### Think Before Coding

1. Which values come from the constructor, and which value starts automatically at zero?
2. How do the two task-completion methods differ?
3. What should adding zero tasks do?
4. How will you check that updating Raina leaves Maya's count unchanged?

### Class requirements

Create:

```text
TeamMember.java
```

Instance variables:

```java
private String name;
private String role;
private int tasksCompleted;
```

Create a constructor and:

```java
public String getName()
public String getRole()
public int getTasksCompleted()
public void completeTask()
public void completeTasks(int amount)
public String toString()
```

Example:

```text
Raina — Coding Lead — 4 tasks completed
```

Create at least three team-member objects and update their task counts.

### Reflection

Why is an object better than keeping separate variables for every team member?

```text
____________________________________________________________
____________________________________________________________
```

---

# Day 3 — Objects in an ArrayList

## Problem 3: Robotics Team Roster

### Situation and goal

At the start of a meeting, the mentor enters everyone who attended. The number of attendees is unknown in advance. Store each person's name and role together as a `TeamMember` object in an expandable list, then print the roster.

### Input and expected behavior

Reuse Day 2's `TeamMember.java`. Read a whole line for the name, then a whole line for the role so a role can contain spaces. If the name is empty (the user presses Enter without typing), stop immediately **without asking for a role**. Assume entered names and roles are valid and nonempty otherwise. Each member starts with zero tasks. Keep members in entry order; repeated names count as separate entries for this exercise.

### Sample input

The user enters these lines, followed by one empty line:

```text
Raina
Coding Lead
Maya
Mechanical

```

### Sample output

After the input prompts, print:

```text
Team roster:
Raina — Coding Lead — 0 tasks completed
Maya — Mechanical — 0 tasks completed
Total members: 2
```

If the very first name is empty, print `No members entered.` followed by `Total members: 0`.

### Think Before Coding

1. Why must you check the name before asking for the role?
2. At what point do you have enough information to create one object?
3. How is a list of member objects different from a list of names?
4. What should the program do if nobody attends?

### Program requirements

Create:

```text
TeamRoster.java
```

Use:

```java
ArrayList<TeamMember>
```

Repeatedly ask for:

- member name
- member role

An empty name ends input.

Example:

```text
Name: Raina
Role: Coding Lead

Name: Maya
Role: Mechanical

Name:
```

Display all members and the total number of members.

### Requirements

Use:

```java
members.add(...)
members.size()
```

and a for-each loop:

```java
for (TeamMember member : members)
```

### Optional extension

After printing the roster, ask once for a role. Print matching members in entry order, or `No matching members.` if there are none. For example, `mechanical` should match Maya in the sample.

Ask the user for a role and print only matching members.

Use:

```java
.equalsIgnoreCase(...)
```

---

# Day 4 — Analyze Objects in a List

## Problem 4: Team Performance Tracker

### Situation and goal

At the end of practice, the mentor wants a summary of the team's work. Your program will analyze the task counts stored inside member objects. You are reporting existing work, not asking for new input.

### Sample input

Create `TeamPerformance.java`. Reuse Day 2's constructor and task methods to create these five members and set their counts. The table is your test data; do not read it from the keyboard or a file.

| Name | Role | Completed tasks |
| --- | --- | --- |
| Raina | Coding Lead | 4 |
| Maya | Mechanical | 2 |
| Alex | Driver | 0 |
| Jordan | Electronics | 5 |
| Sam | Strategy | 4 |

### Sample output

```text
Raina — Coding Lead — 4 tasks completed
Maya — Mechanical — 2 tasks completed
Alex — Driver — 0 tasks completed
Jordan — Electronics — 5 tasks completed
Sam — Strategy — 4 tasks completed
Total tasks: 15
Average tasks: 3.0
Top member: Jordan — 5 tasks
Members with 3 or more tasks: 3
```

### Rules and boundary cases

Calculate the average as a decimal value, including when the result is not a whole number. If two members tie for the highest count, report the first one in list order. Include members with exactly 3 tasks in the threshold count. All counts are nonnegative.

For the required exercise and the optional `findTopMember` method below, assume the list has at least one member. Optional extra: decide how your main program could handle an empty list before calculating an average or finding a top member.

### Think Before Coding

1. What must you remember while visiting each member?
2. Which getter gives you the value you need for the calculations?
3. How will you avoid losing the decimal part of the average?
4. How will you test a tie for first place?

### Program requirements

Create at least five `TeamMember` objects and add them to an `ArrayList`.

Display:

- all members
- total tasks completed
- average tasks completed
- member with the most completed tasks
- number of members with 3 or more completed tasks

### Challenge Method

Write:

```java
public static TeamMember findTopMember(ArrayList<TeamMember> members)
```

Do not sort the list.

---

# Day 5 — Reading Data from a File

## Problem 5: Read Robotics Scores

### Situation and goal

After a robotics knowledge quiz, the mentor saves the results in a text file. Your program should read those saved results and produce a report so the mentor does not have to retype every score.

### Input and file format

The sample input is the full contents of `scores.txt` shown below. Each line contains one name, a comma, and one whole-number score from 0 to 100. There is **no header row**. For this exercise, assume every line has the correct format, with no blank lines, extra spaces, or commas inside names. Keyboard input is not needed.

Splitting one line produces text pieces. The score piece is still text until you convert it to an integer. You may process records one at a time; you do not need a custom class or a list today.

### Sample output

```text
Raina: 92
Maya: 84
Alex: 76
Jordan: 95
Sam: 68
Records: 5
Average score: 83.0
Highest score: 95
Highest-scoring student: Jordan
```

### Rules and boundary cases

Print records in file order. Calculate a decimal average. For a highest-score tie, choose the first student in file order. If the file is empty, print `No scores found.` and skip the average and highest-score report. If the file cannot be read, print an error message and stop; do not print a success summary. The exact error detail can vary by computer. Close the file scanner when finished.

### Think Before Coding

1. What does one line represent? What does the comma separate?
2. Why must the score change from text to an integer?
3. What information must you accumulate as you read?
4. Why does an empty file need different behavior from a file containing a score of zero?

### Program requirements and sample input file

Create:

```text
scores.txt
```

Contents:

```text
Raina,92
Maya,84
Alex,76
Jordan,95
Sam,68
```

Create:

```text
ReadScores.java
```

Read the file using:

```java
Scanner
Paths.get(...)
```

For each line:

1. Read the line.
2. Split it using a comma.
3. Store the name.
4. Convert the score to an integer.

Use:

```java
line.split(",")
Integer.valueOf(...)
```

Display:

- every name and score
- number of records
- average score
- highest score
- name of highest-scoring student

Use file error handling:

```java
try {
    // read file
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

---

# Day 6 — Final Part 4 Challenge

## Problem 6: Robot Inventory from a File

### Situation and goal

Before a competition, the team checks its robot inventory. Each robot has a name, a purpose (its type), and a battery percentage. Read the inventory into objects so the same list can support several reports without rereading the file.

### Input and object design

The sample input is `robots.txt` below. Each line represents one robot in this order: `name,type,battery`. There is no header. Assume correctly formatted lines, no blank lines, no commas inside fields, and whole-number battery levels from 0 to 100. No keyboard input is required.

Use the constructor `Robot(String name, String type, int battery)` and getters `getName()`, `getType()`, and `getBattery()`. `toString()` returns the robot description shown in the sample. Store a **separate object for each record** in an `ArrayList<Robot>`.

### Sample output

```text
Atlas — Competition — battery 92%
Bolt — Practice — battery 74%
Nova — Competition — battery 88%
Echo — Training — battery 61%
Orion — Competition — battery 96%
Total robots: 5
Highest battery: Orion — 96%
Competition robots: 3
Average battery: 82.2%
```

### Rules and boundary cases

Print robots in file order. For a highest-battery tie, choose the first robot in the list. Count a type as Competition regardless of capitalization. Calculate the average as a decimal. If the file is empty, print `No robots found.` and skip the remaining report. If reading fails, print an error and stop instead of reporting an incomplete inventory. Close the scanner when finished.

The suggested helper methods below are optional. If used, `readRobots` returns the loaded list; call the highest-battery and average helpers only when the list is nonempty. `highestBattery` returns a robot object, allowing the caller to access both its name and battery. The main program is responsible for printing the report.

### Think Before Coding

1. Which field must be converted from text before constructing a robot?
2. How does each line become a new object and then an entry in the list?
3. Why is returning a robot useful when finding the highest battery?
4. Which behaviors from Days 3, 4, and 5 can you reuse conceptually?

### Class requirements and sample input file

Create:

```text
Robot.java
```

Instance variables:

```java
private String name;
private String type;
private int battery;
```

Create:

- constructor
- getters
- `toString()`

Example:

```text
Atlas — Competition — battery 92%
```

Create:

```text
robots.txt
```

Contents:

```text
Atlas,Competition,92
Bolt,Practice,74
Nova,Competition,88
Echo,Training,61
Orion,Competition,96
```

Create:

```text
RobotInventory.java
```

The program should:

1. Read every line from `robots.txt`.
2. Split the line using commas.
3. Create a `Robot` object.
4. Add the object to:

```java
ArrayList<Robot>
```

Then display:

- all robots
- total robots
- robot with highest battery
- number of Competition robots
- average battery level

### Suggested Methods

```java
public static ArrayList<Robot> readRobots(String fileName)
```

```java
public static Robot highestBattery(ArrayList<Robot> robots)
```

```java
public static double averageBattery(ArrayList<Robot> robots)
```

---

# Debugging Exercise

Find the problem:

```java
public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        name = name;
        score = score;
    }
}
```

### Questions

1. Will the class compile?
2. Will the object store the values correctly?
3. What should be changed?

### Think Before Coding

The mentor creates a student using `new Student("Maya", 84)` and expects the object to remember both values. In the constructor, the parameters and fields have the same names. How can you tell which variable each name refers to? Explain your reasoning before changing the code.

---

# Week 3 Completion Checklist

```text
[ ] I understand class vs. object.
[ ] I can create instance variables.
[ ] I can write a constructor.
[ ] I understand `this`.
[ ] I can write object methods.
[ ] I can write `toString()`.
[ ] I can store objects in an ArrayList.
[ ] I can loop through objects in a list.
[ ] I can search objects by a field.
[ ] I can read a text file.
[ ] I can split comma-separated data.
[ ] I can convert String data to int.
[ ] I can create objects from file data.
```

---

# End-of-Week Review

## 1. What is the difference between a class and an object?

```text
____________________________________________________________
____________________________________________________________
```

## 2. What is the purpose of a constructor?

```text
____________________________________________________________
____________________________________________________________
```

## 3. Why do we use `this.name = name`?

```text
____________________________________________________________
____________________________________________________________
```

## 4. Why is `ArrayList<Robot>` useful?

```text
____________________________________________________________
____________________________________________________________
```

## 5. How does this line:

```text
Atlas,Competition,92
```

become a `Robot` object?

```text
____________________________________________________________
____________________________________________________________
```

---

# Parent Review Guide

Ask Raina to explain:

1. What is the difference between `Robot` and `new Robot(...)`?
2. What information belongs inside an object?
3. Why is `toString()` useful?
4. How is `ArrayList<Robot>` different from `ArrayList<String>`?
5. How does one line from a file become an object?

### Small Modification Test

Ask her to do one of these without rewriting the whole program:

- Display only Competition robots.
- Display robots below 70% battery.
- Add a robot status field.
- Add a `useBattery(int amount)` method.
- Add a new record to the file and verify it is read automatically.
