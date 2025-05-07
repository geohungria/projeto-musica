package com.geovana.projetomusica.repository;

import com.geovana.projetomusica.models.Musica;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicaRepository extends CrudRepository<Musica,Long> {
}
