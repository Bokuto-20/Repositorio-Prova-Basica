package br.com.blackwall.BlackWall.BlackWall_Repository.Operador;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.blackwall.BlackWall.BlackWall_ENTITY.Operador.BlackWall_Operador;

public interface BlackWallOP_Repository extends JpaRepository<BlackWall_Operador,Long>{

    boolean existsByEmail(String email);
}
