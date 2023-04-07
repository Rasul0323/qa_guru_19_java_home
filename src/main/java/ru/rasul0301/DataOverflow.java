package ru.rasul0301;

public class DataOverflow {
    public static void main(String[] args) {
        // byte (8 бит). Диапазон -128...127
        byte a = 127;
        for (int i = 0; i <200; i++)
            System.out.println("a = " + (byte) (a+i));
        // short (16 бит). Диапазон -32768...32767
        short b = 32767;
        for (int i = 0; i <33000; i++)
            System.out.println("b = " + (short) (b+i));
        // int (32 бит). Диапазон -2147483648...2147483647
        int numberOneInt = 2147483630;
        int numberTwoInt = 100000;
        int sumInt = numberOneInt + numberTwoInt;
        System.out.println("Сумма чисел 2147483630 и 100000 типа int равна " + sumInt);
        // long (64 бит). Диапазон -9223372036854775808...9223372036854775807
        long numberOneLong = -92233720368547758L;
        long numberTwoLong = -9223372036854775808L;
        long differenceLong = numberOneLong - numberTwoLong;
        System.out.println("Разница чисел -92233720368547758 и -9223372036854775808 типа long равна " + differenceLong);
    }
}