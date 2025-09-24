package br.com.blackwall.BlackWall.BlackWall_DTO.Usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record Put(
        @NotNull(message = "Informe o id do usuário")
        Long id,
        @NotBlank(message = "O nome não pode estar vazio")
        String name,
        @NotBlank(message = "O email não pode estar vazio")
        @Email(message = "Email inválido")
        String email,
        @NotBlank(message = "A senha não pode estar vazia")
        @Pattern(regexp = "^^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&-_])([A-Za-z\\d@$!%*?&-_]{8,20})$",
                message = "A senha deve ter no mínimo 8 caracteres, incluido uma Letra Maiúscula, uma Letra Minúscula, um número e um caractere especial")
        String password
        ) {

}
