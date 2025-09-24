package br.com.blackwall.BlackWall.BlackWall_Controller.Operador;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.blackwall.BlackWall.BlackWall_DTO.Operador.OPDelete;
import br.com.blackwall.BlackWall.BlackWall_DTO.Operador.OPGet;
import br.com.blackwall.BlackWall.BlackWall_DTO.Operador.OPPost;
import br.com.blackwall.BlackWall.BlackWall_DTO.Operador.OPPut;
import br.com.blackwall.BlackWall.BlackWall_ENTITY.Operador.BlackWall_Operador;
import br.com.blackwall.BlackWall.BlackWall_Repository.Operador.BlackWallOP_Repository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/blackwallop")
public class BlackWallOp_Controller {

    @Autowired
    private BlackWallOP_Repository repository;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public ResponseEntity<String> CriarCadastro(@RequestBody @Valid OPPost dados) {
        if (repository.existsByEmail(dados.email())) {
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body("Erro: Email já cadastrado");
        }

        BlackWall_Operador operador = new BlackWall_Operador(null, dados.name(), dados.email(), dados.password(), "OP_Role", dados.setor(), null);

        operador.setPassword(dados.password());

        repository.save(operador);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Operador Criado com sucesso!");
    }

    @PreAuthorize("hasAnyRole('ADMIN','OPERADOR')")
    @GetMapping
    public List<OPGet> ListarUsuarios(@PageableDefault(size = 10, sort = {"email"}) Pageable paginacao) {
        return repository.findAll(paginacao)
                .stream()
                .map(OPGet::new)
                .collect(Collectors.toList());
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping
    public String AtualizarConta(@RequestBody @Valid OPPut dados) {
        var operador = repository.getReferenceById(dados.id());
        operador.atualizarOperador(dados);
        return "Operador Atualizado!";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping
    public String DeletarConta(@RequestBody @Valid OPDelete dados) {
        if (repository.existsById(dados.id())) {
            repository.deleteById(dados.id());
            return "Operador deletado com sucesso!";
        } else {
            return "ERROR: O operador com o ID: " + dados.id() + " não foi encontrado";
        }

    }

}
