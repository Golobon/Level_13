import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] name;
        int string;
        System.out.println("Введите колличество строк двумерного массива");
        string = scanner.nextInt();
        System.out.println("Введите колличество столбцов двумерного массива");
        int columns;
        columns = scanner.nextInt();
        name = new int[string][columns];
        int i = 0;
        int j = 0;
        while (i<=string-1) {
            System.out.println("Введи данные ячейки массива с индектом :" + "[" + i + "]" + "[" + j + "]");
            name[i][j] = scanner.nextInt();
            System.out.println("Ячейки массива с индексами :" + "[" + i + "]" + "[" + j + "]" + " присвоего знечение: " + name[i][j] + "\n");
            if (j == columns-1) { System.out.println("Строка массива с индектом " + "[" + j + "]" + " заполнена." + "\n"); }
            j++;
            if (j == columns && i == string-1) {break;}
            if (j == columns) {i++; j = 0;}
        }
        System.out.println("Вывод данных двумерного массива на экран: " + (Arrays.deepToString(name)));
    }
}