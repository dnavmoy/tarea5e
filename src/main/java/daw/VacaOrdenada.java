/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author daniel
 */
public class VacaOrdenada implements Comparable<Vaca>{
    
    private String Id;
    private LocalDate fechaNacimiento;
    private String descripcion;

    public VacaOrdenada(String Id, LocalDate fechaNacimiento, String descripcion) {
        this.Id = Id;
        this.fechaNacimiento = fechaNacimiento;
        this.descripcion = descripcion;
    }

    public String getId() {
        return Id;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.Id);
        hash = 61 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 61 * hash + Objects.hashCode(this.descripcion);
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
        final VacaOrdenada other = (VacaOrdenada) obj;
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return Objects.equals(this.fechaNacimiento, other.fechaNacimiento);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vaca{");
        sb.append("Id=").append(Id);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", descripcion=").append(descripcion);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Vaca o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

   
    



    
    
    
}
