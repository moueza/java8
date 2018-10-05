package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println("OK");

		// https://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
		List<Transaction> groceryTransactions = new ArrayList<>();
		List<Transaction> transactions = groceryTransactions;
		for (Transaction t : transactions) {
			if (t.getType() == Transaction.GROCERY) {
				groceryTransactions.add(t);
			}
		}
		Collections.sort(groceryTransactions, new Comparator() {
			public int compare(Transaction t1, Transaction t2) {
				return t2.getValue().compareTo(t1.getValue());
			}

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		// List<Integer> transactionIds = new ArrayList<>();
		List<Integer> transactionsIds = new ArrayList<>();

		for (Transaction t : groceryTransactions) {
			transactionsIds.add(t.getId());
		}
		// Listing 1

		
		
		// List<Integer>
		transactionsIds = transactions.stream().filter(t -> t.getType() == Transaction.GROCERY)
				.sorted(comparing(Transaction::getValue).reversed()).map(Transaction::getId).collect(toList());
	}

}
