package Lecture_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String str = bR.readLine();
            list.add(str);
        }
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        for (int i = list.size(); i-- > 0;) {
            System.out.println(list.get(i));
        }
    }
}
