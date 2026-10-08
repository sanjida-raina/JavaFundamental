# Raina’s Java Coding Practice
## Week 2: MOOC.fi Parts 1–3 Bridge Worksheet

**Recommended schedule:** 6 days  
**Daily practice time:** 30–45 minutes  
**Main goal:** Practice the core objectives from Java Programming MOOC.fi Parts 1–3.

## Skills Covered

- Part 1 review: input, variables, arithmetic, and conditionals
- `while` loops and repeated input
- `for` loops
- Accumulators, counters, minimum, maximum, and averages
- Writing and calling methods
- Method parameters and return values
- Finding and correcting errors
- `ArrayList`
- Arrays
- String comparison and string processing

---

# General Rules

For every problem:

1. Create a separate Java file unless the problem says to extend an earlier file.
2. Use meaningful variable names.
3. Add your name, date, and problem title as comments.
4. Test the program with at least three different inputs.
5. Before running the program, predict the output for one test.
6. Fix compiler errors by reading the complete error message.
7. Do not copy a complete solution from the internet.

Example:

```java
// Name: Raina
// Date:
// Problem: Number Statistics
```

---

# Day 1: Repetition with `while`

## Problem 1A: Countdown and Launch

Create:

```text
RobotCountdown.java
```

Ask the user for a starting number.

Print a countdown from that number to `1`, followed by:

```text
Robot launched!
```

### Example

```text
Enter starting number: 5
5
4
3
2
1
Robot launched!
```

### Requirements

- Use a `while` loop.
- Do not write separate print statements for each number.
- Test with `1`, `5`, and `10`.

---

## Problem 1B: Keep Asking Until Correct

Create:

```text
SecretCode.java
```

The correct robotics access code is:

```text
2468
```

Keep asking the user to enter the code until the correct code is entered.

### Example

```text
Enter access code: 1234
Incorrect code. Try again.

Enter access code: 1111
Incorrect code. Try again.

Enter access code: 2468
Access granted.
```

### Requirements

- Use a `while` loop.
- Count the number of attempts.
- After access is granted, display the attempt count.

### Example Final Line

```text
You entered the correct code after 3 attempts.
```

---

## Day 1 Reflection

What is the main difference between an `if` statement and a `while` loop?

```text
____________________________________________________________

____________________________________________________________
```

---

# Day 2: Loops, Counters, and Totals

## Problem 2A: Sum from 1 to N

Create:

```text
SumToNumber.java
```

Ask the user for a positive integer `n`.

Calculate the sum of all integers from `1` through `n`.

### Example

```text
Enter a positive integer: 5
Sum: 15
```

Because:

```text
1 + 2 + 3 + 4 + 5 = 15
```

### Requirements

- Use a loop.
- Do not use a mathematical shortcut formula.
- Test with `1`, `5`, and `10`.

---

## Problem 2B: Multiplication Table

Create:

```text
MultiplicationTable.java
```

Ask the user for a number.

Print its multiplication table from `1` through `10`.

### Example

```text
Enter a number: 7

7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
...
7 x 10 = 70
```

### Requirements

- Use a `for` loop.
- Use only one multiplication statement inside the loop.

---

## Problem 2C: Even Number Counter

Ask the user for a starting number and an ending number.

Display all even numbers in that range and count how many were found.

### Example

```text
Starting number: 4
Ending number: 13

Even numbers:
4
6
8
10
12

Total even numbers: 5
```

### Requirements

- The starting number may be odd or even.
- Use `% 2`.
- Assume the starting number is less than or equal to the ending number.

---

# Day 3: Repeated Input and Statistics

## Problem 3: Robotics Test Score Analyzer

Create:

```text
ScoreAnalyzer.java
```

Ask the user to enter robotics test scores one at a time.

The user enters `-1` to stop.

After input ends, display:

- Number of valid scores
- Sum of scores
- Average score
- Highest score
- Lowest score
- Number of passing scores
- Number of scores equal to or above 90

A passing score is `65` or higher.

### Example

```text
Enter scores. Enter -1 to stop.

Score: 80
Score: 95
Score: 61
Score: 88
Score: -1

Number of scores: 4
Average: 81.0
Highest: 95
Lowest: 61
Passing scores: 3
Scores of 90 or higher: 1
```

### Input Rules

- Valid scores are from `0` through `100`.
- Ignore invalid scores such as `120` or `-5`.
- Only `-1` stops the program.
- Do not divide by zero when no valid scores were entered.

### Suggested Plan

Before coding, identify these variables:

```text
count
sum
highest
lowest
passingCount
excellentCount
```

### Required Testing

Test these three cases:

1. Several normal scores
2. One score only
3. Immediate `-1` with no scores

---

# Day 4: Methods

## Problem 4A: Number Helper Methods

Create:

```text
NumberHelpers.java
```

Write the following methods:

```java
public static boolean isEven(int number)
```

Returns `true` when the number is even.

```java
public static int largerOf(int first, int second)
```

Returns the larger number.

```java
public static int absoluteValue(int number)
```

Returns the positive absolute value of the number.

```java
public static void printLine(int length)
```

Prints a line containing the requested number of `*` characters.

### Example Calls

```java
System.out.println(isEven(8));
System.out.println(largerOf(12, 19));
System.out.println(absoluteValue(-7));
printLine(5);
```

### Expected Output

```text
true
19
7
*****
```

### Requirements

- Keep `main` short.
- Call every method from `main`.
- Test each method with at least three values.

---

## Problem 4B: Grade Method

Add this method:

```java
public static String getLetterGrade(int score)
```

Use these rules:

- `90–100`: `A`
- `80–89`: `B`
- `70–79`: `C`
- `65–69`: `D`
- Below `65`: `F`
- Outside `0–100`: `Invalid`

### Example

