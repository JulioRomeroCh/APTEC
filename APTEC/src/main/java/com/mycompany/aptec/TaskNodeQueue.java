package com.mycompany.aptec;
//
public class TaskNodeQueue {
     private Task element;
     private TaskNodeQueue next;
     
      public TaskNodeQueue (){
            this.element = null;
            this.next = null;
      }
            
      public TaskNodeQueue (Task element){
            this.element = element;
            this.next = null;
      }
      
      public TaskNodeQueue (Task element, TaskNodeQueue next){
            this.element = element;
            this.next = next;
      }
       public Task getElement() {
            return element;
        }

       
        public void setElement(Task element) {
            this.element = element;
        }

     
        public TaskNodeQueue getNext() {
            return next;
        }

       
        public void setNext(TaskNodeQueue next) {
            this.next = next;
        }
}
        
