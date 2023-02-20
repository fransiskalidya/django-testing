package testing_gmail_com;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitPasswordTest {
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
	  public void isPassword() {
	    testing_gmail_com.Password.main(null);
	    assertEquals("Password not same", "0true", outputStream.toString());

		String data = testing_gmail_com.Password.pass();
	    assertEquals("String Password not same", "correcthorsebatterystaple" ,data);
	  }
}
