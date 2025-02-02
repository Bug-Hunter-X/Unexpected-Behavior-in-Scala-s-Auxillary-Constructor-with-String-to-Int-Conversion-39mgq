# Scala Auxillary Constructor Bug

This repository demonstrates a potential issue with Scala's auxillary constructors when converting strings to integers. The main problem lies in the lack of explicit error handling for situations where the string conversion fails.  The `toInt` method will throw a `NumberFormatException` if the input string is not a valid integer representation. This can lead to unexpected application crashes.

## How to Reproduce

1. Clone this repository.
2. Compile and run `bug.scala`. 
3. Observe the output. Note that while a valid integer conversion works fine, providing an invalid string will crash the program.

## Solution

The solution demonstrates adding explicit error handling using a `try-catch` block to gracefully handle cases where the string cannot be converted to an integer.