
package com.mycompany.aptec;

/**
 *
 * @author KevRj
 */
public class TaskNodeList {
    
//atributes

    private Task element;
    private TaskNodeList next;
    //Builder

    public TaskNodeList () {
        this.element = null;
        this.next = null;
    }

    /**
     * Builder of a node, when the element be the only one or the last one.
     *
     * @param element
     */
    public TaskNodeList (Task element) {
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
    public TaskNodeList (Task element, TaskNodeList next) {
        this.element = element;
        this.next = next;
    }
//Functions

    public Task getElement() {
        return element;
    }

    public void setElement(Task element) {
        this.element = element;
    }

    public TaskNodeList getNext() {
        return next;
    }

    public void setNext(TaskNodeList next) {
        this.next = next;
    }

}
