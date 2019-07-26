package manejoarreglo;

import java.util.Scanner;

/**
 *
 * @author cavargas10
 */
public class ManejoArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] valores = new int[4];
        int numero = 0;

        Scanner sc = new Scanner(System.in);

        valores[1 + 1] = 35;
        //valores [4] = 25;

        /*System.out.println(valores[3]);
        for (int i = 0; i<valores.length;i++){
            System.out.println(valores[i]);
        }
         */
        for (int i = 0; i < valores.length; i++) {

            System.out.printf("Ingrese el valor en la posicion : %d ", i);
            valores[i] = sc.nextInt();
        }

        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

    }

}

