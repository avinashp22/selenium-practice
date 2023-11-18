package junit;

import org.junit.*;

public class JUnitIntroduction

{

@BeforeClass // once at start of class
public static void startDB(){System.out.println("enable DB connection");}

@AfterClass  // once at end of class
public static void closeDB(){System.out.println("closing DB connection");}

@Before   // start of each method
public void openBroswer(){System.out.println("opening browser");}

@After  // end of each method
public void closeBroswer(){System.out.println("closing browser");}

@Test
public void verifyUserShouldNavigateToLoginPage(){
    System.out.println("Navigate to Login Page");
    Assert.assertEquals("user not navigate","Jay", "Jay");
}

@Test
public void test (){
    System.out.println("test method");
    //Assert.fail(); // purposely fail this test
    Assert.assertTrue(true);
}

}






