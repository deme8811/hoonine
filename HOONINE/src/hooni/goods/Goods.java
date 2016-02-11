package hooni.goods;

import java.io.Serializable;
import org.springframework.web.multipart.MultipartFile;

public class Goods implements Serializable {

	private static final long serialVersionUID = 1L;
	private int gId;
	private String gName;
	private int gPrice;
	private String gcUrl;
	private String gContent;
	private int gCount;
	private String gsUrl;
	private String gCategory;
	private String gCategory2;
	private MultipartFile imgFile;
	private MultipartFile imgFile2;
	public Goods() {
		// TODO Auto-generated constructor stub
	}

	public Goods(int gId, String gName, int gPrice, String gcUrl, String gContent, int gCount, String gsUrl,
			String gCategory, String gCategory2, MultipartFile imgFile) {
		super();
		this.gId = gId;
		this.gName = gName;
		this.gPrice = gPrice;
		this.gcUrl = gcUrl;
		this.gContent = gContent;
		this.gCount = gCount;
		this.gsUrl = gsUrl;
		this.gCategory = gCategory;
		this.gCategory2 = gCategory2;
		this.imgFile = imgFile;
	}
	

	public String getgCategory2() {
		return gCategory2;
	}

	public void setgCategory2(String gCategory2) {
		this.gCategory2 = gCategory2;
	}

	public int getgId() {
		return gId;
	}

	public void setgId(int gId) {
		this.gId = gId;
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

	public String getGcUrl() {
		return gcUrl;
	}

	public void setGcUrl(String gcUrl) {
		this.gcUrl = gcUrl;
	}

	public String getgContent() {
		return gContent;
	}

	public void setgContent(String gContent) {
		this.gContent = gContent;
	}

	public int getgCount() {
		return gCount;
	}

	public void setgCount(int gCount) {
		this.gCount = gCount;
	}

	public String getGsUrl() {
		return gsUrl;
	}

	public void setGsUrl(String gsUrl) {
		this.gsUrl = gsUrl;
	}

	public String getgCategory() {
		return gCategory;
	}

	public void setgCategory(String gCategory) {
		this.gCategory = gCategory;
	}

	public MultipartFile getImgFile() {
		return imgFile;
	}

	public void setImgFile(MultipartFile imgFile) {
		this.imgFile = imgFile;
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
		Goods other = (Goods) obj;
		if (gId != other.gId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Goods [gId=" + gId + ", gName=" + gName + ", gPrice=" + gPrice + "]";
	}

}
