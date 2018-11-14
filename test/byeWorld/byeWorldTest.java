package byeWorld;


import static org.junit.Assert.*;
import org.junit.Test;
import uk.co.placona.helloWorld.ByeWorld;


public class byeWorldTest {
	
	@Test
	public void testByewWorld(){
		ByeWorld bye = new ByeWorld();
		assertEquals("A test for Bye World String", "Bye World", bye.sayBye());
	}

}
