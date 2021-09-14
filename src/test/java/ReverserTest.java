import org.junit.Test;
import static org.junit.Assert.*;


public class ReverserTest {

    String str1 = "ABC";
    String str2 = "CBA";
    String str3 = "";
    String str4 = null;
    String str5 = "abcd efg hijk";
    String str6 = "a1bc!de2f@gh";
    String str7 = "a1Bc!D e2f@G hI3jK#";
    String ans5 =  "dcba gfe kjih";
    String ans6 = "h1gf!ed2c@ba";
    String ans7 =  "D1cB!a G2f@e Kj3Ih#";



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

    @Test
    public void testReverse1() {

        // Проверка реверса строк

        String expect = ans5;

        String result = Reverse.spliter(str5);

        // expect == result

        assertEquals(expect,result);

        System.out.println("method 'Reverse 1' is worked succesful");

    }

    @Test
    public void testReverse2() {

        // Проверка реверса строк

        String expect = ans6;

        String result = Reverse.spliter(str6);

        // expect == result

        assertEquals(expect,result);

        System.out.println("method 'Reverse 2' is worked succesful");

    }

    @Test
    public void testReverse3() {

        // Проверка реверса строк

        String expect = ans7;

        String result = Reverse.spliter(str7);

        // expect == result

        assertEquals(expect,result);

        System.out.println("method 'Reverse 3' is worked succesful");

    }





}
