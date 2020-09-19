import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {

    public void testPrintWord() {
        String result = HelloWorld.PrintWord();
        assertEquals("Hello", result);
    }
}