/*
Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.


● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.
 */
package E13Auto;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author AlejaDevelops
 */
public class AutoService {
    Scanner leer = new Scanner(System.in);
    public Auto crearFicha(){
        Auto ficha1 = new Auto();
        System.out.println("Ingresa el nombre del usuario");
        ficha1.setNombre(leer.nextLine());
        System.out.println("Fecha de vencimiento de la licencia dd/mm/aaaa: ");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();
        Date fechaV = new Date(dia, mes, anio);
        ficha1.setFechaVencLicencia(fechaV);
        System.out.println("Color del auto");
        ficha1.setColor(leer.nextLine());
        System.out.println("Modelo del auto");
        ficha1.setModelo(leer.nextInt());
        System.out.println("Kilometraje del vehiculo");
        ficha1.setKm(mes);
        return ficha1;
    }
    
}
