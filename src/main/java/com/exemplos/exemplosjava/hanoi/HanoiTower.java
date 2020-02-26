package com.exemplos.exemplosjava.hanoi;

import java.util.Stack;

public class HanoiTower {

    private final Stack<Integer> source;
    private final Stack<Integer> destination;
    private final Stack<Integer> auxilary;

    private final int numberOfDisks;

    private String s;
    private String d;
    private String a;

    /**
     * I choose to use constructor because of Unit Test, I compare initial
     * source pole and last destination pole creates 3 poles source pole has
     * theNumberOfDisk disks destination and auxiliary pole has theNumberOfDisk
     * capacity but they are empty at first
     *
     * @param theNumberOfDisks
     */
    public HanoiTower(int theNumberOfDisks) {
        numberOfDisks = theNumberOfDisks;

        s = "S";
        d = "D";
        a = "A";

        source = new Stack<>();
        destination = new Stack<>();
        auxilary = new Stack<>();

        /*Bigger disks must be at the bottom*/
        for (int i = theNumberOfDisks; i >= 1; --i) {
            source.push(i);
        }
    }

    /**
     * The major function that does real job Takes the names of the poles and
     * solves Towers of Hanoi problem, with iteration
     *
     * @param diskSize ignore it because of Unit test
     * @param theSource the name of the source pole
     * @param theDestination the name of the destination pole
     * @param theAuxilary the name of auxiliary pole
     */
    public void doIterative(int diskSize, String theSource, String theDestination, String theAuxilary) {

        //Set the name of the poles(Stacks)
        setStackNames(theSource, theDestination, theAuxilary);

        int totalMoves = getTotalMoves(numberOfDisks);

        /*If number of disks is even, then interchange
	    destination pole and auxiliary pole */
        if (this.getNumberOfDisks() % 2 == 0) {
            swapStrings(d, a);
        }

        for (int i = 1; i <= totalMoves; ++i) {
            if (i % 3 == 1) {
                moveDiskBetweenTwoPoles(source, destination, s, d);
            } else if (i % 3 == 2) {
                moveDiskBetweenTwoPoles(source, auxilary, s, a);
            } else if (i % 3 == 0) {
                moveDiskBetweenTwoPoles(auxilary, destination, a, d);
            }
        }
    }

    /**
     * Moves one disk from the pole to another pole
     *
     * @param from the pole where we want to move the disk from
     * @param to the pole where we want to move the disk to
     * @param S The name of the source
     * @param D The name of the destination
     */
    private void moveDiskBetweenTwoPoles(Object from, Object to, String S, String D) {

        Integer pole1;
        Integer pole2;

        if (((Stack) from).isEmpty() && !((Stack) to).isEmpty()) {
            pole2 = (Integer) ((Stack) to).pop();
            ((Stack) from).push(pole2);
            moveDiskOutput(D, S, pole2);
        } else if (((Stack) to).isEmpty() && !((Stack) from).isEmpty()) {
            pole1 = (Integer) ((Stack) from).pop();
            ((Stack) to).push(pole1);
            moveDiskOutput(S, D, pole1);
        } else if (!((Stack) from).isEmpty() && !((Stack) to).isEmpty()) {
            pole1 = (Integer) ((Stack) from).pop();
            pole2 = (Integer) ((Stack) to).pop();

            if (pole1 > pole2) {
                ((Stack) from).push(pole1);
                ((Stack) from).push(pole2);
                moveDiskOutput(D, S, pole2);
            } else {
                ((Stack) to).push(pole2);
                ((Stack) to).push(pole1);
                moveDiskOutput(S, D, pole1);

            }
        }

    }

    /**
     * Similar to toString Method but this function does not return string
     * instead, puts the output to the screen immediately
     *
     * @param from the pole where we want to move the disk from
     * @param to the pole where we want to move the disk to
     * @param disk Disk number to move
     */
    private void moveDiskOutput(String from, String to, int disk) {
        System.out.printf("Move Disk %d From %s To %s\n", disk, from, to);
    }

    /**
     * Calculates number of necessary moves
     *
     * @param n is the number of disks
     * @return necessary number of moves
     *
     */
    private int getTotalMoves(int n) {
        return power(2, n) - 1;
    }

    /**
     * calculates base to power of top
     *
     * @param base
     * @param top
     * @return base to power of top
     */
    private int power(int base, int top) {
        int i = 0;
        int result = 1;

        for (i = 0; i < top; ++i) {
            result *= base;
        }

        return result;
    }

    /**
     * Swaps two String objects
     *
     * @param first the first String to swap
     * @param second the second String to swap
     */
    private void swapStrings(String first, String second) {
        String temp = first;
        first = second;
        second = temp;
    }

    /**
     * Getter method for numberOfDisks
     *
     * @return numberOfDisks
     */
    private int getNumberOfDisks() {
        return this.numberOfDisks;
    }

    /**
     * Getter method for destination Stack For Unit Test
     *
     * @return destination
     */
    public Stack getDestination() {
        return destination;
    }

    /**
     * Getter method for source Stack For Unit Test
     *
     * @return source
     */
    public Stack<Integer> getSource() {
        return source;
    }

    /**
     * Sets the stack names
     *
     * @param sourceName new value for source stack name
     * @param destinationName new value for destination stack name
     * @param auxilaryName new value for auxiliary stack name
     */
    public void setStackNames(String sourceName, String destinationName, String auxilaryName) {
        s = sourceName;
        d = destinationName;
        a = auxilaryName;
    }

}
