package com.mycompany.aptec;

public class LinkedListResource {

    /**
     * Node class
     */
    public class Node {

        //atributes
        private Resource element;
        private Node next;

        //Builder
        public Node() {
            this.element = null;
            this.next = null;
        }

        /**
         * Builder of a node, when the element be the only one or the last one.
         *
         * @param element
         */
        public Node(Resource element) {
            this.element = element;
            this.next = null;
        }

        /**
         * Another builder for the node, this gets an element and references the
         * next node.
         *
         * @param element
         * @param next
         */
        public Node(Resource element, Node next) {
            this.element = element;
            this.next = next;
        }
//Functions

        public Resource getElement() {
            return element;
        }

        public void setElement(Resource element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }
    //Atributes of the class Linkedlist
    private Node head;
    private Node current;
    private Node tail;
    private int position;
    private int size;

    //Builder of LinkedList
    public LinkedListResource() {
        this.head = new Node();
        this.current = this.head;
        this.tail = this.head;
        this.position = -1;
        this.size = 0;
    }

    public LinkedListResource(LinkedListResource list) {
    }
    //Methods

    public void append(Resource element) {
        //Always appends at the end of the list
        Node newNode = new Node(element);
        this.tail.setNext(newNode);
        this.tail = newNode;
        this.size++;
    }

    public void insert(Resource element) {
        Node newNode = new Node(element, this.current.getNext());
        this.current.setNext(newNode);
        //Inserts at the end of the list
        if (this.current == this.tail) {
            this.tail = tail.getNext();
        }
        this.size++;
    }

    public int PositionOfElement(Resource element) {
        if (this.size == 0) {
            System.out.println("Empty List");
        }
        Node auxiliar = this.head;
        int position1 = -1;
        //While iteration to go through the list
        while (auxiliar != null) {
            if (auxiliar.getElement() != null && auxiliar.getElement().equals(element)) {
                return position1;
            }
            position1++;
            auxiliar = auxiliar.getNext();

        }
        return position1;
    }

    public boolean Find(LinkedListResource list, Resource element) {
        Node auxiliar = this.head;
        //Iteration to go through the list
        while (auxiliar != null) {
            if (auxiliar.getElement() == element) {
                return true;
            }
            auxiliar = auxiliar.getNext();
        }
        return false;
    }

//Method to reverse the list
    public void reverse() {
        Node newHead = new Node();
        Node newTail = new Node();
        Node newCurrent = new Node();
        Node aux = new Node();

        newCurrent = head.getNext();
        int i = 0;
        //Iteration to go through the list and reverse it
        while (newCurrent != null) {
            if (newCurrent == head.getNext()) {
                //nueva tail
                aux = new Node(newCurrent.getElement(), null);
                newTail = aux;
            } else if (newCurrent == tail) {
                //nueva head
                aux = new Node(newCurrent.getElement(), aux);
                newHead = new Node(null, aux);
            } else {
                //else
                aux = new Node(newCurrent.getElement(), aux);
            }
            newCurrent = newCurrent.getNext();
        }
        head = newHead;
        tail = newTail;
        current = newHead;
        position = -1;
    }
//Returns the size of the list

    public int size() {
        return this.size;
    }
}
