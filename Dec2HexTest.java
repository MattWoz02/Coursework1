import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {
    /**
     * Method: main(String args[])
     */
    @Test
    public void testWithCorrectInput() {
        Dec2Hex.main(new String[] {"15"});
    }

    @Test
    public void testNoInput() {
        Dec2Hex.main(new String[]{});
    }

    @Test
    public void testWithNonIntegerInput() {
        Dec2Hex.main(new String[] {"sometext"});
    }

	@Test
	public void testWithNegativeInput(){
	Dec2Hex.main(new String[] {"-12"});
}
}
