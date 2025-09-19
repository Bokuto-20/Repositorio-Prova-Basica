package br.com.ProjetoMaven.Aramnda_269.DTO;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record LeadCriarCadastro(
    @NotBlank(message="Nome é obrigatório")
    String nome, 

    @NotBlank(message="Email é obrigatório")
    @Email
    String email, 

    @NotBlank(message="Telefone é obrigatório")
    @Pattern(regexp = "\\d{10,11}")
    String telefone
){}



    
    

