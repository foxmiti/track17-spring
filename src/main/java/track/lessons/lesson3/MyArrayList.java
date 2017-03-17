package track.lessons.lesson3;

import java.util.NoSuchElementException;

/**
 * Должен наследовать List
 */
public class MyArrayList extends List {
    private static final int defListLong = 32;
    public int[] array;


    public MyArrayList() {
        this(defListLong);
    }
    public MyArrayList(int dimension){
        array = new int[dimension];
        size = dimension;
    }

    @Override
    void add(int forAdd) {
        if (size + 1 < array.length){
            array[size] = forAdd;
            size++;
        }
        else {
            ++size;
            int[] newArray = new int[size];
            System.arraycopy(array, 0, newArray, 0, size);
            array[size] = forAdd;
        }

    }

    private void resize(int newDimension){
        int[] newArray = new int[newDimension];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    @Override
    int remove(int idx) throws NoSuchElementException{
            if (idx < size) {
                int returnInt = array[idx];
                if (size > idx + 1) {
                    System.arraycopy(array, idx + 1, array, idx, size - idx - 1);
                }


                --size;
                return returnInt;
            } else {
                throw new NoSuchElementException();
        }
    }

    @Override
    int get(int idx) throws NoSuchElementException{
        if (idx < size){
            return array[idx];
        }
        else {
            throw new NoSuchElementException();
        }
    }
    


}