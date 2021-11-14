package Lesson12;

public class Task3 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("казак");
        StringBuilder stringBuilder2 = stringBuilder.reverse();
        if (stringBuilder2.compareTo(stringBuilder) == 0) {
            System.out.println(stringBuilder2);
        } else {
            System.out.println("Это не слово палиндром.");
        }
    }
}
//Работает не корректно и не могу исправить. По факту не доходит программа до else никогда, а почему не понимаю. Как исправить?

//В массиве находятся слова. Вывести на экран слова палиндромы (т.е которые читаются справа на лево и слева на право одинаково, например: заказ, казак, дед...)


//        int val = 0;
//        int j;
//        int i;
//
//        String[] myArray = new String[]{"Казак", "Шалаш", "Авто"};// объявление массива
//        String[] myArray1 = new String[]{};
//        return new StringBuilder(myArray[i]).reverse().toString();
//        for (i = 0; i <= myArray.length; i++) {
//            i = j;
//            val = myArray[i].compareTo(myArray1[j]);
//            if (val == 0) {
//                System.out.println(val);
//            }



