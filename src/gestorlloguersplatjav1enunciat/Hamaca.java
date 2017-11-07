
import java.util.Scanner;

/**
 *
 * @author fta
 */
public class Hamaca {

    private int codi;
    private static int properCodi=0;
    private String dataAlta;
    private boolean llogat;

    /*
     CONSTRUCTOR
     Paràmetres: valor per la data d'alta
     Accions:
     - Assignar als atributs els valors passats com a paràmetres
     - A codi li hem d'assignar el següent enter que serà incrementant el valor
       actual de codi en 1.
     - Heu de tenir en compte que quan es crea una ombrella, l'atribut llogat 
       sempre és fals.
     */
    public Hamaca() {

    }

    /*
     Mètodes accessors. No poden ser estàtics. Penseu com serà setCodi().    
     */
    

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari les dades per consola per crear una nova hamaca. Les dades
       a demanar són les que passem per paràmetre en el constructor.
     Retorn: La nova hamaca creada.
     */
    public static Hamaca novaHamaca() {
        
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
       i modificar els atributs corresponents d'aquest objecte.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
       actual, abans de modificar-los.
     - Per modificar l'estat de lloguer de l'hamaca, heu de fer servir el
       mètode modificarEstatLloguer() d'aquesta mateixa classe.
     - Tingueu en compte que el codi no es pot modificar.
     Retorn: cap
     */
    public void modificarHamaca() {
       
    }

    public void mostrarHamaca() {
        System.out.println("\nLes dades de l'hamaca amb codi " + codi + " són:");
        System.out.println("\nData d'alta:" + dataAlta);
        System.out.println("\nEstat de lloguer:");
        if (llogat) {
            System.out.print("Llogada");
        } else {
            System.out.print("No llogada");
        }
    }

    public void modificarEstatLloguer() {
        Scanner dades = new Scanner(System.in);
        int opcio;

        System.out.println("\nL'estat actual de lloguer és: ");
        if (llogat) {
            System.out.print("Llogada");
        } else {
            System.out.print("No llogada");
        }

        do {
            System.out.println("\nEntra el nou estat de lloguer: (0 si no està llogada o 1 si està llogada)");
            opcio = dades.nextInt();

            switch (opcio) {
                case 0:
                    llogat = true;
                    break;
                case 1:
                    llogat = false;
                    break;
                default:
                    System.out.println("\nEl valor introduit no és correcte");
                    break;
            }
        } while (opcio != 0 && opcio != 1);
    }
}
