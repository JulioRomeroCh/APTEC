package com.mycompany.aptec;


import java.awt.Color;
import javax.swing.JOptionPane;
import static com.mycompany.aptec.Graphical_User_Interface.jPanel2;
import static com.mycompany.aptec.Graphical_User_Interface.R_repaint;

public class Algoritmo_Dijkstra {
   public  Arboles arboles;
   public int subTope;
   public Nodo auxi=null;
   public int auxAumulado;
   public int subAcomulado;
   public Nodo nodo[]; 
   public int tope;
   public int permanente;     
   public int nodoFin; 
   
   
    public Algoritmo_Dijkstra (Arboles arboles, int tope,int permanente, int nodoFin){
        this.arboles = arboles;        
        this.tope = tope;
        this.nodo= new Nodo[tope]; 
        this.permanente = permanente;
        this.nodoFin = nodoFin;
        
    }

    public int getAcumulado(){
        return nodo[nodoFin].getAcumulado(); 
    }
        
    public void dijkstra(){ 
         for (int i = 0; i < tope; i++)  // creamos el vector nodo del tamaño de tope el cual tiene el numero de nodo pintados 
                    nodo[i]= new Nodo(); 
         
        if(permanente != nodoFin){
             jPanel2.paint(jPanel2.getGraphics());
             R_repaint(tope, arboles);   
             Pintar.clickSobreNodo(jPanel2.getGraphics(), arboles.getCordeX(permanente), arboles.getCordeY(permanente), null,Color.GREEN); // pinta de color GREEN los nodos
            
        
            nodo[permanente].setVisitado(true);        
            nodo[permanente].setNombre(permanente);       
            
            do{            
              subAcomulado=0;
              auxAumulado = 2000000000; // lo igualamos a esta cifra ya q el acomulado de los nodos, supuestamente  nunca sera mayor 
              nodo[permanente].setEtiqueta(true); 
              for (int j = 0; j < tope; j++) {
                  if(arboles.getmAdyacencia(j, permanente)==1){
                        subAcomulado= nodo[permanente].getAcumulado()+arboles.getmCoeficiente(j, permanente);                                 
                        if(subAcomulado <= nodo[j].getAcumulado() && nodo[j].isVisitado()==true && nodo[j].isEtiqueta()== false){
                            nodo[j].setAcumulado(subAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[permanente]);
                        }
                        else if( nodo[j].isVisitado()==false){
                            nodo[j].setAcumulado(subAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[permanente]); 
                       }
                 }
              }
              for (int i = 0; i <tope; i++) { // buscamos cual de los nodos visitado tiene el acomulado menor par escogerlo como permanente 
                if(nodo[i].isVisitado()== true && nodo[i].isEtiqueta()== false){
                   if(nodo[i].getAcumulado()<=auxAumulado){
                       permanente= nodo[i].getNombre();
                       auxAumulado= nodo[i].getAcumulado();
                   }
                }               
             }
            subTope++;                
          }while(subTope<tope+1);          
          auxi= nodo[nodoFin]; 
           if(auxi.getPredecesor() == null )
             JOptionPane.showMessageDialog(null,"No se Pudo LLegar Al Nodo "+nodoFin);          
          while(auxi.getPredecesor() != null){           
              Pintar.pintarCamino(jPanel2.getGraphics(), arboles.getCordeX(auxi.getNombre()), arboles.getCordeY(auxi.getNombre()), arboles.getCordeX(auxi.getPredecesor().getNombre()), arboles.getCordeY(auxi.getPredecesor().getNombre()),Color.GREEN);
              Pintar.clickSobreNodo(jPanel2.getGraphics(), arboles.getCordeX(auxi.getNombre()), arboles.getCordeY(auxi.getNombre()), null,Color.GREEN);
             auxi=auxi.getPredecesor();              
          }  
         Pintar.clickSobreNodo(jPanel2.getGraphics(), arboles.getCordeX(nodoFin), arboles.getCordeY(nodoFin), null,Color.GREEN);     
       }
       else Pintar.clickSobreNodo(jPanel2.getGraphics(), arboles.getCordeX(nodoFin), arboles.getCordeY(nodoFin), null,Color.GREEN);    
    }
    
    
 
}