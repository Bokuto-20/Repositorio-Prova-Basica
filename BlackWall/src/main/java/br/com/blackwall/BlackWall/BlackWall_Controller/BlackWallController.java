package br.com.blackwall.BlackWall.BlackWall_Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.blackwall.BlackWall.BlackWall_DTO.Delete;
import br.com.blackwall.BlackWall.BlackWall_DTO.Get;
import br.com.blackwall.BlackWall.BlackWall_DTO.Post;
import br.com.blackwall.BlackWall.BlackWall_DTO.Put;
import br.com.blackwall.BlackWall.BlackWall_ENTITY.BlackWall;
import br.com.blackwall.BlackWall.BlackWall_Repository.BlackWallRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/blackwall")
public class BlackWallController {

    @Autowired
    private BlackWallRepository repository;

    @GetMapping
    public List<Get> ListarUsuarios(@PageableDefault(size = 10, sort = {"email"}) Pageable paginacao) {
        return repository.findAll(paginacao) // retorna Page<BlackWall>
                .stream() // pega Stream<BlackWall>
                .map(Get::new) // converte para Get
                .collect(Collectors.toList());
    }

    @PostMapping
    public ResponseEntity<String> CriarCadastro(@RequestBody
            @Valid Post dados
    ) {
        if (repository.existsByEmail(dados.email())) {
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body("Erro: Email já Cadastrado!");
        }
        BlackWall usuario = new BlackWall(null, dados.name(), dados.email(), dados.password());

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        usuario.setPassword(encoder.encode(dados.password()));

        repository.save(usuario);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Usuário cadastrado com sucesso!");
    }

    @PutMapping
    public String AtualizarUsuario(@RequestBody @Valid Put dados) {
        var usuario = repository.getReferenceById(dados.id());
        usuario.AtualizarUsuario(dados);
        return "Atualizando usuario";
    }

    @DeleteMapping
    public String DeletarUsuario(@RequestBody @Valid Delete dados) {
        if (repository.existsById(dados.id())) {
            repository.deleteById(dados.id());
            return "Usuario deletado com sucesso!";
        } else {
            return "O usuario com o ID" + dados.id() + "não foi encontrado";
        }
    }
}
