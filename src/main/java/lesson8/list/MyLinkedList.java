package lesson8.list;

import lesson7.list.MyList;

import java.util.Iterator;

public class MyLinkedList implements MyList {
    //List implementation. Linked list
    //есть arraylist

    private Node head; //первый элемент списка



    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        Node n = head;
        b.append("[");
        while (n != null){
            b.append(n.getValue());
            n = n.getNext();
            if (n!= null)
            {
                b.append(", ");
            }
        }
        b.append("]");
        return b.toString();
    }



    @Override
    public void add(int value) {
        //идти до посл начиная с head
        //добавить новый и в предпосл прописать ссылку на посл

        if (head == null){
            head = new Node(value);
            head.setValue(value);
            return;
        }

        Node n = head;
        while (n.getNext() != null){
            n = n.getNext();
        }
        n.setNext(new Node(value));
        n.getNext().setValue(value);

    }

    public void addFirst(int value)
    {
        Node n = head;
        Node nw = new Node(value);
        nw.next = head;
        this.head = nw;
    }

    public void removeFirst()
    {
        Node n = head;
        n = n.getNext();
        head.setNext(null);
        head = n;

    }

    public int getFirst()
    {
        return head.getValue();
    }

    @Override
    public void add(int index, int value) {
        Node n = head;
        Node one = null;
        Node two = null;
        while (n!=null)
        {
            if (index == 0)
            {
                one = n;
                two = n.getNext();
                break;
            }
            index--;
            n = n.getNext();
        }

        if (one != null)
        {
            one.setNext(
                    new Node(value, two)
            );
        }

    }

    @Override
    public boolean contains(int value) {
        Node n = head;
        while (n!= null){
            if (n.getValue() == value){
                return true;
            }
            n = n.getNext();
        }
        return false;
    }

    @Override
    public int get(int index) {


        int ind = 0;
        Node n = head;

        while (n!= null && ind != index){
            ind++;
            n = n.getNext();

        }
        return n.getValue();
    }

    @Override
    public void remove(int index) {
        Node n = head;
        while (n!=null)
        {
            if (index==1){
                n.setNext(n.getNext().getNext());
                n.getNext().setNext(null);
            }
            index--;
            n = n.getNext();
        }
    }

    @Override
    public int size() {
        int sz = 0;
        Node n = head;

        while (n != null){
            sz++;
            n = n.getNext();

        }
        return sz;
    }

    @Override
    public void set(int index, int value) {
        Node n = head;
        int ind = 0;
        while (n != null)
        {
            if (ind == index)
            {
                n.setValue(value);

            }
            index--;
            n = n.getNext();
        }

    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private Node n = head;

            @Override
            public boolean hasNext() {
                return (n.getNext() != null);
            }

            @Override
            public Integer next() {
                n = n.getNext();
                return n.getValue();
            }
        };
    }

    static class Node //
    {
        private int value;
        private Node next;


        public Node(int value) {
            this.value = this.value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }



    public static void main(String[] args) {
//        Node n = new MyLinkedList().new Node(); //если нвутр не статит класс
//        Node n new MyLinkedList.Node(); //для статит класса

        MyLinkedList l = new MyLinkedList();
        System.out.println(l);
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);


    }



}


