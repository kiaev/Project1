import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Scanner;

public class TestReverse {
    @Test
    public void testAdd() {
        char[] check = ("abcd").toCharArray();

        char[] expResult = ("dcba").toCharArray();

        //char[] result = ReverseClass.reverse(check);

        //assertNotSame(expResult,result);

        //assertNotEquals(expResult,result);
        assertFalse(expResult.equals(ReverseClass.reverse(check)));
        System.out.println("after assertFalse");



    }
}
