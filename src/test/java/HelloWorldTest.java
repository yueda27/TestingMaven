import junit.framework.TestCase;
import org.junit.Before;

public class HelloWorldTest extends TestCase {
    String result = HelloWorld.PrintWord();
    @Before
    public void setUp(){

    }

    public void testPrintWord() {
        assertEquals("Hello", result);
    }
    public void testPrintNotValid(){

        assertNotSame("Not this", result);
    }
}