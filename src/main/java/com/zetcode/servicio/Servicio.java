package com.zetcode.servicio;

import com.zetcode.modelo.Cliente;
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

    public List<Cliente> findAll() {

        var it = userRepository.findAll();

        var users = new ArrayList<Cliente>();
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
