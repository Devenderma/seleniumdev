package automation.login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginTest {
  @Test
  public void f() {
	  System.out.println("devendra rao....");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("hii....");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("bye....");
  }

}
