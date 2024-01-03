package com.telran.algorithms;

import java.util.Arrays;

public class Dynamic {
    public static void main(String[] args) {
        int sum = 37;
        int[] arr = {1, 3, 4, 8, 11, 13};
        int[] result = new int[sum + 1];

        for (int i = 0; i < arr.length; i++) {
            result[arr[i]] = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (result[arr[i] + arr[j]] == 0)
                    result[arr[i] + arr[j]] = arr[j];
            }
        }
        System.out.println(Arrays.toString(result));

        int searchKey = 8;
        int searchResult = findElement(result, searchKey);
        if (searchResult != -1) {
            System.out.println("Элемент " + searchKey + " найден на позиции " + searchResult);
        } else {
            System.out.println("Элемент " + searchKey + " не найден");
        }

        int indexToRemove = 4;
        if (removeElement(result, indexToRemove)) {
            System.out.println("Элемент на позиции " + indexToRemove + " успешно удален");
        } else {
            System.out.println("Не удалось удалить элемент на позиции " + indexToRemove);
        }
        System.out.println(Arrays.toString(result));
    }

    public static int findElement(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static boolean removeElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            return false;
        }
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        return true;
    }
}
