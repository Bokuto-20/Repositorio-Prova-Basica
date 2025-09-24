package br.com.blackwall.BlackWall.BlackWall_DTO.Usuario;

import br.com.blackwall.BlackWall.BlackWall_ENTITY.Usuario.BlackWall;

public record Get(
        Long id,
        String name,
        String email,
        String password
        ) {

    public Get(BlackWall usuario) {
        this(usuario.getId(), usuario.getName(), usuario.getEmail(), usuario.getPassword());
    }
}
