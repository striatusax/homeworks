//import java.io.PrintStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //вызвать методы из метода main
        //1
        printThreeWords();
        //2
        checkSumSign();
        //3
        printColor();
        //4
        compareNumbers();
        //5
        System.out.println(checkSumRange(5,10));
        //6
        checkNumberSignAndPrint(10);
        //7
        System.out.println(checkNumberSign(0));
        //8
        printMultiple("Повторить ещё раз", 1);
        //9
        System.out.println(checkYearIsLeap(2000));
        //10
        arrayReplacer();
        //11
        arrayFiller();
        //12
        arrayMultiply();
        //13
        quadArray();
        //14
        inpArray(8, 5);
    }

    // 1. Создать метод printThreeWords(), который при вызове должен напечатать в столбец
    // три слова: Orange, Banana, Apple.
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2. Создать метод checkSumSign(), в теле которого объявляются две int переменные a и b с любым значениями.
    // Метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
    // то вывести в консоль сообщение "Сумма положительная", в противном случае - "Сумма отрицательная".
    public static void checkSumSign(){
        int a = 2;
        int b = -3;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3. Создать метод printColor(), в теле которого задать int переменную value с любым значением.
    // Если value меньше или равна 0, то в консоль метод должен вывести сообщение "Красный".
    // Если лежит в пределах от 0 до 100(включительно), то - "Желтый". Если больше 100 - "Зеленый".
    public static void printColor() {
        int value = 1010;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4. Создать метод compareNumbers(), в теле которого объявить две переменные a и b с любыми значениями.
    // Если a больше или равно b, то выводит в консоль сообщение a >= b. Если меньше, то - "a < b".
    public static void compareNumbers() {
        int a = 4;
        int b = 4;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5. Создать метод checkSumRange, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    // в пределах от 10 до 20(включительно), если да, то возвращает true. Если нет - false.
    public static boolean checkSumRange(int num1, int num2) {
        return (num1 + num2 >= 10 && num1 + num2 <= 20);
    }

    // 6. Создать метод checkNumberSign, который на вход принимает целое число. Если число положительное или равно 0,
    // то вывести в консоль сообщение "Число положительное", а если отрицательное - "Число отрицательное".
    public static void checkNumberSignAndPrint(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // 7. Создать метод checkNumberSign, который принимает на вход целое число. Если число отрицательное,
    // то вернуть true. Если положительное или равно 0 - false.
    public static boolean checkNumberSign(int number) {
        return number < 0;
    }

    // 8. Создать метод printMultiple, который на вход принимает строку и целое число.
    // Выводит в консоль сообщением строку указанное в числе число раз.
    public static void printMultiple(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    // 9. Создать метод checkLeapYear, который на вход принимает год и определяет високосный ли он.
    // Возвращает true, если год високосный. Если не високосный - false.
    public static boolean checkYearIsLeap(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 != 0 && year % 4 == 0) {
            return true;
        }
        return false;
    }

    // 10. Задать целочисленный массив [1,1,1,0,0,0,1,1,1], состоящий из 0 и 1 с помощью цикла
    // и условия заменить 0 на 1, а 1 на 0.
    public static void arrayReplacer() {
        int[] array = {1, 1, 1, 0, 0, 0, 1, 1, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));

    }

    // 11. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1, 2, 3... 100.
    public static void arrayFiller() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    // 12. Задать массив [1,5,3,2,11,4,5,2,4,8,9,1]. Обработать массив циклом и числа меньше 6 умножить на 2.
    public static void arrayMultiply() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // 13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью циклов заполнить массив.
    public static void quadArray() {
        int counter = 1;
        int[][] table = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 14. Создать метод inputArray, принимающий на вход два аргумента - len и initialValue.
    // Метод возвращает одномерный массив типа int длиной len и значением initialValue в каждой ячейке.
    public static void inpArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));
    }

}