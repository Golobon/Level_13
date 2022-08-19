package Lecture8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<String>();
        for (String string : strings) {
            if (string.length() % 2 == 0) {
                resultStrings.add(String.join(" ", string, string));
            } else {
                resultStrings.add(String.join(" ", string, string, string));
            }
        }

        for (String resultString : resultStrings) {
            System.out.println(resultString);
        }
    }
}
