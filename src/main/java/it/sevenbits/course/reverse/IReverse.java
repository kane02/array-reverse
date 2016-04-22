package it.sevenbits.course.reverse;

import it.sevenbits.course.entities.IArray;

/**
 * providing methods for reverse classes
 */
public interface IReverse {
   /**
    *
    * @param array array of T objects
    * @param <T> <T> list/element type
    */
    <T> void reverseArray(IArray<T> array);
}
