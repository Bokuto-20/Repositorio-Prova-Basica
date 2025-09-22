package br.com.blackwall.BlackWall.BlackWall_Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.blackwall.BlackWall.BlackWall_ENTITY.BlackWall;

public interface BlackWallRepository extends JpaRepository<BlackWall, Long> {

    boolean existsByEmail(String email);
}
