
/**
    Clase que tiene las caracteristicas d eun jugador.
 **/
public class Jugador {

    public int getSaldo() {
        return saldo;
    }

    /**
     * saldo inicial
     */
    private int saldoInicial;

    /**
     * variable que tiene la auetsa del jugador
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
     * 
     * @param apuesta
     */
    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }

    public int getApuesta() {
        return apuesta;
    }


}//end clase Jugador
