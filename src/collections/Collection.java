package collections;

import list.Iterator;

/**
 * Created by Наталья on 31.10.2016.
 */

public interface Collection<T> {

    public boolean add(T element);

    public void addAll(Collection<T> collection);

    public void clear();

    public boolean isEmpty();

    //public boolean remove(T value);

    //public boolean removeAll(Collection<T> collection);

    public Iterator<T> getIterator();

    public int getSize();

}
