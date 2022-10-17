package Assertionpack;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertionSoftAndHard {
String ExpUrl="https://www.youtube.com/";
String ActUrl="https://www.youtube.com/";
String ActUrl2="https://www.youtube";


SoftAssert soft=new SoftAssert();

@Test
public void TC01() {
	Assert.assertEquals(ActUrl, ExpUrl,"asertion fail due to ");  //if actual is equals to exp then pass else fail
	System.out.println("Assertion1");
	Assert.assertNotEquals(ActUrl, ExpUrl,"asertion fail due to ");  //if actual is  not equals to exp then pass else fail
	System.out.println("Assertion2");
	Assert.assertEquals(ActUrl, ExpUrl,"asertion fail due to ");
	Assert.assertFalse(false);  //it needs false argument then it pass else it fails
	Assert.assertTrue(true);    //it needs true argument then it pass else it fails
}
@Test
public void TC02(){
	soft.assertEquals(ActUrl, ExpUrl,"assertion fail due to");
	System.out.println("TC03 Assertion3");
soft.assertNotEquals(ActUrl, ExpUrl,"assertion fail due to");
System.out.println("Assertion4");
soft.assertFalse(true);   // if we add true it fails for false method.
System.out.println("Assertion5");

soft.assertTrue(true);
System.out.println("Assertion6");
soft.assertAll();     //this is very imp method in soft assert.we need to use this to execute all assertions



	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
