package it.sevenbits.course.entities;

/**
 *
 * @param <T> type of array
 */
public class Array <T> {

    private T[] array;

    /**
     *
     * @param arr array of T elements
     */
    public void set(final T[] arr) {
        this.array = arr;
    }

    /**
     *
     * @return an array of T elements
     */
    public T[] get() {
        return this.array;
    }
}
