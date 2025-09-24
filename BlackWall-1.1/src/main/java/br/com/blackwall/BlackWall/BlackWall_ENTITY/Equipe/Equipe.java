package br.com.blackwall.BlackWall.BlackWall_ENTITY.Equipe;

import java.util.List;

import br.com.blackwall.BlackWall.BlackWall_ENTITY.Operador.BlackWall_Operador;
import br.com.blackwall.BlackWall.BlackWall_ENTITY.Usuario.BlackWall;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "equipe")
@NoArgsConstructor
@AllArgsConstructor
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy="equipe")
    private List<BlackWall_Operador> operadores;

    @OneToMany(mappedBy="equipe")
    
    private List<BlackWall> usuarios;
}
