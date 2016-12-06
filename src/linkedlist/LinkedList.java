package linkedlist;

//import java.util.List;
//import java.util.Iterator;
//import java.util.Collection;

import collections.Collection;
import list.Iterator;
import list.List;

import static java.lang.System.*;


/**
 * Created by Наталья on 31.10.2016.
 */
public class LinkedList<T> implements List<T>,Collection<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;

    public T getFirst() {
        if (first != null)
            return first.getValue();
        return null;
    }

    public T getLast() {
        if (last != null) return last.getValue();
        return null;
    }


    @Override
    public boolean add(T t) {
        addLast(t);
        return true;
    }

    public void addFirst(T value) {
        Node<T> node = new Node<>(value, first, null);
        if (first != null) {
            first.setPrevious(node);
        }
        first = node;
        size++;
        if (size == 1) {
            last = node;
        }
    }

    public void addLast(T value) {
        Node<T> node = new Node<>(value, null, last);
        if (last != null) {
            last.setNext(node);
        }
        last = node;
        size++;
        if (size == 1) {
            first = node;
        }
    }

    @Override
    public void addAll(Collection<T> collection) {
        Iterator<T> iterator = collection.getIterator();
        while (iterator.hasNext()) {
            this.addFirst(iterator.next());
        }

    }

    @Override
    public void remove() {
        removeFirst();
    }

    @Override
    public void removeByIndex(int i) {
        if (i < 0 || i >= size) {
            throw new IllegalArgumentException("Index " + i + " is out of bounds");
        }
        if (i == 0) {
            removeFirst();
        } else if (i == size - 1) {
            removeLast();
        } else {
            Node<T> currentNode = first;
            int counter = 0;
            while (currentNode != null) {
                if (counter == i) {
                    remove(currentNode);
                    break;
                }
                currentNode = currentNode.getNext();
                counter++;
            }
        }
    }

    private void remove(Node<T> node) {
        if (!isEmpty()) {
            if (node == first) {
                first = node.getNext();
            }
            if (node == last) {
                last = node.getPrevious();
            }
            if (node.getPrevious() != null) {
                node.getPrevious().setNext(node.getNext());
            }
            if (node.getNext() != null) {
                node.getNext().setPrevious(node.getPrevious());
            }
            size--;
        }
    }

    public void removeFirst() {
        remove(first);
    }

    public void removeLast() {
        remove(last);
    }

    @Override
    public boolean remove(T value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null");
        }
        Node<T> currentNode = first;
        while (currentNode != null) {
            if (value.equals(currentNode.getValue())) {
                remove(currentNode);
                return true;
            }
            currentNode = currentNode.getNext();

        }
        return false;
    }

    /*@Override
    public boolean removeAll(Collection<T> collection) {
        return false;
    }*/


    public void clear() {
        last = null;
        first = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
       return first==null;
    }

    public Iterator<T> getIterator() {
        return new ListIterator<T>(first);
    }

    @Override
    public LinkedList<T> clone() {
        LinkedList<T> list1 = new LinkedList<>();
        list1.addAll(this);
        LinkedList<T> list= new LinkedList<>(); //иначе инверсивный список
        list.addAll(list1);
        return list;
    }


    @Override public boolean equals(Object o) {
        if (o != null && o instanceof LinkedList) {
            LinkedList<?> list = (LinkedList<?>) o;
            if (list.size == this.size) {
                Iterator<?> listIterator = list.getIterator();
                Iterator<T> thisIterator = this.getIterator();
                while (listIterator.hasNext()) {
                    if (!listIterator.next().equals(thisIterator.next())) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String separator = "";
        Iterator<T> iterator = this.getIterator();
        while (iterator.hasNext()) {
            sb.append(separator);
            sb.append(iterator.next());
            separator = ", ";
        }
        return sb.toString();
    }

   /* @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        Iterator<T> thisIterator = this.getIterator();
        while (thisIterator.hasNext()) {
            result += thisIterator.next().hashCode();

        }
        return result * prime + this.size;

    }*/

    @Override
    public T get(int i) {
        if (i < 0 || i >= size) {
            throw new IllegalArgumentException("Index " + i + " is out of bounds");
        }
        if (i == 0) {
            return getFirst();
        } else if (i == size - 1) {
            return getLast();
        }
        int counter = 0;
        Iterator<T> iterator = this.getIterator();
        T temp;
        while (iterator.hasNext()) {
            temp=iterator.next();
            if (counter == i) {
                return temp;
            }
            counter++;
        }
        return null;

    }

    @Override
    public boolean contains(T value) {
        Iterator<T> iterator = this.getIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(value)) {
                return true;
            }
        }
        return false;
    }


}
