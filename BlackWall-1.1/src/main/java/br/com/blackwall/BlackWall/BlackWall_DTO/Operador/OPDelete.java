package br.com.blackwall.BlackWall.BlackWall_DTO.Operador;

import jakarta.validation.constraints.NotBlank;

public record OPDelete(
        @NotBlank(message = "Informe o id do usuario para a alteração")
        Long id) {

}
