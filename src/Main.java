import java.util.Scanner;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите набор чисел в виде одной строки: ");
        String input = scanner.nextLine();

        String[] numbersStr = input.split(",");
        HashSet<Integer> numbers = new HashSet<Integer>();
        for (int i = 0; i < numbersStr.length; i++) {
            numbers.add(Integer.parseInt(numbersStr[i]));
        }

        System.out.println("Избавились от повторяющихся значений:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
