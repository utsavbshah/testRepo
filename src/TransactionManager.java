
public class TransactionManager {
	
	int initialBalanceSavings = 10000;
	int initialBalanceChecking = 10000;
	
	public int initializeTransaction(String accountType, String transactionType, int amount) throws Exception {
		if(amount % 500 == 0) {
			if(accountType.equalsIgnoreCase("savings")) {
				initialBalanceSavings = this.transcationByType(transactionType, amount, initialBalanceSavings);
				return initialBalanceSavings;
			} else if(accountType.equalsIgnoreCase("checking")) {
				initialBalanceChecking = this.transcationByType(transactionType, amount, initialBalanceChecking);
				return initialBalanceChecking;
			} else {
				throw new Exception("Invaid type of account");
			}
		} else {
			throw new Exception("Invalid transaction amount");
		}
	}
	
	public int transcationByType(String transactionType, int amount, int balance) throws Exception {
		if(transactionType.equalsIgnoreCase("debit")) {
			balance = balance - amount;
		} else if(transactionType.equals("credit")) {
			balance = balance + amount;
		} else {
			throw new Exception("Invalid type of transaction");
		}
		return balance;
	}
	
}
