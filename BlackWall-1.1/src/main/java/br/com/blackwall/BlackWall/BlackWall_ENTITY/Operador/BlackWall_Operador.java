package br.com.blackwall.BlackWall.BlackWall_ENTITY.Operador;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.com.blackwall.BlackWall.BlackWall_DTO.Operador.OPPut;
import br.com.blackwall.BlackWall.BlackWall_ENTITY.Equipe.Equipe;
import br.com.blackwall.BlackWall.BlackWall_Repository.Operador.BlackWallOP_Record;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "operador")
@Table(name = "operador")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class BlackWall_Operador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String role;
    private String setor;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;

    public BlackWall_Operador(BlackWallOP_Record dados) {
        this.id = dados.id();
        this.name = dados.name();
        this.email = dados.email();
        this.password = dados.password();
        this.setor = dados.setor();
    }

    public void atualizarOperador(OPPut dados) {
        if (dados.name() != null) {
            this.name = dados.name();
        }

        if (dados.email() != null) {
            this.email = dados.email();
        }

        if (dados.password() != null) {
            this.password = dados.password();
        }

        if (dados.setor() != null) {
            this.setor = dados.setor();
        }
    }

    public void setPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        this.password = encoder.encode(password);
    }
}
