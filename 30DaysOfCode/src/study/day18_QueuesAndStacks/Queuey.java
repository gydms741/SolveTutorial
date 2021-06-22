package study.day18_QueuesAndStacks;

import java.util.LinkedList;
import java.util.Queue;

/*
Queues : FIFO(First In First Out)
 */

public class Queuey {

    LinkedList queue = new LinkedList();

    // Making a queue instance
    public Queuey(){
        queue = new LinkedList();
    }

    // Is our queue empty?
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    // What is the size of our queue?
    public int size(){
        return queue.size();
    }

    // Enqueuing an item
    public void enqueue(String n){
        queue.addLast(n);
    }

    // Dequeuing an item
    public String dequeue(){
        return (String)queue.remove(0);
    }

    // Peek at the first item
    public String peek(){
        return (String) queue.get(0);
    }

    public static void main(String[] args){
        /*Queuey stringQueue = new Queuey();
        stringQueue.enqueue("hi");
        stringQueue.enqueue("there");
        System.out.println(stringQueue.dequeue()+"");
        System.out.println(stringQueue.dequeue()+".");*/

        /*Queuey numberQueue = new Queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("First out: " + numberQueue.dequeue());
        System.out.println("Peek at second item: " + numberQueue.peek());
        System.out.println("Second out: " + numberQueue.dequeue());
        System.out.println("Third out: " + numberQueue.dequeue());*/

    }
}
