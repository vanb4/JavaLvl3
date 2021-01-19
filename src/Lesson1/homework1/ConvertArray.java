package Lesson1.homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//2. Написать метод, который преобразует массив в ArrayList.


public class ConvertArray {
    public static void main(String[] args) {
        String[] arrStr = {"7", "0", "6", "7","67"};

        List <String> listStr = convert(arrStr);

        for (String str : listStr) {
            System.out.print(" " + str);
        }

        listStr.add("7");

        System.out.println();

        for (String str : listStr){
            System.out.print(" " + str);
        }

    }

    private static <T> ArrayList<T> convert(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

}
