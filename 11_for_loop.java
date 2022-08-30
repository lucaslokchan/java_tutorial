//For loop

//Statement 1 is executed (one time) before the execution of the code block
//Statement 2 defines the condition for executing the code block
//Statement 3 is executed (every time) after the code block has been executed
for (statement 1; statement 2; statement 3) {
    // code block to be executed
}

//example
for (int i = 0; i < 5, i++) {
    System.out.println(i);
}

//For Each loop
//Used exclusively to loop through elements in an array
for (type variableName : arrayName) {
    // code block to be executed
}

//example
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
    System.out.println(i);
}