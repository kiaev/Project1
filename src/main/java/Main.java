import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Создание объекта scan для считывания из консоли

        Scanner scan = new Scanner(System.in);

        String beforeSplit = scan.nextLine();

        // Сплит объекта с разделителем " "

        String[] afterSplit = Splitter.split(beforeSplit);

        // Перебор массива

        String ans = Iterater.iterate(afterSplit);

        // Вывод на экран, убираем лишние пробелы в коне и начале полученной строки

        System.out.println(ans.trim());

    }

}
