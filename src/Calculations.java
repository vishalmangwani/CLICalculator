import java.util.Stack;

/*
 * Class: Calculations
 * Author: Vishal Mangwani
 * Date: Sept 14th 2018
 * Purpose: Is a single Responsibility class which performs all the Arithematic Operations
 */
public class Calculations {

	/*
	 * Method: Calculate
	 * Author: Vishal Mangwani
	 * Date: Sept 14 2018
	 * Functionality: takes in the Stack of Numbers and Operators and calculates the result and puts it on the screen. Class is called everytime a symbol is encountered in the input
	 */
	public void Calculate( Stack<Float> stackNumbers ,Stack<String> stackOps)
	{
		Float result =(float)0;
		
		if(stackNumbers.size()<2){										//if there is a symbol called check if there are atleast two numbers to perform the operations else display result as 0 and remove all elements from stack
			stackNumbers.removeAllElements();			
			stackOps.pop();
			stackNumbers.push((float) 0.00);
		}
		else
		{
			switch(stackOps.pop())										//Based on last operator, Call the specific method which results the result 
			{
			case "+":
				result=add(stackNumbers.pop(), stackNumbers.pop());
				break;
			case "-":
				result=subtract(stackNumbers.pop(), stackNumbers.pop());
				break;
			case "/":
				result=divide(stackNumbers.pop(), stackNumbers.pop());
				break;
			case "*":
				result=multiply(stackNumbers.pop(), stackNumbers.pop());
				break;
			}
			System.out.println(result);										//Prints the result and pushes the result into stack
			stackNumbers.push(result);
		}
		
	}
	
	/*
	 * Method: Add
	 * Author: Vishal Mangwani
	 * Date: Sept 14 2018
	 * Functionality: Takes two input numbers as arguments and returns the addition of both numbers
	 */
	private Float add(Float a, Float b){
		return (a+b);
	}
	
	/*
	 * Method: Subtract
	 * Author: Vishal Mangwani
	 * Date: Sept 14 2018
	 * Functionality: Takes two input numbers as arguments and returns the subtraction of both numbers.
	 */
	private Float subtract(Float a, Float b){
		if(a>=b)
			return (a-b);
		else
			return (b-a);
		
	}
	
	
	/*
	 * Method: Multiply
	 * Author: Vishal Mangwani
	 * Date: Sept 14 2018
	 * Functionality: Functionality: Takes two input numbers as arguments and returns the multiplication of both numbers
	 */
	private Float multiply(Float a, Float b){
		return (a*b);
	}
	
	
	/*
	 * Method: Divide
	 * Author: Vishal Mangwani
	 * Date: Sept 14 2018
	 * Functionality: Functionality: Takes two input numbers as arguments and returns the Division of both numbers
	 */
	private Float divide(Float a, Float b){
		return (b/a);
	}
}
