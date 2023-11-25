package io.github.sebastiantoepfer.refaster.badcode;

import java.util.Optional;
import java.util.stream.Stream;

public class BadOptinalInStream {

    Optional<String> findValue(final String value) {
        return Stream.of(Optional.of(value))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst();
    }

}
