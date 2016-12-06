package queue;

import stack.Stack;

/**
 * Created by Наталья on 05.12.2016.
 */
public class QueueTest {
    public static void main(String[] args) {

    //Stack<Integer> stack1 =new Stack<>();
        Queue<String> queue =new Queue<>();

    System.out.println(queue.isEmpty());

        /*stack1.push(5);
        stack1.push(4);
        stack1.push(3);
        stack1.push(2);
        stack1.push(1);*/

        queue.push("q");
        queue.push("w");
        queue.push("e");
        queue.push("r");
        queue.push("y");

    System.out.println(queue.toString());

    System.out.println(queue.isEmpty());

    System.out.println(queue.pop());
    System.out.println(queue.pop());

    System.out.println(queue.toString());
}

}
