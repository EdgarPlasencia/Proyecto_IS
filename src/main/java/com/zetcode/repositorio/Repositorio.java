package com.zetcode.repositorio;

import com.zetcode.modelo.Asistente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositorio extends CrudRepository<Asistente, Long> {
}