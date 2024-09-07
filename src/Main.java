import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String multiWordVariable;


        final int NUM = 5;

        String word = "Hello";


        multiWordVariable = NUM + word;

        System.out.println("multiWordVariable: " + multiWordVariable);
        System.out.println("NUM: " + NUM);
        System.out.println("word: " + word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        System.out.println("Введите ваше имя: ");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Привет, " + userName + "!");
        scanner.close();
    }
}
