package home9;

import org.junit.Assert;
import org.junit.Test;

public class GroupTest {
	@Test
	public void ChangeLimitGroupTest(){
		Group g=Group.grAC1;
		Studnt[] expecteds=new Studnt[10];
		int expected=expecteds.length;
		Studnt[] actuals=g.ChangeLimitGroup(g.getStudnt(), 10);
		int actual=actuals.length;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void displayTest(){
		
	}
	
//	String c=Group.valueOf("grREPS1").toString();
//	boolean Display=false;
//	if(Group.valueOf("grREPS1").equals(grREPS1)){
//		Display=true;
//	System.out.println("equal");
//	if(Display){System.out.println(Group.typeSearchWord());}}
//	else if(g.compareTo(c)<0){System.out.println("word is shorter");}
//	else if(g.compareTo(c)>0){System.out.println("word is longer");}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
