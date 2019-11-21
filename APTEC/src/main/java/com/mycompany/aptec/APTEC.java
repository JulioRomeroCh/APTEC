package com.mycompany.aptec;
//

public class APTEC {
  /**
   * 
   * @param args 
   */
    public static void main (String [] args){
        
        String sCadena = "Hola Mundo";
        String sSubCadena = sCadena.substring(0,1);
        System.out.println(sSubCadena);
        
        
        String origen = (Integer.toString(1) + "(" + 456 + ")");
        int largo_origen = origen.length()-1;
        String recortado= origen.substring(2, largo_origen);
        System.out.println("Recor:" + recortado);
        
        Task t1 = new Task();
        t1.setID(1);
        t1.setDescription("Pack the inventory");
        t1.setComplexity("Hard");
        t1.setSupervisor("Jose Blanco");
        t1.setTaskType("Operative");
        
        Task t2 = new Task();
        t2.setID(2);
        t2.setDescription("Buy a new home");
        t2.setComplexity("Easy");
        t2.setSupervisor("Sebastián Córdoba");
        t2.setTaskType("Operative");
        
        Task t3 = new Task();
        t3.setID(3);
        t3.setDescription("Unbox the inventory");
        t3.setComplexity("Medium");
        t3.setSupervisor("Jose Blanco");
        t3.setTaskType("Operative");
        
        TaskList list = new TaskList();
        list.append(t1);
        list.append(t2);
        list.append(t3);
               
        GraphAdjencyMatrix matrix = new GraphAdjencyMatrix(list.size());
        matrix.add(0, 1, t1);
        matrix.add(0, 1, t1);
        
        matrix.add(0, 2, t1);
        
        matrix.add(1, 2, t2);
        matrix.add(1, 0, t2);
        
        matrix.add(2,0, t3);
        matrix.add(2,1, t3);
        
        matrix.print();
  
    }
}