package br.com.blackwall.BlackWall.BlackWall_DTO.Usuario;

import jakarta.validation.constraints.NotNull;

public record Delete(
        @NotNull(message = "Informe o id do usuário")
        Long id) {

}
