package home9a;

import org.junit.Assert;
import org.junit.Test;

public class AdvanceTest {

	@Test
	public void CalculatorTest(){
		double num1=3.2;
		double num2=2.2;
		char znak='-';
		double expected=1;
		double delta=5;
		double actual=Advance.Calculator(num1, znak, num2);
		Assert.assertEquals(expected, actual, delta);
	}
	
	
	
}
