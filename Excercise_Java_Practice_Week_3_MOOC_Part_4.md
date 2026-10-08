# Raina’s Java Coding Practice
## Week 3: MOOC.fi Part 4 — Objects, Lists, and Files

**Recommended schedule:** 6 days  
**Daily practice time:** 30–45 minutes  
**Goal:** Practice the main concepts from MOOC.fi Part 4: object-oriented programming, objects in lists, and reading data from files.

---

# Day 1 — First Custom Class

## Problem 1: Robot Battery

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

Possible output:

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

### Extension

Ask the user for a role and print only matching members.

Use:

```java
.equalsIgnoreCase(...)
```

---

# Day 4 — Analyze Objects in a List

## Problem 4: Team Performance Tracker

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

Hint:

```java
this.name = name;
this.score = score;
```

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
