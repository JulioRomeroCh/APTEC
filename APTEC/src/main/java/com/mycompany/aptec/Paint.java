package com.mycompany.aptec;
//Imports
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import static com.mycompany.aptec.Graphical_User_Interface.jTextField1;


//Clase para pintar los nodos en la interfaz
public class Paint {   
    Color color;
    private String item;
    
    //Get's y Set's
    
    /**
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * @param item the iden to set
     */
    public void setItem(String item) {
        this.item = item;
    }
    
     //Constructor   
    public Paint(){
                
    }
    
    //Pinta los círculos en la interfaz
   public static void paintCircle(Graphics g,int x,int y, String n){
        String GetText = jTextField1.getText();
       ((Graphics2D)g).setColor(Color.ORANGE);
        ((Graphics2D)g).setStroke(new BasicStroke(4));       
        ((Graphics2D)g).fillOval(x, y, 15, 15);        
        //((Graphics2D)g).setColor(Color.BLACK);
        //((Graphics2D)g).drawOval(x, y, 20, 20);
        ((Graphics2D)g).setColor(Color.black);
        Font font=new Font("Monospaced",Font.BOLD, 16);
        g.setFont(font);
        ((Graphics2D)g).drawString(GetText, x, y);

    }    
  //Pinta las aristas en la interfaz
  public static void paintLine(Graphics g, int x1,int y1,int x2,int y2,int tam){
        int xAux = 0; int yAux = 0; 
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(2);
        ((Graphics2D)g).setStroke(stroke);         
       ((Graphics2D)g).drawLine(x1+10, y1+10, x2+10, y2+10);
       if(x1<=x2)
           xAux=((x2-x1)/2)+x1;       
        if(x1>x2)
           xAux=((x1-x2)/2)+x2;
        if(y1<y2)
           yAux=((y2-y1)/2)+y1;
        if(y1>=y2)
            yAux=((y1-y2)/2)+y2;        

        Font fuente=new Font("Monospaced",Font.PLAIN, 12);
        g.setFont(fuente);
      ((Graphics2D)g).drawString(String.valueOf(tam), xAux, yAux);
  }   
  //Pinta el camino en la interfaz
  public static void paintPath(Graphics g, int x1,int y1,int x2,int y2, Color color){
      ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(2);
        ((Graphics2D)g).setStroke(stroke);
        g.setColor(color);
        g.drawLine(x1+10, y1+10, x2+10, y2+10);
        
  }
  
  //Permite hacer "click" sobre un nodo
   public static void clickOverNode(Graphics g,int x,int y,String n,Color co){
        
       ((Graphics2D)g).setColor(co);
        ((Graphics2D)g).setStroke(new BasicStroke(4));       
        ((Graphics2D)g).fillOval(x, y, 15, 15);        
        //((Graphics2D)g).setColor(Color.BLACK);
        //((Graphics2D)g).drawOval(x, y, 15, 15);
         
    }

}
