package com.gamboatech.gamecar.domain.repository;

import com.gamboatech.gamecar.domain.model.Gamer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamerRepository extends CrudRepository<Gamer, Integer> {
}