```java
System.out.println(getLetterGrade(94));
System.out.println(getLetterGrade(67));
System.out.println(getLetterGrade(125));
```

### Expected Output

```text
A
D
Invalid
```

---

## Method Reflection

For each item, write one sentence.

### Parameter

```text
____________________________________________________________
```

### Return value

```text
____________________________________________________________
```

### `void` method

```text
____________________________________________________________
```

---

# Day 5: Lists and Strings

## Problem 5: Robotics Member List

Create:

```text
RoboticsMembers.java
```

Use:

```java
ArrayList<String>
```

Ask the user to enter robotics team member names.

An empty input ends the program.

After all names are entered, display:

1. Every member with a number
2. Total number of members
3. First member
4. Last member
5. Longest name
6. Whether a requested name is on the team

### Example

```text
Enter member names. Press Enter without a name to stop.

Name: Raina
Name: Maya
Name: Christopher
Name:

TEAM MEMBERS
1. Raina
2. Maya
3. Christopher

Total members: 3
First member: Raina
Last member: Christopher
Longest name: Christopher

Search for a member: maya
Member found.
```

### Requirements

- Import `java.util.ArrayList`.
- Use `.add()`.
- Use `.size()`.
- Use `.get(index)`.
- Use a loop to display the list.
- Use `.equalsIgnoreCase()` for the search.
- Handle an empty list safely.

### Optional Extension

Display only the names containing the letter `a`, ignoring uppercase and lowercase.

---

# Day 6: Arrays, Debugging, and Final Challenge

## Problem 6A: Fix the Program

The following program contains several errors.

Copy it into:

```text
DebugPractice.java
```

Do not replace the entire program. Find and fix each error.

```java
import java.util.Scanner;

public class DebugPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)

        int[] scores = new int[5];

        for (int i = 0; i <= scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        int total = 0;

        for (int score : scores) {
            total = score;
        }

        double average = total / scores.length;

        if (average = 90) {
            System.out.println("Excellent average!");
        } else {
            System.out.println("Average: " + average);
        }
    }
}
```

### Debugging Record

For every correction, record:

| Error | Type | Correction |
|---|---|---|
| Example: missing semicolon | Compiler error | Added `;` |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |

Use these error categories:

- Compiler error
- Runtime error
- Logic error

---

## Problem 6B: Weekly Temperature Array

Create:

```text
WeeklyTemperatures.java
```

Store seven daily temperatures in an integer array.

The program should display:

- All seven temperatures
- Average temperature
- Highest temperature
- Lowest temperature
- Number of days above the average
- Number of days below `60`
- The index of the hottest day

Use these day names:

```java
String[] days = {
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday",
    "Sunday"
};
```

### Example Output

```text
Monday: 72
Tuesday: 68
Wednesday: 75
Thursday: 80
Friday: 77
Saturday: 70
Sunday: 66

Average temperature: 72.57
Highest temperature: 80
Hottest day: Thursday
Lowest temperature: 66
Days above average: 3
Days below 60: 0
```

### Requirements

- Use an array of length `7`.
- Use one loop to receive or assign values.
- Use another loop to analyze the values.
- Format the average to two decimal places if possible.
- Do not use built-in sorting.

---

# Optional Challenge: Word Analyzer

Create:

```text
WordAnalyzer.java
```

Ask the user to enter a word or short phrase.

Display:

- Total number of characters
- Text in uppercase
- Text in lowercase
- First character
- Last character
- Number of vowels
- Number of spaces
- Whether the text contains the word `robot`
- The reversed text

### Example

```text
Enter text: Robotics Team

Characters: 13
Uppercase: ROBOTICS TEAM
Lowercase: robotics team
First character: R
Last character: m
Vowels: 5
Spaces: 1
Contains "robot": true
Reversed: maeT scitoboR
```

### Useful String Tools

```java
length()
charAt(index)
toUpperCase()
toLowerCase()
contains()
equals()
equalsIgnoreCase()
```

---

# Week 2 Completion Checklist

```text
[ ] I can write a while loop.
[ ] I can write a for loop.
[ ] I can use a counter.
[ ] I can use an accumulator to calculate a total.
[ ] I can use a sentinel value such as -1.
[ ] I can prevent division by zero.
[ ] I can write and call a method.
[ ] I understand parameters and return values.
[ ] I can classify compiler, runtime, and logic errors.
[ ] I can create and use an ArrayList.
[ ] I can create and process an array.
[ ] I can compare strings correctly.
[ ] I know why strings should normally use .equals() instead of ==.
[ ] I tested boundary values and empty-input cases.
```

---

# End-of-Week Review Questions

## 1. Why is this loop condition dangerous for an array?

```java
i <= array.length
```

```text
____________________________________________________________

____________________________________________________________
```

## 2. What is the difference between an array and an `ArrayList`?

```text
____________________________________________________________

____________________________________________________________
```

## 3. Why should Java strings usually be compared with `.equals()` rather than `==`?

```text
____________________________________________________________

____________________________________________________________
```

## 4. What is a sentinel value?

```text
____________________________________________________________

____________________________________________________________
```

## 5. Which Week 2 topic needs more practice?

```text
____________________________________________________________

____________________________________________________________
```

---

# Parent Review Guide

At the end of the week, ask Raina to explain—not merely show—the following:

1. How her score analyzer knows when to stop.
2. Why the average calculation needs decimal division.
3. How a method receives information through parameters.
4. Why an array index runs from `0` to `length - 1`.
5. How she found the longest name in an `ArrayList`.
6. The difference between a compiler error and a logic error.

She should be able to make a small modification without rewriting the whole program. For example:

- Change the passing score from `65` to `70`.
- Change the team size or score count.
- Search names without case sensitivity.
- Add another statistic to the array problem.
