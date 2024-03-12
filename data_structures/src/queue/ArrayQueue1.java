package queue;

import java.util.Iterator;

public class ArrayQueue1<E> implements Queue<E>, Iterable<E> {

    private final E[] array;
    private int head = 0;
    private int tail = 0;

    @SuppressWarnings("all")
    public ArrayQueue1(int cap){
        array = (E[]) new Object[cap+1];
    }
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int p = head;
            @Override
            public boolean hasNext() {
                return p != tail;
            }

            @Override
            public E next() {
                E value = array[p];
                p = (p+1) % array.length;
                return value;
            }
        };
    }

    @Override
    public boolean offer(E value) {
        if(isFull()){
            return false;
        }
        array[tail] = value;
        tail = (tail+1) % array.length;
        return true;
    }

    @Override
    public E poll() {
        if(isEmpty()){
            return null;
        }
        E value = array[head];
        head = (head+1) % array.length;
        return value;
    }

    @Override
    public E peek() {
        if(isEmpty()){
            return null;
        }
        return array[head];
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public boolean isFull() {
        return (tail + 1) % array.length == head;
    }
}
