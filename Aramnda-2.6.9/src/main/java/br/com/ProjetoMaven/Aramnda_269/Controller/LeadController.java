    package br.com.ProjetoMaven.Aramnda_269.Controller;

    import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.data.domain.Page;
    import org.springframework.data.domain.Pageable;
    import org.springframework.data.web.PageableDefault;
    import org.springframework.web.bind.annotation.DeleteMapping;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.PutMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ProjetoMaven.Aramnda_269.DTO.LeadAtualizar;
import br.com.ProjetoMaven.Aramnda_269.DTO.LeadCriarCadastro;
import br.com.ProjetoMaven.Aramnda_269.DTO.LeadDeletar;
import br.com.ProjetoMaven.Aramnda_269.DTO.LeadListar;
import br.com.ProjetoMaven.Aramnda_269.Entity.Lead;
import br.com.ProjetoMaven.Aramnda_269.Repository.LeadRepository;
import jakarta.transaction.Transactional;
    import jakarta.validation.Valid;

    @RestController
    @RequestMapping("/leads")
    public class LeadController {
        
        @Autowired
        private LeadRepository repository;

        @PostMapping
        @Transactional
        public String CriarLead(@RequestBody @Valid LeadCriarCadastro dados){
            System.out.println("Lead cria com os dados:"+ dados);
            repository.save(new Lead(null, dados.nome(), dados.email(), dados.telefone()));
            return "Lead criado com sucesso!";            
        }


        @PutMapping
        @Transactional
        public String atualizarLead(@RequestBody @Valid LeadAtualizar dados) {
            var lead = repository.getReferenceById(dados.id());
            lead.atualizarInformacoes(dados);
            return "Lead atualizado com sucesso!";
        }
        
        
        @GetMapping
        public Page<LeadListar> ListarLeads(@PageableDefault(size = 10, sort = {"email"}) Pageable paginacao) {
            return repository.findAll(paginacao).map(LeadListar::new);
        }


        @GetMapping("/buscar")
        public List<LeadListar> buscarPorNome(@RequestParam String nome) {
            return repository.findByNomeContainingIgnoreCase(nome)
                             .stream()
                             .map(LeadListar::new)
                             .toList();
        }
        

        @DeleteMapping
        @Transactional
        public String deletarLead(@RequestBody @Valid LeadDeletar dados){
            if(repository.existsById(dados.id())){
                repository.deleteById(dados.id());
                return "Lead deletado com sucesso!";
            }
            else{
                return "O usuario com o ID ("+ dados.id() + ") não existe.";
            }
        }
        
    }

