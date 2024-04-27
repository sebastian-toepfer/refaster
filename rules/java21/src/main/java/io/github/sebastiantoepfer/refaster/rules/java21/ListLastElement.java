package io.github.sebastiantoepfer.refaster.rules.java21;

import com.google.errorprone.refaster.annotation.AfterTemplate;
import com.google.errorprone.refaster.annotation.BeforeTemplate;
import java.util.List;

public class ListLastElement {

    @BeforeTemplate
    <T> T lastElementOf(final List<T> list) {
        return list.get(list.size() - 1);
    }

    @AfterTemplate
    <T> T optimizedLastElementOf(final List<T> list) {
        return list.getLast();
    }

}
