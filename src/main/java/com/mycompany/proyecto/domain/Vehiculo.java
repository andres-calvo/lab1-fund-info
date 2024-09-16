package com.mycompany.proyecto.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.util.Objects;
import java.util.Optional;

/**
 * @author Andres
 */
@Entity
public class Vehiculo {

    @Id
    @GeneratedValue
    private Long id;
    @Basic
    @Column(nullable = false)
    @PositiveOrZero(message = "Valores positivos")
    private int precio;
    @Basic
    private String foto;
    @Basic
    @Column(nullable = false)
    @Positive(message = "El aï¿½o debe ser positivo")
    private int anio;
    @OneToOne(mappedBy = "vehiculo")
    private Venta venta;

    public Vehiculo(Long id, int precio, String foto, int anio) {
        this.id = id;
        this.precio = precio;
        this.foto = foto;
        this.anio = anio;
    }

    public Vehiculo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Optional<String> getFoto() {
        return Optional.ofNullable(foto);
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!Objects.equals(getClass(), obj.getClass())) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
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
        return "Vehiculo{" + " id=" + id + ", precio=" + precio + ", foto=" + foto + ", anio=" + anio + ", venta=" + venta + '}';
    }

}