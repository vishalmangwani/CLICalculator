import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
/*
 * Class: ReadAndInsertIntoStack
 * Author: Vishal Mangwani
 * Date: Sept 14, 2018
 * Purpose: Consists of two stacks, One for Numbers and Other for Operators.
 *          Consits of all the read functions. As of now only has read via keyboard
 *          Basically while reading we are also inserting the elements into the two stacks that we have i.e. Numbers and operators
 * Dependency: InsertintoStack uses Calculations class to calculate result whenever there is a symbol entereds
 */
public class ReadAndInsertIntoStack {
	static Calculations calc=new Calculations();
	private static Stack<Float> stackNumbers= new Stack<Float>();
	private static Stack<String> stackOps= new Stack<String>(); 
	private static ArrayList<String> validSymbols= new ArrayList<String>(Arrays.asList("*","-","+","/")); // Set of allowed operations
	
	
	/*
	 * Method: readInputviaKeyBoard
	 * Author: Vishal Mangwani
	 * Date: Sept 14th, 2018
	 * Functionality: Reads the line by line input and passes each token to the insertIntoStack method. If encounters a 'q' or 'Q' breaks the loops and jumps out 
	 */
	public void readInputviaKeyBoard() throws Exception{
		Scanner s=new Scanner(System.in);
		String input;
		while(true)
		{
			input=s.nextLine();
			if(input.equalsIgnoreCase("q")){
				s.close();
				System.exit(1);
			}
			else
			{
				String[] allInputChars=input.split("\\s+"); // Split each line into tokens
				for(String sq :allInputChars)
					insertIntoStack(sq);					//Inserting each token into the stack
				System.out.println(stackNumbers.peek());
			}
			
		}
	}
	
	
	/*
	 * Method: insertIntoStack
	 * Author: Vishal Mangwani
	 * Date: Sept 14th, 2018
	 * Functionality: Takes each Token as input and based on if its a Number puts it into Number stack else if its an allowed operator then puts it into operator stack
	 */
	
	private static void insertIntoStack(String sq)
	{
		if(validSymbols.contains(sq))				//Checking if the entered Symbol is valid/allowed and puts it into Operator stack
			stackOps.add(sq);
		else{
			try
			{
				stackNumbers.push(Float.parseFloat(sq));	//if not symbol then parse the input into Float and push it into Numbers stack 
				//System.out.println(stackNumbers.peek());	//display entered number to the user
			}catch(Exception e){
				System.out.println("Invalid Entry. Please Enter only Numbers and Symbols("+validSymbols.toString()+")");
				}
		}
		if(stackOps.size()>=1)
			calc.Calculate(stackNumbers,stackOps);	//if There are atleast 1 symbols then perform the operation. Calls the Calculate function and passes it the Numbers and Operators Stack
	}
	
	
	
	
}
