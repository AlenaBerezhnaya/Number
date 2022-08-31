import java.util.Scanner; // импорт класса Scanner для ввода информации с консоли
public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создание объекта класса Scanner
        System.out.println("Введите число a:");
        int a = sc.nextInt(); // nextInt() - считывание данных и преобразование в тип Int
        System.out.println("Введите число b:");
        int b = sc.nextInt();
        System.out.println("Введите число c:");
        int c = sc.nextInt();
        sc.close(); // закрытие объекта sc
        if (a==b&&b==c&&a==c) {System.out.println(a+" "+b+" "+c);}
        else if (a==b) {System.out.println(a+" "+b);}
        else if (b==c) {System.out.println(b+" "+c);}
        else if (a==c) {System.out.println(a+" "+c);}
        else {System.out.println("Решения нет");}

    }
}