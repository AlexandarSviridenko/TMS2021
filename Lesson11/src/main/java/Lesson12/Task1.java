package Lesson12;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String args[]) {
        StringBuffer text = new StringBuffer("sndsAdnndfAndnBmmdB");
        Pattern pattern = Pattern.compile("A.+B");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}

//Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения сивола(B).