import java.time.*;

/**
 * Clase principal que simula un tragamonedas.
 *@author Diego Ignacio Saavedra Tapia </dst005@alumnos.ucn.cl>
 *@version 1.0
 *
 */

public class Tragamoneda {

    /**
     * variables de tipo entero que simulan las 3 ruedas del tragamonedas.
     */
    private int rueda1;
    private int rueda2;
    private int rueda3;

    /**
     * variabale de tipo entero que almacena la apuesta del jugador
     */
    private int apuesta;

    /**
     * variable que tiene el tiempo de inicio de juego, apra mensajes de la maquina
     */
    private LocalTime tiempo;

    /**
     * constructor vacio de la clase Tragamonedas
     */
    public Tragamoneda(int apuestaJugador){
            this.rueda1=0;
            this.rueda2=0;
            this.rueda3=0;
            this.apuesta=apuestaJugador;
            this.tiempo= LocalTime.now();
    }

    /**
     *
     * @return
     */
    public int jugar() {
        //asignamos valores a las ruedas de forma aleatoria
        //los valores son del 1 al 10, y en el caso que sea un 10 es porque es un asterisco (*==10)
        this.rueda1 = (int) (Math.random() * 10) + 1;
        this.rueda1 = (int) (Math.random() * 10) + 1;
        this.rueda1 = (int) (Math.random() * 10) + 1;
        //revisamos que las ruedas de la maquina no tengan asteriscos

        //variable auxiliar para guardar la cantidad de asteriscos en caso de que hayan.
        int auxAterisco = asterisco(rueda1,rueda2,rueda3);
        //si la cantidad de asterisco es igual a 1,2 o 3, retorna lo siguiente segun la cantidad
        if(auxAterisco!= 0){
            if(auxAterisco == 1){
                return 50;
            }else{
                if(auxAterisco == 2){
                    return 300;
                }else{
                    return 500;
                }
            }
        }else {//end if catidad de asteriscos
            //si el contador de asteriscos es == 0, entonces se debe preguntar si
            //se repiten 3 veces los digitos en las 3 ruedas del tragamonedas
            return premio(rueda1,rueda2,rueda3);
        }//end else 1

        return 0;
    }

    /**
     * Metodo que devuelve la cantidad de asteriscos que salen al girar la maquina tragamonedas
     * @param r1 variable rueda1, de tipo entero.
     * @param r2 variable rueda2, de tipo entero.
     * @param r3 variable rueda3, de tipo entero.
     * @return retorna la cantidad de asteriscos encontrados
     */

    public static int asterisco ( int r1, int r2, int r3){
        //variable para contar los asteriscos
        int contAsterisco = 0;

        //si la primera rueda tiene un asterisco
        if (r1 == 10) {
            //contados se le suma 1
            contAsterisco++;
        }//end if 1

        //si la segunda rueda tiene un asterisco, suma 1 al contador
        if (r2 == 10) {
            contAsterisco++;
        }//end if 2

        //si la tercera rueda tiene un asterisco, suma 1 al contador
        if (r3 == 10) {
            contAsterisco++;
        }//end if 3

        //retornamos el contador con la cantidad de asteriscos del juego.
        return contAsterisco;
    }//end method "asterisco".

    /**
     * metodo que indica si hubo premio al repetirse los mismos valores en el juego
     * @param r1 variabe rueda 1 de la maquina tragamonedas
     * @param r2 variable rueda 2 de la maquina tragamonedas
     * @param r3 variable rueda 3 de la maquina tragamonedas
     * @return retonra el valor del digito multiplicado por la apuesta del jugador
     */
    public static int premio(int r1,int r2, int r3){
        //variable para dar el premio
        int premioJuego=0;
        //si los 3 valores de las ruedas son iguales
        if(r1 == r2 && r2==r3 ){
            return r1*this.apuesta;
        }else{//en caso que no sean igual el premio es cero
            return 0;
        }//end else

        return 0;
    }//end metodo premio

    /**
     * metodo que retorna el tiempo en que se esta usando la maquina tragamonedas
     * @return retorna el saludo, en caso del tiempo
     */
    public static String saludo(){
        //variables que almacenan las cotas de horas para dar el mensaje de buenos dias.
        LocalTime tiempoBuenosDias = LocalTime.of(6, 0, 0, 0); //06:00:00:00
        LocalTime tiempoBuenosDias2 = LocalTime.of(11,59, 0, 0); //11:59:00:00

        //variables que almacenan las cotas de horas para dar el mensaje de buenas tardes.
        LocalTime tiempoBuenasTardes = LocalTime.of(12, 0, 0, 0); //12:00:00:00
        LocalTime tiempoBuenosTardes2 = LocalTime.of(19,59, 0, 0); //19:59:00:00

        //variables que almacenan las cotas de horas para dar el mensaje de buenas noches.
        LocalTime tiempoBuenasNoches = LocalTime.of(20, 0, 0, 0); //20:00:00:00
        LocalTime tiempoBuenasNoches2 = LocalTime.of(05,59, 0, 0); //05:59:00:00

        //System.out.println(time.getHour()); //5
        //System.out.println(time.getMinute()); //30
        //System.out.println(time.getSecond()); //45
        //System.out.println(time.getNano()); //35

        //si el valor se encuantra entre, se da el siguiente mensaje
        if(this.tiempo <= tiempoBuenosDias2 && this.tiempo >= tiempoBuenosDias){
            //se retorna el saludos
            return "Buenos Días";
        }else{//if buenas tardes
            if(this.tiempo >= tiempoBuenasTardes && this.tiempo<=tiempoBuenosTardes2 ){
                return "Buenas tardes";
            }else{//end if buenas tardes
                return "Buenas noches";
            }//end else 2
        }//end else 1, if comparador de tiempo
    }//end metodo saludo

}//end TRagamonedas
