package com.mycompany.aptec;
//Crea grafo por matrices de adyacencia
public class GraphAdjencyMatrix {
//Atributos
    public int n;
    public TaskNodeQueue[][] matrix;

    //Constructor que recibe el numero de nodos posibles
    public GraphAdjencyMatrix(int n) {
        this.n = n;
        matrix = new TaskNodeQueue[n][n];
        //La matriz se inicializa en "n"

    }

    //Añade un nodo al grafo
    public void add(int i, int j, Task task) {
        TaskNodeQueue tasknode = new TaskNodeQueue(task);
        matrix[i][j] = tasknode;
    }
//Imprime la matriz
    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                TaskNodeQueue O = matrix[i][j];

                if (O != null) {
                    System.out.print(matrix[i][j].getElement().getID() + " ");
                }

            }
            System.out.println();
        }
    }
}
