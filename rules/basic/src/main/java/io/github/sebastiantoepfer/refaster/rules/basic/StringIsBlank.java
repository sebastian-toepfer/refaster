package io.github.sebastiantoepfer.refaster.rules.basic;

import com.google.errorprone.refaster.annotation.AfterTemplate;
import com.google.errorprone.refaster.annotation.AlsoNegation;
import com.google.errorprone.refaster.annotation.BeforeTemplate;

/**
 * stupid copied from https://errorprone.info/docs/refaster
 *
 * @author sebastian
 */
public class StringIsBlank {

    @BeforeTemplate
    boolean equalsEmptyString(final String string) {
        return string.trim().isEmpty();
    }

    @AfterTemplate
    @AlsoNegation
    boolean optimizedMethod(final String string) {
        return string.isBlank();
    }
}
