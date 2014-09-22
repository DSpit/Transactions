

import java.math.BigDecimal;

/**
 * An interface which defines what methods that it's inheritors should use
 * to be properly considered a monetary transaction within this system.
 *
 * @author David Boivin (Spit)
 * @author Patrick Spensieri
 */
public interface MoneyTransactionInterface {
	
// Abstract Methods -------------------------------------------------------- //
	
	/**
	 * Method which should generate a random number within a given 
	 * constraint.
	 *
	 * @return Randomly generated value
	 */
	BigDecimal getRandomAmount();
	
	/**
	 * Should be used to check whether the randomly generated number 
	 * is valid or not.
	 * 
	 * @param validityCheckBalance The balance to check the randomly generated value against.
	 *
	 * @return <b>true</b> if the randomly generated number is considered valid and
	 * 	<b>false</b> if the randomly generated number is considered invalid
	 */
	boolean isValid(BigDecimal validityCheckBalance);
	
	/**
	 * This method should define what is considered valid by the implementation of this
	 * class, and using this definition to out put a message indicating why the randomly 
	 * generated number is considered valid or invalid.
	 * 
	 * @param validityCheckBalance The balance to check the randomly generated value against.
	 * 
	 * @return A string explaining why the random value is valid or not.
	 */
	String showValidation(BigDecimal validityCheckBalance);
}
