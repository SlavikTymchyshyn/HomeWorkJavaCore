package pack;

import java.util.ArrayList;
import java.util.List;

public class Student extends Human{
	
	private VNZ vnz;
	private String Course;
	private List<Book> books =new ArrayList<>() ;
	private List<Subject> subjects=new ArrayList<>();
	
	public Student( VNZ vnz, int weight, int height, int age, String course
			) {
		super(weight, height, age);
		this.vnz = vnz;
		Course = course;
	}

	public static Student studentFactory(String vnz,int weight, int height, int age, String course)
	{
		return new Student(VNZ.valueOf(vnz.toUpperCase()), weight, height, age, course);
	}

	public List<Book> addBook2(int weight,int height,int age,String nameAuthor,String nameBook,int pageAmount){
		List<Book> books=new ArrayList<>();
		books.add(new Book(new Author(weight,height,age,nameAuthor),nameBook,pageAmount));
		return books;
	}
	
	public void addBook(int weight,int height,int age,String nameAuthor,String nameBook,int pageAmount){
		books.add(new Book(new Author(weight,height,age,nameAuthor),nameBook,pageAmount));
	}
	
	public void addSubject(String nameBook, int weight, int height, int age, String Teachername, String vnz){
		subjects.add(new Subject(nameBook,new Teacher(weight,height, age, Teachername, VNZ.valueOf(vnz.toUpperCase()))));
	}
		
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public VNZ getVnz() {
		return vnz;
	}

	public void setVnz(VNZ vnz) {
		this.vnz = vnz;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Course == null) ? 0 : Course.hashCode());
		result = prime * result + ((vnz == null) ? 0 : vnz.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Course == null) {
			if (other.Course != null)
				return false;
		} else if (!Course.equals(other.Course))
			return false;
		if (vnz != other.vnz)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [vnz=" + vnz + ", Course=" + Course + ", books="
				+ books + ", subjects=" + subjects + "]";
	}

}
	
