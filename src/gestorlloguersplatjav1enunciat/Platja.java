package gestorlloguersplatjav1enunciat;
import java.util.Scanner;

/**
 *
 * @author fta
 */
public class Platja {

    private String coordenades;
    private String nom;
    private Velomar velomars[];
    private Ombrella ombrelles[];
    private Hamaca hamaques[];
    private Encarregat encarregats[];
    private Zona zones[];

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe menys els
    vectors
     Accions:
     - Assignar als atributs els valors passats com a paràmetres     
     - L'atribut velomars s'ha d'inicialtizar buit i amb una capacitat per 50 velomars.
     - L'atribut ombrelles s'ha d'inicialtizar buit i amb una capacitat per 200 ombrel.les.
     - L'atribut encarregats s'ha d'inicialtizar buit i amb una capacitat per 30 encarregats.
     - L'atribut hamaques s'ha d'inicialtizar buit i amb una capacitat per 800 hamaques.
     - L'atribut zones s'ha d'inicialtizar buit i amb una capacitat per 10 zones.
     */
    public Platja(String novesCoordenades, String nouNom) {
        this.coordenades = novesCoordenades;
        this.nom = nouNom;
    }


    /*
     Mètodes accessors.
     */

    public void setCoordenades(String novesCoordenades) {
        this.coordenades = novesCoordenades;
    }

    public void setNom(String nouNom) {
        this.nom = nouNom;
    }

    public void setVelomars(Velomar[] velomars) {
        this.velomars = velomars;
    }

    public void setOmbrelles(Ombrella[] ombrelles) {
        this.ombrelles = ombrelles;
    }

    public void setHamaques(Hamaca[] hamaques) {
        this.hamaques = hamaques;
    }

    public void setEncarregats(Encarregat[] encarregats) {
        this.encarregats = encarregats;
    }

    public void setZones(Zona[] zones) {
        this.zones = zones;
    }
    
    public String getCoordenades() {
        return coordenades;
    }

    public String getNom() {
        return nom;
    }

    public Velomar[] getVelomars() {
        return velomars;
    }

    public Ombrella[] getOmbrelles() {
        return ombrelles;
    }

    public Hamaca[] getHamaques() {
        return hamaques;
    }

    public Encarregat[] getEncarregats() {
        return encarregats;
    }

    public Zona[] getZones() {
        return zones;
    }
    

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari les dades per consola per crear una nova platja. Les dades
       a demanar són les que passem per paràmetre en el constructor.
     - Heu de tenir en compte que el nom, pot ser una frases, per exemple, Cala Estància.
     Retorn: La nova platja creada.
     */
    public static Platja novaPlatja() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce unas nuevas coordenadas:");
        String coordenades = in.nextLine();
        
        System.out.println("Introduce un nuevo nombre para la playa:");
        String nom = in.nextLine();
        
        Platja newPlatja = new Platja(coordenades, nom);
        return newPlatja;
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades 
        de l'objecte actual i modificar els atributs 
        corresponents d'aquest objecte.
     - Les coordenades seran l'índex de la platja, per tant 
        no es poden modificar.
     - Li heu de mostrar a l'usuari el valor actual dels 
        atributs de l'objecte actual, abans de modificar-los.
     - Aquest mètode no modificarà els vectors dels 
        diferents elements de la platja.
     Retorn: cap
     */
    public void modificarPlatja() {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Tus coordenadas son las siguientes:" + coordenades +
        " para modificar tus coordenadas escriba a continuación:");
        String coordenades = in.nextLine();
        
