package com.estudosjava.dreamgames.repositories;

import com.estudosjava.dreamgames.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {


}
