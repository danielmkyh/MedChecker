import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;


public class Tests {

    @Test
    public void testThatItCanAddNumbers() {
        // given
        int numberOne = 20;
        int numberTwo = 30;
        // when
        int result = runProgram.Calculator.add(numberOne,numberTwo);
        assertEquals(50, result);
    }
    @Test
    public void testThatItCanMultiply() {
        int Java = 10;
        int Is = 20;
        int a = 30;
        int Monster = runProgram.Monsters.multiply(Java, Is, a);
        assertEquals(6000,Monster);
    }


    @Test
    public void testThatJavaIsMakingMyBrainHurt () {


        assertEquals(true, true);
    }

    @Test
    public void testSomethingUseful() {

        assertEquals(true, true);
    }

    @Test
    public void canICreateOneMoreTest() {

        assertSame(false, false);
    }
}