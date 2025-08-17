public class StackMain {
    public static void main(String[] args)throws StackException {
        CustomStack stack = new CustomStack(5);
        stack.push(34);
        stack.push(664);
        stack.push(64);
        stack.push(04);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());  
        System.out.println("Dynamic Stack");
         DynamicStack stck = new DynamicStack(5);
        stck.push(34);
        stck.push(664);
        stck.push(64);
        stck.push(04);
        stck.push(04);
        stck.push(04);
        stck.push(04);
        
        System.out.println(stck.pop());
        System.out.println(stck.pop());
        System.out.println(stck.pop());
        System.out.println(stck.pop());
        System.out.println(stck.pop());
        System.out.println(stck.pop());
        System.out.println(stck.pop()); 

    }
}
