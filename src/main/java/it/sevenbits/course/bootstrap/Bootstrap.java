package it.sevenbits.course.bootstrap;

import it.sevenbits.course.entities.Array;
import it.sevenbits.course.reverse.Reverse;

import java.util.Arrays;

/**
 * <p>Bootstrap Class</p>
 * <p>Entry point</p>
 */
final class Bootstrap {

    private static final Integer[] ARRAY = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    private Bootstrap(){
    }

    /**
     * <p>Main method</p>
     * @param args incoming arguments
     */
    public static void main(final String[] args) {

        Array array = new Array();
        array.setArray(ARRAY);

        System.out.println("Start array");
        System.out.println(Arrays.toString(array.getArray()));

        System.out.println();
        Reverse reverse = new Reverse();
        reverse.reverseArray(array);

        System.out.println("Reverse array");
        System.out.println(Arrays.toString(array.getArray()));
    }
}
