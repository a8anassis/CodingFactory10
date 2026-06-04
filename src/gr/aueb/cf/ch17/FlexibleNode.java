package gr.aueb.cf.ch17;

/**
 * Περιέχει ένα {@link Object} άρα
 * οποιοσδήποτε τύπος δεδομένων.
 */
public class FlexibleNode {
    private Object value;

    public FlexibleNode(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
