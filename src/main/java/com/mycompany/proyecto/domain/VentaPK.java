package com.mycompany.proyecto.domain;

import java.io.Serializable;
import java.util.Objects;

public class VentaPK implements Serializable {

    private Long id;
    private Long vehiculo;
    private Long empleado;

    public VentaPK() {
    }

    public VentaPK(Long id, Long vehiculo, Long empleado) {
        this.id = id;
        this.vehiculo = vehiculo;
        this.empleado = empleado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Long vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Long getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Long empleado) {
        this.empleado = empleado;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!Objects.equals(getClass(), obj.getClass())) {
            return false;
        }
        final VentaPK other = (VentaPK) obj;
        if (!java.util.Objects.equals(this.getId(), other.getId())) {
            return false;
        }
        if (!java.util.Objects.equals(this.getVehiculo(), other.getVehiculo())) {
            return false;
        }
        if (!java.util.Objects.equals(this.getEmpleado(), other.getEmpleado())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.getId());
        hash = 31 * hash + Objects.hashCode(this.getVehiculo());
        hash = 31 * hash + Objects.hashCode(this.getEmpleado());
        return hash;
    }

    @Override
    public String toString() {
        return "VentaPK{" + " id=" + id + ", vehiculo=" + vehiculo + ", empleado=" + empleado + '}';
    }

}