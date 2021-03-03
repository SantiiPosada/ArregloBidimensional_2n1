
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author santi
 */
public class arreglobidimensional_2n1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String ab[][] = arregloBidimensional(ingresoNumero());
        imprimirArregloBidimensional(ab);
    }

    /**
     *
     * @return Entero positivo.
     */
    private static String[][] arregloBidimensional(int n) {
        int columna = n + 1;
        int fila = (2 * n) + 1;

        String ab[][] = new String[fila][columna];

        int condiFila = columna;
        for (int i = 0; i < ab.length; i++) {//Número de filas
            for (int j = 0; j < ab[i].length; j++) {//Número de columas
                /* 
                System.out.println("fila " + i + " columna " + j);
                System.out.println(condiFila);
                 */

                if (j < condiFila) {
                    ab[i][j] = "1";
                } else {
                    ab[i][j] = " ";
                }

            }
            if ((i + 1) >= columna) {
                if (condiFila > 0) {
                    condiFila++;
                } else {
                    condiFila = condiFila * -1;
                }

            } else {
                condiFila--;
            }

        }

        return ab;
    }

    private static void imprimirArregloBidimensional(String arreglo[][]) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print(arreglo[i][j]);
            }
            System.out.println("");
        }
    }

    private static int ingresoNumero() {
        boolean condicion = false;
        int n = 0;
        while (condicion == false) {
            try {
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero positivo"));
                if (n % 2 == 0) {
                    condicion = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese solo un entero positivo");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese solo un entero positivo");
            }

        }
        return n;

    }

}
