# Palindrome Checker App

## Objective
The objective of the Palindrome Checker App is to design and implement a console-based Java application that validates whether a given string is a palindrome under different conditions, while strengthening core programming fundamentals and data structure concepts.

## Project Flow

### UC1: Application Entry & Welcome Message
- **Goal:** Display a welcome message and app details at startup.
- **Actor:** User
- **Flow:**
  1. Program starts.
  2. JVM invokes the `main()` method.
  3. Application name is displayed.
  4. Application version is displayed.
  5. Program continues to next use case or exits.
- **Key Concepts:** Class, Main Method, Static Keyword, Console Output (`System.out.println()`), Application Flow Control.

### UC2: Print a Hardcoded Palindrome Result
- **Goal:** Display whether a hardcoded string is a palindrome.
- **Actor:** User
- **Flow:**
  1. Program starts.
  2. Hardcoded string (`"madam"`) is checked.
  3. Result is printed.
  4. Program exits.
- **Key Concepts:** String, String Literal, Conditional Statement (if-else), Console Output, StringBuilder.
- **Data Structure:** String

### UC3: Palindrome Check Using String Reverse
- **Goal:** Check whether a string is a palindrome by reversing it using a loop.
- **Actor:** User
- **Flow:**
  1. Reverse string using a for loop.
  2. Compare original and reversed strings.
  3. Display result.
- **Key Concepts:** For Loop, String Immutability, String Concatenation (`+`), `equals()` Method.
- **Data Structure:** String