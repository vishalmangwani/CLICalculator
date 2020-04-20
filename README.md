# CLICalculator

Description
I have choosen to implement the Calculator with Facade Design Pattern using the Single Responsibility Principle so that it can be easy to add functionailites, reading methods at a later point with a basic change in the code.
In this project, I have a class i.e. Calculations that does all the calculations part. 
I have implemented two stacks, One to store input numbers and the other to store input Operators.
On reading input the numbers are saved in Number stack and Operators are saved in perator stack.

Whenever we have atleast one operator in Operator stack and atleast two numbers in Numbers stack I Perform the required operation.

So basically on submiting request from the keyboard, the data is first stored into the stack, and if there is an operator entered, then we perform the calculation by calling the calculate class and push the result in the stack on the top.

I had to initially decide what had to be done and what functionailities had to go in what classes. Then i designed the main class which helped me segregate functionailities.


As the code i have uploaded is already compiled, One can navigate to bin directory of my project and enter the following command to run the project
java CLICalculator
or if needed to compile one can also go to src directory and compile the code by using javac *.java and then rerun the code as mentioned above.



Sample Change 1