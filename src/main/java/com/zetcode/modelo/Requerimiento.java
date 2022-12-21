package com.zetcode.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "users")
public class Requerimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private String fecha;
    private String descripcion;

    public Requerimiento() {}

    public Requerimiento(String tipo, String fecha, String descripcion) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {

        this.tipo = tipo;
    }

    public String getFecha() {

        return fecha;
    }

    public void setFecha(String fecha) {

        this.fecha = fecha;
    }

    public String getDescripcion() {

        return descripcion;
    }

    public void setDescripcion(String descripcion) {

        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Requerimiento user = (Requerimiento) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(tipo, user.tipo) &&
                Objects.equals(fecha, user.fecha) &&
                Objects.equals(descripcion, user.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipo, fecha, descripcion);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", tipo='").append(tipo).append('\'');
        sb.append(", fecha='").append(fecha).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
