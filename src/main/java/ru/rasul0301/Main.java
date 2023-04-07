package ru.rasul0301;


public class Main {
    public static void main(String[] args) {
        int a = 64;
        int b = 43;
        int c = 2147483647;
        double d = 1.5;
        char varChar = 'a';
        float varFloat = 12.7F;
        boolean varBoolean;

        System.out.println("Сложение a+b="+(a+b));
        System.out.println("Вычитание a-b="+(a-b));
        System.out.println("Умножение a*b="+(a*b));
        System.out.println("Деление a/b="+(a/b));
        System.out.println("Получение остатка от деления a%b="+(a%b)+ "\n");
        System.out.println("Логические операторы"+ "\n");
        System.out.print("a > (b + 50) ");
        System.out.println (a > (b + 50));
        System.out.print("a < (b * 5) ");
        System.out.println(a < (b * 5));
        System.out.print("a >= (b + 30) ");
        System.out.println(a >= (b + 30));
        System.out.print("a <= (b + 4) ");
        System.out.println(a <= (b + 4));
        System.out.print("a == (b + 21)");
        System.out.println(a == (b + 21));
        System.out.println(a != (b + 21));
        System.out.println(a != (b + 21));
        System.out.println(a == (b + 21));
        if (!((a % b) <= (Integer.MIN_VALUE + Integer.MAX_VALUE)) && varChar == 'a') {
            varBoolean = true;
        } else {
            varBoolean = false;
        }
        System.out.println(varBoolean);

        String bigSize = (d >= Integer.SIZE) ?"Integer is normal" : "Long is required";
        System.out.println(bigSize);
    }
}
