package ru.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumByteShort((byte)10, (short)137));
    }
    /*
    4. Написать публичный метод принимающий 2 параметра: первый типа byte и второй типа short.
    Метод должен возвращать сумму значений параметров.
    Тип возвращаемого значения должен быть byte.
     */
    public static byte sumByteShort(byte byte_value, short short_value){
        return (byte) (byte_value+short_value);
    }
}
