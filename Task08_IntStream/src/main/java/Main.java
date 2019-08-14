import java.util.stream.IntStream;


/**
 * Created by Templar on 07.08.2019.
 */
public class Main {
    public static void main(String[] args) {
        int[] mass = {9, 15, -6, 0, 1, 87, 34, 65, 27};

        /*
        * Выводит среднее арифметическое элементов массива
        * */
        System.out.println("Average number: " + IntStream.of(mass)
                .average());

        /*
        * Выводит количество чисел больше 0
        * */
        System.out.println("Number of digits > 0: " + IntStream.of(mass)
                .filter((x) -> x > 0)
                .count());

        /*
        * Выводит количество чисел, которые равны 0
        * */
        System.out.println("Number of digits = 0: " + IntStream.of(mass)
                .filter((x) -> x == 0)
                .count());

        /*
        * Усножает элементы массива на число
        * */
        IntStream.of(mass)
                .map(x -> x * 2)
                .forEach(x -> System.out.print(x + " "));

        System.out.println();

        /*
        * Выводит значение минимального элемента и его индекс
        * */
        IntStream
                .range(0, mass.length)
                .reduce((x, y) -> mass[x] < mass[y] ? x : y)
                .ifPresent(x -> System.out.println("Min value: " + mass[x] + ", index: " + x));
    }
}
