package gr.aueb.cf.ch17;

/**
 * Ορίζει μία κλάση {@link Node}
 * με ένα μόνο πεδίο int.
 */
public class Node {
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
