package com.mycompany.aptec;

//
import java.awt.Color;
import javax.swing.JOptionPane;
import static com.mycompany.aptec.Graphical_User_Interface.jPanel2;
import static com.mycompany.aptec.Graphical_User_Interface.R_repaint;

public class Dijkstra_Algorithm {
   public  Graphs trees;
   public int subTop;
   public Node auxi=null;
   public int auxAccumulated;
   public int subAccumulated;
   public Node node[]; 
   public int top;
   public int permanent;     
   public int endNode; 
   
   
    public Dijkstra_Algorithm (Graphs trees, int top,int permanent, int endNode){
        this.trees = trees;        
        this.top = top;
        this.node = new Node[top]; 
        this.permanent = permanent;
        this.endNode = endNode;
        
    }

    public int getAccumulated(){
        return node[endNode].getAccumulated(); 
    }
        
    public void dijkstra(){ 
         for (int i = 0; i < top; i++) 
                    node[i]= new Node();
         
        if(permanent != endNode){
             //jPanel2.paint(jPanel2.getGraphics());
             //R_repaint(tope, arboles);   
             Paint.clickOverNode(jPanel2.getGraphics(), trees.getCoordX(permanent), trees.getCoordY(permanent), null,Color.GREEN);
            
        
            node[permanent].setVisited(true);        
            node[permanent].setName(permanent);       
            
            do{            
              subAccumulated=0;
              auxAccumulated = 20000;
              node[permanent].setTag(true); 
              for (int j = 0; j < top; j++) {
                  if(trees.getmAdjency(j, permanent)==1){
                        subAccumulated= node[permanent].getAccumulated()+trees.getmCoefficient(j, permanent);                                 
                        if(subAccumulated <= node[j].getAccumulated() && node[j].isVisited()==true && node[j].isTag()== false){
                            node[j].setAccumulated(subAccumulated);
                            node[j].setVisited(true);
                            node[j].setName(j);
                            node[j].setPrevious(node[permanent]);
                        }
                        else if( node[j].isVisited()==false){
                            node[j].setAccumulated(subAccumulated);
                            node[j].setVisited(true);
                            node[j].setName(j);
                            node[j].setPrevious(node[permanent]); 
                       }
                 }
              }
              for (int i = 0; i <top; i++) { // buscamos cual de los nodos visitado tiene el acomulado menor par escogerlo como permanente 
                if(node[i].isVisited()== true && node[i].isTag()== false){
                   if(node[i].getAccumulated()<=auxAccumulated){
                       permanent= node[i].getName();
                       auxAccumulated= node[i].getAccumulated();
                   }
                }               
             }
            subTop++;                
          }while(subTop<top+1);          
          auxi= node[endNode]; 
           if(auxi.getPrevious() == null )
             JOptionPane.showMessageDialog(null,"Can't reach the node "+endNode);          
          while(auxi.getPrevious() != null){           
              Paint.paintPath(jPanel2.getGraphics(), trees.getCoordX(auxi.getName()), trees.getCoordY(auxi.getName()), trees.getCoordX(auxi.getPrevious().getName()), trees.getCoordY(auxi.getPrevious().getName()),Color.RED);
              Paint.clickOverNode(jPanel2.getGraphics(), trees.getCoordX(auxi.getName()), trees.getCoordY(auxi.getName()), null,Color.GREEN);
             auxi=auxi.getPrevious();              
          }  
         Paint.clickOverNode(jPanel2.getGraphics(), trees.getCoordX(endNode), trees.getCoordY(endNode), null,Color.GREEN);     
       }
       else Paint.clickOverNode(jPanel2.getGraphics(), trees.getCoordX(endNode), trees.getCoordY(endNode), null,Color.GREEN);    
    }
    
    
 
}
