# Contains Duplicates II

Given an integer array `nums` and an integer `k`, return `true` if there are two distinct indices `i` and `j` in the array such that `nums[i] == nums[j]` and `abs(i - j) <= k`.

Example 1:

```java
Input: nums = [1,2,3,1], k = 3
Output: true
```

Example 2:

```java
Input: nums = [1,0,1,1], k = 1
Output: true
```

Example 3:

```java
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
```

Submission: *Accepted*

## Notes

- use sliding window technique instead of nested for loops
- create hash set and load set up to k values from nums
  - iterate through nums array starting from i + 1
    - remove first element in set
    - add current element
      - if element already in set -> duplicate
