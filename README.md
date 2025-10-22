# Lesson: For Loops

**Previous Lesson:** [If Statements](https://github.com/SACHSTech/Lesson-If-Statements)

---

## 1. Why Loops?

Programs often need to **repeat** actions — printing a sequence, calculating totals, checking multiple inputs.  
Copy-pasting code works… but it’s inefficient, error-prone, and inflexible.

```java
System.out.println("Hello!");
System.out.println("Hello!");
System.out.println("Hello!");
```

If you wanted to print “Hello!” 100 times, this wouldn’t be realistic.  
That’s where **loops** come in.

---

## 2. What is a For Loop?

A **for loop** repeats a block of code a specific number of times.

```java
for (int counter = 0; counter < 3; counter++) {
    System.out.println("Hello!");
}
```

**Output:**
```
Hello!
Hello!
Hello!
```

This loop runs **3 times**, because:
1. `counter` starts at 0.  
2. The loop continues **while** `counter < 3`.  
3. After each repetition, `counter++` increases `counter` by 1.

---

### Visualizing the Flow

```
Initialize counter
        ↓
Check condition → false? → END
        ↓
   Run body
        ↓
   Update counter
        ↖︎
```

---

## 3. For Loop Structure

| Part | Description | Example |
|------|--------------|----------|
| **Initialization** | Create and start counter | `int i = 0` |
| **Condition** | Continue while this is true | `i < 5` |
| **Update** | Change the counter after each run | `i++` |

```java
for (int i = 0; i < 5; i++) {
    System.out.println("i = " + i);
}
```

**Output:**
```
i = 0
i = 1
i = 2
i = 3
i = 4
```

---

## 4. Example 1 — Counting Up

```java
for (int num = 1; num <= 10; num++) {
    System.out.println(num);
}
```

Prints 1 to 10.

**Try it:**  
Change `<=` to `<` and see what happens.  
→ This introduces boundary thinking from conditionals.

---

## 5. Example 2 — Counting Down

```java
for (int num = 10; num >= 1; num--) {
    System.out.println(num);
}
System.out.println("Blastoff!");
```

**Concept link:** This mirrors chained and nested `if`s — sequence control.

---

## 6. Example 3 — Using Variables in Loops

You can use the counter inside the loop to drive math or text.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Square of " + i + " is " + (i * i));
}
```

**Output:**
```
Square of 1 is 1
Square of 2 is 4
Square of 3 is 9
Square of 4 is 16
Square of 5 is 25
```

This connects back to **expressions** and **operators** from earlier lessons.

---

## 7. Example 4 — Accumulating Totals

Repetition is powerful when you *build up* results.

```java
int sum = 0;
for (int i = 1; i <= 5; i++) {
    sum = sum + i; // accumulate
    System.out.println("Running total: " + sum);
}
System.out.println("Final sum: " + sum);
```

**Discuss:**  
Why must `sum = 0` be *before* the loop?

---

## 8. Example 5 — Summing User Input (ConsoleProgram)

Now let’s include interaction:

```java
public class SumInputs extends ConsoleProgram {
    public void run() {
        int count = readInt("How many numbers? ");
        int total = 0;

        for (int i = 0; i < count; i++) {
            int value = readInt("Enter a number: ");
            total = total + value;
        }

        System.out.println("Total = " + total);
    }
}
```

**Try:** Add `System.out.println("Average = " + (total / (double)count));`

---

## 9. Example 6 — Multiplication Table

```java
int num = readInt("Enter a number: ");
for (int i = 1; i <= 10; i++) {
    System.out.println(num + " × " + i + " = " + (num * i));
}
```

Encourages pattern recognition — perfect bridge to **nested loops** next lesson.

---

## 10. Example 7 — Loop with Running Logic

You can also include conditional statements inside loops.

```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        System.out.println(i + " is even");
    } else {
        System.out.println(i + " is odd");
    }
}
```

This revisits Boolean and `if` logic within a new structure.

---

## Common Mistakes

| Type | Example | Problem |
|------|----------|----------|
| Missing braces | `for (...) System.out.println("Hi");` | Only the first line repeats |
| Wrong condition | `for (i = 0; i > 10; i++)` | Never executes |
| Infinite loop | `for (i = 0; i >= 0; i++)` | Never ends |
| Wrong update | `i--` instead of `i++` | Logic reversed |

---

## 11. Practice Problems

1. **Print a Line of Stars**  
Ask how many stars and print that many `*` on one line.  

2. **Sum from 1 to N**  
Ask for N and calculate the sum from 1 to N.  

3. **Even Numbers Only**  
Print all even numbers from 2 to 20.  

4. **Factorial Finder**  
Ask for N and compute `N!`.  

5. **Average of Test Scores**  
Ask for 5 scores and print the average.  

6. **Power Table**  
Print `2^1` through `2^10`.  

7. **Guessing Game (Challenge)**  
Generate a random number 1–10.  
Let the user guess 3 times using a loop.

---

## Reflection Questions

- What happens if you place `System.out.println(sum)` **inside** vs **outside** the loop?  
- How is a loop’s condition similar to an `if` statement’s condition?  
- How could you use a loop to validate input (e.g., retry until valid number)?

---

## Summary

- Loops automate **repetition** and reduce duplication.  
- `for` loops use a counter variable to control execution.  
- Initialization → Condition → Update → Repeat.  
- You can nest logic (`if` statements) *inside* loops.  
- Common use cases: counting, summing, accumulating, table generation.

---

**Next Lesson:** *2.5 Nested Loops and Patterns*
