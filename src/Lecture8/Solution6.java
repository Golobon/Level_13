package Lecture8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] listInt = new int[20];

        for (int i = 0; i < 20; i++) {
            listInt[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(listInt);

        int maximum = listInt[listInt.length - 1];
        int minimum = listInt[0];

        System.out.print(maximum + " " + minimum);
    }
}
