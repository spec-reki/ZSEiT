//
//
//
//
//
//
//

import java.util.Scanner;

public class Program {
    private static int[] toSort;
    private static void gettingInput() {
        toSort = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < toSort.length; i++) {
            toSort[i] = input.nextInt();
        }
    }
    private static void printArr(int[] array) {
        for (int i :
                array) {
            System.out.println(i);
        }
    }

    private static int[] selectionSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1 ; i++)
        {
            int max = i;

            for (int j = i+1 ; j < n; j++)
            {
                if (arr[max] < arr[j])
                    max = j;
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    private static int highest_int(int[] arr) {
        int[] sortedArr = selectionSort(arr);
        return sortedArr[0];
    }

    public static void main(String[] args) {
        gettingInput();
        System.out.println("Sorted:");
        printArr(selectionSort(toSort));
        System.out.println("Highest value:");
        System.out.println(highest_int(toSort));
