import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class ReverserTest {
    @Test
    public void reverse_ShouldReversWholeWord_ifOneWordAndOnlyCapitalLetters() {
        String str = "ABC";
        String ans = "CBA";
        String expect = ans;
        String result = Reverser.reverseWithoutSpecialSymbols(str);
        assertEquals(expect,result);
    }

    @Test
    public void empty_ShouldThrowAnExceptionIfStringEmpty() {
        String str = "ABC";
        String ans = "";
        String expect = ans;
        String result = Reverser.reverseWithoutSpecialSymbols(str);
        assertNotEquals(expect,result);
    }

    @Test
    public void null_ShouldThrowAnExceptionIfStringNull() {
        String str = "ABC";
        String ans = null;
        String expect = ans;
        String result = Reverser.reverseWithoutSpecialSymbols(str);
        assertNotEquals(expect,result);
    }

    @Test
    public void simple_ShouldReversWholeWordsIfWordsInLowCaseAndWithoutSpecialSymbols() {
        String str = "abcd efg hijk";
        String ans =  "dcba gfe kjih";
        String expect = ans;
        String result = Reverser.reverseWithoutSpecialSymbols(str);
        assertEquals(expect,result);
    }

    @Test
    public void difficultOne_ShouldReversWholeWord_IfOnlyOneWordWithSpicialSymbolsAndNummerics() {
        String str = "a1bc!de2f@gh";
        String ans = "h1gf!ed2c@ba";
        String expect = ans;
        String result = Reverser.reverseWithoutSpecialSymbols(str);
        assertEquals(expect,result);
    }

    @Test
    public void difficultSeveral_ShouldReversWholeWords_IfSeveralWordsWithSpicialSymbolsAndNummerics() {
        String str = "a1Bc!D e2f@G hI3jK#";
        String ans =  "D1cB!a G2f@e Kj3Ih#";
        String expect = ans;
        String result = Reverser.reverseWithoutSpecialSymbols(str);
        assertEquals(expect,result);
    }
}
