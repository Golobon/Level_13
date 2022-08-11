package Lecture_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution2 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String iSR = bufferedReader.readLine();
            list.add(0, iSR);
        }
        for(String result:list){
            System.out.println(result);
        }
    }
}
