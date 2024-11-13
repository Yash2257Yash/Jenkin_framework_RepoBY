package pack1_For_Maven;

import org.testng.annotations.Test;

public class ContactTestForMavenTest {
@Test
	public void createcontactTest()
	{
	String URL=System.getProperty("url");
	String BROWSER=System.getProperty("browser","chrome");
	String USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");
	
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	
		System.out.println("Execute createcontactTest on POLL SCM z");
	}
	@Test
	public void modifycontactTest()
	{
		System.out.println("Execute modifycontactTest");
	}
}