        System.out.println("El nombre de la playa actual es: " + nom +
        " para modificar el nombre escriba a continuación:");
        String nom = in.nextLine();
    }

    public void mostrarPlatja() {
        System.out.println("\nLes dades de la platja amb nom " + nom + " i coordenades " + coordenades + " són:");

        System.out.println("\nZones:");
        for (int i = 0; i < zones.length && zones[i] != null; i++) {
            zones[i].mostrarZona();
        }

        System.out.println("\nOmbrel.les:");
        for (int i = 0; i < ombrelles.length && ombrelles[i] != null; i++) {
            ombrelles[i].mostrarOmbrella();
        }

        System.out.println("\nVelomars:");
        for (int i = 0; i < velomars.length && velomars[i] != null; i++) {
            velomars[i].mostrarVelomar();
        }

        System.out.println("\nHamaques:");
        for (int i = 0; i < hamaques.length && hamaques[i] != null; i++) {
            hamaques[i].mostrarHamaca();
        }

        System.out.println("\nEncarregats:");
        for (int i = 0; i < encarregats.length && encarregats[i] != null; i++) {
            encarregats[i].mostrarEncarregat();
        }
    }

    /*
     VELOMAR
     */
 /*
     Paràmetres:cap
     Accions:
     - afegeix un nou velomar al primer espai buit del vector de velomars de la platja 
       actual, si aquest no està afegit.     
     - per saber si està afegit o no, farem servir el mètode seleccionarVelomar() 
       d'aquesta classe.
     - si el velomar ja està afegit a la platja, se li mostrarà un missatge a l'usuari
       finalitzant el mètode.
     Retorn: cap
     */
    public void afegirVelomar() {
        
    }

    /*
     Paràmetres:cap
     Accions:
     - treu el velomar seleccionat mitjançant el mètode selccionarVelomar() del
       vector de velomars de la platja actual.
     - si el velomar no és d'aquestaa platja, li mostrarem a l'usuari un missatge
       finalitzant el mètode.
     Retorn: cap
     */
    public void treureVelomar() {
        
    }

    public int seleccionarVelomar() {
        Scanner dades = new Scanner(System.in);
        System.out.println("\nCodi del velomar?:");
        int codi = dades.nextInt();
        int pos = -1;
        for (int i = 0; i < velomars.length; i++) {
            if (velomars[i] != null && velomars[i].getCodi() == codi) {
                pos = i;
                return pos;
            }
        }
        return pos;
    }

    /*
    OMBREL.LA
     */
 /*
     Paràmetres:cap
     Accions:
     - afegeix una nova ombrel.la al primer espai buit del vector d'ombrel.les de 
       la platja actual, si aquesta no està afegida.     
     - per saber si està afegida o no, farem servir el mètode seleccionarOmbrella() 
       d'aquesta classe.
     - si l'ombrella ja està afegida a la platja, se li mostrarà un missatge a l'usuari
       finalitzant el mètode.
     Retorn: cap
     */
    public void afegirOmbrella() {

    }

    /*
     Paràmetres:cap
     Accions:
     - treu l'ombrel.la seleccionada mitjançant el mètode selccionarOmbrel.la() del
       vector d'ombrel.les de la platja actual.
     - si l'ombrel.la no és d'aquesta platja, li mostrarem a l'usuari un missatge
       finalitzant el mètode.
     Retorn: cap
     */
    public void treureOmbrella() {
       
    }

    public int seleccionarOmbrella() {
        Scanner dades = new Scanner(System.in);
        System.out.println("\nCodi de l'Ombrella?:");
        int codi = dades.nextInt();
        int pos = -1;
        for (int i = 0; i < ombrelles.length; i++) {
            if (ombrelles[i] != null && ombrelles[i].getCodi() == codi) {
                pos = i;
                return pos;
            }
        }
        return pos;
    }

    /*
    HAMACA
     */
 /*
     Paràmetres:cap
     Accions:
     - afegeix una nova hamaca al primer espai buit del vector d'ombrel.les de 
       la platja actual, si aquesta no està afegida.     
     - per saber si està afegida o no, farem servir el mètode seleccionarHamaca() 
       d'aquesta classe.
     - si l'hamaca ja està afegida a la platja, se li mostrarà un missatge a l'usuari
       finalitzant el mètode.
     Retorn: cap
     */
    public void afegirHamaca() {
        
    }

    /*
     Paràmetres:cap
     Accions:
     - treu l'hamaca seleccionada mitjançant el mètode selccionarHamaca() del
       vector d'hamaques de la platja actual.
     - si l'hamaca no és d'aquesta platja, li mostrarem a l'usuari un missatge
       finalitzant el mètode.
     Retorn: cap
     */
    public void treureHamaca() {
       
    }

    public int seleccionarHamaca() {
        Scanner dades = new Scanner(System.in);
        System.out.println("\nCodi de l'hamaca?:");
        int codi = dades.nextInt();
        int pos = -1;
        for (int i = 0; i < hamaques.length; i++) {
            if (hamaques[i].getCodi() == codi) {
                pos = i;
                return pos;
            }
        }
        return pos;
    }

    /*
    ZONA
     */
 /*
     Paràmetres:cap
     Accions:
     - afegeix una nova zona al primer espai buit del vector de zones de 
       la platja actual, si aquesta no està afegida.     
     - per saber si està afegida o no, farem servir el mètode seleccionarZona() 
       d'aquesta classe.
     - si la zona ja està afegida a la platja, se li mostrarà un missatge a l'usuari
       finalitzant el mètode.
     Retorn: cap
     */
    public void afegirZona() {
       
    }

    /*
     Paràmetres:cap
     Accions:
     - treu la zona seleccionada mitjançant el mètode selccionarZona() del
       vector de zones de la platja actual.
     - si la zona no és d'aquesta platja, li mostrarem a l'usuari un missatge
       finalitzant el mètode.
     Retorn: cap
     */
    public void treureZona() {
      
    }

    public int seleccionarZona() {
        Scanner dades = new Scanner(System.in);
        System.out.println("\nCodi de la zona?:");
        String codi = dades.next();
        int pos = -1;
        for (int i = 0; i < zones.length; i++) {
            if (zones[i].getCodi().equals(codi)) {
                pos = i;
                return pos;
            }
        }
        return pos;
    }

    /*
    ENCARREGAT
     */
 /*
     Paràmetres:cap
     Accions:
     - afegeix un nou encarregat al primer espai buit del vector d'encarregats de 
       la platja actual, si aquest no està afegit.     
     - per saber si està afegit o no, farem servir el mètode seleccionarEncarregat() 
       d'aquesta classe.
     - si l'encarregat ja està afegit a la platja, se li mostrarà un missatge a l'usuari
       finalitzant el mètode.
     Retorn: cap
     */
    public void afegirEncarregat() {
        
    }

    /*
     Paràmetres:cap
     Accions:
     - treu l'encarregat seleccionat mitjançant el mètode selccionarEncarregat() del
       vector d'encarregats de la platja actual.
     - si l'encarregat no és d'aquesta platja, li mostrarem a l'usuari un missatge
       finalitzant el mètode.
     Retorn: cap
     */
    public void treureEncarregat() {
       
    }

    public int seleccionarEncarregat() {
        Scanner dades = new Scanner(System.in);
        System.out.println("\nDNI de l'encarregat?:");
        String dni = dades.next();
        int pos = -1;
        for (int i = 0; i < encarregats.length; i++) {
            if (encarregats[i].getDni().equals(dni)) {
                pos = i;
                return pos;
            }
        }
        return pos;
    }
}
