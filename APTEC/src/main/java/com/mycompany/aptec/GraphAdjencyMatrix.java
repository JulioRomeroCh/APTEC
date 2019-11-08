package com.mycompany.aptec;

public class GraphAdjencyMatrix {
    public int n;
       public TaskNode [][] matrix;
    
  
    public GraphAdjencyMatrix(int n) {
        this.n = n;
        matrix = new TaskNode [n][n];
        //The matrix initializes on the "size" of n
               
        
    }
    
    public void add (int i, int j, Task task){
                TaskNode tasknode = new TaskNode(task);
                matrix[i][j] = tasknode;
            }     
    
    
    

    
    public void print (){
        for(int i=0; i< n; i++){
           for(int j=1; j< n; j++){
               TaskNode O = matrix[i][j];
               
               if(O != null){
                System.out.print(matrix[i][j].getElement().getID() + " " ); 
               }
               
            }
            System.out.println();
        }
    }
}
