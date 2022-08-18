package Lecture_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution6 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(bR.readLine());
        }

        ArrayList<Integer> int1 = new ArrayList<>();
        for (String s : list) { int1.add(s.length()); }
        Collections.sort(int1);

        for (int i = 0; i < list.size(); i++) {
            if (int1.get(i) != list.get(i).length()) {
                System.out.println(list.indexOf(list.get(i)));
                break;
            }
        }
    }
}
