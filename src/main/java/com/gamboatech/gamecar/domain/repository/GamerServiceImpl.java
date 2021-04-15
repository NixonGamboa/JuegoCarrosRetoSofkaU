package com.gamboatech.gamecar.domain.repository;

import com.gamboatech.gamecar.domain.model.Gamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GamerServiceImpl implements GameService {
    @Autowired
    private GamerRepository gamerRepository;


    @Override
    public void saveAll(ArrayList<Gamer> gamers) {
        gamerRepository.saveAll(gamers);
    }

    @Override
    public List<Gamer> findAll() {
        return (List<Gamer>) gamerRepository.findAll();
    }

    @Override
    public void deleteAll() {
        gamerRepository.deleteAll();
    }

    @Override
    public void deleteById(int id) {
        gamerRepository.deleteById(id);
    }
}
