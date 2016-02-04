package hooni.sales;

import java.io.Serializable;

public class Sales implements Serializable {

	private static final long serialVersionUID = 1L;
	private String userId;
	private int gId;
	private int count;
	private int sum;
	private String gName;
	private int gPrice;

	public Sales() {
		// TODO Auto-generated constructor stub
	}

	public Sales(String userId, int gId, int count, int sum, String gName, int gPrice) {
		super();
		this.userId = userId;
		this.gId = gId;
		this.count = count;
		this.sum = sum;
		this.gName = gName;
		this.gPrice = gPrice;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getgId() {
		return gId;
	}

	public void setgId(int gId) {
		this.gId = gId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public int getgPrice() {
		return gPrice;
	}

	public void setgPrice(int gPrice) {
		this.gPrice = gPrice;
	}

}
