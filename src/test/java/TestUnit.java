import org.junit.Test;
import static org.junit.Assert.*;


public class TestUnit {

    String str1 = "ABC";
    String str2 = "CBA";
    String str3 = "";
    String str4 = null;

    @Test
    public void testReverse() {

        // Проверка реверса строк

        String expect = str2;

        String result = Reverse.spliter(str1);

        // expect == result

        assertEquals(expect,result);

        System.out.println("method 'Reverse' is worked succesful");

    }

    @Test
    public void testEmpty() {

        String expect = str3;

        String result = Reverse.spliter(str1);

        assertNotEquals(expect,result);

        System.out.println("Is not Empty, succesful");

    }

    @Test
    public void testNULL() {

        String expect = str4;

        String result = Reverse.spliter(str1);

        assertNotEquals(expect,result);

        System.out.println("Is not NULL, succesful");

    }




}
