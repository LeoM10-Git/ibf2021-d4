import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class Test {

        @org.junit.Test
        public void testGenerator() throws IOException {
         Cookie generator = new Cookie();
        assertEquals("1. \"We grow fearless when we do the things we fear.\" -Robin Sharma.",generator.generateCookie().get(0));
    }
}
