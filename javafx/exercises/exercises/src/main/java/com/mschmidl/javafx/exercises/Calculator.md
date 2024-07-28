# Calculator example

Final goal is to create a JavaFX Calculator

### Step 1:

Use the following classes to create the layout for a calculator:
 - https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Label.html
 - https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/GridPane.html
 - https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Button.html

Desired result: See "keyboard layout.jpg"

### Step 2:

Make the number inputs do something.
Create a variable to store the current number being put in. Every time a new number is pressed multiply the current number by ten and add the new number. 

See https://docs.oracle.com/javafx/2/ui_controls/button.htm - "Assigning an Action"

### Step 3:

Make the operations do something.
Create an Enum for the operations. See https://www.baeldung.com/a-guide-to-java-enums

Then store the numbers and operations in a Stack:
https://www.baeldung.com/java-stack

TIPP: Create the stack with new Stack<Object>, so you can store the numbers and the operations in the same stack. 

### Step 4:

Make the "=" button do something.
Take all the numbers and operation from the stack and calculate the final result.