package track.lessons.lesson3;

import java.util.NoSuchElementException;

/**
 * Должен наследовать List
 * Односвязный список
 */
public class MyLinkedList extends List {

    /**
     * private - используется для сокрытия этого класса от других.
     * Класс доступен только изнутри того, где он объявлен
     * <p>
     * static - позволяет использовать Node без создания экземпляра внешнего класса
     */
    private Node head ;
    private Node tail ;
    private static class Node {
        Node prev;
        Node next;
        int val;

        Node(Node prev, Node next, int val) {
            this.prev = prev;
            this.next = next;
            this.val = val;
        }
    }
    public MyLinkedList(){
        head = tail = null;
    }


    @Override
    void add(int item) {
        ++size;
        if(tail == null){
            Node element = new Node(null,null,item);
            head = tail = element;
        } else {
            Node element = new Node(tail, null,item);
            tail.next = element;
        }

    }
    private Node getNode(int idx) {
        if (idx < size) {
            Node currentNode = head;
            for (int i = 0; i < idx; ++i) {
                currentNode = currentNode.next;
            }
            return currentNode;
        } else {
            throw new NoSuchElementException();
        }
    }
    @Override
    int remove(int idx) throws NoSuchElementException {
        if ( idx > size || idx < 0){
            throw new NoSuchElementException();
        }
        Node nodeIdx = getNode(idx);
        if (nodeIdx.next != null) {
            nodeIdx.next.prev = nodeIdx.prev;
        }
        if (nodeIdx.prev != null){
            nodeIdx.prev.next = nodeIdx.next;
        }
        if (idx == 0){
            head = head.next;
        }
        if (idx == size - 1) {
            tail = tail.prev;
        }
        size--;
        return nodeIdx.val;
    }

    @Override
    int get(int idx) throws NoSuchElementException {
        return getNode(idx).val;
    }

}
