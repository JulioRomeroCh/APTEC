
package com.mycompany.aptec;


public class APTEC {
  /**
   * 
   * @param args 
   */
    public static void main (String [] args){
        Task t = new Task();
        t.setID(1);
        t.setDescription("Pack the inventory");
        t.setComplexity("Hard");
        t.setSupervisor("Jose Blanco");
        t.setTaskType("Operative");
        
        Task t2 = new Task();
        t2.setID(2);
        t2.setDescription("Buy a new home");
        t2.setComplexity("Easy");
        t2.setSupervisor("Sebas Córdoba");
        t2.setTaskType("Operative");
        
        Task t3 = new Task();
        t3.setID(3);
        t3.setDescription("Unbox the inventory");
        t3.setComplexity("Medium");
        t3.setSupervisor("Jose Blanco");
        t3.setTaskType("Operative");
        
        
        TaskList list = new TaskList();
        list.append(t);
        list.append(t2);
        list.append(t3);
        
  
        
        GraphAdjencyMatrix matrix = new GraphAdjencyMatrix(list.size());
        matrix.add(0, 1, t);
        matrix.add(0, 1, t);
        
        matrix.add(0, 2, t);
        
        matrix.add(1, 2, t2);
        matrix.add(1, 0, t2);
        
        matrix.add(2,0, t3);
        matrix.add(2,1, t3);
        
        matrix.print();

    
    
}
}
