
import java.util.Scanner;

/**
 *
 * @author fta
 */
public class Velomar {

    private static int codi = 0;
    private String dataAlta;
    private boolean tobogan;
    private boolean llogat;

    /*
     CONSTRUCTOR
     Paràmetres: valor per la data d'alta i pel tobogan
     Accions:
     - Assignar als atributs els valors passats com a paràmetres
     - A codi li hem d'assignar el següent enter que serà incrementant el valor
       actual de codi en 1.
     - Heu de tenir en compte que quan es crea una ombrella, l'atribut llogat 
       sempre és fals.
     */
    public Velomar() {

    }

    /*
     Mètodes accessors. No poden ser estàtics. Penseu com serà setCodi().    
     */
   

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari les dades per consola per crear un nou velomar. Les dades
       a demanar són les que passem per paràmetre en el constructor.
     - Quan demaneu si té tobogan o no, li heu de demanar a l'usuari que introdueixi
       1 si té i 0 si no té. En cas de no introduir cap dels dos valors se li 
       mostrarà un missatge avisant-lo de què el valor introduït no és correcte i
       se li tornarà a demanar el valor.
     Retorn: El nou velomar creat.
     */
    public static Velomar nouVelomar() {
       
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
       i modificar els atributs corresponents d'aquest objecte.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
       actual, abans de modificar-los.
     - Per mostrar si té tobogan o no, li heu de mostrar a l'usuari el missatge
       "Té tobogan", si en té, i "No té tobogan", si no en té.
     - Quan vulgueu modificar si té o no velomar, li heu de demanar a l'usuari que
       introdueixi 1 si té i 0 si no té. En cas de no introduir cap dels dos valors 
       se li mostrarà un missatge avisant-lo de què el valor introduït no és correcte i
       se li tornarà a demanar el valor.
     - Per modificar l'estat de lloguer del velomar, heu de fer servir el
       mètode modificarEstatLloguer() d'aquesta mateixa classe.
     - Tingueu en compte que el codi no es pot modificar.
     Retorn: cap
     */
    public void modificarVelomar() {
       
    }

    public void mostrarVelomar() {
        System.out.println("\nLes dades del velomar amb codi " + codi + " són:");
        System.out.println("\nData d'alta:" + dataAlta);
        
        System.out.println("\nEl velomar ");
        if (tobogan) {
            System.out.print("té tobogan");
        } else {
            System.out.print("no té tobogan");
        }
        
        System.out.println("\nEstat de lloguer:");
        if (llogat) {
            System.out.print("Llogat");
        } else {
            System.out.print("No llogat");
        }
    }

    public void modificarEstatLloguer() {
        Scanner dades = new Scanner(System.in);
        int opcio;

        System.out.println("\nL'estat actual de lloguer és: ");
        if (llogat) {
            System.out.print("Llogat");
        } else {
            System.out.print("No llogat");
        }

        do {
            System.out.println("\nEntra el nou estat de lloguer: (0 si no està llogat o 1 si està llogat)");
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
