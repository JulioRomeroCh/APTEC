package com.mycompany.aptec;


public class TaskNode {
     //atributes
        private Task element;
        private TaskNode next;
        //Builder
        public TaskNode (){
            this.element = null;
            this.next = null;
        }
        /**
         * Builder of a node, when the element be the only one or the last one.
         * @param element
         */
        public TaskNode (Task element){
            this.element = element;
            this.next = null;
        }
        /**
         * Another builder for the node, this gets an element and references the next node.
         * @param element
         * @param next 
         */
        public TaskNode (Task element, TaskNode next){
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

        public TaskNode getNext() {
            return next;
        }

        
        public void setNext(TaskNode next) {
            this.next = next;
        }
        
    
}