/*
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, 
y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????
 */
package E8_2Tiempo;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author AlejaDevelops
 */
public class TiempoService {
    public Tiempo tomarTiempo(){
        Scanner leer = new Scanner(System.in);
        Tiempo tiempo1 = new Tiempo();
        int hora = -1;
        int min = -1; 
        int seg = -1;
        boolean flag = false;        
          
        do {           
            
            if (hora == -1) {
                System.out.println("Ingresa la hora");
                hora = leer.nextInt();              
                if (hora>=0 && hora<=24) {
                    tiempo1.setHora(hora);                    
                } else{
                    System.out.println("Hora inválida. Intenta nuevamente");                    
                    hora = -1;
                    continue;
                }            
            }            
            if (min == -1) {
                System.out.println("Ingresa los minutos");
                min = leer.nextInt();              
                if (min>=0 && min<=60) {
                    tiempo1.setMinutos(min);                    
                } else{
                    System.out.println("Minutos inválidos. Intenta nuevamente");
                    min = -1;
                    continue;
                }            
            }
            if (seg == -1) {
                System.out.println("Ingresa los segundos");
                seg = leer.nextInt();              
                if (seg>=0 && seg<=60) {
                    tiempo1.setSegundos(seg);
                    flag = true;
                } else{
                    System.out.println("Segundos inválidos. Intenta nuevamente");
                    seg = -1;
                }            
            }            
        } while (flag == false); 
        
        return tiempo1;
    }
    
    public void imprimirHoraCompleta(Tiempo a){
        System.out.println(+a.getHora()+":"+a.getMinutos()+":"+a.getSegundos());        
    }
    
    public Tiempo horaActual(){
        Tiempo tiempo2 = new Tiempo();
        LocalDateTime horaActual = LocalDateTime.now();
        tiempo2.setHora(horaActual.getHour());
        tiempo2.setMinutos(horaActual.getMinute());
        tiempo2.setSegundos(horaActual.getSecond());       
        
    return tiempo2;
    }
    
    public Tiempo pasoDelTiempo(Tiempo b, Tiempo c){ //PENDIENTE ARREGLAR FORMA DE CALCULAR DIFERENCIA
        Tiempo d = new Tiempo();        
        d.setHora(b.getHora()-c.getHora());
        d.setMinutos(b.getMinutos()-c.getMinutos());
        d.setSegundos(b.getSegundos()-c.getSegundos());
        return d;
    }
            
}
