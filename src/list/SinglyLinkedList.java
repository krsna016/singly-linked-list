package list;

import node.Node;
import adt.AbstractClass;

public class SinglyLinkedList implements AbstractClass {

    private Node head;
    private int size;
    public SinglyLinkedList(){
        this.head = null;
        this.size = 0;
    }

    @Override
    public boolean is_empty() {
        return false;
    }

    @Override
    public int get_size() {
        return Integer.MIN_VALUE;
    }

    @Override
    public void add_first(int data) {

    }

    @Override
    public void add_last(int data){

    }

    @Override
    public void remove_first() {

    }

    @Override
    public void remove_last() {

    }

    @Override
    public void print_element() {

    }

    @Override
    public void add_any() {

    }

    @Override
    public void remove_any() {

    }

    @Override
    public void reverse() {

    }
}