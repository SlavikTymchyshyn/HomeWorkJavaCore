package pack;

import java.util.ArrayList;
import java.util.List;

public class Author extends Human{
	
	private String nameAuthor;
	private List<Book> books=new ArrayList<>();
		
	
	public Author(int weight, int height, int age, String nameAuthor) {
		super(weight, height, age);
		this.nameAuthor = nameAuthor;
	}
		
	public String getName() {
		return nameAuthor;
	}

	public void setName(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}



	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameAuthor == null) ? 0 : nameAuthor.hashCode());
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
		Author other = (Author) obj;
		
		if (nameAuthor == null) {
			if (other.nameAuthor != null)
				return false;
		} else if (!nameAuthor.equals(other.nameAuthor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Author [name=" + nameAuthor + "]";
	}
	
	

}
