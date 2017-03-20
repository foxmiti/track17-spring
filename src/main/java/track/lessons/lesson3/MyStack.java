package track.lessons.lesson3;

public class MyStack implements Stack {

    private MyLinkedList list = new MyLinkedList();

    @Override
    public void push(int value) {
        list.add(value);
    }

    @Override
    public int pop() {
        return list.remove(list.size() - 1);
    }

    @Override
    public int size() {
        return list.size();
    }
}