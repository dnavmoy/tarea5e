/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class Tarea5eDanielNavarro {

    public static void main(String[] args) {
        Vaqueria primera = new Vaqueria();
        primera.getVaqueria().add(new Vaca("0", LocalDate.of(2020, 02, 10), "marron"));
        primera.getVaqueria().add(new Vaca("1", LocalDate.of(2024, 01, 01), "negra"));
        primera.getVaqueria().add(new Vaca("2", LocalDate.of(2018, 07, 21), "blanca con manchas"));
        
        for (Vaca p : primera.getVaqueria()) {
            System.out.println(p);
            
        }
        //1- numero de vacas
        System.out.println("Cuantas vacas hay en la vaqueria?" + primera.contarVacas());
        
        //2- añadir animal a la vaqueria
        primera.añadirVaca(new Vaca("3", LocalDate.now(), "bebe vaca"));
        for (Vaca p : primera.getVaqueria()) {
            System.out.println(p);
            
        }
        //3. Saber si la vaquería tiene vacas.  
        System.out.println("Tiene vacas la vaqueria? "+ primera.tieneVacas());
        
        //4. Saber si un animal está en la vaquería.
        System.out.println("la vaca esta en la vaqueria? " + primera.estaEnVaqueria(new Vaca("0", LocalDate.of(2020, 02, 10), "marron")));
        //4. Sacar todos los animales, en forma de ArrayList.
        System.out.println("ArrayList de la vaqueria\n");
        ArrayList<Vaca> listaVaqueria = primera.ArrayVaqueria();
        for (Vaca p : listaVaqueria) {
            System.out.println(p);
            
        }
        //5. Dar de baja una vaca de la vaquería.
        System.out.println("baja de la ultima vaca");
        primera.bajaVaca(new Vaca("2", LocalDate.of(2018, 07, 21), "blanca con manchas"));
        for (Vaca p : primera.getVaqueria()) {
            System.out.println(p);
            
        }
        
        //7. mostrar vaqueria
        System.out.println("mostrar vaqueria");
        primera.mostrarVaqueria();
        
        //7.mostrar vaqeuriav2
        System.out.println("mostrar vaqueria v2");
        primera.mostrarVaqueriaV2();
        //parteB


        System.out.println("---- vaqueria segunda");
        VaqueriaOrdenada segunda = new VaqueriaOrdenada();
        segunda.getVaqueria().add(new Vaca("3", LocalDate.of(2020, 02, 10), "marron"));
        segunda.getVaqueria().add(new Vaca("1", LocalDate.of(2024, 01, 01), "negra"));
        segunda.getVaqueria().add(new Vaca("2", LocalDate.of(2018, 07, 21), "blanca con manchas"));
        
        segunda.mostrarVaqueria();
        
        
        
    }
}
