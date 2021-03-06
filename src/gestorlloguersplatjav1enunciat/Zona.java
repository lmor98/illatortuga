package gestorlloguersplatjav1enunciat;
import java.util.Scanner;

/**
 *
 * @author fta
 */
public class Zona {

    private String codi;
    private Lloguer lloguers[];
    private int indexLloguers = 0;
    private Velomar velomars[];
    private Ombrella ombrelles[];
    private Encarregat encarregats[];

    /*
     CONSTRUCTOR
     Parāmetres: valors per tots els atributs de la classe menys els vectors
     Accions:
     - Assignar als atributs els valors passats com a parāmetres
     - L'atribut lloguers s'ha d'inicialtizar buit i amb una capacitat per 300 lloguers.
     - L'atribut velomars s'ha d'inicialtizar buit i amb una capacitat per 5 velomars.
     - L'atribut ombrelles s'ha d'inicialtizar buit i amb una capacitat per 20 ombrel.les.
     - L'atribut encarregats s'ha d'inicialtizar buit i amb una capacitat per 3 encarregats.
     */
    public Zona(String codi) {
        this.codi = codi;
        lloguers = new Lloguer[300];
        velomars = new Velomar[5];
        ombrelles = new Ombrella[20];
        encarregats = new Encarregat[3];
    }

    /*
     Mčtodes accessors. No han de ser estātics.
     */
    
    public String getCodi() {
        return codi;
    }

    public Lloguer[] getLloguers() {
        return lloguers;
    }

    public int getIndexLloguers() {
        return indexLloguers;
    }

    public Velomar[] getVelomars() {
        return velomars;
    }

    public Ombrella[] getOmbrelles() {
        return ombrelles;
    }

    public Encarregat[] getEncarregats() {
        return encarregats;
    }

    
    public void setCodi(String codi) {
        this.codi = codi;
    }

    public void setLloguers(Lloguer[] lloguers) {
        this.lloguers = lloguers;
    }

    public void setIndexLloguers(int indexLloguers) {
        this.indexLloguers = indexLloguers;
    }

    public void setVelomars(Velomar[] velomars) {
        this.velomars = velomars;
    }

    public void setOmbrelles(Ombrella[] ombrelles) {
        this.ombrelles = ombrelles;
    }

    public void setEncarregats(Encarregat[] encarregats) {
        this.encarregats = encarregats;
    }
    

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari les dades per consola per crear una nova zona. Les dades
       a demanar són les que passem per paràmetre en el constructor.
     Retorn: La nova zona creada.
     */
    
    public static Zona novaZona() {
        Scanner in = new Scanner(System.in);
        
        String codi;   

        
        System.out.println("Introdueix el nou codi de zona");
        codi = in.nextLine();

        System.out.println("Zona creat satisfactoriament");

        Zona NewZona = new Zona(codi);

       return NewZona; 
    }
    /*
     LLOGUERS
     */
 /*
     Paràmetres:lloguer
     Accions:
     - afegeix el lloguer passat per paràmetre a la primera posició buida del vector 
       de lloguers de la zona actual.
     Retorn: cap
     */
        
    public void afegirLloguer(Lloguer noulloguer) {
        lloguers[indexLloguers] = noulloguer; 
        indexLloguers++;
      
    }
    

    public void mostrarZona() {
        System.out.println("\nLes dades de la zona amb codi " + codi + " són:");

        System.out.println("\nLloguers:");
        for (int i = 0; i < lloguers.length && lloguers[i] != null; i++) {
            lloguers[i].mostrarLloguer();
        }

        System.out.println("\nOmbrel.les:");
        for (int i = 0; i < ombrelles.length && ombrelles[i] != null; i++) {
            ombrelles[i].mostrarOmbrella();
        }

        System.out.println("\nVelomars:");
        for (int i = 0; i < velomars.length && velomars[i] != null; i++) {
            velomars[i].mostrarVelomar();
        }

        System.out.println("\nEncarregats:");
        for (int i = 0; i < encarregats.length && encarregats[i] != null; i++) {
            encarregats[i].mostrarEncarregat();
        }
    }

    /*
     Paràmetres: Lloguer
     Accions:
     - Modifica l'estat dels elements llogats a no llogats del lloguer passat per
       paràmetre de la zona actual. 
     - Si el lloguer no existeix se li mostrarà a l'usuari el missatge "El lloguer
       no existeix"
     Retorn: cap
     */
    public void tancarLloguer(Lloguer tancarLloguer) {
        //un elemento alquilado lo pasamo a null
        lloguers[tancarLloguer] = null;
        
        //si el aquiler no existe mostrar al usuario el siguiente error
        for(int i = 0; i < lloguers.length; i++){
            if(lloguers[i] == null){
                System.out.println("El alquiler no existe");
            }else{
                System.out.println("El alquiler si que existe");
            }
        }
    }

