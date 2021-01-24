package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int SIZE = 12;
    public static final int FULL = 11;
    public static final int EMPTY = -1;
    private int[] NUMBERS = new int[SIZE];

    private int total = EMPTY;

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
            return EMPTY;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return NUMBERS[total--];
    }

}
