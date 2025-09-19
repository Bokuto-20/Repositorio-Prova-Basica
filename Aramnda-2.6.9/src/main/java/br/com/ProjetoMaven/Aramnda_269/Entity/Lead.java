package br.com.ProjetoMaven.Aramnda_269.Entity;
import br.com.ProjetoMaven.Aramnda_269.DTO.LeadAtualizar;
import br.com.ProjetoMaven.Aramnda_269.Repository.LeadRecord;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "lead")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Lead{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;

    
    public Lead(LeadRecord dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
    }

    public void atualizarInformacoes(LeadAtualizar dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.telefone() != null) {
            this.telefone = dados.telefone();
        }
        if (dados.email() != null) {
            this.email = dados.email();
        }
    }

    

}


