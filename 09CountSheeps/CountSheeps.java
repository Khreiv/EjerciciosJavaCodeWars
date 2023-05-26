package pruebas.nueva;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountSheeps {
    public static void main(String[] args) {
        System.out.println(countingSheep(3));
    }
    public static String countingSheep(int num) {
        return IntStream.rangeClosed(1, num)
                .mapToObj(i -> i + " sheep...")
                .collect(Collectors.joining());
    }
}
