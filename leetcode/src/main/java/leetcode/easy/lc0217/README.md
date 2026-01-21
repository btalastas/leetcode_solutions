# Contains Duplicates

Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

Example 1:

```java
Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.
```

Example 2:

```java
Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.
```

Example 3:

```java
Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true
```

Submission: *Accepted*

## Notes

- Use a hashset instead of hashmap
- Element can only appear once in a set
- Can remove boolean variable and just return `true` or `false`
