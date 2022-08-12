package Lecture_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution3 {
    private static ArrayList<Integer> integers = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        for (int i = 0; i < 5; i++) {
            int val = Integer.parseInt(bR.readLine());
            integers.add(val);
            if (max < integers.get(i)) {
                max = integers.get(i);
            }
        }
        System.out.println(max);
    }
}

