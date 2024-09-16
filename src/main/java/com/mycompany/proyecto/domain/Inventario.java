package com.mycompany.proyecto.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Andres
 */
@Entity
public class Inventario {

    @Id
    @GeneratedValue
    private Long id;
    @OneToMany
    private List<Vehiculo> vehiculoes;

    public Inventario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Vehiculo> getVehiculoes() {
        if (vehiculoes == null) {
            vehiculoes = new ArrayList<>();
        }
        return vehiculoes;
    }

    public void setVehiculoes(List<Vehiculo> vehiculoes) {
        this.vehiculoes = vehiculoes;
    }

    public void addVehiculo(Vehiculo vehiculo) {
        getVehiculoes().add(vehiculo);
    }

    public void removeVehiculo(Vehiculo vehiculo) {
        getVehiculoes().remove(vehiculo);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!Objects.equals(getClass(), obj.getClass())) {
            return false;
        }
        final Inventario other = (Inventario) obj;
        if (!java.util.Objects.equals(this.getId(), other.getId())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.getId());
        return hash;
    }

    @Override
    public String toString() {
        return "Inventario{" + " id=" + id + ", vehiculoes=" + vehiculoes + '}';
    }

}