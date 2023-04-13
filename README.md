# Validate-Stack-Sequences

The problem statement is as follows:
Given two sequences pushed and popped with distinct values, return true if and only if this could have been the result of a sequence of push and pop operations on an initially empty stack.

Here's an example to clarify the problem:

Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]

Output: true

Explanation: We might do the following sequence:

push(1), push(2), push(3), push(4), pop() -> 4, push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1

To solve this problem, we can use a stack data structure to simulate the push and pop operations. We can push elements from the pushed array onto the stack, and whenever the top of the stack matches an element in the popped array, we pop the stack.

If the popped sequence is valid, the stack should be empty at the end of the process. Therefore, we can return true if the stack is empty, and false otherwise.

The time complexity o(n).
The space complexity o(n).
