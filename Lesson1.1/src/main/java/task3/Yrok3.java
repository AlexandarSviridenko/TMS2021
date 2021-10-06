package task3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Yrok3 {
    public static void main(String[] args) {
        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        //calculateSumOfDiagonalElements();
        countDevs(103);
        foobar(6);
        foobar(10);
        foobar(15);
        //  printMatrix();
        printPrimeNumbers();
    }

    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * далее создать одноменрый массив типа int размера прочитаного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        System.out.println("Введите размер массива");

        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[scanner.nextInt()];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(ints));
        // тут пишем логику
    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        // тут пишем логику
        if (number > 0) {
            number = number + 1;
        }
        if (number < 0) {
            number = number - 2;
        }
        if (number == 0) {
            number = number + 10;
        }
        return number;
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        // тут пишем логику
        int c = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                c++;
            }
        }
        return c;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        // тут пишем логику

        if (0 < (count % 10) && (count % 10) < 5) {
            System.out.println(count + " программиста");
        } else {
            System.out.println(count + " программистов");
        }


    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        // тут пишем логику
        if (number % 3 == 0) {
            System.out.println("foo");
        }
        if (number % 5 == 0) {
            System.out.println("bar");
        }
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("foobar");
        }
    }
    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
    //public static void calculateSumOfDiagonalElements() {
    //пишем логику и выводим результат используя System.out.println
// ЕЩЕ РАБОТАЮ НАД ЭТОЙ ЗАДАЧЕЙ, НЕ ЗАКОНЧЕНА. Не понял только насчет заполнения массива, заполнять рандомно с клавиатуры или при помощи команды рандом
    //Scanner console = new Scanner(System.in);
    //int x = console.nextInt();
    // int y = console.nextInt();

    // System.out.println("Введите размерность массива" + x, y);
    // int[][] mm = new int[x][y];
    // for (int x1 = 0; x1 < x; x1++) {
    //     for (int y1 = 0; y1 < x; y1++) {
    //     x1 = console.nextInt();
    //    }
    //  int y1 = console.nextInt();

    // Scanner console = new Scanner(System.in);
    // int x = console.nextInt();
    //int y = console.nextInt();
    // int[] a = new int[x][y];

    // Random random = new Random();

    // for (int i = 0; i < x; i++)
    //  {
    //      for (int j = 0; j < y; j++)
    //      {
    //          a[i] [j] = random.Next(100);
    //          Console.Write("{0,4}", a[i] [j]);
    //      }
    //     Console.WriteLine();
    //  }
    // }
    //}
    //}


    /**
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */
    public static void printMatrix() {
        // тут пишем логику
// ЕЩЕ РАБОТАЮ НАД ЭТОЙ ЗАДАЧЕЙ, НЕ ЗАКОНЧЕНА
        Scanner scanner = new Scanner(System.in);
int v,g;
        v = scanner.nextInt();
        g = scanner.nextInt();
        int[][] ints = new int[v][g];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100);
            if ( i % 3 == 0) {
                System.out.println("+");
            }
            if (i % 7 == 0) {
                System.out.println("-");
            }
            else {System.out.println("*");}
        }
    }





    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {


            int x, y;
            for (x = 2; x < 1001; x++) {
                y = 0;
                for (int i = 1; i <= x; i++) {
                    if (x % i == 0)
                        y++;
                }
                if (y <= 2)
                    System.out.println(x);

            }
        }
    }
