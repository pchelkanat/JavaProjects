package queue;

/**
 * Created by Наталья on 05.12.2016.
 */
public interface QueueComponents<T> {
    public T pop();
    public void push(T value);
}
