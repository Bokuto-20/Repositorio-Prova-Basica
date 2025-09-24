package br.com.blackwall.BlackWall.BlackWall_Controller.Equipe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.blackwall.BlackWall.BlackWall_ENTITY.Equipe.Equipe;
import br.com.blackwall.BlackWall.BlackWall_Repository.Equipe.Equipe_Repository;

@RestController
@RequestMapping("/equipe")
public class EquipeController {

    @Autowired
    private Equipe_Repository repository;

    @PostMapping
    public Equipe criar(@RequestBody Equipe equipe) {
        return repository.save(equipe);
    }

    @GetMapping
    public List<Equipe> Listartodos(){
        return repository.findAll();
    }

}
