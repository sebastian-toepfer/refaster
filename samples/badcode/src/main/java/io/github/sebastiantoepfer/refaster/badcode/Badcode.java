package io.github.sebastiantoepfer.refaster.badcode;

public class Badcode {

    boolean isEmpty(String s) {
        return s.length() == 0;
    }

    boolean isBlank(final String s) {
        return s.trim().isEmpty();
    }

}
