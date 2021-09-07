public class Reverse {

    public static String spliter(String str) {

        // создаем массив строк разделенных пробелом

        String[] words = str.split(" ");

        // Пробразуем массив в строку

        String ans = String.valueOf(Reverse.iterate(words));

        // Удаляем лишние пробелы

        return ans;
    }

    private static String iterate (String[] words){

        String messege = "";

        for (int i=0; i<= words.length-1; i++){

            // создаем символьный массив

            char[] array = words[i].toCharArray();

            // Реверс символьного массива, преобразование к строке

            messege  += String.valueOf(Reverse.reverse(array))+" ";

        }

        return messege;

    }

    private static char[] reverse(char[] str)  {

        // Инициализируем левый и правый указатели

        int r = str.length - 1, l = 0;

        // Обход строки с обоих концов до

        // 'l' и 'r'

        while (l < r) {

            // Игнорировать специальные символы

            if (!Character.isAlphabetic(str[l]))

                l++;

            else if(!Character.isAlphabetic(str[r]))

                r--;


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
