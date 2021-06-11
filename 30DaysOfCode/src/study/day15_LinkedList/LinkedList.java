package study.day15_LinkedList;

public class LinkedList {

    // Properties
    Node head;
    int count;

    // Constructors
    public LinkedList(){
        head = null;
        count = 0;
    }

    public LinkedList(Node newHead){
        head = newHead;
        count = 1;
    }

    // Methods

    // add
    public void add(int newData){
        Node temp = new Node(newData);
        Node current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
    }

    public static void main(String[] args){

    }
}
