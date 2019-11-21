package com.mycompany.aptec;
//Se crea la clase Grafo, que lo dibuja mediante matriz de adyacencia
public class Graphs {
    //Atributos
   private int mCoefficient[][] = new int [51][51];
   private int mAdjency [][] = new int [51][51];
   private int coordX [] = new int [51];
   private int coordY [] = new int [51];
   private int name [] = new int [51];
   private int inTree [];
   
   
   //Constructor
   public Graphs(){
        
    }
//Get's y Set's
    public int getmCoefficient(int i, int j ) {
        return mCoefficient[i][j];
    }

    public int getmAdjency(int i,int j) {
        return mAdjency[i][j];
    }

    public int getCoordX(int i) {
        return coordX[i];
    }

    public int getCoordY(int i) {
        return coordY[i];
    }

    public int getName(int i) {
        return name[i];
    }

    public int getInTree(int i) {
        return inTree[i];
    }

    public void setmCoefficient(int i,int j ,int mCoefficient) {
        this.mCoefficient[i][j] = mCoefficient;
    }

    public void setmAdjency(int i,int j ,int mAdjency) {
        this.mAdjency[i][j] = mAdjency;
    }

    public void setCoordX(int i,int coordX) {
        this.coordX[i] = coordX;
    }

    public void setCoordY(int i, int coordY) {
        this.coordY[i] = coordY;
    }

    public void setName(int i,int name) {
        this.name[i] = name;
    }

    public void setInTree(int i,int inTree) {
        this.inTree[i] = inTree;
    }
    public void createInTree(int i){
       inTree = new int [i]; 
    }  
    
}
