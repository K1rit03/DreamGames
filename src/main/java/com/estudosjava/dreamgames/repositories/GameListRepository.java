package com.estudosjava.dreamgames.repositories;

import com.estudosjava.dreamgames.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
