# Array Rotation
Inspiration: https://www.geeksforgeeks.org/array-rotation/

## Problem Statement
Given an array: A, of length: n and asked to rotate times: d
The algorithm has to return A rotated d times

### Example 
A: {1 2 3 4 5}
on rotate(A, 2, 5) the program should modify the array to
A: {3 4 5 1 2}
 
## Implementation
This package implements rotation of Arrays through the following algorithms
  * Rotate one at a time
  * Rotate using a temporary array
  * Rotate using Juggling algorithm
  
## [Rotate one at a time](OneAtATimeRotator.java)
 This aims to rotate the array by one position for a total of d number of times.
 The Time Complexity for this Algorithm is: O(n*d)

Time Complexity: O(n*d)

## [Rotate using a temp array](ArrayRotatorUsingTempArray.java)
Create a temporary array of size d and transfer the initial elements of array A into
temp, then move the elements of array by d lengths and then insert temp at the end of Array A

Time Complexity: O(n)
Axiliary Space: O(d)

## [Rotate using Juggling algorithm](JugglingRotator.java)
We split the array into g number og parts where g is the GCD of N and d.
We rotate the sets once to arrive at desired solution.

Time Complexity: O(n)

## [Rotate using Reversal Algorithm](ReversalArrayRotator.java)
We Split the array into two sub-parts, from start Index to d, and d to end Index.
Reverse both parts separately and reverse the entire array.
It will reverse the array by d times. 

Time Complexity: O(n)
