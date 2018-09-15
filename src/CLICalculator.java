/*
 * Main Class: CLICalculator
 * Author: Vishal Mangwani
 * Date: Sept 14, 2018
 * Purpose: To initialize the ReadClass and pass it to the facade.
 */
public class CLICalculator {
	/*
	 * main function
	 */
	public static void main(String args[]) throws Exception
	{
		
		ReadAndInsertIntoStack exp=new ReadAndInsertIntoStack();
		InteractingFacade facade=new InteractingFacade(exp);
		facade.startProg();
	}
	
}
