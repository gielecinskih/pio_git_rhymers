package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int INT = 12;
    public static final int FULL = 11;
    public static final int EMPTY = -1;
    private int[] NUMBERS = new int[INT];

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}
