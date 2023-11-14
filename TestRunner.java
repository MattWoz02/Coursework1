import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Dec2HexTest.class);

        int fails = result.getFailureCount();
        
        for (Failure failure : result.getFailures()) {
            logger.log(failure.toString());
        }

        if (fails > 0) {
            logger.log("Tests failed: " + fails);
            System.exit(1); // Non-zero exit code indicates an error
        } else {
            logger.log("All tests passed successfully.");
            System.exit(0); // Zero exit code indicates success
        }
    }
}
