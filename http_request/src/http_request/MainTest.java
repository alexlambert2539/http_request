package http_request;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
	
	@Test
	public void test() {
		
		SimpleClass simpleClass = new SimpleClass();
		
		assertEquals("simple class output string", simpleClass.getSimpleString());
		
	}

}
