package queue;
import linkedlist.LinkedList;
/**
 * Created by Наталья on 05.12.2016.
 */
public class Queue<T> implements QueueComponents<T> {
    private LinkedList<T> list= new LinkedList<>();

    @Override
    public void push (T value){
        list.addLast(value);
    }

    @Override
    public T pop(){
        T value = list.getFirst();
        list.removeFirst();
        return value;
    }

    public boolean isEmpty(){
        return list.isEmpty();}

    public String toString(){
        return list.toString();
    }
}
