package br.com.blackwall.BlackWall.BlackWall_DTO.Operador;

import br.com.blackwall.BlackWall.BlackWall_ENTITY.Operador.BlackWall_Operador;

public record OPGet(
        Long id,
        String name,
        String email,
        String password,
        String setor
        ) {

    public OPGet(BlackWall_Operador dados) {
        this(dados.getId(), dados.getName(), dados.getEmail(), dados.getPassword(), dados.getSetor());
    }
}
