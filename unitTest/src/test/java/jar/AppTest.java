package jar;

import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
    private static Frame frame; 
    @BeforeAll
    public static void initializeFrame () {
        frame = new Frame();
    }
    
    @Test
	public void testIsStrike() throws Exception {
		frame.rollFirst(10);
		assertTrue(frame.isStrike());
	}
    
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }
}
