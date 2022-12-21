package com.zetcode.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "users")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String tipo;
    private String fecha;
    private String ci;
    private String dir;
    private String telf;
    private String descrip;
    private String email;
    private Double total;

    public Factura() {}

    public Factura(String nombre, String tipo, String email, String fecha, String ci, String dir, String telf, String descrip, Double total) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.email = email;
        this.fecha = fecha;
        this.ci = ci ;
        this.dir = dir;
        this.telf = telf;
        this.descrip = descrip;
        this.total = total;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factura user = (Factura) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(nombre, user.nombre) &&
                Objects.equals(tipo, user.tipo) &&
                Objects.equals(email, user.email) &&
                Objects.equals(fecha, user.fecha) &&
                Objects.equals(ci, user.ci) &&
                Objects.equals(dir, user.dir) &&
                Objects.equals(telf, user.telf) &&
                Objects.equals(descrip, user.descrip) &&
                Objects.equals(total, user.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, tipo, email, fecha, ci, dir, telf, descrip, total);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", tipo='").append(tipo).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", fecha='").append(fecha).append('\'');
        sb.append(", ci='").append(ci).append('\'');
        sb.append(", dir='").append(dir).append('\'');
        sb.append(", telf='").append(telf).append('\'');
        sb.append(", descrip='").append(descrip).append('\'');
        sb.append(", total='").append(total).append('\'');

        sb.append('}');
        return sb.toString();
    }


}
