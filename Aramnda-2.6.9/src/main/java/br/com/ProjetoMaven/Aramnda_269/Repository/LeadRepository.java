package br.com.ProjetoMaven.Aramnda_269.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ProjetoMaven.Aramnda_269.Entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long>{

    boolean existsByEmail(String email);
    boolean existsByTelefone(String telefone);
    List<Lead> findByNomeContainingIgnoreCase(String nome);

}
