import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainInput {

	public static void main(String[] args) {
		String accountType;
		String transactionType;
		int amount;
		List<String> transactionHistorySavings = new ArrayList<>();
		List<String> transactionHistoryChecking = new ArrayList<>();
		
		TransactionManager manager = new TransactionManager();
		Scanner sc = new Scanner(System.in);
		int i = 1;
		do {
			System.out.println("Write account type");
			accountType = sc.nextLine();
			System.out.println("Enter type of transaction");
			transactionType = sc.nextLine();
			System.out.println("Enter amount for the transaction");
			amount = sc.nextInt();
			
			try {
				i++;
				int updatedBalance = manager.initializeTransaction(accountType, transactionType, amount);
				if(accountType.equalsIgnoreCase("savings")) {
					transactionHistorySavings.add(new TransactionHistory(accountType, transactionType, amount, updatedBalance).toString());
				} else {
					transactionHistoryChecking.add(new TransactionHistory(accountType, transactionType, amount, updatedBalance).toString());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			sc.nextLine();
		} while (i < 3);
		System.out.println(transactionHistorySavings);
		System.out.println(transactionHistoryChecking);
		sc.close();

	}

}
