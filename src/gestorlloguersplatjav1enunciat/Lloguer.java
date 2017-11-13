package  gestorlloguersplatjav1enunciat;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author fta
 */
public class Lloguer {

     private static final double VALOR = 8.0;
    private int codi;
    private static int properCodi=0;
    private String codiZona;
    private String dniEncarregat;
    private int idElementLloguer;
    private String dniClient;
    private LocalTime horaLloguer;
    private LocalTime tempsLloguer;
    private double totalPagar;
    private boolean pagat;

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els seus atributs, menys el codi i l'hora de lloguer
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     - A codi li hem d'assignar el següent enter que serà incrementant el valor
       actual de codi en 1.
     - A l'atribut horaLloguer, se li ha d'assignar l'hora actual del sistema.
     */
    public Lloguer(String nouCodiZona, String nouDniEncarregat, int nouIdElementLloguer, String nouDniClient, LocalTime nouTempsLloguer, double nouTotalPagar, boolean nouPagat) {
        properCodi=codi++;
        codiZona = nouCodiZona;
        dniEncarregat = nouDniEncarregat;
        idElementLloguer = nouIdElementLloguer;
        dniClient = nouDniClient;
        tempsLloguer = nouTempsLloguer;
        horaLloguer = LocalTime.now();
        totalPagar = nouTotalPagar;
        pagat = nouPagat;
        
    }

 

    /*
     Mètodes accessors. No poden ser estàtics. Penseu com serà setCodi().    
     */
    public void horaLloguer(int pHora, int minuts, int segons, int nanosegons) {
        horaLloguer = LocalTime.of(pHora, minuts, segons, nanosegons);
    }
    public void setCodi(int noucodi) {
        this.codi = noucodi;
    }

     public int getCodi() {
        return codi;
    }
    
    public static void setProperCodi(int nouproperCodi) {
        Lloguer.properCodi = nouproperCodi;
    }

     public static int getProperCodi() {
        return properCodi;
    }
    public void setCodiZona(String nouCodiZona) {
        this.codiZona = nouCodiZona;
    }

     public String getCodiZona() {
        return codiZona;
    }
    
    public void setDniEncarregat(String nouDniEncarregat) {
        this.dniEncarregat = nouDniEncarregat;
    }

    public String getDniEncarregat() {
        return dniEncarregat;
    }
    
    public void setIdElementLloguer(int nouIdElementLloguer) {
        this.idElementLloguer = nouIdElementLloguer;
    }

    public int getIdElementLloguer() {
        return idElementLloguer;
    }
    
    public void setDniClient(String nouDniClient) {
        this.dniClient = nouDniClient;
    }

      public String getDniClient() {
        return dniClient;
    }
    
    public void setHoraLloguer(LocalTime nouHoraLloguer) {
        this.horaLloguer = nouHoraLloguer;
    }

     public LocalTime getHoraLloguer() {
        return horaLloguer;
    }
    
    public void setTempsLloguer(LocalTime nouTempsLloguer) {
        this.tempsLloguer = nouTempsLloguer;
    }

     public LocalTime getTempsLloguer() {
        return tempsLloguer;
    }
    
    public void setTotalPagar(double nouTotalPagar) {
        this.totalPagar = nouTotalPagar;
    }

    public double getTotalPagar() {
        return totalPagar;
    }
    
    public void setPagat(boolean nouPagat) {
        this.pagat = nouPagat;
    }
    
    public boolean getPagat() {
        return pagat;
    } 

