
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
    public Encarregat( String nouDni, String nouNom, String nouAdreca) {
       dni = nouDni;
       nom = nouNom;
       adreca = nouAdreca;
    }

    /*
     Mètodes accessors    
     */
    //metode accesor de DNI
    public String getDni(){
    return dni;
    }
    public void setDni(String nouDni) {
        dni = nouDni;
    }
    //metode accesor de Nom
    public String getNom(){
    return nom;
    }
    public void setNom(String nouNom) {
        dni = nouNom;
    }
    //metode accesor de adreça
    public String getAdreca(){
    return nom;
    }
    public void setAdeca(String nouAdreca) {
        dni = nouAdreca;
    }
    
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
        Scanner in = new Scanner(System.in);
        
        System.out.println("Introduce el DNI del nuevo encargado: ");
        String nouDni = in.nextLine();
        
        System.out.println("Introduce el nombre del nuevo encargado: ");
        String nouNom = in.nextLine();
         
        System.out.println("Introduce la direccion del nuevo encargado: ");
        String nouAdreca = in.nextLine();
       
        Encarregat nouEncarregat = new Encarregat(nouDni,nouNom,nouAdreca);
        
        return nouEncarregat ;
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
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("El DNI actual es "+dni+", para modificarlo escribelo a continuació: ");
         this.dni = in.nextLine();
        
        System.out.println("El Nombre actual es "+nom+", para modificarlo escribelo a continuació: ");
        this.nom = in.nextLine();
         
        System.out.println("El Nombre actual es "+adreca+", para modificarlo escribelo a continuació: ");
        this.adreca = in.nextLine();
    }

    public void mostrarEncarregat() {
        System.out.println("\nLes dades de l'encarregat amb dni " + dni + " són:");
        System.out.println("\nNom:" + nom);
        System.out.println("\nAdreça:" + adreca);
    }
}
