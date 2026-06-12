package gr.aueb.cf.solutions.ch17;

public class ListNode<T> {
    private T value;
    private int count = 0;

    public ListNode(T value) {
        this.value = value;
        this.count = 1;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public int getCount() {
        return count;
    }

    public void increaseCount() {
        count++;
    }
}
