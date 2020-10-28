package ru.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumByteShort((byte)10, (short)137));
        System.out.println(multIntLong(10, (long)137));
        System.out.println(getMaxNumber(10, 137));
        System.out.println(isCharA('B'));
        System.out.println(isCharNumber('1'));
        printBin();
    }
    /*
    4. Написать публичный метод принимающий 2 параметра: первый типа byte и второй типа short.
    Метод должен возвращать сумму значений параметров.
    Тип возвращаемого значения должен быть byte.
     */
    public static byte sumByteShort(byte byte_value, short short_value){
        return (byte) (byte_value+short_value);
    }

    /*
    5. Написать публичный метод принимающий 2 параметра: первый типа int и второй типа long.
    Метод должен возвращать произведение значений параметров.
    Тип возвращаемого значения int.
     */
    public static int multIntLong(int int_value, long long_value){
        return (int) (int_value * long_value);
    }
    /*
    6. Написать метод getMaxNumber принимающий 2 параметра: int и int.
    Метод должен сравнить переданные параметры между собой и вернуть максимальный.
    Для решения необходимо использовать IF или тернарный оператор ?:
     */
    public static int getMaxNumber(int a, int b){
        return a > b ? a : b;
    }
    /*
    7. Написать метод isCharA принимающий 1 параметр типа char.
    Если передана буква 'А', то возвращать true, а в остальных случаях false
     */
    public static boolean isCharA(char a){
        return a == 'A';
    }
    /*
    8. Написать метод isCharNumber принимающий 1 параметр типа char.
    Если передано число, то вернуть true, а в остальных случаях false
     */
    public static boolean isCharNumber(char a){
        return Character.isDigit(a);
    }
    /*
    9. Написать метод выводящий на экран в цикле бинарное представление чисел от 0 до 30.
    Для вывода бинарного представления использовать Integer.toBinaryString().
    Без входных параметров и не возвращающая ничего.
     */
    public static void printBin(){
        for(int i=0; i<=30; i++)
        {
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
