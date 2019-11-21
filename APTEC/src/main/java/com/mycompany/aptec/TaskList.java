package com.mycompany.aptec;
//
public class TaskList {
    //Atributes of the class Linkedlist

    private TaskNodeQueue head;
    private TaskNodeQueue current;
    private TaskNodeQueue tail;
    private int position;
    private int size;

    //Builder of LinkedList
    public TaskList() {
        this.head = new TaskNodeQueue();
        this.current = this.head;
        this.tail = this.head;
        this.position = -1;
        this.size = 0;
    }

    public TaskList(TaskList list) {
    }
    //Methods

    public void append(Task element) {
        //Always appends at the end of the list
        TaskNodeQueue newNode = new TaskNodeQueue(element);
        this.tail.setNext(newNode);
        this.tail = newNode;
        this.size++;
    }

    public void insert(Task element) {
        TaskNodeQueue newNode = new TaskNodeQueue(element, this.current.getNext());
        this.current.setNext(newNode);
        //Inserts at the end of the list
        if (this.current == this.tail) {
            this.tail = tail.getNext();
        }
        this.size++;
    }

    public int PositionOfElement(Task element) {
        if (this.size == 0) {
            System.out.println("Empty List");
        }
        TaskNodeQueue auxiliar = this.head;
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

    public boolean Find(TaskList list, Task element) {
        TaskNodeQueue auxiliar = this.head;
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
        TaskNodeQueue newHead = new TaskNodeQueue();
        TaskNodeQueue newTail = new TaskNodeQueue();
        TaskNodeQueue newCurrent = new TaskNodeQueue();
        TaskNodeQueue aux = new TaskNodeQueue();

        newCurrent = head.getNext();
        int i = 0;
        //Iteration to go through the list and reverse it
        while (newCurrent != null) {
            if (newCurrent == head.getNext()) {
                //nueva tail
                aux = new TaskNodeQueue(newCurrent.getElement(), null);
                newTail = aux;
            } else if (newCurrent == tail) {
                //nueva head
                aux = new TaskNodeQueue(newCurrent.getElement(), aux);
                newHead = new TaskNodeQueue(null, aux);
            } else {
                //else
                aux = new TaskNodeQueue(newCurrent.getElement(), aux);
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
