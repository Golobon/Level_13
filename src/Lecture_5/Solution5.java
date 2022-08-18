package Lecture_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution5 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(bR.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        result.forEach(System.out::println);// Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String>listStr = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            listStr.add(list.get(i));
            listStr.add(list.get(i));
        }
        return listStr;
    }
}
