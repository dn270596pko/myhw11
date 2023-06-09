package task4;

import java.util.stream.Stream;

public class LinearCongruentialGenerator {
    public static void main(String[] args) {
        Stream<Long> randomStream = generateRandomStream(25214903917L, 11L, (long) Math.pow(2, 48));
        randomStream.limit(10).forEach(System.out::println);
    }

    public static Stream<Long> generateRandomStream(long a, long c, long m) {
        return Stream.iterate(1L, n -> (a * n + c) % m);
    }
}
