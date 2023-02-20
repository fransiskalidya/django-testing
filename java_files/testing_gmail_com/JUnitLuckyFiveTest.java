package testing_gmail_com;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitLuckyFiveTest {
	private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	  private final PrintStream oPrintStream = System.out;

	  @Before
	  public void setUpStream() {
	    System.setOut(new PrintStream(outputStream));
	  }

	  @After
	  public void restoreStream() {
	    System.setOut(oPrintStream);
	  }

	  @Test
	  public void isLuckyFive() {
	    testing_gmail_com.LuckyFive.main(null);
	    assertEquals("Is Loop not same", "12345", outputStream.toString());

		testing_gmail_com.LuckyFive.loop(6);
	  }
}
