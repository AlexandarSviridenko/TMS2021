package task2;

import java.util.stream.IntStream;

public class HomeWork2 {
    public static void main(String[] args) {
        //Некоторые тесты для проверки задач.
        System.out.println(sum1(100, 200));
        System.out.println(sum2(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(56, 349));
        System.out.println(average(new int[]{0, -1, 3, -1, 5}));
        System.out.println(max(new int[]{1, 2, 3, 4, 5, 100, 99}));
        System.out.println(calculateHypotenuse(3, 4));

    }

    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int sum1(int a, int b) {
        return a + b;
    }

    public static int sum2(int a, int b) {
        long c = a + b;
        if (c > 2147483647) ;
        return -1;
    }


    public static int max(int a, int b) {
        int max;
        if (a >= b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }


    public static double average(int[] array) {
        double res;
        double sum = IntStream.of(array).sum();
        res = sum / array.length;
        return res;
    }

    public static int max(int[] array) {
        int maxNum = array[0];

        for (int j : array) {
            if (j > maxNum)
                maxNum = j;
        }
        return maxNum;
    }

    public static double calculateHypotenuse(int a, int b) {
        double h = 2;
        double c = Math.sqrt(Math.pow(a, h) + Math.pow(b, h));
        return c;
    }
}


