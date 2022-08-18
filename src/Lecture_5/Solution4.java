package Lecture_5;

import java.util.ArrayList;

public class Solution4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i).contains("именно"))) {
                list.add(i + 1, "именно");
                i++;
            } else if (i == list.size() - 1 && !(list.get(i).contains("именно"))){
                list.add("именно");
            }
        }
        for (String result : list){
            System.out.println(result);
        }
    }
}
