package hooni.cart;

import java.io.Serializable;

public class Cart implements Serializable {

	private static final long serialVersionUID = 1L;
	private String userId;
	private int gId;
	private int gPrice;
	private String gName;
	private int count;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public Cart(String userId, int gId, int gPrice, String gName, int count) {
		super();
		this.userId = userId;
		this.gId = gId;
		this.gPrice = gPrice;
		this.gName = gName;
		this.count = count;
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

	public int getgPrice() {
		return gPrice;
	}

	public void setgPrice(int gPrice) {
		this.gPrice = gPrice;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		if (gId != other.gId)
			return false;
		return true;
	}
	
}
