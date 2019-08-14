import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Templar on 09.08.2019.
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(4,5,-6,4,5,3,4,2,4,5,7));

        list.stream()
                .collect(Collectors
                        .groupingBy(x -> x, Collectors.counting()))
                .forEach((s, count) -> System.out.println(s + ": " + count));
    }
}
