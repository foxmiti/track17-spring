package track.lessons.lesson3;

import java.util.NoSuchElementException;

interface Stack {

    void push(int value);

    int pop() throws NoSuchElementException;

    int size();
}