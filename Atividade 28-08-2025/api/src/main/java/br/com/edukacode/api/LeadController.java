package br.com.edukacode.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leads")
public class LeadController {

    @PostMapping
    public String criarLead(@RequestBody DadosCadastroLead dados) {
        System.out.println("Lead cria com os dados: " + dados);
        return "Lead criado com sucesso!";
    }

    @GetMapping
    public void listarLeads() {

    }

    @PutMapping
    public void atulizarLead() {

    }

    @DeleteMapping
    public void excluirLead() {

    }
}
