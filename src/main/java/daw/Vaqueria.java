/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author daniel
 */
public class Vaqueria {
    
    private Set<Vaca> vaqueria;

    public Vaqueria(Set<Vaca> vaqueria) {
        this.vaqueria = vaqueria;
    }
    
    public Vaqueria(){
        this.vaqueria= new HashSet<>();
    }

    public Set<Vaca> getVaqueria() {
        return vaqueria;
    }

    public void setVaqueria(Set<Vaca> vaqueria) {
        this.vaqueria = vaqueria;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.vaqueria);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vaqueria other = (Vaqueria) obj;
        return Objects.equals(this.vaqueria, other.vaqueria);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vaqueria{");
        sb.append("vaqueria=").append(vaqueria);
        sb.append('}');
        return sb.toString();
    }
    
    public int contarVacas(){
        int cantidad=this.vaqueria.size();
        return cantidad;
    }
    public void añadirVaca(Vaca nueva){
        this.vaqueria.add(nueva);
    }
    
    public boolean tieneVacas(){
        boolean tiene=false;
        if(contarVacas()>=0){
            tiene=true;
        }
        return tiene;
    }
    public boolean estaEnVaqueria(Vaca encontrar){
        boolean encontrada=false;
        if(this.vaqueria.contains(encontrar)){
            encontrada=true;
        }
        return encontrada;
    }
    
    public ArrayList<Vaca> ArrayVaqueria(){
        ArrayList<Vaca> listaVacas=new ArrayList<>(this.vaqueria);
        
        
        return listaVacas;
    }
    public void bajaVaca(Vaca baja){
        this.vaqueria.remove(baja);
    }
    public void mostrarVaqueria(){
        for(Vaca vaca:vaqueria){
            System.out.println(vaca);
        }
    }
    
    public void mostrarVaqueriaV2(){
        Iterator<Vaca> iterador=vaqueria.iterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next());
            
        }
    }
    
}
