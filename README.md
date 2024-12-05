# Kotlin Collection Functions and Empty Lists
This example demonstrates a common error in Kotlin when using collection functions like `first()`, `last()`, and `single()` with empty lists or lists where no element matches a given predicate. These functions throw exceptions if no matching element is found.  A safer approach involves using the `firstOrNull()`, `lastOrNull()`, and `singleOrNull()` counterparts which return `null` instead.

## Bug
The `Bug.kt` file shows how these functions can throw `NoSuchElementException` when applied to empty lists or lists lacking matching elements. 

## Solution
The `BugSolution.kt` file demonstrates how to safely handle empty collections using `firstOrNull()`, `lastOrNull()`, and `singleOrNull()`. These functions return null when no element satisfies the condition, preventing exceptions.
