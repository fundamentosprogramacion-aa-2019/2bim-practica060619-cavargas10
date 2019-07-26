package manejoarreglo;

/**
 *
 * @author cavargas10
 */
public class ManejoEstructuraDos {

    public static void main(String[] args) {
        //listado de trabajadores marjan de la ciudad de loja tiene un sueldo de 900.1

        String[] listaNombres = {"Marjna", "Jhon", "Rodrigo", "Miguel", "Jose"};
        String[] listaCiudades = {"Loja", "Catamayo", "Calvas", "Celica",
            "Pindal"};
        double[] listaSueldos = {900.1, 1000.2, 450.3, 1500.2, 861.9};
        String mensajeFinal = "";

        mensajeFinal = String.format("%s%s\n", mensajeFinal, "Lista de "
                + "Trabajadores\n");

        for (int i = 0; i < listaNombres.length; i++) {
            /*System.out.printf("Nombre: %s\n",listaNombres[i]);
            System.out.printf("Ciudad: %s\n",listaCiudades[i]);
            System.out.printf("Sueldo: %s\n",listaSueldos[i]);*/

            mensajeFinal = String.format("%s%s de la ciudad de %s\ntiene un "
                    + "sueldo de %.2f$\n\n", mensajeFinal, listaNombres[i],
                    listaCiudades[i], listaSueldos[i]);
        }

        System.out.printf("%s", mensajeFinal);
    }
}
