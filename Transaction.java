// TODO: Auto-generated Javadoc
/**
 * The Class Transaction.
 */
public class Transaction implements Comparable<Transaction> {

	/** The block number. */
	private int blockNumber;
	
	/** The index. */
	private int index;
	
	/** The gas limit. */
	private int gasLimit;
	
	/** The gas price. */
	private long gasPrice;
	
	/** The to adr. */
	private String toAdr;
	
	/** The from adr. */
	private String fromAdr;

	/**
	 * Instantiates a new transaction.
	 *
	 * @param number the number
	 * @param index the index
	 * @param gasLimit the gas limit
	 * @param gasPrice the gas price
	 * @param fromAdr the from adr
	 * @param toAdr the to adr
	 */
	public Transaction(int number, int index, int gasLimit, long gasPrice, String fromAdr, String toAdr) {
		this.blockNumber = number;
		this.index = index;
		this.gasLimit = gasLimit;
		this.gasPrice = gasPrice;
		this.fromAdr = fromAdr;
		this.toAdr = toAdr;
	}

	/**
	 * Gets the block number.
	 *
	 * @return the block number
	 */
	public int getBlockNumber() {
		return this.blockNumber;
	}

	/**
	 * Gets the index.
	 *
	 * @return the index
	 */
	public int getIndex() {
		return this.index;
	}

	/**
	 * Gets the gas limit.
	 *
	 * @return the gas limit
	 */
	public int getGasLimit() {
		return this.gasLimit;
	}

	/**
	 * Gets the gas price.
	 *
	 * @return the gas price
	 */
	public long getGasPrice() {
		return this.gasPrice;
	}

	/**
	 * Gets the from address.
	 *
	 * @return the from address
	 */
	public String getFromAddress() {
		return this.fromAdr;
	}

	/**
	 * Gets the to address.
	 *
	 * @return the to address
	 */
	public String getToAddress() {
		return this.toAdr;
	}

	/**
	 * Compare to.
	 *
	 * @param t the t
	 * @return the int
	 */
	public int compareTo(Transaction t) {
		Integer defaultIndex = this.index;
		Integer tIndex = t.getIndex();
		return defaultIndex.compareTo(tIndex);
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		int thisIndex = this.index;
		int thisBlockNumber = this.blockNumber;
		return "Transaction " + thisIndex + " for Block " + thisBlockNumber;
	}

	/**
	 * Transaction cost.
	 *
	 * @return the double
	 */
	public double transactionCost() {
		double cost = (this.gasLimit * this.gasPrice);
		double convertedCost = (cost / 1000000000);
		return (convertedCost / 1000000000);
	}

}
