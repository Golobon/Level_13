package Lecture_5;

import java.util.ArrayList;

public class Solution3 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("вода");
        strings.add("лика");


        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //ArrayList<String> str = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).contains("л") && !(strings.get(i).contains("р"))) {
                strings.add(i, strings.get(i));
                i++;
            } else if (strings.get(i).contains("р") && !(strings.get(i).contains("л"))) {
                strings.remove(i);
                i--;
            }
        }
        //strings.addAll(str);
        return strings;
    }
}
