package queue;

import java.util.Iterator;

public interface Queue<E> {

    Iterator<E> iterator();

    //add value end of queue
    boolean offer(E value);

    //remove value from head of queue
    E poll();

    //get value from head of queue
    E peek();

    boolean isEmpty();

    boolean isFull();
}
