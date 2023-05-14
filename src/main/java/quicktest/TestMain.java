package quicktest;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TestMain {

    public static void main(String[] args) {
        String[] ASFF_SECURITYHUB_ENTITY_IDS = IntStream
            .range(28, 103)
            .filter(v -> v != 65)
            .mapToObj(i -> "e" + i)
            .toArray(String[]::new);


        Arrays.stream(ASFF_SECURITYHUB_ENTITY_IDS).forEach(System.out::println);
    }

}
