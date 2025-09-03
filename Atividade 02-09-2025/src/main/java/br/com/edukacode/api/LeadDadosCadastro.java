package br.com.edukacode.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record LeadDadosCadastro(
    @NotBlank //valida se o campo de nome não está vazio
    String nome,

    @NotBlank //valida se o campo de email não está vazio
    @Email //valida se o campo de email está em um formato correto
     String email,

    @NotBlank //valida se o campo de telefone não está vazio
    @Pattern(regexp = "\\d{10,11}") //valida se o campo de telefone contém apenas números e tem 10 ou 11 dígitos
      String telefone,
    @NotBlank
    @Pattern(regexp = "\\d{11}")
      String cpf
      ){
  
  }

