import org.junit.Test;
import static org.junit.Assert.*;


public class TestUnit {

    @Test
    public void testReverse() {

        // Проверка реверса строк

        String str1 = "ABC";
        String str2 = "CBA";

        char[] actual = str1.toCharArray();

        String expect = str2;

        String result = String.valueOf (ReverseClass.reverse(actual));

        // expect == result

        assertEquals(expect,result);

        System.out.println("method 'ReverseClass' is worked succesful");

    }

    @Test
    public void testSplitter(){

        //Проверка разделителя

        String actual = "abcd ifg";

        String[] expect = {"abcd", "ifg"};

        String[] result = Splitter.split(actual);

        assertArrayEquals(expect,result);

        System.out.println("method 'Splitter' is worked succesful");

    }

    @Test
    public void testIterater(){

        // Провекра Итератора

        String[] actual = {"abcd", "ifg"};

        String expect = "dcba gfi";

        String result = (Iterater.iterate(actual)).trim();

        assertEquals(expect,result);

        System.out.println("method 'Iterater' is worked succesful");

    }

}
