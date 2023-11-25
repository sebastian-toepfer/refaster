package io.github.sebastiantoepfer.refaster.java17;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class CollectToList {

    List<String> collecttoList(final String value) {
        return Stream.of(value).collect(Collectors.toList());
    }

    List<String> collectToListStaticImport(final String value) {
        return Stream.of(value).collect(toList());
    }

}
