package track.lessons.lesson3;

import java.util.NoSuchElementException;

public class MyQueue implements Queue {

    private MyLinkedList list = new MyLinkedList();

    @Override
    public void enqueue(int value) {
        list.add(value);
    }

    @Override
    public int dequeue() throws NoSuchElementException {
        return list.remove(0);
    }

    @Override
    public int size() {
        return list.size();
    }
}