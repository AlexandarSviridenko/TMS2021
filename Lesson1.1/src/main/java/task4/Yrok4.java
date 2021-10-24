package task4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Yrok4 {


    public static void main(String[] args) {


////        Задачи:
////         1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
////   сколько амеб будет через 3, 6, 9, 12,..., 24 часа


        for (int i = 0; i <= 24; i += 3) {
            System.out.print(fission(1, i) + " ");
        }
        System.out.println();


//        2) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.


        System.out.println(summ(7, 6));
        System.out.println(summ(3, 0));
        System.out.println(summ(3, -1));
        System.out.println(summ(-3, -1));
        System.out.println();


//        3) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *

//A
        String [][] myArray = new String[4][4];
        String a1[][] = {{" "," "," ", "*"},{" "," ", "*", "*"}, {" ", "*", "*", "*"}, {"*","*","*","*"}};

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + a1[i][j] + " ");
            }
            System.out.println();
        }

//        //C
        String [][] myArrayc = new String[4][4];
        String c1[][] = {{"*","*","*","*"}, {" ", "*", "*", "*"},{" "," ", "*", "*"}, {" "," "," ", "*"} };

        System.out.println();
        for (int i = 0; i < 4; i++) {  //идём по строкам
            for (int j = 0; j < 4; j++) {//идём по столбцам
                System.out.print(" " + c1[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

        //b
        String [][] myArrayb = new String[4][4];
        String b1[][] = {{"*"," "," "," "}, {"*", "*", " ", " "},{"*","*", "*", " "}, {"*","*","*", "*"} };

        System.out.println();
        for (int i = 0; i < 4; i++) {  //идём по строкам
            for (int j = 0; j < 4; j++) {//идём по столбцам
                System.out.print(" " + b1[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

        //D
        String [][] myArrayd = new String[4][4];
        String d[][] = { {"*","*","*", "*"},{"*","*", "*", " "}, {"*", "*", " ", " "},{"*"," "," "," "} };

        System.out.println();
        for (int i = 0; i < 4; i++) {  //идём по строкам
            for (int j = 0; j < 4; j++) {//идём по столбцам
                System.out.print(" " + d[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

//        4)В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"

        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        if (x > 0) {
            System.out.println("Это положительное число");
        }
        if (x == 0) {
            System.out.println("Это  не положительное и не отрицательное число и 1 цифра");
        }
        if (x < 0) {
            System.out.println("Это отрицательное число");
        }

        if (x > 0) {
            int numberCounter = 10;
            boolean condition = true;
            int digitLength = 1;

            while (condition) {
                int numberRatio = x / numberCounter;
                if (numberRatio < 1) {
                    condition = false;
                } else {
                    digitLength++;
                    numberCounter *= 10;
                }
            }

            System.out.println(digitLength);
        }
        if (x < 0) {
            int c4 = x * (-1);
            int numberCounter = 10;
            boolean condition = true;
            int digitLength = 1;

            while (condition) {
                int numberRatio = c4 / numberCounter;
                if (numberRatio < 1) {
                    condition = false;
                } else {
                    digitLength++;
                    numberCounter *= 10;
                }
            }

            System.out.println(digitLength);
        }


//        5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).

        int [] a5 = new int [100];
        for (int j = 0; j<100; j++) {
            a5[j]= j+1;
            if (a5[j] % 2 !=0) {
                System.out.print(" " + a5[j]);
            }
        }
        System.out.println();
        int n = a5.length;
        int temp;
        for (int j = 0; j < n / 2; j++) {
            temp = a5[n - j - 1];
            a5[n - j - 1] = a5[j];
            a5[j] = temp;

        }
        for (int j = 0; j < a5.length; j++) {
            if (a5[j] % 2 != 0)
                System.out.print(" " + a5[j]);
        }
        System.out.println();

//        6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

        int[] mass = new int[12];
        Random rand = new Random();
        for (int i = 0; i < 12; i++) {
            mass[i] = rand.nextInt(15);
        }
        for (int i = 0; i < 12; i++) {
            System.out.println(mass[i] + "  ");
        }
        System.out.println();


        int c6 = 0 ;
        for (int i = 0; i < 12; i++) {
            if(mass[i]>c6){ c6=mass[i];}
        }
        System.out.println(c6);

        int g= 0;
        for (int i = 0; i < 12; i++) {
            if(mass[i]==c6){ g=i+1;}
        }
        System.out.println(g);


//        7) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.

        int[] mass7 = new int[21];
        Random rand7 = new Random();
        for (int i = 0; i < 20; i++) {
            mass7[i] = rand7.nextInt(20);
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(mass7[i] + "  ");
        }
        System.out.println();
        int c7 =0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                mass7[i] = 0;
            }
            System.out.print(mass7[i] + "  ");
        }
        System.out.println();
        System.out.println();

//        8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом

        int[] mass8 = {4,5,0,23,77,0,8,9,101,2};

        for (int i = 0; i < 10; i++) {
            System.out.print(mass8[i] + "  ");
        }
        System.out.println();
        int c8 = 0 ;

        for (int i = 0; i < 10; i++) {
            if(mass8[i]>c8){ c8=mass8[i];}
        }
        System.out.println(c8);

        int g8= 0;
        for (int i = 0; i < 10; i++) {
            if(mass8[i]==c8){ g8=i;}
        }


        int f=0;
        f= mass8[0];
        mass8[0]=c8;
        mass8[g8]=f;
        for (int i = 0; i < 10; i++) {
            System.out.print(mass8[i] + "  ");
        }


        System.out.println();
        System.out.println();


//        9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов


        int[] mass9 = new int[6];
        Random rand9 = new Random();
        for (int i = 0; i < 6; i++) {
            mass9[i] = rand9.nextInt(10);
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(mass9[i] + "  ");
        }
        System.out.println();

        boolean flag = true;

        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                if (mass9[i] == mass9[j]) {
                    System.out.print(" " + mass9[j]);
                    if (flag = false) {
                        System.out.println("повторяющиеся элементы");
                    }
                }
            }
        }
        if (flag = true) {
            System.out.println("нет повторяющихся элементов");
        }
        System.out.println();
        System.out.println();


//        10) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7


        int v = 4;
        int[][] a10 = new int[v][v];
        Random random10 = new Random();
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                a10[i][j] = random10.nextInt(50);
            }
        }
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {

                System.out.print(a10[i][j] + "   ");
            }
            System.out.println();
        }


        for (int i = 0; i < v; i++) {
            for (int j = i+1; j < v; j++) {
                int temp10 = a10[i][j];
                a10[i][j] = a10[j][i];
                a10[j][i] = temp10;
            }
        }


        System.out.println();
        System.out.println("Новая матрица");
        System.out.println("------");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.printf("%3d", a10[i][j]);
            }
            System.out.println();
        }


    }

    private static int multi(int a, int b) {
        int sum = 0;
        if (a != 0) {
            for (int i = 0; i < b; i++) {
                sum += a;
            }
        }
        return sum;
    }

    public static int fission(int start, int time) {
        return (int) (start * Math.pow(2, time / 3));
    }

    public static int summ(int a, int b) {
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        int result = 0;

        if (absA > absB) {
            result = multi(absA, absB);
        } else {
            result = multi(absB, absA);
        }
        if (a < 0 && b > 0 || b < 0 && a > 0) {
            return -result;
        }
        return result;
    }
}