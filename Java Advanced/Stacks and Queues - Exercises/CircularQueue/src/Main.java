public class Main {
    public static void main(String[] args) throws Exception {

        CircularQueue queue = new CircularQueue();

        queue.insert(8);
        queue.insert(5);
        queue.insert(77);
        queue.insert(43);
        queue.insert(12);

        queue.display();

        System.out.println(queue.remove());
        queue.insert(133);
        queue.display();
    }
}