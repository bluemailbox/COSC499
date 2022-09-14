import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class sortStringTest {
    @Test
    public void testSort() {
        int result = sortString.sortstr("stuff","things","possessions");
        assertEquals(0,result);
    }
}

