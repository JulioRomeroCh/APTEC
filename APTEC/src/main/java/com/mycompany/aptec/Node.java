
package com.mycompany.aptec;

//Clase Nodo para Dijkstra
public class Node {   
    //Atributos
   private  int name ;
   private boolean visited ;
   private boolean tag;
   private int accumulated;
   private Node previous;
   
   //Constructor
   public Node(){
       this.name =-1;
       this.visited = false;
       this.tag = false;
       this.previous  = null;
       this.accumulated =0;       

   }
//Get's y Set's
     public int getName() {
        return name;
    }

    public boolean isVisited() {
        return visited;
    }

    public boolean isTag() {
        return tag;
    }

    public int getAccumulated() {
        return accumulated;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setTag(boolean tag) {
        this.tag = tag;
    }

    public void setAccumulated(int accumulated) {
        this.accumulated = accumulated;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    
}
