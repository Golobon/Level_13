package Lecture_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution6 {

    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(bR.readLine());
        }
        for (int i = 0; i < 13; i++) {
            strings.add(0, strings.remove(4));
        }

        for (String result : strings) {
            System.out.println(result);
        }
    }
}

