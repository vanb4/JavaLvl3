package Lesson1.homework1;

public class SwapElements {
    public static void main(String[] args) {

        String[] arrayOfStrings = {"1", "2", "3", "4"};

        for (String arrayOfString : arrayOfStrings) {
            System.out.print(arrayOfString + " ");
        }

        System.out.println();

        swap(arrayOfStrings, 3, 5);

        swap(arrayOfStrings, 2, 3);

        for (String arrayOfString : arrayOfStrings) {

            System.out.print(arrayOfString + " ");
        }

    }

    public static void swap(Object[] arr, int indexOne, int indexTwo) {

        if (indexOne > 0 && indexOne <= arr.length && indexTwo > 0 && indexTwo <= arr.length) {
            Object temp = arr[indexOne - 1];
            arr[indexOne - 1] = arr[indexTwo - 1];
            arr[indexTwo - 1] = temp;

        } else {

            System.out.println("Число не входит диапазон индексов массива"  + arr.length);
        }

    }
}
