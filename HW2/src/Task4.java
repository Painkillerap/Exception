/*
 * Разработайте программу, которая выбросит Exception,
 * когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws Exception {
        Scanner inScanner = new Scanner(System.in);
        System.out.printf("Введите сообщение: ");
        isEmpty(inScanner.nextLine());
        inScanner.close();
    }

    private static void isEmpty(String message) {
        Scanner inScanner = new Scanner(System.in);
        while (true) {
            if (message.isEmpty()) {
                System.out.println("Пустые строки вводить нельзя");
                System.out.printf("Введите сообщение: ");
                message = inScanner.nextLine();
            } else {
                System.out.printf("Вы ввели строку '%s'", message);
                break;
            }
        }
        inScanner.close();
    }
}