package algs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DuplicatesRemoverTest {

    @Test
    void removeDuplicatesFromNull() {
        // given
        DuplicatesRemover remover = new DuplicatesRemover();

        // when
        Object[] result = remover.removeDuplicates(null);

        // then
        Object[] expectedResult = null;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void removeDuplicatesOk() {
        // given
        DuplicatesRemover remover = new DuplicatesRemover();
        Object[] array = {"a", "a", "b", "c", "c"};

        // when
        Object[] result = remover.removeDuplicates(array);

        // then
        Object[] expectedResult = {"a", "b", "c"};
        assertSameElements(expectedResult, result);
    }

    @Test
    void removeDuplicatesNotFailed() {
        // given
        DuplicatesRemover remover = new DuplicatesRemover();
        Object[] array = {"a", "a", "b", "c", "c"};

        // when
        Object[] result = remover.removeDuplicates(array);

        // then
        Object[] incorrectExpectedResult = {"a", "d", "c", "f"};
        assertNotSameElements(incorrectExpectedResult, result);
    }

    private void assertSameElements(Object[] expected, Object[] actual) {
        if (expected == null || actual == null) {
            throw new AssertionError("One of arrays is null");
        }

        Assertions.assertEquals(expected.length, actual.length);

        for (int i = 0; i < expected.length; i++) {
            Object expectedElem = expected[i];
            Object actualElem = actual[i];
            Assertions.assertEquals(expectedElem, actualElem);
        }
    }

    private void assertNotSameElements(Object[] expected, Object[] actual) {
        if (expected == null || actual == null) {
            throw new AssertionError("One of arrays is null");
        }

        int minLength = expected.length < actual.length ? expected.length : actual.length;
        boolean hasDiff = false;

        for (int i = 0; i < minLength; i++) {
            Object expectedElem = expected[i];
            Object actualElem = actual[i];
            if (!expectedElem.equals(actualElem)) {
                hasDiff = true;
                break;
            }
        }

        Assertions.assertTrue(hasDiff);
    }
}
