package it.sevenbits.course.reverse;


/**
 * <p>Provides reversing for arrays</p>
 */
public class Reverse implements IMyReverse {
    /**
     *
     * @param array array of T objects
     * @param <T> list/element type
     * @throws NullPointerException
     */
    public <T> void reverseArray(final T[] array)  throws NullPointerException {
        try {
            T intermediateValue;
            for (int i = 0; i < array.length / 2; i++) {
                intermediateValue = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = intermediateValue;
            }
        } catch (NullPointerException e) {
           System.out.println("Error of null argument of array");
        }
    }
}

