package laba9.Task5;

public class Node {
    public int value;
    public Node next;

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}