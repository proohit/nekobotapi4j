import org.junit.Test;
import static org.junit.Assert.*;

public class NekobotApiTest {
    @Test
    public void testImageEndpoints() {
        NekobotApi nekobotApi = new NekobotApi();
        assertNotNull("ImageEndpoints object should exist", nekobotApi.getImageEndpoints());
    }

    @Test
    public void testImageGenerators() {
        NekobotApi nekobotApi = new NekobotApi();
        assertNotNull("ImageGenerators object should exist", nekobotApi.getImageGenerators());
    }
}
