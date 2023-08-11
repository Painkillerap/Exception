/*
 * Если необходимо, исправьте данный код 
 */

public class Task2 {
    public static void main(String[] args) {

        // задаем массив
        int[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };

        try {
            int d = 0;
            double catchedRes1 = intArray[15] / d; // Выход за пределы массива(выводится первым,так как стоит ранее деления на 0)
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e); // обработка исключения деления на ноль
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e); // обработка исключения выхода индекса за пределы массива
        }
    }
}
