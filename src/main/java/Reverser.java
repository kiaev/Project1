public class Reverser {

    public static String reverseWithoutSpecialSymbols (String str){
        String[] words = checkNull(str).split(" ");
        String message = "";

        for (int i = 0; i <= words.length - 1; i ++){
            char[] array = words[i].toCharArray();
            // Реверс символьного массива, преобразование к строке
            message += String.valueOf(Reverser.iteratingThroughCharacters(array)) + " ";
        }
        return message.trim();
    }

    private static String checkNull (String str) {
        String checkvalue = str;

        if  (checkvalue == null){
            throw new IllegalArgumentException("Значение строки не должно быть null");
        }
        return checkvalue;
    }

    private static char[] iteratingThroughCharacters (char[] str)  {
        // Инициализируем левый и правый указатели Обход строки с обоих концов до 'l' и 'r'
        int r = str.length - 1;
        int l = 0;

        while (l < r) {
            // Игнорировать специальные символы
            if (!Character.isAlphabetic(str[l])) {
                l++;
            }
            else if(!Character.isAlphabetic(str[r])) {
                r--;
            }
                // И str [l], и str [r] не являются пространственными
            else {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
        return str;
    }
}