    public int seleccionarLloguer() {
        Scanner dades = new Scanner(System.in);
        System.out.println("\nCodi del lloguer?:");
        int codi = dades.nextInt();

        int pos = -1;
        for (int i = 0; i < indexLloguers; i++) {
            if (lloguers[i] != null && lloguers[i].getCodi() == codi) {
                pos = i;
                return pos;
            }
        }
        
        return pos;
    }

    /*
     VELOMAR
     */
 /*
     Paràmetres:Velomar
     Accions:
     - afegeix el velomar passat per paràmetre al primer espai buit del vector de 
       velomars de la zona actual.
     Retorn: cap
     */
    public void afegirVelomar(Velomar nouVelomar) {
        velomars[indexLloguers] = nouVelomar; 
        indexLloguers++;

    }

    /*
     Paràmetres:codi del velomar
     Accions:
     - treu el velomar del codi passat per paràmetre del vector de velomars de la zona 
       actual.
     - a la posició que ocupa aquest velomar se li ha d'assignar el valor null,
       què és la manera de treure el velomar del vector de velomars.
     Retorn: cap
     */
    public void treureVelomar(Velomar treureVelomar) {
        velomars[treureVelomar] = null;
        
    }

    public int seleccionarVelomar(int codi) {
        int pos = -1;

        if (codi == -1) {
            Scanner dades = new Scanner(System.in);
            System.out.println("\nCodi del velomar?:");
            codi = dades.nextInt();
        }

        for (int i = 0; i < velomars.length; i++) {
            if (velomars[i] != null && velomars[i].getCodi() == codi) {
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
     Paràmetres:Encarregat
     Accions:
     - afegeix l'encarregat passat per paràmetre al primer espai buit del vector 
       d'encarregats de la zona actual.
     Retorn: cap
     */
    public void afegirEncarregat(Encarregat nouEncarregat) {
        encarregats[indexLloguers] = nouEncarregat; 
        indexLloguers++;
    }

    /*
     Paràmetres:dni de l'encarregat
     Accions:
     - treu l'encarregat del DNI passat per paràmetre del vector de velomars de la zona 
       actual.
     - a la posició que ocupa aquest encarregat se li ha d'assignar el valor null,
       què és la manera de treure l'encarregat del vector d'encarregats.
     Retorn: cap
     */
    public void treureEncarregat(Encarregat[] treureDniEncarregat) {
        encarregats[treureDniEncarregat] = null;
    }

    public int seleccionarEncarregat(String dni) {
        int pos = -1;

        if (dni == null) {
            Scanner dades = new Scanner(System.in);
            System.out.println("\nDni de l'encarregat?:");
            dni = dades.next();
        }

        for (int i = 0; i < encarregats.length; i++) {
            if (encarregats[i] != null && encarregats[i].getDni().equals(dni)) {
                pos = i;
                return pos;
            }
        }

        return pos;
    }

    /*
     OMBRELLA
     */
 /*
     Paràmetres:Ombrella
     Accions:
     - afegeix l'ombrel.la passada per paràmetre al primer espai buit del vector 
       d'ombrel.les de la zona actual.
     Retorn: cap
     */
    public void afegirOmbrella(Ombrella novaOmbrella) {
       ombrelles[indexLloguers] = novaOmbrella; 
       indexLloguers++;
    }

    /*
     Paràmetres:codi de l'ombrel.la
     Accions:
     - treu l'omrel.la del codi passat per paràmetre del vector d'ombrel.les de 
        la zona actual.
     - a la posició que ocupa aquesta ombrel.la se li ha d'assignar el valor null,
       què és la manera de treure l'ombrel.la del vector d'ombrel.les.
     Retorn: cap
     */
    public void treureOmbrella() {
       
    }

    public int seleccionarOmbrella(int codi) {
        int pos = -1;

        if (codi == -1) {
            Scanner dades = new Scanner(System.in);
            System.out.println("\nCodi de l'ombrel.la?:");
            codi = dades.nextInt();
        }

        for (int i = 0; i < ombrelles.length; i++) {
            if (ombrelles[i] != null && ombrelles[i].getCodi() == codi) {
                pos = i;
                return pos;
            }
        }

        return pos;
    }

}
