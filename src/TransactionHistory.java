import java.util.Date;

public class TransactionHistory {

	private String accountType;
	private String transactionType;
	private int amount;
	private int finalBalance;
	private Date date;
	public TransactionHistory(String accountType, String transactionType, int amount, int finalBalance) {
		this.accountType = accountType;
		this.transactionType = accountType;
		this.amount = amount;
		this.finalBalance = finalBalance;
		this.date = new Date();
	}
	@Override
	public String toString() {
		return "TransactionHistory [accountType=" + accountType + ", transactionType=" + transactionType + ", amount="
				+ amount + ", finalBalance=" + finalBalance + ", date=" + date + "]";
	}
	
}
