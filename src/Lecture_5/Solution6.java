package Lecture_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution6 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(bR.readLine());
        }

        for (int i = 0; i < list.size(); i++) {
            if (i == list.size()-1){
                break;
            } else if (list.get(i+1).length() < list.get(i).length()) {
                System.out.println(list.indexOf(list.get(i+1)));
                break;
            }
        }
    }
}
