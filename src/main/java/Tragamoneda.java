import java.time.LocalDateTime;

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
    private LocalDateTime tiempo;

    /**
     * constructor vacio de la clase Tragamonedas
     */
    public Tragamoneda(int apuestaJugador){
            this.rueda1=0;
            this.rueda2=0;
            this.rueda3=0;
            this.apuesta=apuestaJugador;
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
        //si la cantidad de asterisco es igual a 1,2 0 3, retorna lo siguiente segun la cantidad
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
        }//end if catidad de asteriscos


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

        if (r1 == 10) {
            contAsterisco++;
        }

        if (r2 == 10) {
            contAsterisco++;
        }

        if (r3 == 10) {
            contAsterisco++;
        }

        return contAsterisco;
    }//end method "asterisco".

}
