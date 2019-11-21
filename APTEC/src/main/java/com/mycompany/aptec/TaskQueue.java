package com.mycompany.aptec;

//Clase cola de tareas
public class TaskQueue {

    private TaskNodeQueue front;
    private TaskNodeQueue rear;
    private int size;
//Constructores
    public TaskQueue() {
        this.front = new TaskNodeQueue();
        this.rear = this.front;
        this.size = 0;
    }

    //Enqueue
    public void enqueue(Task element) {
        this.rear.setNext(new TaskNodeQueue(element, null));
        this.rear = rear.getNext();
        this.size++;
    }
//Dequeue
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
//Selecciona el primer elemento de la cola
    public Task first() {
        if (this.size == 0) {
            System.out.println("Queue is empty");
            return null;
        }
        return (Task) this.front.getNext().getElement();
    }
//Retorna el tamaño de la cola
    public int size() {
        return this.size;
    }
//Vacía la cola
    public void clear() {
        this.front = new TaskNodeQueue();
        this.rear = this.front;
        this.size = 0;
    }
//Convierte la cola a String
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
//Obtiene una tarea de la cola
    public Task GetTask() {
        TaskNodeQueue temp = this.front.getNext();
        Task res = null;
        while (temp != null) {
            res = temp.getElement();
            temp = temp.getNext();
        }
        return res;
    }
    
//Obtiene el ID de una tarea
    public String GetID() {
        TaskNodeQueue temp = this.front.getNext();
        String result = "";
        while (temp != null) {
            result = result + temp.getElement().getID() + ",";
            temp = temp.getNext();
        }
        return result;
    }
//Obtiene la descripción de una tarea
    public String GetDescription() {
        TaskNodeQueue temp = this.front.getNext();
        String result = "";
        while (temp != null) {
            result = result + temp.getElement().getDescription() + ",";
            temp = temp.getNext();
        }
        return result;
    }
//Obtiene la complejidad de la tarea
    public String GetComplexity() {
        TaskNodeQueue temp = this.front.getNext();
        String result = "";
        while (temp != null) {
            result = result + temp.getElement().getComplexity() + ",";
            temp = temp.getNext();
        }
        return result;
    }
//Obtiene el responsable de la tarea
    public String GetSupervisor() {
        TaskNodeQueue temp = this.front.getNext();
        String result = "";
        while (temp != null) {
            result = result + temp.getElement().getSupervisor() + ",";
            temp = temp.getNext();
        }
        return result;
    }
//Obtiene el tipo de tarea
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
