package io.github.sebastiantoepfer.refaster.rules.basic;

import com.google.errorprone.refaster.annotation.AfterTemplate;
import com.google.errorprone.refaster.annotation.AlsoNegation;
import com.google.errorprone.refaster.annotation.BeforeTemplate;

class StringIsEmpty {

    @BeforeTemplate
    boolean equalsEmptyString(final String string) {
        return string.equals("");
    }

    @BeforeTemplate
    boolean lengthEquals0(final String string) {
        return string.length() == 0;
    }

    @AfterTemplate
    @AlsoNegation
    boolean optimizedMethod(final String string) {
        return string.isEmpty();
    }

}
