package http_request;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReadInputTest {
	
	private static String inputString = 
			"http://www.bbc.co.uk/iplayer" + System.lineSeparator() +
			"https://google.com" + System.lineSeparator() +
			"bad://address" + System.lineSeparator() +
			"http://www.bbc.co.uk/missing/thing" + System.lineSeparator() +
			"http://not.exists.bbc.co.uk/" + System.lineSeparator() +
			"http://www.oracle.com/technetwork/java/javase/downloads/index.html" + System.lineSeparator() +
			"https://www.pets4homes.co.uk/images/articles/1646/large/kitten-emergencies-signs-to-look-out-for-537479947ec1c.jpg" + System.lineSeparator() + 
			"http://site.mockito.org/";
	
	@Before
	public void before() {
		
		ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());
		System.setIn(input);
		
	}

	@Test
	public void test() {
			
		ReadInput readInput = new ReadInput();		
		ArrayList<?> arrayList = readInput.readInput();
		
		assertEquals(arrayList.get(0), "http://www.bbc.co.uk/iplayer");
		assertEquals(arrayList.get(1), "https://google.com");
		assertEquals(arrayList.get(2), "bad://address");
		assertEquals(arrayList.get(3), "http://www.bbc.co.uk/missing/thing");
		assertEquals(arrayList.get(4), "http://not.exists.bbc.co.uk/");
		assertEquals(arrayList.get(5), "http://www.oracle.com/technetwork/java/javase/downloads/index.html");
		assertEquals(arrayList.get(6), "https://www.pets4homes.co.uk/images/articles/1646/large/kitten-emergencies-signs-to-look-out-for-537479947ec1c.jpg");
		assertEquals(arrayList.get(7), "http://site.mockito.org/");
		
		assertEquals(arrayList.size(), 8);
		
		System.out.println("input contents: " + arrayList);
		System.out.println("number of queries: " + arrayList.size());
		
	}
	
	@After
	public void after() {
		
		System.setIn(System.in);
		
	}

}
