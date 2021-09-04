package com.kyle;

public class Main {

    public static void main(String[] args) {

        int[] num = new int[10];

        num[0] = 15;
        num[1] = 69;
        num[2] = 1;
        num[3] = 10;
        num[4] = -50;
        num[5] = 320;
        num[6] = 63;
        num[7] = 58;
        num[8] = 26;
        num[9] = 13;

        System.out.println("Before Selection sort:");
        printArrayElements(num);

        bubbleSort(num);

        System.out.println("\n\nAfter Selection sort:");
        printArrayElements(num);

    }

    private static void bubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i]  <  arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr)
    {
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++)
            {
               if (arr[i] < arr[smallestIndex])
               {
                   smallestIndex = i;
               }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
