package pro2;
import org.testng.Assert;


public class Test {
	 public void testPass() { 
		 Assert.assertEquals(devop.display(55), "pass"); 
		 } 
		  
		 public void testFail() { 
		 Assert.assertEquals(devop.display(35), "fail"); 
		 } 
		 
		 public void testInvalid() { 
		 Assert.assertEquals(devop.display(-5), "invalid"); 
		 } 


}
