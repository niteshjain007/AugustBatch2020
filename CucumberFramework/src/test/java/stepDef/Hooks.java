package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	
	
	
	@Before("@sanityTest")
	public void setupBefore()
	{
		System.out.println("hi..i am under before scenario");
	}
	
	@After("@sanityTest")
	public void setupAfter()
	{
		System.out.println("i am under after");
	}
	
	
	@Before("@smokeTest")
	public void setupBeforesmokescenario()
	{
		System.out.println("before each smoke scenarios");
	}
	
	@After("@smokeTest")
	public void setupAftersmokescenario()
	{
		System.out.println("after each smoke scenario");
	}

}
