# Winner of an Election

This Java program determines the winner of an election based on an array of candidate names.

## Problem Description

Given an array of candidate names, the program counts the votes for each candidate and identifies the winner.

### Input

- An array of candidate names.

### Output

- The name of the winning candidate.
- The number of votes the winner received.

## Usage

1. **Clone the repository:**

   ```bash
   git clone <repository-url>
Explanation:

    HashMap (map):
        A HashMap is used to store the count of votes for each candidate.
        Key: Candidate name, Value: Count of votes for that candidate.

    Counting Votes:
        The for loop iterates through the array of candidate names (arr).
        For each name, it updates the count in the HashMap (map).
        map.getOrDefault(name, 0) + 1 ensures that if the candidate is not in the map, it initializes the count to 1.

    Finding the Winner:
        After counting votes, the program iterates through the HashMap to find the winner.
        It compares the votes for each candidate and updates the winner and max variables accordingly.
        If two candidates have the same number of votes, it chooses the lexicographically smaller name as the winner.

    Result Array:
        The function returns an array containing the winner's name and the number of votes they received.

    Example Usage:
        The main method demonstrates the usage of the winner function with a sample array of candidate names.

This solution efficiently finds the winner of an election by using a HashMap to store and process the votes. The lexicographically smaller candidate is chosen in case of a tie.
