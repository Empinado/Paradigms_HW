/*
Домашнее задание

Условие
На вход подается число n.

Задача
Написать скрипт в любой парадигме, который выводит на экран таблицу умножения всех чисел от 1 до n.
Обоснуйте выбор парадигм.

 */
public class Main {
    public static void main(String[] args) {

        for (int number : new int[]{3, 6, 7}) {
            System.out.println(getMultiplicationTable(number));
        }

    }

    public static String getMultiplicationTable(int targetNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            stringBuilder.append(targetNumber)
                    .append(" x ")
                    .append(i)
                    .append(" = ")
                    .append(targetNumber * i)
                    .append("\n");
        }
        return stringBuilder.toString();
    }
}

