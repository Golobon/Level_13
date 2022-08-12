package Lecture_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution5 {
    public static ArrayList <String> strings;
    public static void main(String[] args) throws Exception {
        strings  = new ArrayList<String>();
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        int min = 0;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            String str = bR.readLine();
            strings.add(str);
            if (min == 0){
                min = strings .get(0).length();
            }
            else if (min > strings .get(i).length()) {
                min = strings .get(i).length();
            }
            if (max == 0){
                max = strings .get(0).length();
            } else if (max < strings .get(i).length()) {
                max = strings .get(i).length();
            }
        }
        for (String str1 : strings ) {
            if (str1.length() == min) {
                System.out.println(str1);
                break;
            } else if (str1.length() == max) {
                System.out.println(str1);
                break;
            }
        }
    }
}

