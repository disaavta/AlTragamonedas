
/**
    Clase que tiene las caracteristicas de un jugador.
 **/
public class Jugador {



    /**
     * saldo inicial
     */
    private int saldoInicial;

    /**
     * variable que tiene la apuesta del jugador
     */
    private int apuesta;


    /**
     * variable que contiene el saldo en juego del jugador.
     */
    private int saldo;

    /**
     * constructor de la clase jugador.
     * se le reconoce un saldo inicial
     */
    public Jugador(){
        //todo jugador parte con un saldo inicial de 1000
        this.saldoInicial=1000;
        //por default el saldo del jugador al inicio es el saldo inicial
        this.saldo=saldoInicial;
    }//end constructor

    /**
     *metodo que cambia la apuesta del jugador
     * @param apuesta
     */
    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }//end metodo setApuesta

    /**
     *metodo que retorna la apuesta del jugador.
     * @return retorna la apuesta del jugador
     */
    public int getApuesta() {
        return apuesta;
    }//end metodo getAppuesta

    /**
     * metodo que retorna el sldo actual  del jugador
     * @return retorna el saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * metodo que cambia el saldo del jugador al apostar
     * @param saldo, se envia el saldo ajustado
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}//end clase Jugador
