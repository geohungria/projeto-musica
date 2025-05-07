package com.geovana.projetomusica.api;

import com.geovana.projetomusica.models.Musica;
import com.geovana.projetomusica.services.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * CONTROLLER É A PORTA DE ENTRADA DA API E É AONDE DEFINIMOS O ENDPOINT --> sao os metodos que estao mapeados/ expostos na minha API
 */
@RestController//anotacao serve para economizar codigo
@RequestMapping("/musica")
public class MusicaController {

    @Autowired
    private MusicaService musicaService;

    @PostMapping("/criar")
    public Musica cadastrarMusica(@RequestBody Musica musica){
        System.out.println("O objeto recebido da tela é: nome: "+musica.getNome()+
                ", categoria: " +musica.getCategoria() + ", duracao: " + musica.getDuracao());

        musicaService.cadastrar(musica);

        return musica;
    }

    @GetMapping("/buscar-todos")
    public List<Musica> buscarTodos(){
        List<Musica> todasMusicas = musicaService.buscarTodos();
        return todasMusicas;
    }

    @DeleteMapping("/deletar/{id}")
    public boolean deletaMusica(@PathVariable Long id){

        boolean apagadoComSucesso = musicaService.deletar(id);

        return apagadoComSucesso;
    }

    @PutMapping("/alterar")
    public Musica alterar(@RequestBody Musica musica){

        Musica musicaAlterada = musicaService.alterar(musica);
        return musicaAlterada;
    }


}
