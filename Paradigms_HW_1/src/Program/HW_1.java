package Program;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HW_1 {

    public static void main(String[] args) {

   /*
    Задача №1.
    Дан список целых чисел numbers. Необходимо написать в императивном стиле процедуру для
    сортировки числа в списке в порядке убывания. Можно использовать любой алгоритм сортировки.
    */

        //Создаем и заполняем массив.
        int size = 4;
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = -size; i < size + 1; i++) {
            array.add(i);
        }

        System.out.println("Массив целых чисел: " + array);

        int tmp;
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = 0; j < array.size() - 1; j++) {
                if (array.get(j) < array.get(j + 1)) {
                    tmp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, tmp);
                }
            }
        }

        System.out.println("Отсортированный в порядке убывания массив целых чисел: " + array + "\n");

        /*
    Задача №2.
    Написать точно такую же процедуру, но в декларативном стиле
     */

        int size2 = 5;
        ArrayList<Integer> array2 = new ArrayList<>();
        for (int i = -size2; i < size2 + 1; i++) {
            array2.add(i);
        }

        System.out.println("2 Массив целых чисел: " + array2);

        Collections.sort(array2, Collections.reverseOrder());

        System.out.println("2 Отсортированный в порядке убывания массив целых чисел: " + array2);


    }


}
