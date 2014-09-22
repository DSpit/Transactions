


/**
 * A class which contains methods that pertain to all types of transactions
 * for this system. <br><br> <code>AbsTransaction</code> contains an abstract 
 * {@link #transaction()} method which performs any transaction by the sub classes. 
 * The {@link #display()} method can and should be used in {@link #transaction()} to 
 * display information to the user.
 * 
 * @author David Boivin (Spit)
 * @author Patrick Spensieri
 */
public abstract class AbsTransaction {

// Members ---------------------------------------------------------------- //
	
	protected Account mAccount;
	
// Constructors ----------------------------------------------------------- //
	
	/**
	 * Constructor which creates a new {@link Account} instance and sets 
	 * it as the account member variable for the instance of this class.
	 */
	public AbsTransaction(){
		mAccount = new Account();
	}
	
	/**
	 * Constructor which takes an {@link Account} instance as a parameter
	 * and sets it to the account member variable for this instance.
	 *
	 * @param account The {@link Account} to link this transaction to.
	 */
	public AbsTransaction(Account account){
		mAccount = account;
	}
	
// Methods ----------------------------------------------------------------- //
	
	/**
	 * Method which provides a basic implementation of what display should
	 * do. It displays a respectful end of transaction message to the user
	 * through the command line.<br><br>
	 * <b>Note:</b> This class should always be override and optionally have
	 * this super class implementation called within it.
	 */
	protected void display(){
		System.out.println("Thank you for using out system "
				+ "to perform this transaction.\n");
	}
	
// Abstract Methods -------------------------------------------------------- //
	
	/**
	 * The abstract method for any general transaction within this system,
	 * this method should perform whatever transaction that the subclasses 
	 * wish to perform. <br><br>
	 * 
	 * <b>Note:</b>should always call {@link #display()} if the result
	 * should be displayed.
	 * 
	 * @see AbsTransaction#display()
	 */
	public abstract void transaction();
}
