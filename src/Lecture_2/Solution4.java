package Lecture_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution4 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> array = new ArrayList<>();
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        for (int i = 0; i < 5; i++) {
            String str = bR.readLine();
            array.add(str);
            if (result == ""){
                result = array.get(0);
            } else if (result.length() > array.get(i).length()) {
                result = array.get(i);
            }
        }
        for (String str1 : array) {
            if (str1.length() == result.length()) {
                System.out.println(str1);
            }
        }
    }
}

