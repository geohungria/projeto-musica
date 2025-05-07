package com.geovana.projetomusica.services;

import com.geovana.projetomusica.models.Musica;
import com.geovana.projetomusica.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * O Service é aonde a gente coloca a regra do negocio.
 */
@Service
public class MusicaService {

    @Autowired
    private MusicaRepository musicaRepository;

    public Musica cadastrar(Musica musica){
        Musica musicaCadastrada  = musicaRepository.save(musica);
        return musicaCadastrada;
    }

    /**
     *Esse metodo vai buscar todas as musicas no banco de dados
     */
    public List<Musica> buscarTodos(){
        List<Musica> todasMusicasBanco = (List<Musica>) musicaRepository.findAll();
        return todasMusicasBanco;
    }

    public boolean deletar(Long id){

        Optional<Musica> musicaDoBanco = musicaRepository.findById(id);

        if(musicaDoBanco.isEmpty()){
            return false;
        }

        musicaRepository.deleteById(id);
        return true;
    }

    public Musica alterar(Musica musica){

       Musica musicaAtualizada = musicaRepository.save(musica);
       return  musicaAtualizada;
    }

}
