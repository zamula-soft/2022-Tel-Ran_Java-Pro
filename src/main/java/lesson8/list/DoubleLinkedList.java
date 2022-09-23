package lesson8.list;

import lesson7.list.MyList;

import java.util.Iterator;

public class DoubleLinkedList implements MyList {
    DoubleLinkedNode head = null;
    DoubleLinkedNode tail = null;
    private int size = 0;

    @Override
    public void add(int value) {
        if (tail == null){
            DoubleLinkedNode node = new DoubleLinkedNode(value);
            head = node;
            tail = node;
        }
        else {
            DoubleLinkedNode node = new DoubleLinkedNode(value, tail, null);
//            tail.next = node;
              tail = node;
        }
        size++;
    }

    @Override
    public void add(int index, int value) {
        if (size() == 0 && index == 0)
        {
            add(value);
        }
        //head
        if (index == 0){
            DoubleLinkedNode newNode = new DoubleLinkedNode(value, null, head);
            head = newNode;
            }
        //tail
        else if (index == size()) {
            DoubleLinkedNode newNode = new DoubleLinkedNode(value, tail, null);
            tail = newNode;
        }
        //rest
        else {
            DoubleLinkedNode node = getNodeByIndex(index);
            DoubleLinkedNode prev = node.prev;
            new DoubleLinkedNode(value, prev, node);
        }
size++;
    }

    @Override
    public boolean contains(int value) {
        DoubleLinkedNode node = head;
        while (node != null)
        {
            if (node.value == value){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    @Override
    public int get(int index) {
        DoubleLinkedNode node = getNodeByIndex(index);
        return node != null ? node.value : 0;
    }

    private DoubleLinkedNode getNodeByIndex(int index){
        DoubleLinkedNode node = head;
        while (node != null && index > 0){
            index--;
            node = node.next;
        }
        return node;
    }

    @Override
    public void remove(int index) {
        if (index == 0 && head != null){
            head = head.next;
            if (head != null)
                head.prev = null;
        }
        else if (index == size()-1){
            tail = tail.prev;
            tail.next = null;
        }
        else{
            DoubleLinkedNode r = getNodeByIndex(index);
            DoubleLinkedNode p = r.prev;
            DoubleLinkedNode n = r.next;
            if (p != null){
                p.next = n;
            }
            if (n != null){
                n.prev = p;
            }
        }
        size--;
    }

    void addLast(int value){
        add(value);
    }

    void removeLast(){
        remove(size()-1);
    }

    int getLast(){

        return get(size()-1);
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        DoubleLinkedNode node = head;
        builder.append("[");
        while (node != null){
            builder.append(node.value);
            if (node.next != null)
            {
                builder.append(", ");
            }
            node = node.next;
        }
        builder.append("]");
        return builder.toString();
    }

    @Override
    public void set(int index, int value) {
        DoubleLinkedNode node = getNodeByIndex(index);
        if (node != null){
            node.value = value;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    static class DoubleLinkedNode{
        int value;
        DoubleLinkedNode prev = null;
        DoubleLinkedNode next = null;

        public DoubleLinkedNode(int value) {
            this.value = value;
        }

        public DoubleLinkedNode(int value, DoubleLinkedNode prev, DoubleLinkedNode next) {
            this.value = value;
            this.prev = prev;
            if (prev!=null){
                prev.next = this;
            }
            this.next = next;
            if (next!=null){
                next.prev = this;
            }
        }


    }
}
