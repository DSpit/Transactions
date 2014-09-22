


/**
 * This class is the implementation of a transaction which displays information
 * about the account which it has stored as its member variable. For more information
 * the information is going to be displayed, see {@link #display()}.
 *
 * @author David Boivin (Spit)
 * @author Patrick Spensieri
 */
public class BalanceTransaction extends AbsTransaction {
	
// Constructors ------------------------------------------------------------ //
	
	/**
	 * Provides a usable constructor which implements 
	 * {@link AbsTransaction#AbsTransaction()}.
	 * 
	 * @see {@link AbsTransaction#AbsTransaction()}
	 */
	public BalanceTransaction(){
		super();	
	}
	
	/**
	 * Provides a usable constructor which implements 
	 * {@link AbsTransaction#AbsTransaction(Account)}.
	 * 
	 * @param account The account on which to perform the transaction on.
	 * 
	 * @see {@link AbsTransaction#AbsTransaction(Account)}
	 */
	public BalanceTransaction(Account account){
		super(account);
	}
	
// Overridden methods ------------------------------------------------------ //
	
	/**
	 * Method which displays the information held within the account member variable
	 * in a pretty, user friendly formatting. <br><br>
	 * 
	 * This method will display: 
	 * <ul>
	 * 	<li>Transaction type</li>
	 * 	<li>The account balance</li>
	 * 	<li>End of transaction message</li>
	 * </ul>
	 * 
	 * @see AbsTransaction#display()
	 */
	@Override
	protected void display(){
		System.out.println("Balance Transaction");								//transaction type
		System.out.println("\t\tAccount Balance: " + mAccount.getBalance() + "$");	//balance amount
		System.out.print("\t\t");										//formatting for final output message
		super.display(); 											//final output message
	}
	
// Implemented Methods ----------------------------------------------------- //
	
	/**
	 * This method basically displays the information held within the 
	 * account member variable in a nice formatting.
	 * In essence this method calls {@link #display()} to display the information
	 * and nothing else.
	 * 
	 * @see AbsTransaction#transaction()
	 * @see BalanceTransaction#display()
	 */
	@Override
	public void transaction(){
		this.display();
	}
}
