package io.github.sebastiantoepfer.refaster.rules.java21;

import com.google.errorprone.refaster.annotation.AfterTemplate;
import com.google.errorprone.refaster.annotation.BeforeTemplate;
import java.util.List;

public class ListFirstElement {

    @BeforeTemplate
    <T> T firstElementOfList(final List<T> list) {
        return list.get(0);
    }

    @BeforeTemplate
    <T> T firstElementOfListWithIterator(final List<T> list) {
        return list.iterator().next();
    }

    @AfterTemplate
    <T> T optimizedFirstElementOfList(final List<T> list) {
        return list.getFirst();
    }
}
