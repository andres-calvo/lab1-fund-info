package com.mycompany.proyecto.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
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
public class Empleado {

    @Id
    @GeneratedValue
    private Long id;
    @Basic
    @Column(nullable = false)
    private String nombre;
    @Basic
    @Column(unique = true, nullable = false)
    private String documento;
    @OneToMany(mappedBy = "empleado")
    private List<Venta> ventas;

    public Empleado(Long id, String nombre, String documento) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
    }

    public Empleado() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public List<Venta> getVentas() {
        if (ventas == null) {
            ventas = new ArrayList<>();
        }
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public void addVenta(Venta venta) {
        getVentas().add(venta);
        venta.setEmpleado(this);
    }

    public void removeVenta(Venta venta) {
        getVentas().remove(venta);
        venta.setEmpleado(null);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!Objects.equals(getClass(), obj.getClass())) {
            return false;
        }
        final Empleado other = (Empleado) obj;
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
        return "Empleado{" + " id=" + id + ", nombre=" + nombre + ", documento=" + documento + ", ventas=" + ventas + '}';
    }

}