import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.print('\u231C');
        for (int i = 0; i < 50; i++) {
            System.out.print('\u203E');
        }
        System.out.println('\u231D');
        System.out.println('\u2758' + " Введите \"1\", чтобы узнать прозвище кролишка.      " + '\u007C');
        System.out.println('\u2758' + " Введите \"2\", чтобы узнать кто такой кролилапый ку-" + '\u007C' + "\n" +
                           '\u2758' + " рлыкот.                                           "   + '\u007C');
        System.out.println('\u2758' + " Введите \"3\", чтобы кролик мявкнул.                " + '\u007C');
        System.out.println('\u2758' + " Введите \"4\", чтобы создать кроля.                 " + '\u007C');
        System.out.println('\u2758' + " Введите \"0\", для завершения программы.            " + '\u007C');
        System.out.print("" + '\u231E');
        for (int i = 0; i < 50; i++) {
            System.out.print('\u005F');
        }
        System.out.println('\u231F');
        String input = scan();
        if (input.equals("0") || input.equals("1")|| input.equals("2") || input.equals("3") || input.equals("4")){
        switch (input) {
            case "1" -> info_1();
            case "2" -> info_2();
            case "3" -> info_3();
            case "4" -> createKrol();
            case "0" -> finish();
        }
        }
        else{
            System.out.println("\nКроляш не примет ничего, кроме цифры от 0 до 4 включи-\n" +
                               "тельно. См. ниже...\n");
            menu();
        }
    }

    public static void info_1() {
        System.out.println("Какими только именами на называют этого\n" +
                           "удивительного пушного зверя: лапик, ла-\n" +
                           "пундрик, кролилапик, заюняш и т.п. Пере-\n" +
                           "числять их все не имеет смысла.\n");
        backToMenu();
        }

    public static void info_2() {
        System.out.println("Это удивительное существо обитает на 9-м\n" +
                           "этаже многоквартирного дома по ул Комму-\n" +
                           "наров, д. 270. Оно часто бывает ворчливо\n" +
                           "и имеет вспыльчивый, порой свирепый нрав.\n" +
                           "Однако в глубине души курлыкотик большой\n" +
                           "добряк, который заслуживает вашего внимания.\n" +
                           "\n" +
                           "P.S. Любит, когда его гладят по лапке :)\n" +
                           "\n");
        backToMenu();
    }

    public static void info_3() {
        System.out.println("Кроль выпрямляется и гордо произносит: \"Мяфк!\"...\n");
        backToMenu();
    }

    public static void createKrol() {
        List<String> list = new ArrayList<>(3);
        System.out.println("Какого цвета глазки у Кроля?");
        list.add(scan());
        System.out.println("Какого цвета лапки Кроля?");
        list.add(scan());
        System.out.println("Какого цвета шерстка Кроля?");
        list.add(scan());
        System.out.println("Итак, у нас получился такой Кроль:\n" +
                "\nЦвет глаз: " + list.get(0) + "\n" +
                "Цвет лапок: " + list.get(1) + "\n" +
                "Цвет шерстки: " + list.get(2) + "\n" +
                "\n" + "А вот и сам Кроль: " + "\n\n" +
               "  (\\…/)" + "\n" +
               " (=’;'=)" + "\n" +
               "(”).–.(”)" + "\n");
        backToMenu();
    }

    public static void finish() {
        System.out.println("\"Всего хорошего!\", - говорит кролилап и машет крысолапкой...");
    }

    public static String scan() {
        String input = new Scanner(System.in).nextLine();
        return input;
    }

    public static void backToMenu() {
        System.out.print('\u231C');
        for (int i = 0; i < 50; i++) {
            System.out.print('\u203E');
        }
        System.out.println('\u231D');
        System.out.println('\u2758' + " Чтобы продолжить нажмите \"1\", чтобы выйти - \"0\"   " + '\u007C');
        System.out.print("" + '\u231E');
        for (int i = 0; i < 50; i++) {
            System.out.print('\u005F');
        }
        System.out.println('\u231F' + "\n");
        String input = scan();
        switch (input) {
        case "0" -> finish();
        case "1" -> menu();
    }
        if(!(input.equals("0")) && !(input.equals("1"))) {
        System.out.println("Кроль негодует. Введи цифру 1 или 0, а то укусит за бочок.\n");
            backToMenu();
        }
    }
}
