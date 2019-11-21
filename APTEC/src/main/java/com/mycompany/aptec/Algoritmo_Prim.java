package com.mycompany.aptec;
//
import static com.mycompany.aptec.Graphical_User_Interface.R_repaint;
import static com.mycompany.aptec.Graphical_User_Interface.ingresarNodoOrigen;
import static com.mycompany.aptec.Graphical_User_Interface.jPanel2;
import static com.mycompany.aptec.Graphical_User_Interface.jTextField11;
import java.awt.Color;

public class Algoritmo_Prim {

    public int cumulado;
    public int aristaMenor;
    public int fin;
    public boolean estaNodo = false;
    public boolean aumentaTamano;
    public int nodoApuntado;
    public int nodoApuntador;
    public int tamano;
    public int arsitaMayor;
    public Arboles arboles;
    public int tope;
    public int nodoOrigen;

    public Algoritmo_Prim(Arboles arbol, int top, int aristaMayor) {
        this.cumulado = 0;
        this.aristaMenor = 0;
        this.fin = 0;
        this.estaNodo = false;
        this.aumentaTamano = false;
        this.nodoApuntado = 0;
        this.nodoApuntador = 0;
        this.tamano = 1;
        this.arsitaMayor = aristaMayor;
        this.arboles = arbol;
        this.tope = top;
    }

    public int getCumulado() {
        return cumulado;
    }

    public void prim() {
        this.nodoOrigen = Integer.parseInt(jTextField11.getText());
        //jPanel2.paint(jPanel2.getGraphics());
        //R_repaint(tope, arboles);
        arboles.crearEnArbol(tope);
        arboles.setEnArbol(0, nodoOrigen);
        do {
            this.aristaMenor = this.arsitaMayor;
            this.fin = 2;
            for (int j = 0; j < tamano; j++) {
                for (int k = 0; k < tope; k++) {
                    if (arboles.getmAdyacencia(k, arboles.getEnArbol(j)) == 1) {
                        for (int h = 0; h < tamano; h++) {
                            if (arboles.getEnArbol(h) == k) {
                                this.estaNodo = true;
                                break;
                            }
                        }
                        if (estaNodo == false) {
                            if (arboles.getmCoeficiente(k, arboles.getEnArbol(j)) <= aristaMenor && arboles.getmCoeficiente(k, arboles.getEnArbol(j)) > 0) {
                                aristaMenor = arboles.getmCoeficiente(k, arboles.getEnArbol(j));
                                this.nodoApuntado = k;
                                this.aumentaTamano = true;
                                this.nodoApuntador = arboles.getEnArbol(j);
                                this.fin = 1;
                            }
                        }
                        this.estaNodo = false;
                    }
                }
            }             
            if (aumentaTamano == true) {
                Pintar.pintarCamino(jPanel2.getGraphics(), arboles.getCordeX(nodoApuntador), arboles.getCordeY(nodoApuntador), arboles.getCordeX(nodoApuntado), arboles.getCordeY(nodoApuntado), Color.red);
                Pintar.clickSobreNodo(jPanel2.getGraphics(), arboles.getCordeX(nodoApuntador), arboles.getCordeY(nodoApuntador), null, Color.red);
                Pintar.clickSobreNodo(jPanel2.getGraphics(), arboles.getCordeX(nodoApuntado), arboles.getCordeY(nodoApuntado), null, Color.red);
                arboles.setEnArbol(tamano, nodoApuntado);
                this.tamano++;
                this.aumentaTamano = false;
                this.cumulado += this.aristaMenor;
            }
        } while (fin < 2);
    }

}
