package it.sevenbits.course.reverse;


import it.sevenbits.course.entities.IArray;

/**
 * <p>Provides reversing for arrays</p>
 */
public class Reverse implements IReverse {
    /**
     *
     * @param array array of T objects
     * @param <T> list/element type
     *
     */
    public <T> void reverseArray(final IArray<T> array)  throws NullPointerException {
        try {
            T[]tempArray = array.getArray();
            int length = tempArray.length;
            T intermediateValue;

            for (int i = 0; i < length / 2; i++) {
                intermediateValue = tempArray[i];
                tempArray[i] = tempArray[length - i - 1];
                tempArray[length - i - 1] = intermediateValue;
            }
            array.setArray(tempArray);
        } catch (NullPointerException e) {
           System.out.println("Error of null argument of array");
        }
    }
}

