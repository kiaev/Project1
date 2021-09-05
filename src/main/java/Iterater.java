public class Iterater {

    public static String iterate (String[] afterSplit){

        String messege = "";

        for (int i=0; i<=afterSplit.length-1; i++){

            // создаем символьный массив

            char[] array = afterSplit[i].toCharArray();

            // Реверс символьного массива, преобразование к строке

            messege  += String.valueOf(ReverseClass.reverse(array))+" ";

        }

        return messege;
    }

}
