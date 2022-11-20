public class Main {
    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack();

        stack.push(5);
        stack.push(87);
        stack.push(51);
        stack.push(2);
        stack.push(44);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

//        System.out.println(stack.peek());
    }

}