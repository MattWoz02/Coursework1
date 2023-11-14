import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.logging.Logger;

public class TestRunner {
	// Declare Logger for the TestRunner class
        private static final Logger logger = Logger.getLogger(TestRunner.class.getName());
    
public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Dec2HexTest.class);

        int fails = result.getFailureCount();
        
        for (Failure failure : result.getFailures()) {
            logger.severe(failure.toString());
        }

        if (fails > 0) {
            logger.severe("Tests failed: {0}", fails);
            System.exit(1); // Non-zero exit code indicates an error
        } else {
            logger.info("All tests passed successfully.");
            System.exit(0); // Zero exit code indicates success
        }
    }
}
