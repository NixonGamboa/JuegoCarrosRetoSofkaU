package com.gamboatech.gamecar.domain.repository;

import com.gamboatech.gamecar.domain.model.Gamer;

import java.util.ArrayList;

public interface GameService {

    void saveAll(ArrayList<Gamer> gamers);

    Iterable<Gamer> findAll();

    void deleteAll();

    void deleteById(int id);
}
