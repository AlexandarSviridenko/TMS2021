import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
System.out.println("Введите четыре числа");
Scanner scanner = new Scanner (System.in);
int a = scanner.nextInt();
int b = scanner.nextInt();
int c = scanner.nextInt();
int d = scanner.nextInt();
       int f=0;
       if(a>0) { f=1;}
        if(b>0) { f=f+1;}
        if(c>0) { f=f+1;}
        if(d>0) { f=f+1;}

                        System.out.println("Положительных чисел всего:" + f);
                    }
                }

