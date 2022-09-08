package Lecture_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution2 {
    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> divBy3 = new ArrayList<>();
    public static ArrayList<Integer> divBy2 = new ArrayList<>();
    public static ArrayList<Integer> others = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            int num = Integer.parseInt(bR.readLine());
            numbers.add(num);
            if (numbers.get(i) % 3 == 0 && numbers.get(i) % 2 == 0) {
                divBy2.add(numbers.get(i));
                divBy3.add(numbers.get(i));
            } else if (numbers.get(i) % 2 == 0) {
                divBy2.add(numbers.get(i));
            } else if (numbers.get(i) % 3 == 0) {
                divBy3.add(numbers.get(i));
            } else {
                others.add(numbers.get(i));
            }
        }
        System.out.println(numbers);

        System.out.println("\ndivBy3:");
        printList(divBy3);
        System.out.println("\ndivBy2:");
        printList(divBy2);
        System.out.println("\nothers:");
        printList(others);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int result : list) {
            System.out.println(result);
        }
    }
}
