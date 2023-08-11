import java.util.Arrays;

/* Задача 1
 * class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int arr[] = new int[10];
        System.out.println(arr[100]);
}

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 0;
        int b = 10 / a;
      
}

    public static void numberFormatException() {
        // Напишите свое решение ниже
        int value = Integer.parseInt("100a0");       
 }
}

class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
 */

 /* Задача 2
  * class Answer {
    public int[] subArrays(int[] a, int[] b){
      // Введите свое решение ниже
      if (a.length != b.length) {
          return new int[]{0};
      }
      int[] c = new int[a.length];
      for (int i = 0; i < a.length; i++) {
          c[i] = a[i] - b[i];
      }
      return c;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
class Printer{ 
    public static void main(String[] args) { 
      int[] a = {};
      int[] b = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        a = new int[]{4, 5, 6};
        b = new int[]{1, 2, 3};
      }
      else{
        a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
      }     
      
      Answer ans = new Answer(); 
      String itresume_res = Arrays.toString(ans.subArrays(a, b));     
      System.out.println(itresume_res);
    }
}
  */

// Задача 3
class Answer {
    public int[] divArrays(int[] a, int[] b){
      // Введите свое решение ниже
      if (a.length != b.length) {
          return new int[]{0};
      }
      int[] c = new int[a.length];
      for (int i = 0; i < a.length; i++) {
          c[i] = a[i] / b[i];
      }
      return c;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
class Printer{ 
    public static void main(String[] args) { 
      int[] a = {};
      int[] b = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        a = new int[]{12, 8, 16};
        b = new int[]{4, 2, 4};
      }
      else{
        a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
      }     
      
      Answer ans = new Answer(); 
      String itresume_res = Arrays.toString(ans.divArrays(a, b));     
      System.out.println(itresume_res);
    }
}