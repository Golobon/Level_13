package Lecture_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Solution3 {
    private static ArrayList<Integer> integers = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            int val = Integer.parseInt(bR.readLine());
            integers.add(val);
        }
        System.out.println((Collections.max(integers)));
        System.out.println(new Date());
    }
}

