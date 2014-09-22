


import java.math.BigDecimal;
import java.util.Random;

/**
 * A general Account class to populate the demo bank, and to perform
 * transactions on.
 * 
 * @author David Boivin(Spit)
 * @author Patrick Spensieri
 */
public class Account{
	
// Constructors ------------------------------------------------------------ //
	
	public final int MIN_GEN_AMOUNT = 250;
	public final int MAX_GEN_AMOUNT = 500;
	
// Private Members -------------------------------------------------------- //
	
	private BigDecimal mBalance;
	private BigDecimal mPreviousBalance;
	
// Constructor ------------------------------------------------------------- //
	
	/**
	 * Default constructor which generates a random number with conditions
	 * <code>
	 *  MIN_GEN_AMOUNT <= x <= MAX_GEN_AMOUNT
	 *  </code>
	 */
	public Account(){
		double random;
		
		//generate a random number and make it an integer
		//with MAX_GEN_AMOUNT number of digits (highest possible digit number) 
		random =(new Random()).
				nextInt(Math.round(((MAX_GEN_AMOUNT-MIN_GEN_AMOUNT) * 100))) + MIN_GEN_AMOUNT*100;
		
		//get the number to be to the correct decimal point
		random = random/100.0;
		
		mBalance = (new BigDecimal(random)).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		mPreviousBalance = (new BigDecimal(-1)).setScale(2, BigDecimal.ROUND_HALF_EVEN);	//Note if -1 appears in display output, it is considered an error 
													//(not enough incentive to add a whole exception for this because it should never happen in this system)
	}
	
	/**
	 * Returns the account balance.
	 * 
	 * @return Account balance.
	 */
	public BigDecimal getBalance(){
		return mBalance;
	}
	
	/**
	 * Returns the previous balance stored into the account.
	 * 
	 * @return The previopus balance.
	 */
	public BigDecimal getPreviousBalance(){
		return mPreviousBalance;
	}
	
	/**
	 * Allows for update to the Account instances balance member
	 * variable. In doing so it updates the previous balance.
	 * 
	 * @param newBalance The new balance to assign to this accounts balance.
	 */
	public void setBalance(BigDecimal newBalance){
		mPreviousBalance = mBalance;
		mBalance = newBalance.setScale(2, BigDecimal.ROUND_HALF_EVEN);
	}
}
