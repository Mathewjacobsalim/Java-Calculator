# Java Calculator App

A simple GUI calculator built with Java and Swing. Supports basic arithmetic operations: Add, Subtract, Multiply, Divide.

## 💻 Run Instructions

### Option 1: Using VS Code or Terminal

```
javac src/CalculatorApp.java
java -cp src CalculatorApp
```

### Option 2: Run the JAR

```
cd out
java -jar CalculatorApp.jar
```

## 📦 Build JAR (Optional)

```
cd src
javac CalculatorApp.java
jar cfe ../out/CalculatorApp.jar CalculatorApp CalculatorApp.class
```

## 🛠️ Want an .exe?

Use [Launch4j](http://launch4j.sourceforge.net/) to wrap `CalculatorApp.jar` into a `.exe`.