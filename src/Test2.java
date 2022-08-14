import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List <String> list = new ArrayList();
        list.add(String.valueOf(2222));
        list.add("3");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        printstring(String.valueOf(list.get(0)));
        System.out.println(list.size());
    }

    public static void printstring(String list) {
        System.out.println(list.length());
    }
}
