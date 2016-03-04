package home11;

public class Commodity {
	
	private String NameAuthor;
	private String NameBook;
	private int pageAmount;
	private int yearOfPublic;
	
	public Commodity(String nameAuthor, String nameBook, int pageAmount,
			int yearOfPublic) {
		NameAuthor = nameAuthor;
		NameBook = nameBook;
		this.pageAmount = pageAmount;
		this.yearOfPublic = yearOfPublic;
	}
	public String getNameBook() {
		return NameBook;
	}
	public void setNameBook(String nameBook) {
		NameBook = nameBook;
	}
	public String getNameAuthor() {
		return NameAuthor;
	}
	public void setNameAuthor(String nameAuthor) {
		NameAuthor = nameAuthor;
	}
	public int getPageAmount() {
		return pageAmount;
	}
	public void setPageAmount(int pageAmount) {
		this.pageAmount = pageAmount;
	}
	public int getYearOfPublic() {
		return yearOfPublic;
	}
	public void setYearOfPublic(int yearOfPublic) {
		this.yearOfPublic = yearOfPublic;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((NameAuthor == null) ? 0 : NameAuthor.hashCode());
		result = prime * result
				+ ((NameBook == null) ? 0 : NameBook.hashCode());
		result = prime * result + pageAmount;
		result = prime * result + yearOfPublic;
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
		Commodity other = (Commodity) obj;
		if (NameAuthor == null) {
			if (other.NameAuthor != null)
				return false;
		} else if (!NameAuthor.equals(other.NameAuthor))
			return false;
		if (NameBook == null) {
			if (other.NameBook != null)
				return false;
		} else if (!NameBook.equals(other.NameBook))
			return false;
		if (pageAmount != other.pageAmount)
			return false;
		if (yearOfPublic != other.yearOfPublic)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Commodity [NameBook=" + NameBook + ", NameAuthor=" + NameAuthor
				+ ", pageAmount=" + pageAmount + ", yearOfPublic="
				+ yearOfPublic + "]\n";
	}
}
