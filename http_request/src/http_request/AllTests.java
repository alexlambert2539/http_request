package http_request;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ReadInputTest.class,
				ValidateURLTest.class, 
				RequestTest.class,
				FormatDateTest.class,
				JsonFormatTest.class })

public class AllTests {

}
