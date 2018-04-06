/**
 * Clase principal del proyecto Altragamonedas que da inicio al juego.
 * @author  Diego Saavedra Tapia </dst005@alumnos.ucn.cl>
 * @version 1.0
 */
public class Jugar {

    //variable tragamonedasque es la maquina para jugar
    private Tragamoneda tragamonedas;

    /**
     * metodo que principal
     * @param args
     */
    public static void main(String[] args){
        //instanciuamos el tragamonedas
        tragamonedas = new Tragamoneda();
        //llamamos al metodo inciar de la clase Tragamoneda para inicar el juego
        tragamonedas.iniciar();

    }
}
