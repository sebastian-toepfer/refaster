package io.github.sebastiantoepfer.refaster.rules.java17;

import com.google.errorprone.refaster.annotation.AfterTemplate;
import com.google.errorprone.refaster.annotation.BeforeTemplate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToList {

    @BeforeTemplate
    <T> List<T> collectToList(final Stream<T> stream) {
        return stream.collect(Collectors.toList());
    }

    @AfterTemplate
    <T> List<T> optimizedCollectToList(final Stream<T> stream) {
        return stream.toList();
    }

}
