

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testIfAddIsWorkingorNot() {
	 Calculator c=new Calculator();
	 int result=c.add(10, 20);
	 int expected=30;
	 assertEquals(expected,result);
	}
	@Test
    public void testIfSubisWorking(){
    Calculator c=new Calculator();
   	 int result=c.sub(10, 20);
   	 int expected=-10;
   	 assertEquals(expected,result);
    }
}
