package list;

import collections.Collection;

/**
 * Created by Наталья on 31.10.2016.
 */
public interface List<T> extends Collection<T> {

    public void add(T t);

    public void remove();

    public void removeByIndex(int i);

    public boolean remove(T value);

    public T get(int i);

    public T getFirst();

    public T getLast();

    public boolean contains(T value);

}
