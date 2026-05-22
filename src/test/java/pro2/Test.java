package pro2;
import org.testng.Assert;


public class Test {
	 public void testPass() { 
		 Assert.assertEquals(Devop.display(55), "pass"); 
		 } 
		  
		 public void testFail() { 
		 Assert.assertEquals(Devop.display(35), "fail"); 
		 } 
		 
		 public void testInvalid() { 
		 Assert.assertEquals(Devop.display(-5), "invalid"); 
		 } 


}
