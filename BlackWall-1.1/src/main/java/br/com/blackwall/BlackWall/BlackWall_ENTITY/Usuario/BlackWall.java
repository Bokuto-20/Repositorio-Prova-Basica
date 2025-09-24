package br.com.blackwall.BlackWall.BlackWall_ENTITY.Usuario;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.com.blackwall.BlackWall.BlackWall_DTO.Usuario.Put;
import br.com.blackwall.BlackWall.BlackWall_ENTITY.Equipe.Equipe;
import br.com.blackwall.BlackWall.BlackWall_Repository.Usuario.BlackWallRecord;
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

@Data
@Entity(name = "netWatch")
@Table(name = "netWatch")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class BlackWall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String role;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;

    public BlackWall(BlackWallRecord dados) {
        this.id = dados.id();
        this.name = dados.name();
        this.email = dados.email();
        this.password = dados.password();

    }

    public void AtualizarUsuario(Put dados) {
        if (dados.name() != null) {
            this.name = dados.name();
        }
        if (dados.email() != null) {
            this.email = dados.email();
        }
        if (dados.password() != null) {
            this.password = dados.password();
        }
    }

    public void setPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        this.password = encoder.encode(password);
    }
}
