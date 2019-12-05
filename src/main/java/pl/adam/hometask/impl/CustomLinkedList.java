package pl.adam.hometask.impl;


import java.util.Collection;

/**
 * @author denys.berezanskyi
 */
public class CustomLinkedList<E> {

    public CustomLinkedList() {
    }
    public void addToEnd(E item) {

    }
    public void addToBeginning(E item) {

    }
    public void removeOneFromEnd() {

    }
    public void removeOneFromBeginning() {

    }
    public void clear() {

    }
    public void addAll(Collection<E> collection) {

    }
    public E getFirst() {
        return null;
    }
    public E getLast() {
        return null;
    }
    public E getItem(E item) {
        return null;
    }
    public void removeItem(E item) {

    }
    public int getLength() {
        return -1;
    }
    public boolean isEmpty() {
        return false;
    }
    public boolean contains(E item) {
        return true;
    }

    private static class Node<E> {
        private Node lastNode;
        private Node firstNode;
        private E currentNode;

        public Node(Node lastNode, Node firstNode, E currentNode) {
            this.lastNode = lastNode;
            this.firstNode = firstNode;
            this.currentNode = currentNode;
        }
    }
}
