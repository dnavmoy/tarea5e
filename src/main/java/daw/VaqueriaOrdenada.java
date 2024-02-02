/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author daniel
 */
public class VaqueriaOrdenada{
    
    private SortedSet<Vaca> vaqueria=new TreeSet<>();

    public VaqueriaOrdenada(SortedSet<Vaca> vaqueria) {
        this.vaqueria = vaqueria;
    }
    
    public VaqueriaOrdenada(){
       this.vaqueria=new TreeSet<>();
    }

    public SortedSet<Vaca> getVaqueria() {
        return vaqueria;
    }

    public void setVaqueria(SortedSet<Vaca> vaqueria) {
        this.vaqueria = vaqueria;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.vaqueria);
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
        final VaqueriaOrdenada other = (VaqueriaOrdenada) obj;
        return Objects.equals(this.vaqueria, other.vaqueria);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VaqueriaOrdenada{");
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

       
    
    
}
