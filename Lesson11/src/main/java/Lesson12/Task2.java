package Lesson12;

public class Task2 {

    public static void main(String args[]) {
        String Str = new String("Маша шагала с шариком");
        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.replace(Str.charAt(3), Str.charAt(0)));
    }
}

// Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0