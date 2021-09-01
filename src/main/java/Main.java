
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Создание объекта scan для считывания из консоли

        Scanner scan = new Scanner(System.in);

        String beforeSplit = scan.nextLine();

        // Сплит объекта с разделителем " "

        String[] afterSplit = Splitter.split(beforeSplit);

        // Реверс объекта

        for (int i=0; i<=afterSplit.length-1; i++){
            char[] array = afterSplit[i].toCharArray();
            System.out.print(ReverseClass.reverse(array));
            System.out.print(" ");
        }

    }
}
