package it.sevenbits.course.entities;

/**
 *
 * @param <T> type of array
 */
public class Array <T> implements IArray<T> {

    private T[] array;

    /**
     * setter
     * @param array array of T elements
     */
    public void setArray(final T[] array) {
        this.array = array;
    }

    /**
     * getter
     * @return an array of T elements
     */
    public T[] getArray() {
        return this.array;
    }
}
