# Leetcode Solutions

Java + Maven project containing my solutions to LeetCode problems. Uses JUnit unit tests for validation.

## Project Structure

- `src/main/java/leetcode` -- solution implementations
- `src/test/java/leetcode` -- JUnit test cases
- Solutions are organized by difficulity (eg. `easy/`, `medium/`, and `hard/`) and problem number using `lc####` as the naming convention

## Run Tests

Run all test:

```bash
mvn test
```

Run a single test class:

```bash
mvn -Dtest=Lc0268Test Test
```

Run a single test method:

```bash
mvn -DTest=Lc0268Test#exampleTest1 test
```
