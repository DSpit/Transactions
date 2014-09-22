


import java.util.Random;

/**
 * Class which simulates a banking system. This class provides
 * an implementation example for the Transaction system for this 
 * assignment.
 * 
 * @author David Boivin (Spit)
 * @author Patrick Spensieri
 */
public class DemoBank {
	
// Constants --------------------------------------------------------------- //
	
	public final static int MAX_NUMBER_TRANSACTION = 5;
	public final static int BALANCE_TRANSACTION = 0;
	public final static int WITHDRAW_TRANSACTION = 1;
	public final static int DEPOSIT_TRANSACTION = 2;
	public final static int EXIT = 3;
	public final static String EXIT_MESSAGE = "\nThank you for doing business with us, Please come again. :)";
	public final static int[] TRANSACTIONS = {BALANCE_TRANSACTION, WITHDRAW_TRANSACTION, DEPOSIT_TRANSACTION, EXIT};
	
// MAIN -------------------------------------------------------------------- //
	
	public static void main(String[] args){
		
		//declare and/or instantiate method wide variables
		Account account = new Account();
		AbsTransaction transaction;
		Random randGen = new Random();
		int random;
		
		//loop the program a max number of times
		for(int i = 0; i < MAX_NUMBER_TRANSACTION; ++i){
			
			//display to user which transaction that is currently happening
			System.out.println("Transaction #" + (i+1) + "\n");
			
			//get random number
			random = randGen.nextInt(TRANSACTIONS.length);
			
			//-------------------------------------- Exit clause
			//must be in an if statement and not a switch because of the break out clause.
			if(random == EXIT){
				System.out.println("You've selected to exit the program.");
				break;
			}
			
			//get proper transaction for this iteration
			transaction = DemoBank.getTransaction(random, account);
			
			//perform the transaction (at the same time displays the result)
			transaction.transaction();
		}
		
		System.out.println(EXIT_MESSAGE);
		
	}
	
// Private Methods --------------------------------------------------------- //
	
	/**
	 * Method which returns a AbsTransaction which is instantiated by one of 
	 * it's child classes (polymorphism). All this method does is decide which 
	 * child class to instantiate it with. It will return <code>null</code> if
	 * the <code>random</code> variable is out of range of Transaction.length.
	 * 
	 * @param random The random transaction selected.
	 * @param account The account to initialize the transaction with.
	 * 
	 * @return An overloaded AbsTransaction.
	 */
	private static AbsTransaction getTransaction(int random, Account account){
	
		switch(random){
			case BALANCE_TRANSACTION: 
				return new BalanceTransaction(account);
			
			case DEPOSIT_TRANSACTION:
				return new DepositTransaction(account);
			
			case WITHDRAW_TRANSACTION:
				return new WithdrawTransaction(account);
			
			default:
				return null;
		}
	}
}
