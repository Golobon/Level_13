package Lecture8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Solution8 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array);
        for (int x : array) { System.out.println(x); }
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
        int num = 0;
        for (int i = 0, j = array.length-1; i < j; i++, j--) {
            num = array[i];
            array[i] = array[j];
            array[j] = num;
        }
    }
}

