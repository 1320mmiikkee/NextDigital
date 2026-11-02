<h1 align="center">NEXT DIGITAL - TDD - STRINGCALCULATOR</h1>

<p align="center">
  <img src="images/header_next_digital.png" alt="Next Digital" width="600">
</p>


<p align="center">
  <img src="https://img.shields.io/badge/coverage-100%25-green">
  <img src="https://img.shields.io/badge/language-Java-orange">


</p>

<p align="center">
  <b>Miguel González Moreno</b> · <b>Mario Coronado López</b>
</p>

---

## Description

**String Calculator** kata solved with **TDD**: an `add(String)` method that sums the numbers in a string, separated by commas or by a custom delimiter using the format `//[delimiter]\n[numbers...]`.

---

## Tests Used

### `shouldReturnZeroWhenEmpty`
Empty string → `0`.

![shouldReturnZeroWhenEmpty](images/shouldReturnZeroWhenEmpty.png)

### `shouldReturnTheSameNumber`
Single number → same number.

![shouldReturnTheSameNumber](images/shouldReturnTheSameNumber.png)

### `shouldAddManyNumbers`
Comma-separated numbers → their sum.

![shouldAddManyNumbers](images/shouldAddManyNumbers.png)

### `shouldAddWithLongCustomDelimiter`
Multi-character delimiter (`::`) → their sum.

![shouldAddWithLongCustomDelimiter](images/shouldAddWithLongCustomDelimiter.png)

### `shouldAddWithSpecialCharacterDelimiter`
Regex special character delimiter (`|`) → their sum.

![shouldAddWithSpecialCharacterDelimiter](images/shouldAddWithSpecialCharacterDelimiter.png)


---

## How it works

```mermaid
flowchart TD
    A(["add(numbers)"]) --> B{"Is numbers empty?"}
    B -- Yes --> C(["return 0"])
    B -- No --> D["delimiter = comma"]
    D --> E{"Starts with // ?"}
    E -- Yes --> F["Read custom delimiter<br/>Remove header"]
    E -- No --> G
    F --> G["Split numbers by Pattern.quote(delimiter)"]
    G --> H["Add each value with Integer.parseInt"]
    H --> I(["return sum"])
```


