package gr.aueb.cf.ch17;

public class GenericNode<T> {
    private T value;

    public GenericNode() {

    }

    public GenericNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
