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


import java.util.Scanner;

/**
 *
 * @author Computador 1
 */
public class SopaLetrasService {
    Scanner leer = new Scanner(System.in);
    public SopaLetras crearSopa(){
        SopaLetras sopa1 = new SopaLetras();
        System.out.println("Cargando sopa de letras...");
        char[][] matriz = new char[][]{
            {'p', 'e', 'r', 'r', 'o', 'c', 'a', 't', 'o', 'r'},
            {'a', 's', 'i', 't', 'i', 'o', 'c', 'e', 'r', 'o'},
            {'l', 'e', 'c', 'h', 'e', 'm', 'o', 't', 'o', 'r'},
            {'o', 's', 'o', 's', 'o', 's', 'o', 's', 'o', 's'},
            {'p', 'e', 'r', 'r', 'o', 'p', 'e', 'r', 'r', 'o'},
            {'a', 's', 'i', 't', 'i', 'o', 'a', 's', 'i', 't'},
            {'l', 'e', 'c', 'h', 'e', 'l', 'e', 'c', 'h', 'e'},
            {'o', 's', 'o', 's', 'o', 's', 'o', 's', 'o', 's'},
            {'m', 'o', 't', 'o', 'r', 'm', 'o', 't', 'o', 'r'},
            {'r', 'a', 't', 'a', 's', 'a', 'r', 'a', 't', 'a'}
        };
        sopa1.setMatriz(matriz);
        
        do {            
            System.out.println("Ingrese una palabra de máximo 5 caracteres");
            sopa1.setPalabra(leer.nextLine());
            if (sopa1.getPalabra().length()>5) {
                System.out.println("Palabra no valida.");
            }
        } while (sopa1.getPalabra().length()>5);
        
        return sopa1;
        
    }
    
    public void buscarPalabra(SopaLetras a){
        
        for (int i = 0; i < a.getMatriz().length; i++) {
            for (int j = 0; j < a.getMatriz()[0].length; j++) {
                if (a.getMatriz()[i][j] == a.getPalabra().charAt(0)) {                    
                    if (j+a.getPalabra().length()<=a.getMatriz().length) {
                        String palabra2 = new String(a.getMatriz()[i],j,a.getPalabra().length()); //Sobrecarga de constructor 
                        if (palabra2.equalsIgnoreCase(a.getPalabra())) {
                            System.out.println("La posicion es: ("+i+","+j+")");
                        }
                    }
                }
            }
        }
    }
    
    public void imprimir(SopaLetras b){
        //System.out.println(Arrays.deepToString(b.getMatriz()));
        
        for (int i = 0; i < b.getMatriz().length; i++) {
            System.out.print("|");
            for (int j = 0; j < b.getMatriz()[0].length; j++) {
                System.out.print(b.getMatriz()[i][j]+"  ");
            }
            System.out.println("|");
            
        }
        
    }
    
    public void reemplazar(SopaLetras c){
        System.out.println("Ingrese la palabra que desea reemplazar (que ya se encuentra en la matriz)");
        c.setPalabra(leer.nextLine());
        System.out.println("Ingrese la palabra nueva");
        String palabraNueva = leer.nextLine();
        buscarPalabra(c);//DEBE DEVOLVER LAS POSICIONES DONDE ENCONTRÓ LA PALABRA
    }
}
