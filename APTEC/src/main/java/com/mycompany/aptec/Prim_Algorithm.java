package com.mycompany.aptec;
//Imports
import static com.mycompany.aptec.Graphical_User_Interface.R_repaint;
import static com.mycompany.aptec.Graphical_User_Interface.ingresarNodoOrigen;
import static com.mycompany.aptec.Graphical_User_Interface.jPanel2;
import static com.mycompany.aptec.Graphical_User_Interface.jTextField11;
import java.awt.Color;

//Clase de algoritmo de prim
public class Prim_Algorithm {
//Atributos
    public int accumulated;
    public int lowerEdge;
    public int end;
    public boolean inNode = false;
    public boolean increaseSize;
    public int pointedNode;
    public int nodePointer;
    public int size;
    public int biggerEdge;
    public Graphs trees;
    public int top;
    public int sourceNode;

    //Constructor
    public Prim_Algorithm (Graphs tree, int top, int biggerEdge) {
        this.accumulated = 0;
        this.lowerEdge = 0;
        this.end = 0;
        this.inNode = false;
        this.increaseSize = false;
        this.pointedNode = 0;
        this.nodePointer = 0;
        this.size = 1;
        this.biggerEdge = biggerEdge;
        this.trees = tree;
        this.top = top;
    }

    //Get acumulado
    public int getAccumulated() {
        return accumulated;
    }
//Aplica el algoritmo de Prim
    public void prim() {
        this.sourceNode = Integer.parseInt(jTextField11.getText());
        //jPanel2.paint(jPanel2.getGraphics());
        //R_repaint(tope, arboles);
        trees.createInTree(top);
        trees.setInTree(0, sourceNode);
        do {
            this.lowerEdge = this.biggerEdge;
            this.end = 2;
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < top; k++) {
                    if (trees.getmAdjency(k, trees.getInTree(j)) == 1) {
                        for (int h = 0; h < size; h++) {
                            if (trees.getInTree(h) == k) {
                                this.inNode = true;
                                break;
                            }
                        }
                        if (inNode == false) {
                            if (trees.getmCoefficient(k, trees.getInTree(j)) <= lowerEdge && trees.getmCoefficient(k, trees.getInTree(j)) > 0) {
                                lowerEdge = trees.getmCoefficient(k, trees.getInTree(j));
                                this.pointedNode = k;
                                this.increaseSize = true;
                                this.nodePointer = trees.getInTree(j);
                                this.end = 1;
                            }
                        }
                        this.inNode = false;
                    }
                }
            }             
            if (increaseSize == true) {
                Paint.paintPath(jPanel2.getGraphics(), trees.getCoordX(nodePointer), trees.getCoordY(nodePointer), trees.getCoordX(pointedNode), trees.getCoordY(pointedNode), Color.red);
                Paint.clickOverNode(jPanel2.getGraphics(), trees.getCoordX(nodePointer), trees.getCoordY(nodePointer), null, Color.red);
                Paint.clickOverNode(jPanel2.getGraphics(), trees.getCoordX(pointedNode), trees.getCoordY(pointedNode), null, Color.red);
                trees.setInTree(size, pointedNode);
                this.size++;
                this.increaseSize = false;
                this.accumulated += this.lowerEdge;
            }
        } while (end < 2);
    }

}
