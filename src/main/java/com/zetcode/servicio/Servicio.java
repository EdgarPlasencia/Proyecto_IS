package com.zetcode.servicio;

import com.zetcode.modelo.Asistente;
import com.zetcode.repositorio.Repositorio;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Servicio {

    private final Repositorio userRepository;

    public Servicio(Repositorio userRepository) {
        this.userRepository = userRepository;
    }

    public List<Asistente> findAll() {

        var it = userRepository.findAll();

        var users = new ArrayList<Asistente>();
        it.forEach(e -> users.add(e));

        return users;
    }

    public Long count() {

        return userRepository.count();
    }

    public void deleteById(Long userId) {

        userRepository.deleteById(userId);
    }
}
