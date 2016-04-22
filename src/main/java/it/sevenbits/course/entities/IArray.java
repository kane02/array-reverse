package it.sevenbits.course.entities;

/**
 * Interface for array
 * @param <T> type
 */
public interface IArray<T> {

    /**
     * Setter
     * @param array incoming arg
     */
    void setArray(final T[] array);

    /**
     * getter
     * @return array of T elements
     */
    T[] getArray();
}
