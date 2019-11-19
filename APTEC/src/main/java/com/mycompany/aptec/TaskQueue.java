package com.mycompany.aptec;

public class TaskQueue {

    private TaskNodeQueue front;
    private TaskNodeQueue rear;
    private int size;

    public TaskQueue() {
        this.front = new TaskNodeQueue();
        this.rear = this.front;
        this.size = 0;
    }

    public void enqueue(Task element) {
        this.rear.setNext(new TaskNodeQueue(element, null));
        this.rear = rear.getNext();
        this.size++;
    }

    public Task dequeue() {
        if (this.size == 0) {
            System.out.println("Queue is empty");
            return null;
        }
        Task temp = (Task) this.front.getNext().getElement();
        TaskNodeQueue nTemp = this.front.getNext();
        this.front.setNext(nTemp.getNext());
        if (this.rear == nTemp) {
            this.rear = this.front;
        }
        this.size--;
        return temp;
    }

    public Task first() {
        if (this.size == 0) {
            System.out.println("Queue is empty");
            return null;
        }
        return (Task) this.front.getNext().getElement();
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        this.front = new TaskNodeQueue();
        this.rear = this.front;
        this.size = 0;
    }

    @Override
    public String toString() {
        String result = "**Cola de impresión**\n";
        TaskNodeQueue tFront = this.front;
        int tSize = this.size;
        while (tSize != 0) {
            result += tFront.getNext().getElement() + " ";
            tFront = tFront.getNext();
            tSize--;
        }
        return result;
    }

    public String GetID() {
        TaskNodeQueue temp = this.front.getNext();
        String result = "";
        while (temp != null) {
            result = result + temp.getElement().getID() + ",";
            temp = temp.getNext();
        }
        return result;
    }

    public String GetDescription() {
        TaskNodeQueue temp = this.front.getNext();
        String result = "";
        while (temp != null) {
            result = result + temp.getElement().getDescription() + ",";
            temp = temp.getNext();
        }
        return result;
    }

    public String GetComplexity() {
        TaskNodeQueue temp = this.front.getNext();
        String result = "";
        while (temp != null) {
            result = result + temp.getElement().getDescription() + ",";
            temp = temp.getNext();
        }
        return result;
    }

    public String GetSupervisor() {
        TaskNodeQueue temp = this.front.getNext();
        String result = "";
        while (temp != null) {
            result = result + temp.getElement().getSupervisor() + ",";
            temp = temp.getNext();
        }
        return result;
    }

    public String GetType() {
        TaskNodeQueue temp = this.front.getNext();
        String result = "";
        while (temp != null) {
            result = result + temp.getElement().getTaskType() + ",";
            temp = temp.getNext();
        }
        return result;
    }
}
