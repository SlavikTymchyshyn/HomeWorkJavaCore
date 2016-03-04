package pack;

public class Book {
	
	private Author author;
	private String name;
	private int pageAmount;
	
	public Book(Author author, String name, int pageAmount) {
		this.author = author;
		this.name = name;
		this.pageAmount = pageAmount;
//		author.getBooks().add(this);  //try better
	}
	
	public static Book bookFactory(/*Author author*/int weight, int height, int age, String nameAuthor, String name, int pageAmount){
		return new Book(new Author ( weight,  height,  age,  nameAuthor), name,  pageAmount);
	}
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPageAmount() {
		return pageAmount;
	}
	public void setPageAmount(int pageAmount) {
		this.pageAmount = pageAmount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pageAmount;
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
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pageAmount != other.pageAmount)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book [author=" + author + ", name=" + name + ", pageAmount="
				+ pageAmount + "]";
	}
	
	

}
