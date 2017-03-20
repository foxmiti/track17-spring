package track.lessons.lesson3;

import java.util.NoSuchElementException;

interface Queue {

    void enqueue(int value);

    int dequeue() throws NoSuchElementException;

    int size();
}