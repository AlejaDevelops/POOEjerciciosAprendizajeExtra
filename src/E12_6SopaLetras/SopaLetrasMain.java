/*
Crear una clase Sopa de letras que contenga un atributo matriz, y otro palabra a encontrar.
Llenar una matriz de 10x10 con palabras de 5 caracteres (todas de forma horizontal, en orden)
inicializándola por defecto con “palabras preestablecidas”.
Crear métodos:
● Que el usuario ingrese una palabra y la busque en la matriz. Deberá retornar en que
posición de la matriz inicia la palabra.
● Imprimir la sopa de letras en pantalla
● Que el usuario pueda reemplazar una palabra especifica de la matriz ya pre -cargada (Es
decir, por ejemplo, que si en posición 0.0 estaba perro, cambiarla a polo). Para realizar esta
gestión, el método recibirá la palabra a buscar y a reemplazar sus datos
● Imprimir la sopa de letras, invertida (es decir, filas por columnas)
 */
package E12_6SopaLetras;

/**
 *
 * @author AlejaDevelops
 */
public class SopaLetrasMain {
    public static void main(String[] args) {
        System.out.println("***SOPA DE LETRAS ***");
        SopaLetrasService sls = new SopaLetrasService();
        SopaLetras sopa1 = sls.crearSopa();
        sls.buscarPalabra(sopa1);
        System.out.println("");
        System.out.println("MATRIZ INICIAL");
        sls.imprimir(sopa1);
        System.out.println("MATRIZ REEMPLAZO");
        sls.reemplazar(sopa1);
    }
}
