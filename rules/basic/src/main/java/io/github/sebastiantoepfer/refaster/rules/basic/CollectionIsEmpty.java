package io.github.sebastiantoepfer.refaster.rules.basic;

import com.google.errorprone.refaster.annotation.AfterTemplate;
import com.google.errorprone.refaster.annotation.AlsoNegation;
import com.google.errorprone.refaster.annotation.BeforeTemplate;
import java.util.Collection;

public class CollectionIsEmpty {

    @BeforeTemplate
    boolean equalsEmptyCollection(final Collection<?> collection) {
        return collection.size() == 0;
    }
    
    @AfterTemplate
    @AlsoNegation
    boolean optimizedMethod(final Collection<?> collection) {
        return collection.isEmpty();
    }

}
