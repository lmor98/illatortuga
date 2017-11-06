
import java.util.Scanner;

/**
 *
 * @author fta
 */
public class Ombrella {

    private static int codi = 0;
    private String dataAlta;
    private Hamaca[] hamaques;
    private boolean llogat;

    /*
     CONSTRUCTOR
     Paràmetres: valor per la data d'alta
     Accions:
     - Assignar als atributs els valors passats com a paràmetres
     - A codi li hem d'assignar el següent enter que serà incrementant el valor
       actual de codi en 1.
     - Hem d'inicialitzar hamaques a buit tenint en compte que una ombrel·la pot
       tenir 4 hamaques com a màxim .
     - Heu de tenir en compte que quan es crea una ombrella, l'atribut llogat 
       sempre és fals.
     */
    public Ombrella() {
  
    }

    /*
     Mètodes accessors. No poden ser estàtics. Penseu com serà setCodi().    
     */
    
    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari les dades per consola per crear una nova ombrel.la. Les dades
       a demanar són les que passem per paràmetre en el constructor.
     Retorn: La nova ombrel.la creada.
     */
    public static Ombrella novaOmbrella() {
        
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
       i modificar els atributs corresponents d'aquest objecte.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
       actual, abans de modificar-los.
     - Per modificar l'estat dee lloguer de l'ombrel.la, heu de fer servir el
       mètode modificarEstatLloguer() d'aquesta mateixa classe.
     - Tingueu en compte que el codi no es pot modificar i no és el mètode que 
       farem servir per modificar les hamaques.
     Retorn: cap
     */
    public void modificarOmbrella() {
       
    }

    public void mostrarOmbrella() {
        System.out.println("\nLes dades de l'ombrel.la amb codi " + codi + " són:");
        System.out.println("\nData d'alta:" + dataAlta);
        System.out.println("\nEstat de lloguer:");
        if (llogat) {
            System.out.print("Llogada");
        } else {
            System.out.print("No llogada");
        }

        for (int i = 0; i < hamaques.length && hamaques != null; i++) {
            hamaques[i].mostrarHamaca();
        }
    }

    /*
     Paràmetres: Hamaca
     Accions:
     - afegeix l'hamaca passada per paràmetre al vector hamaques de l'ombrel.la
       actual.
     - L'hamaca s'ha d'afegir en el primer espai buit que trobeu en el vector
       d'hamaques.
     - Tingueu en compte que quan afegim una hamaca a una ombrel.la és perquè es
       lloga juntament amb l'ombrel.la, per tant, heu de modificar el seu estat 
       de lloguer.
     Retorn: cap
     */
    public void afegirHamaca() {
        
    }

    /*
     Paràmetres: Hamaca
     Accions:
     - Treu l'hamaca passada per paràmetre del vector hamaques de l'ombrel.la
       actual.
     - La posició del vector hamaques on es troba l'hamaca, s'ha de substituir 
       per un null, és la manera com treiem l'hamaca del vector.
     - Si l'hamaca no està en el vector, s'ha d'avisar a l'usuari amb el 
       missatge "L'hamaca no està en el llistat".
     - Tingueu en compte que quan treiem una hamaca a una ombrel.la és perquè ha
       finalitzat el seu lloguer juntament amb l'ombrel.la, per tant, heu de 
       modificar el seu estat de lloguer.
     Retorneu: cap
     */
    public void treureHamaca() {
        
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
