
   import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class InBuild {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack();
        stack.push(34);
        stack.push(664);
        stack.push(64);
        stack.push(04);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());  


System.out.println( "QUEUE STARTED");
        Queue<Integer> queue=new LinkedList<>();
        queue.add(99);
        queue.add(89);
        queue.add(78);
        queue.add(90);
        System.out.println(queue.remove(
        ));
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println("Deque started ");
        Deque<Integer> deque =new ArrayDeque<>();
         deque.add(89);
         deque.addLast(79);
         deque.removeLast();
    }
}

