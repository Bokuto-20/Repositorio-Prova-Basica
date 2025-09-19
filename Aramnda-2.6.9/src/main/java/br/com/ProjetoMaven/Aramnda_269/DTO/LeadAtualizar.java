package br.com.ProjetoMaven.Aramnda_269.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record LeadAtualizar(
@NotNull
Long id,

@NotBlank
String nome,

@NotBlank
@Email
String email,

@NotBlank
@Pattern(regexp = "\\d{10,11}")
String telefone
) {
}