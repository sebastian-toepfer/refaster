package io.github.sebastiantoepfer.refaster.rules.basic;

import com.google.errorprone.refaster.annotation.AfterTemplate;
import com.google.errorprone.refaster.annotation.BeforeTemplate;
import java.util.Optional;
import java.util.stream.Stream;

public class OptinalInStream {

    @BeforeTemplate
    <T> Stream<T> mapOptional(final Stream<Optional<T>> stream) {
        return stream.map(Optional::get);
    }

    @BeforeTemplate
    <T> Stream<T> mapOptionalWithFilter(final Stream<Optional<T>> stream) {
        return stream.filter(Optional::isPresent).map(Optional::get);
    }

    @AfterTemplate
    <T> Stream<T> optimizedMapping(final Stream<Optional<T>> stream) {
        return stream.flatMap(Optional::stream);
    }

}
