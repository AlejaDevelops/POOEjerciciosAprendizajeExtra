/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
 Constructores, tanto el vacío como el parametrizado.
 Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
 Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
 Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
 Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
 Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
 Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
 */
package E6JuegoAhorcado;

/**
 *
 * @author AlejaDevelops
 */
public class Ahorcado {
    private String[] palabra;
    private int nLetrasEncontradas;
    private int nJugadasMax;
    private String[] palabraAux; //Se irá llenando con las letras encontradas
    private String[] letrasIngresadas; //Se irá llenando con las letras ingresadas pero que no están en la palabra

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int nLetrasEncontradas, int nJugadasMax, String[] palabraAux, String[] letrasIngresadas) {
        this.palabra = palabra;
        this.nLetrasEncontradas = nLetrasEncontradas;
        this.nJugadasMax = nJugadasMax;
        this.palabraAux = palabraAux;
        this.letrasIngresadas = letrasIngresadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getnLetrasEncontradas() {
        return nLetrasEncontradas;
    }

    public void setnLetrasEncontradas(int nLetrasEncontradas) {
        this.nLetrasEncontradas = nLetrasEncontradas;
    }

    public int getnJugadasMax() {
        return nJugadasMax;
    }

    public void setnJugadasMax(int nJugadasMax) {
        this.nJugadasMax = nJugadasMax;
    }

    public String[] getPalabraAux() {
        return palabraAux;
    }

    public void setPalabraAux(String[] palabraAux) {
        this.palabraAux = palabraAux;
    }

    public String[] getLetrasIngresadas() {
        return letrasIngresadas;
    }

    public void setLetrasIngresadas(String[] letrasIngresadas) {
        this.letrasIngresadas = letrasIngresadas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", nLetrasEncontradas=" + nLetrasEncontradas + ", nJugadasMax=" + nJugadasMax + ", palabraAux=" + palabraAux + ", letrasIngresadas=" + letrasIngresadas + '}';
    }


}

   