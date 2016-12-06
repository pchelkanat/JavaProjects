package stack;

import linkedlist.LinkedList;
import list.Iterator;

/**
 * Created by Наталья on 05.12.2016.
 */
public class Stack<T> implements StackComponents<T> {
    private LinkedList<T> list= new LinkedList<>();

    @Override
    public void push (T value){
        list.addLast(value);
    }

    @Override
    public T pop(){
        T value = list.getLast();
        list.removeLast();
        return value;
    }

    public boolean isEmpty(){
        return list.isEmpty();}

    public String toString(){
        return list.toString();
    }
}
