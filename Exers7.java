package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Exers7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Количесво элементов >> ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 200 - 100);
        }
        System.out.println(Arrays.toString(arr));
        SelectionSort(arr);
    }

    static void SelectionSort(int[] array) {
        int nmin;
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            nmin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[nmin]) {
                    nmin = j;
                }
            }
            if (i != nmin) {
                temp = array[i];
                array[i] = array[nmin];
                array[nmin] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}