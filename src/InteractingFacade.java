/*
 * Facade: InteractingFacade
 * Author: Vishal Mangwani
 * Date: Sept 14, 2018
 * Purpose: To converge all client request at one place and then distribute as per need.
 */
public class InteractingFacade {
	
	private final ReadAndInsertIntoStack exp;
	/*
	 * Constructor to assign the object instace to class variable
	 */
	public InteractingFacade(ReadAndInsertIntoStack exp) {
		this.exp=exp;
	}
	/*
	 * Method: startProg
	 * Author: Vishal Mangwani
	 * Date: Sept 14, 2018
	 * Purpose: To start the read input from keyboard function.
	 */
	public void startProg() throws Exception {
		exp.readInputviaKeyBoard();
	}
	
}
