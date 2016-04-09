package it.sevenbits.course.reverse;

/**
 * providing methods for reverse classes
 */
public interface IMyReverse{
   /**
    *
    * @param array array of T objects
    * @param <T> <T> list/element type
    */
    <T> void reverseArray(final T[] array);
}
