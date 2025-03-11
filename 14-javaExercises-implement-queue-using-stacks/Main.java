import java.util.logging.Logger;

public class Main  {
    public static void main(String[] args) {
       Logger logger = Logger.getLogger(Main.class.getName());

        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        try {
            System.out.println("First item for peek: " + queue.peek());
            System.out.println("First item for pop: " + queue.pop());

            System.out.println("New first element for peek: " + queue.pop());

            System.out.println("Tail is empty? " + queue.empty());

            queue.pop();
            queue.pop();

        } catch (Exception e){
            logger.info("Tail is empty? " + queue.empty());
        }



    }
}
