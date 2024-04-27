package io.github.sebastiantoepfer.refaster.java21;

import java.util.Arrays;
import java.util.List;

public class FirstAndLastInList {

    public static void main(final String... args) {
        final List<String> argumentList = Arrays.asList(args);
        System.out.printf("first arg %s%n", argumentList.get(0));
        System.out.printf("first arg %s%n", argumentList.iterator().next());
        System.out.printf("mid arg %s%n", argumentList.get(argumentList.size() - 2));
        System.out.printf("last arg %s%n", argumentList.get(argumentList.size() - 1));
    }

}
