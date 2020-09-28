# Array Rotation
Inspiration: CLRS, Introduction to Algorithms

## Problem Statement
Given an array: A, of length: n and asked to sort
The algorithm has to return Array sorted in ascending order

### Example 
A: {3 4 5 1 2}
on rotate(A, 2, 5) the program should modify the array to
A: {1 2 3 4 5}
 
## Implementation
This package implements sorting of Arrays through following algorithms
  * Insertion Sort
  
### [Insertion Sort](./InsertionSort.java)
This aims to sort the array by comparing every value with the values on its left,
then shifting those values by one until the left side is already sorted

The Best case Running time is 0(n) when the array is already sorted
The Worst case Running time is 0(n^2) when the array is sorted in descending order
Average running time is 0(n^2)

Preferred over Merge sort for smaller values of Inputs 
