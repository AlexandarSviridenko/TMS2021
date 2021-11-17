package Lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan;
        int countLatinWords = 0;
        String text;
        String[] textArray;
        ArrayList<String> wordsList = new ArrayList<>();
        System.out.println("Введите текст:");
        scan = new Scanner(System.in);
        text = scan.nextLine();
        textArray = text.split(" ");
        for (int i = 0; i < textArray.length; i++) {
            textArray[i] = textArray[i].replaceAll("[“:”,\"'`;()?_-]", "");
            if (findLatinOnly(textArray[i]) > 0) {
                wordsList.add(textArray[i]);
            }
        }
        for (String word : wordsList) {
            countLatinWords++;
        }
        System.out.print("Количество слов, содержащих только символы латинского алфавита \n" + countLatinWords);
    }

    private static int findLatinOnly(String word) {
        int length = 0;
        if (word.length() == word.replaceAll("[а-яА-Я\\d]", "").length()) {
            length = word.length();
        }
        return length;
    }
}


//4*)со звездочкой! Предложение состоит из нескольких слов, разделенных пробелами. Например: "One two three раз два три one1 two2 123 ".
//        *  Найти количество слов, содержащих только символы латинского алфавита.
//        *  Необходимо составить регулярное выражение и вызвать его в методе split(Regexp)
//        *  String str = "One two three раз два три one1 two2 123 ";
//        *  System.out.println(str.split("регулярное выражение").length);
//        *  Подсказка: тут надо использовать:
//        *  1) группы ()
//        *  2) | - оператор или
//        *  3) [] - группировки символов
//        *  4) +,* - квантификаторы
//        *
//        *  PS: Кто не сможет осилить регулярное выражение, то сделайте как сможете!