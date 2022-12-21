package com.zetcode.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "users")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String telef;
    private String dir;
    private String email;

    public Cliente() {}

    public Cliente(String nombre, String telef, String email, String dir) {
        this.nombre = nombre;
        this.telef = telef;
        this.email = email;
        this.dir = dir;
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

    public void setNombre(String firstName) {

        this.nombre = firstName;
    }

    public String getTelef() {

        return telef;
    }

    public void setTelef(String lastName) {

        this.telef = lastName;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente user = (Cliente) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(nombre, user.nombre) &&
                Objects.equals(telef, user.telef) &&
                Objects.equals(email, user.email) &&
                Objects.equals(dir, user.dir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, telef, email);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", telef='").append(telef).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", dir='").append(dir).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
