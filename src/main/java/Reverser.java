import java.util.StringJoiner;

public class Reverser {

    public static String reverseOnlyWords (String str){
        String[] words = checkNull(str).split(" ");
        return reverseOneWord(words);
    }

    private static String checkNull (String str) {
        String checkvalue = str;
        if  (checkvalue == null){
            throw new IllegalArgumentException("The string value must not be null");
        }
        return checkvalue;
    }

    private static String reverseOneWord (String[] words)  {
        StringJoiner message = new StringJoiner(" ");
        for (int i = 0; i <= words.length - 1; i ++) {
            char[] array = words[i].toCharArray();
            // Инициализируем левый и правый указатели Обход строки с обоих концов до 'l' и 'r'
            int r = array.length - 1;
            int l = 0;
            while (l < r) {
                // Игнорировать специальные символы
                if (!Character.isAlphabetic(array[l])) {
                    l++;
                } else if (!Character.isAlphabetic(array[r])) {
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
            message.add (String.valueOf(array));
        }
        return message.toString();
    }
}
