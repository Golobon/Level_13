package Lecture8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>listStr = new ArrayList<>();
        while (true) {
            String str = reader.readLine();
            if(str.equals("end")){ break; }
            listStr.add(str);
        }
        listStr.forEach(System.out::println);
    }
}
