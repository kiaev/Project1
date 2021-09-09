import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Создание объекта scan для считывания из консоли

        Scanner scan = new Scanner(System.in);

        // Реверс объекта

        String afterSplit = Reverse.spliter(scan.nextLine());

        // Вывод на экран, убираем лишние пробелы в коне и начале полученной строки

        System.out.println(afterSplit);

    }

}
