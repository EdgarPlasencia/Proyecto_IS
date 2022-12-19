package com.zetcode.controlador;

import com.zetcode.modelo.Asistente;
import com.zetcode.servicio.Servicio;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controlador {

    private final Servicio userService;

    public Controlador(Servicio userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<Asistente> allUsers() {

        return userService.findAll();
    }

    @GetMapping("/users/count")
    public Long count() {

        return userService.count();
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable String id) {

        Long userId = Long.parseLong(id);
        userService.deleteById(userId);
    }
}