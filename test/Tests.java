import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Tests {
//    @Test
//    public void testMenuChoice() {
//        int value = runProgram.menu(new int[] {1});
//        assertEquals(true, true);
//    }

    @Test
    public void test2() {
        String anything = "foot";
        String something = "ball";
        anything = anything + something;
        assertNotEquals(anything, true);
    }

    @Test
    public void test3() {
    assertEquals(true, true);
    }

    @Test
    public void test4() {
    assertEquals(true, true);
    }

    @Test
    public void test5() {
    assertSame(false, false);
    }

}