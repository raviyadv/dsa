package edu.data.structure.array;

public class AlternateElementsArray {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};
        iterativeApproach(array);
        recursivePrint(array, 0);

    }

    private static void iterativeApproach(int[] a) {
        for (int i = 0; i < a.length; i += 2) {
            System.out.println(a[i]);
        }
    }

    private static void recursivePrint(int[] arr, int index) {

        if (index >= arr.length) {
            return;
        }
        System.out.println(arr[index]);
        recursivePrint(arr, index += 2);
    }

}
