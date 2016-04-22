package it.sevenbits.course.reverse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import it.sevenbits.course.entities.Array;

public class ReverseTest {

    private Reverse reverse;

    @Before
    public void setup() {
        reverse = new Reverse();
    }

    @Test
    public void testReverseForIntegers() throws NullPointerException {
        Integer[] testArray = {1, 2, 3, 4, 5};
        Integer[] resultArray = {5, 4, 3, 2, 1};

        Array array = new Array();
        array.setArray(testArray);

        reverse.reverseArray(array);
        Assert.assertArrayEquals(resultArray,testArray);
    }

    @Test
        public void testReverseForNull() {
        reverse.reverseArray(null);
    }
}
