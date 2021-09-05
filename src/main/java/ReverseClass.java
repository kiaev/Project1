class ReverseClass {

    public static char[] reverse(char[] str)  {

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
