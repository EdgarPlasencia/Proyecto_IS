package com.zetcode;

import com.zetcode.modelo.Cliente;
import com.zetcode.repositorio.Repositorio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class Runner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(Runner.class);

    private final Repositorio userRepository;

    public Runner(Repositorio userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        logger.info("initializing users");

        var u1 = new Cliente("Paul", "Smith", "paul.smith@gmail.com");
        userRepository.save(u1);

        var u2 = new Cliente("Robert", "Black", "rb34@gmail.com");
        userRepository.save(u2);

        var u3 = new Cliente("John", "Doe", "jdoe@gmail.com");
        userRepository.save(u3);
    }
}