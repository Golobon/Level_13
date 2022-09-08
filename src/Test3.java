import java.util.Arrays;
import java.util.Comparator;

public class Test3 {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {3,6,9,4,7};
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 / o1;
            }
        });
        System.out.println(Arrays.toString(array));
    }
}