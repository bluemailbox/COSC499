import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class sortintTest {
    @Test
    public void testSort() {
        sortint mytest = new sortint();
        int result = mytest.sortint(1,2,3);
        assertEquals(0,result);
    }
}

