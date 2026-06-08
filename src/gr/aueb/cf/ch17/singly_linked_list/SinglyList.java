package gr.aueb.cf.ch17.singly_linked_list;

public class SinglyList<T> {
    private Node<T> head = null;

    public void insertFirst(T t) {
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head);

        head = tmp;
    }

    public void insertLast(T t) {
        if (isEmpty()) {
            insertFirst(t);
            return;
        }

        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(null);

        Node<T> n;
        for (n = head; n.getNext() != null; n = n.getNext());
        n.setNext(tmp);
    }

    public Node<T> removeFirst() {
        if (isEmpty()) return null;
        Node<T> tmp = head;
        head = head.getNext();
        return tmp;
    }

    public Node<T> removeLast() {
        if (isEmpty() || head.getNext() == null) {
            return removeFirst();
        }

        Node<T> n;
        for (n = head; n.getNext().getNext() != null; n = n.getNext());

        Node<T> nodeToReturn = n.getNext();
        n.setNext(null);
        return nodeToReturn;
    }

    public Node<T> get(T t) {
        Node<T> nodeToReturn = null;

        for (Node<T> n = head; n != null; n = n.getNext()) {
            if (n.getItem().equals(t)) {
                nodeToReturn = n;
                break;
            }
        }
        return nodeToReturn;
    }

    public void traverse() {
        for (Node<T> n = head; n != null; n = n.getNext()) {
            System.out.println(n.getItem());
        }
    }

    public int size() {
        int counter = 0;
        for (Node<T> n = head; n != null; n = n.getNext()) {
            counter++;
        }
        return counter;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
