package stack;

/**
 * Created by Наталья on 05.12.2016.
 */
public class StackTest {
    public static void main(String[] args) {

        //Stack<Integer> stack1 =new Stack<>();
        Stack<String> stack =new Stack<>();

        System.out.println(stack.isEmpty());

        /*stack1.push(5);
        stack1.push(4);
        stack1.push(3);
        stack1.push(2);
        stack1.push(1);*/

        stack.push("q");
        stack.push("w");
        stack.push("e");
        stack.push("r");
        stack.push("y");

        System.out.println(stack.toString());

        System.out.println(stack.isEmpty());

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.toString());
    }

}
