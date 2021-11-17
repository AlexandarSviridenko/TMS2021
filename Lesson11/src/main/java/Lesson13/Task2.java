package Lesson13;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        List<String> word = Arrays.asList("cab, ccab, cccab");
        Pattern p = Pattern.compile("c");
        for (String words : word)
            if (p.matcher(words).find()) {
                System.out.println("\n" + words);


            }
    }
}

// не совсем понял условие, так нужно было решить задачу? ВОзник так же вопрос, почему каждое новое слово не выводится на новую строчку, хотя добавил "\n"?

//По  регулярным выражениям!
//     * 2) Дана строка "cab, ccab, cccab" Необходимо составить регулярное выражение, сделать класс Pattern, Matcher, вызвать метод find и вывести слова на консоль
//     * Должно вывести:
//     * cab
//     * ccab
//     * cccab