package gr.aueb.cf.solutions.ch17;

import java.util.LinkedList;

public class DLList<T extends Comparable<T>> {
    private LinkedList<ListNode<T>> list = new LinkedList<>();

    public void insertFirst(T t) {
        ListNode<T> node = new ListNode<>(t);
        list.addFirst(node);
    }

    public void insertLast(T t) {
        ListNode<T> node = new ListNode<>(t);
        list.addLast(node);
    }

    public ListNode<T> findNode(T t) {
        for (ListNode<T> node : list) {
            if (node.getValue() != null && node.getValue().equals(t)) {
                return node;
            }
        }
        return null;
    }

    public void increaseCount(T t) {
        ListNode<T> node = findNode(t);
        if (node == null) return;
        node.increaseCount();
    }

    // Ταξινόμηση ανά συχνότητα (ποσοστό) descending - selection sort
    public void sortByCountDescending() {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int max = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j).getCount() > list.get(max).getCount()) {
                    max = j;
                }
            }
            swap(i, max);
        }
    }

    // Ταξινόμηση ανά χαρακτήρα ascending - selection sort
    public void sortByValueAscending() {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j).getValue().compareTo(list.get(min).getValue()) < 0) {
                    min = j;
                }
            }
            swap(i, min);
        }
    }

    private void swap(int i, int j) {
        if (i == j) return;
        ListNode<T> temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public void traverse(int totalChars) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        for (ListNode<T> node : list) {
            double percentage = 0.0;
            percentage = (node.getCount() / (double) totalChars) * 100;
            System.out.println("Value: " + node.getValue()
                    + " - Frequency: " + String.format("%.2f%%", percentage));
        }
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
