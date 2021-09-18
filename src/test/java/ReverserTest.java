import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class ReverserTest {
    
    @Test
    public void testReverse() {
        String str = "ABC";
        String ans = "CBA";
        String expect = ans;
        String result = Reverser.reverseWithoutSpecialSymbols(str);
        assertEquals(expect,result);
        System.out.println("test 'Reverse Alpha versions' is worked succesful");
    }

    @Test
    public void testEmpty() {
        String str = "ABC";
        String ans = "";
        String expect = ans;
        String result = Reverser.reverseWithoutSpecialSymbols(str);
        assertNotEquals(expect,result);
        System.out.println("test 'Is not Empty', succesful");
    }

    @Test
    public void testNULL() {
        String str = "ABC";
        String ans = null;
        String expect = ans;
        String result = Reverser.reverseWithoutSpecialSymbols(str);
        assertNotEquals(expect,result);
        System.out.println("test 'Is not NULL', succesful");
    }

    @Test
    public void testReverseSimple() {
        String str = "abcd efg hijk";
        String ans =  "dcba gfe kjih";
        String expect = ans;
        String result = Reverser.reverseWithoutSpecialSymbols(str);
        assertEquals(expect,result);
        System.out.println("test 'ReverseSimple' is worked succesful");
    }

    @Test
    public void testReverseSpecialSymbols() {
        String str = "a1bc!de2f@gh";
        String ans = "h1gf!ed2c@ba";
        String expect = ans;
        String result = Reverser.reverseWithoutSpecialSymbols(str);
        assertEquals(expect,result);
        System.out.println("test 'ReverseSpecialSymbols' is worked succesful");
    }

    @Test
    public void testReverseSpecialSymbolsAndNumerics() {
        String str = "a1Bc!D e2f@G hI3jK#";
        String ans =  "D1cB!a G2f@e Kj3Ih#";
        String expect = ans;
        String result = Reverser.reverseWithoutSpecialSymbols(str);
        assertEquals(expect,result);
        System.out.println("test 'ReverseSpecialSymbolsAndNumerics' is worked succesful");
    }

    @Ignore
    public void testNullPointerException(){
        String str = null;
        String result = Reverser.reverseWithoutSpecialSymbols(str);
    }

}
