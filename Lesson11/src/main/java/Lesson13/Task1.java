package Lesson13;

public class Task1 {

    public static void main(String[] args) {
        int a;
        String[] array = new String[]{"казаки", "карусель", "море"};
        for (String arrays : array) {
            a = arrays.length();
            String fin = arrays.substring((a - 1) / 2, ((a - 1) / 2) + 2);
            System.out.println(fin);

        }
    }
}
