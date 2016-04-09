package it.sevenbits.course.bootstrap;

import it.sevenbits.course.entities.Array;
import it.sevenbits.course.reverse.Reverse;

/**
 * <p>Bootstrap Class</p>
 * <p>Entry point</p>
 */
final class Bootstrap {

    private Bootstrap(){
    }

    /**
     * <p>Main method</p>
     * @param args incoming arguments
     */
    public static void main(final String[] args) {

        Object[] arrayObj;
        Array array = new Array();

        array.set(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});

        arrayObj = array.get();

        System.out.println("Start array");
        for (Object element : arrayObj) {
            System.out.print(element + " ");
        }

        System.out.println();
        Reverse reverse = new Reverse();
        reverse.reverseArray(array.get());

        System.out.println("Reverse array");
        for (Object element : arrayObj) {
            System.out.print(element + " ");
        }
    }
}
