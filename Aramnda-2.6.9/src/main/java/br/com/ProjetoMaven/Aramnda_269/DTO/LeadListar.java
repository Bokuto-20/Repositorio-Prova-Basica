package br.com.ProjetoMaven.Aramnda_269.DTO;
import br.com.ProjetoMaven.Aramnda_269.Entity.Lead;
public record LeadListar(
    Long id,
    String nome,
    String emai,
    String telefone
) {
    public LeadListar(Lead lead){
        this(lead.getId(), lead.getNome(), lead.getEmail(), lead.getTelefone());
    }
}

