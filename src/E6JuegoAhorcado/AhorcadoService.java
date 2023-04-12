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
 Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
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

import java.util.Scanner;

/**
 *
 * @author AlejaDevelops
 */
public class AhorcadoService {
    Ahorcado juego1 = new Ahorcado();
    Scanner leer = new Scanner(System.in);
    
    public Ahorcado crearJuego(){
        
        System.out.println("Ingresa la palabra que deseas adivinar");
        juego1.setPalabra(leer.next().split(""));        
        System.out.println("Ingresa la cantidad máxima de intentos");
        juego1.setCantJuagadasMax(leer.nextInt());
        
        return juego1;        
    }
    
    public void longitud(Ahorcado a){
        a.setCantLetras(a.getPalabra().length);
        System.out.println("La cantidad de letras que tiene la palabra es: "+a.getCantLetras()); 
    }
    
    public boolean buscar(Ahorcado b){
        System.out.println("Ingresa una letra");
        String letra = leer.nextLine();
        String[] vectorAux = b.getPalabra();        
        int cont = 0;
        boolean bandera = true;
        
        for (int i = 0; b.getPalabra().length < 10; i++) {
            if (letra.equalsIgnoreCase(vectorAux[i])) {
                cont++;                
            }           
        }
        if (cont>0) {
            System.out.println("La letra fue encontrada en la Palabra");
            bandera = true;
        } else{
            System.out.println("La letra no fue encontrada en la Palabra");
            bandera = false;
        }
        return bandera;
    }
    
    public void encontradas(Ahorcado c){
        
        do {
            buscar(c);            
            
        } while (true);
        
        
    }
    
}
