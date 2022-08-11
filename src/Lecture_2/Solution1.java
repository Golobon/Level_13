package Lecture_2;

import java.util.ArrayList;

public class Solution1 {
    public static ArrayList<String> list;

    public static void main(String[] args) {
        list = new ArrayList<>();
        list.add("Bob1");
        list.add("Bob2");
        list.add("Bob3");
        list.add("Bob4");
        list.add("Bob5");
        System.out.println(list.size());
        for (String list: list){
            System.out.println(list);
        }
    }
}
