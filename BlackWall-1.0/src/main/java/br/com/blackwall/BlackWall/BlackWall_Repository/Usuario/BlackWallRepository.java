package br.com.blackwall.BlackWall.BlackWall_Repository.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.blackwall.BlackWall.BlackWall_ENTITY.Usuario.BlackWall;

public interface BlackWallRepository extends JpaRepository<BlackWall, Long> {

    boolean existsByEmail(String email);
}
