package io.github.sebastiantoepfer.refaster.badcode;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Badcode {

    boolean isEmpty(String s) {
        return s.length() == 0;
    }

    boolean isBlank(final String s) {
        return s.trim().isEmpty();
    }

    boolean isEmpty(Collection<?> c) {
        return c.size() == 0;
    }

    boolean isEmpty(List<?> c) {
        return c.size() == 0;
    }

    boolean isNotEmpty(Set<?> c) {
        return c.size() != 0;
    }

}
