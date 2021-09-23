import java.util.StringJoiner;

public class Reverser {

    public static String reverseOnlyWords (String str){
        checkNull(str);
        String[] words = str.split(" ");

        StringJoiner message = new StringJoiner(" ");

        for (int i = 0; i <= words.length - 1; i ++){
            message.add(reverseOneWord(words[i]));
        }
        return message.toString();
    }

    private static void checkNull (String str) {
        if  (str == null){
            throw new IllegalArgumentException("The string value must not be null");
        }
    }

    private static String reverseOneWord (String oneWord)  {
        char[] array = oneWord.toCharArray();

        // Инициализируем левый и правый указатели Обход строки с обоих концов до 'l' и 'r'
        int r = array.length - 1;
        int l = 0;

        while (l < r) {
            // Игнорировать специальные символы
            if (!Character.isAlphabetic(array[l])) {
                l++;
            }
            else if(!Character.isAlphabetic(array[r])) {
                r--;
            }
                // И str [l], и str [r] не являются пространственными
            else {
                char tmp = array[l];
                array[l] = array[r];
                array[r] = tmp;
                l++;
                r--;
            }
        }
        return String.valueOf(array);
    }
}
