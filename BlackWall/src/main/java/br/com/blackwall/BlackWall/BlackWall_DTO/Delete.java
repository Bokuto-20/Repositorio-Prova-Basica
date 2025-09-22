package br.com.blackwall.BlackWall.BlackWall_DTO;

import jakarta.validation.constraints.NotNull;

public record Delete(
        @NotNull (message = "Informe o id do usuário")
        Long id) {

}
