/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;
import java.net.MalformedURLException;


public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException {
        TestCases tests = new TestCases(); // Initialize your test class
       // AmazonSearch amazon = new AmazonSearch();
        Count_hyperlinks hyperlinks = new Count_hyperlinks();

        //TODO: call your test case functions one after other here

       // tests.testCase01();
      //  amazon.testCase01();
        hyperlinks.testCase02();

        //END Tests


       // tests.endTest(); // End your test by clearning connections and closing browser
      //  amazon.endTest();
        hyperlinks.endTest();
    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        new App().getGreeting();
    }
    
}
