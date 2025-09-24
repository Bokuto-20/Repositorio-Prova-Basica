package br.com.blackwall.BlackWall.BlackWall_DTO.Operador;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record OPPost(
        @NotBlank(message = "O campo name é obrigatório.")
        String name,
        @NotBlank(message = "O campo email é obrigatório.")
        @Email(message = "O campo email deve ser um email válido.")
        String email,
        @NotBlank(message = "O campo password é obrigatório.")
        @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&-_])[A-Za-z\\d@$!%*?&-_]{8,}$",
                message = "A senha deve ter no mínimo 8 caracteres, incluindo pelo menos uma letra maiúscula, uma letra minúscula, um número e um caractere especial.")
        String password,
        @NotBlank(message = "O campo setor é obrigatório.")
        String setor
        ) {

}