    /*
     Paràmetres: platja de la zona on es crearà un lloguer
     Accions:
     - Demanar a l'usuari les dades per consola per crear un nou lloguer d'un dels
       elements per llogar d'una de les zones de la platja passada per paràmetre 
       que fa l'encarregat de la zona. Les dades a demanar són les que passem per
       paràmetre en el constructor.
     - Quan demaneu si està pagat o no, li heu de demanar a l'usuari que introdueixi
       1 si està pagat i 0 si no ho està. En cas de no introduir cap dels dos valors 
       se li mostrarà un missatge avisant-lo de què el valor introduït no és correcte i
       se li tornarà a demanar el valor.
     - El total a pagar s'ha de calcular tenint en compte que una hora de lloguer 
       de qualsevol element de lloguer és el valor que indica l'atribut VALOR.
       (les ombrel.les amb les seves hamaques les considrarem un únic element de
        lloguer)
    
    NOTA: Heu de tenir en compte que:
     - Els elements es poden llogar per només mitja hora, per hores o per hores i mitja.
       Per exemple, un lloguer de 30 minuts, un de 4 hores o un lloguer de 2 hores i 30 minuts.
     - L'horari de lloguer ha de ser l'hora del sistema en el moment de crear el lloguer.
     - Penseu com demanareu a l'usuari el temps de lloguer, tenint en compte que
       es tracta d'un LocalTime.
     - Abans d'assignar el codi de la zona o el dni de l'encarregat hem de comprovar 
       que existeixen mitjançant els mètodes seleccionarZona() de la classe Platja 
       i seleccionarEncarregat() de la classe Zona respectivament. Si no existeixen,
       hem de mostrar un missatge a l'usuari avisant que no existeixen i tornar 
       a demanar que introdueixi el codi o dni segons sigui zona o encarregat.
     - Per assignar el codi de l'element de lloguer, heu de seleccionar l'element
       de lloguer mitjançant el mètode seleccionarElementLloguer() d'aquesta classe. 
     Retorn: El nou lloguer creat.
     */
    public static Lloguer nouLloguer() {
        Scanner in = new Scanner(System.in);
        
        //introducimos los parametros para nos pidan los datos por pantalla
        System.out.println("Introduce el codigo de la zona en la que quieres realizar el alquiler: ");
        String nouCodiZona = in.nextLine();
        
        System.out.println("Introduce el DNI del encargado: ");
        String nouDniEncarregat = in.nextLine();
        
        System.out.println("Introduce el id del elemento de alquiler: ");
        int nouIdElementLloguer = in.nextInt();
        
        System.out.println("Introduce el DNI del cliente: ");
        String nouDniClient = in.nextLine();
        
        System.out.println("Introduce el tiempo de alquiler: ");
        LocalTime nouTempsLloguer = LocalTime.now();
        
        System.out.println("Introduce la hora de alquiler: ");
        String nouHoraLloguer = in.nextLine();
        
        System.out.println("Introduce importe a pagar: ");
        double nouTotalPagar = in.nextDouble();
        
        System.out.println("Introduce si esta pagado el aquiler :  1 si està pagado i 0 si no lo està ");
        boolean nouPagat = in.nextBoolean();
        
        Lloguer nouLoguer = new Lloguer(nouCodiZona,nouDniEncarregat,nouIdElementLloguer,nouDniClient, nouTempsLloguer,nouTotalPagar,nouPagat);
        
        return nouLoguer;
    }

    public static int seleccionarElementLloguer(int posZona, Platja platja) {
        Scanner dades = new Scanner(System.in);
        int opcio = 0;
        int pos;
        int codi = 0;

        do {

            switch (opcio) {
                case 0:
                    System.out.println("Selecciona un element:");
                    System.out.println("1. Velomar.");
                    System.out.println("2. Ombrel.la.");
                    break;

                case 1:
                    do {
                        pos = platja.getZones()[posZona].seleccionarVelomar(-1);
                        if (pos == -1) {
                            System.out.println("\nEl velomar no existeix.");
                        } else {
                            platja.getZones()[posZona].getVelomars()[pos].setLlogat(true);
                            codi = platja.getZones()[posZona].getVelomars()[pos].getCodi();
                        }
                    } while (pos == -1);
                    break;

                case 2:
                    do {
                        pos = platja.getZones()[posZona].seleccionarOmbrella(-1);
                        if (pos == -1) {
                            System.out.println("\nL'ombrel.la no existeix.");
                        } else {
                            platja.getZones()[posZona].getOmbrelles()[pos].setLlogat(true);
                            codi = platja.getZones()[posZona].getOmbrelles()[pos].getCodi();
                        }
                    } while (pos == -1);

                    int hamaques = 0;
                    do {
                        System.out.println("Quantes hamaques vols?");
                        hamaques = dades.nextInt();
                    } while (hamaques < 0 && hamaques > 4);

                    for (int i = 0; i < hamaques; i++) {
                        do {
                            pos = platja.seleccionarHamaca();
                            if (pos == -1) {
                                System.out.println("\nL'hamaca no existeix.");
                            } else {
                                platja.getZones()[posZona].getOmbrelles()[pos].afegirHamaca(platja.getHamaques()[pos]);
                            }
                        } while (pos == -1);
                    }
                    break;

                default:
                    System.out.println("Selecciona una opció correcta");
                    break;
            }

        } while (opcio == 0);

        return codi;
    }

    public void mostrarLloguer() {
        System.out.println("\nLes dades del lloguer amb codi " + codi + " són:");
        System.out.println("\nEncarregat: " + dniEncarregat);
        System.out.println("\nElement lloguer: " + idElementLloguer);
        System.out.println("\nClient: " + dniClient);
        System.out.println("\nHora lloguer: " + horaLloguer.getHour() + ":" + horaLloguer.getMinute() + ":" + horaLloguer.getSecond());
        System.out.println("\nTemps lloguer: " + tempsLloguer.getHour() + ":" + tempsLloguer.getMinute());
        System.out.println("\nTotal pagar: " + totalPagar);
        if (pagat) {
            System.out.println("\nPagat");
        } else {
            System.out.println("\nPendent de pagar");
        }
    }
}
