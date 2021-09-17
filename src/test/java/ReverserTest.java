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
        String expect = str2;
        String result = Reverser.reverseWithoutSpecialSymbols(str1);
        assertEquals(expect,result);
        System.out.println("test 'Reverse Alpha versions' is worked succesful");
    }

    @Test
    public void testEmpty() {
        String expect = str3;
        String result = Reverser.reverseWithoutSpecialSymbols(str1);
        assertNotEquals(expect,result);
        System.out.println("test 'Is not Empty', succesful");
    }

    @Test
    public void testNULL() {
        String expect = str4;
        String result = Reverser.reverseWithoutSpecialSymbols(str1);
        assertNotEquals(expect,result);
        System.out.println("test 'Is not NULL', succesful");
    }

    @Test
    public void testReverseSimple() {
        String expect = ans5;
        String result = Reverser.reverseWithoutSpecialSymbols(str5);
        assertEquals(expect,result);
        System.out.println("test 'ReverseSimple' is worked succesful");
    }

    @Test
    public void testReverseSpecialSymbols() {
        String expect = ans6;
        String result = Reverser.reverseWithoutSpecialSymbols(str6);
        assertEquals(expect,result);
        System.out.println("test 'ReverseSpecialSymbols' is worked succesful");
    }

    @Test
    public void testReverseSpecialSymbolsAndNumerics() {
        String expect = ans7;
        String result = Reverser.reverseWithoutSpecialSymbols(str7);
        assertEquals(expect,result);
        System.out.println("test 'ReverseSpecialSymbolsAndNumerics' is worked succesful");
    }

}
