

public class Task3 {
    public static void main(String[] args){ // Убрано объявление исключения throws Exception из метода main, так как в нем не выбрасываются исключения, которые нужно обрабатывать или передавать дальше.
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль!"); // добавлено исключение ArithmeticException для обработки деления на ноль.
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так..."); // класс Throwable переместили вниз, т.к. "нельзя вызвать более «старший» catch раньше более «младшего»" ©
        }
    }

    public static void printSum(Integer a, Integer b) { // Убрано объявление исключения throws FileNotFoundException из метода printSum, так как в нем не содержится кода, который может привести к FileNotFoundException
        System.out.println(a + b);
    }

}