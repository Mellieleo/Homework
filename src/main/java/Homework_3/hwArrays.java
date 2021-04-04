package Homework_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class hwArrays {
    static int getRandomBinary() {
        int digit = (int) (Math.random() * 10);
        if (digit > 5) {
            digit = 1;
        } else {
            digit = 0;
        }
        return digit;
    }

    static void binaryArray(int length) {
        int[] binArr = new int[length];
        for (int i = 0; i < length; i++) {
            binArr[i] = getRandomBinary();
        }
        System.out.println(Arrays.toString(binArr));
        for (int i = 0; i < binArr.length; i++) {
            if (binArr[i] == 1) {
                binArr[i] = 0;
            } else {
                binArr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(binArr));
    }

    static void toHundred() {
        int[] oneToHundred = new int[100];
        for (int i = 0; i < oneToHundred.length; i++) {
            oneToHundred[i] = i + 1;
        }
        System.out.println(Arrays.toString(oneToHundred));
    }

    static void multiplyIfLessThanSix() {
        ArrayList<Integer> myArray = new ArrayList<>();
        Collections.addAll(myArray, 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1);
        System.out.println(myArray);
        for (int i = 0; i < myArray.size(); i++) {
            if (myArray.get(i) < 6) {
                myArray.set(i, (myArray.get(i) * 2));
            }
        }
        System.out.println(myArray);
    }

    static void diagonalOne() {
        int[][] matrix = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                if (i == j) {
                    matrix[i][j] = 1;
                }
                if (j == (9 - i)) {
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void initValue(int len, int initialValue) {
        int[] value = new int[len];
        for (int i = 0; i < len; i++) {
            value[i] = initialValue;
        }
        System.out.println(Arrays.toString(value));
    }

    public static void main(String[] args) {
        binaryArray(10);
        System.out.println();
        toHundred();
        System.out.println();
        multiplyIfLessThanSix();
        System.out.println();
        diagonalOne();
        System.out.println();
        initValue(9,2);
    }
}
