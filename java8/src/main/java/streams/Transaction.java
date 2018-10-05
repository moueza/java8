package streams;

public class Transaction {

	public static final String GROCERY = null;
	// type=GROCERY;

	public static Integer id;

	public static Integer getId() {
		return Transaction.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public static String getGrocery() {
		return GROCERY;
	}

	public Object getType() {
		return new Object();

	}

	public Integer getValue() {
		return 0;
	}
}
