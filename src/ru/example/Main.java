package ru.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumByteShort((byte)10, (short)137));
        System.out.println(multIntLong(10, (long)137));
        System.out.println(getMaxNumber(10, 137));
        System.out.println(isCharA('B'));
        System.out.println(isCharNumber('1'));
        printBin();
        printIntValue();
        System.out.println(chatToInt('Q'));
        System.out.println(intToChar(81000));
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
    /*
     10. Написать метод выводящий бинарное представление Integer.MAX_VALUE и Integer.MAX_VALUE + 1.
     Для вывода бинарного представления использовать Integer.toBinaryString(). Без входных параметров и не возвращающая ничего.
     Покажет, что переполнение не вызывает ошибку и как это выглядет в памяти
     */
    public static void printIntValue(){
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString((Integer.MAX_VALUE + 1)));
    }
    /*
     11. Написать метод принимающий 1 параметр типа char и возвращающий его числовое представление.
     */
    public static int chatToInt(char char_value){
        return (int)char_value;
    }
    /*
     12. Написать метод принимающий 1 параметр типа int и возвращающий его представление в виде печатного символа
     */
    public static char intToChar(int int_value){
        return (char)int_value;
    }
}
