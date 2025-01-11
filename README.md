_Disclaimer:- Fork this repl into your account before starting with the Takehome assignment._

**Background**
Children love to play number games.
Their favourite is to take a list of numbers and a set of game rules.
They like to find the rule that produces the largest result.
Feel free to have some fun making your own rules, perhaps you could make a rule that combines other rules together.


MINI_NumerGame Project Documentation

Project Summary

The MINI_NumerGame is a Java-based project designed to engage children with number games by applying various mathematical rules to a list of numbers to determine the rule that yields the highest result.

Key Features

-> Multiplication Rule: Computes the product of all numbers in the list.

-> Addition Rule: Calculates the sum of all numbers in the list.

-> Max Rule: Identifies the maximum number in the list.

-> Sum of Cubes Rule: Computes the sum of the cubes of each number in the list.

Implementation Details

-> Each rule is implemented as a class that adheres to the GameRule interface, ensuring a consistent method (applyRule) for processing the list of numbers.

-> The Player class is responsible for evaluating the list of numbers against all defined rules and determining which rule produces the highest result.

-> The Main class serves as the entry point, where different input arrays can be tested to identify the most effective rule for each set.

Customization

-> The design allows for easy addition of new rules. By creating a new class that implements the GameRule interface and adding it to the rules array in Main.java, users can expand the game's functionality.

Usage

Clone the repository from GitHub: MINI_NumerGame.

Open the project in a Java IDE.

Navigate to Main.java to input different arrays and observe which rule yields the highest result.

This project not only provides an interactive way for children to learn mathematical concepts but also serves as a foundation for understanding object-oriented programming principles in Java.

**Instructions**

Complete the TODOs in MultiplicationRule class.
Complete the TODOs in Addition class.
Complete the TODOs in MaxRule class.
Complete the TODOs in Player class.
Implement a new Rule:- Sum of cube of each number in an Array.
Create new class SumCube and implement GameRule interface and add this Rule in the rules array of Main.java
Try implementing any of your own rule.
In Main.java, try running the solution with different input array to get different results to output best rule.
