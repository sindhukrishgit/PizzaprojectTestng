package Assrt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assrtns {
	
	
	@Test
	void Testcase1() {
		
		String str1="hello";
		String str2="hlo";
		/*if(str1.equals(str2))
		{
			System.out.println("test is pass");
			
		}
		else
		{
			System.out.println("test is fail");
		}*/
		
		Assert.assertEquals(str1, str2);
	}

}
