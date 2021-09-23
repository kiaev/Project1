import org.junit.Test;
import static org.junit.Assert.*;

public class ReverserTest {
    @Test
    public void reverse_ShouldReversWholeWord_ifOneWordAndOnlyCapitalLetters() {
        String str = "ABC";
        String ans = "CBA";
        String result = Reverser.reverseOnlyWords(str);
        assertEquals(ans,result);
    }
    @Test(expected = IllegalArgumentException.class)
    public void reverseOnlyWords_ShouldThrowAnException_IfStringIsNull() {
        String str = null;
        String result = Reverser.reverseOnlyWords(str);
    }
    @Test
    public void simple_ShouldReversWholeWords_IfWordsInLowCaseAndWithoutSpecialSymbols() {
        String str = "abcd efg hijk";
        String ans =  "dcba gfe kjih";
        String result = Reverser.reverseOnlyWords(str);
        assertEquals(ans,result);
    }
    @Test
    public void difficultOne_ShouldReversWholeWord_IfOnlyOneWordWithSpicialSymbolsAndNummerics() {
        String str = "a1bc!de2f@gh";
        String ans = "h1gf!ed2c@ba";
        String result = Reverser.reverseOnlyWords(str);
        assertEquals(ans,result);
    }
    @Test
    public void difficultSeveral_ShouldReversWholeWords_IfSeveralWordsWithSpicialSymbolsAndNummerics() {
        String str = "a1Bc!D e2f@G hI3jK#";
        String ans =  "D1cB!a G2f@e Kj3Ih#";
        String result = Reverser.reverseOnlyWords(str);
        assertEquals(ans,result);
    }
}
