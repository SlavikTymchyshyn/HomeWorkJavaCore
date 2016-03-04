package pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
	
	@Test
	public void studentFactoryTest(){
		Student expected =new Student(VNZ.POLITECHNIKA,70,170,30,"KI");
		Student actual=Student.studentFactory("POLITECHNIKA", 70, 170, 30, "KI");	
		Assert.assertEquals(expected, actual);
		}
	
	@Test
	public void addBookTest(){
		Student st=new Student(VNZ.POLITECHNIKA, 70, 170, 20, "Radio");
		Book expected= new Book(new Author(70,170,45,"Kyrkov"),"Knuga",250);
		st.addBook(70, 170, 45, "Kyrkov", "Knuga", 250);
		Book actual =st.getBooks().get(0);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void addSubjectTest(){
		Student st=new Student(VNZ.POLITECHNIKA, 70, 170, 20, "Radio");
		Subject expected=new Subject("Java",new Teacher(70,170, 45, "Vasyl", VNZ.POLITECHNIKA));
		st.addSubject("Java", 70, 170, 45, "Vasyl", "Politechnika");
		Subject actual=st.getSubjects().get(0);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void addBook2Test(){
		Student st=new Student(VNZ.POLITECHNIKA, 70, 170, 20, "Radio");
		List<Book> exp=new ArrayList<>();
		exp.add(new Book((new Author(70, 170, 45, "Kyrkov")), "Knuga", 250));
		List<Book> act=new ArrayList<>();
		Book b=(st.addBook2(70, 170, 45, "Kyrkov", "Knuga", 250).get(0));
		act.add(b);
		Object[] expecteds=exp.toArray(); 
		Object[] actuals=act.toArray();
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	
}
