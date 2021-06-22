package study.day18_QueuesAndStacks;

import java.util.LinkedList;
import java.util.Stack;

/*
Stacks : LIFO(Last In First Out)
 */

public class Stacky {

    LinkedList queue = new LinkedList();

    // Making a queue instance
    public Stacky(){
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
        Stack<String> stacky = new Stack<>();
        stacky.push("there");
        stacky.push("hi");
        System.out.print(stacky.pop()+" ");
        System.out.println(stacky.pop()+"! ");
        System.out.println("Size: " + stacky.size());
    }
}
