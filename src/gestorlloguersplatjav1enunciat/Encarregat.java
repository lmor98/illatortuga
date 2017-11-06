
import java.util.Scanner;

/**
 *
 * @author fta
 */
public class Encarregat {

    private String dni;
    private String nom;
    private String adreca;

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe
     Accions:
     - Assignar als atributs els valors passats com a paràmetres
     */
    public Encarregat( String pDni, String pNom, String pAdreca) {
       dni = pDni;
       nom = pNom;
       adreca = pAdreca;
    }

    /*
     Mètodes accessors    
     */
    

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari les dades per consola per crear un nou encarregat de zona.
       Les dades a demanar són les que passem per paràmetre en el constructor.
     - També heu de tenir en compte que tant el nom com l'adreça, poden ser frases,
       per exemple, Francesc Xavier, o bé, c/ Pau Casals, 42.
     Retorn: El nou encarregat de zona creat.
     */
    public static Encarregat nouEncarregat() {
       
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
       i modificar els atributs corresponents d'aquest objecte.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
       actual, abans de modificar-los.
     Retorn: cap
     */
    public void modificarEncarregat() {
        
    }

    public void mostrarEncarregat() {
        System.out.println("\nLes dades de l'encarregat amb dni " + dni + " són:");
        System.out.println("\nNom:" + nom);
        System.out.println("\nAdreça:" + adreca);
    }
}
