package Lecture8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        makeList(n, m).forEach(System.out::println);
    }

    public static ArrayList<String> makeList(int n, int m) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < n; i++) {
            String str = reader.readLine();
            list.add(str);
        }
        int k = 0;
        for (int j = 0; j < m; j++) {
            list.add(list.remove(k));
        }
        return list;
    }
}
