# Meu Projeto de API em Spring Boot

Olá! Este é o README do meu projeto de API desenvolvido em Spring Boot. Eu criei essa API como parte dos meus estudos e para aplicar os conhecimentos que adquiri sobre desenvolvimento web com Java e Spring. Vou explicar um pouco sobre o que tem aqui e como eu organizei tudo.

## Visão Geral do Projeto

Este projeto é uma API RESTful simples que gerencia informações de 'Leads' e 'Gêneros'. Pense em 'Leads' como contatos ou potenciais clientes, e 'Gêneros' como categorias para organizar esses leads (embora no meu código atual, 'Gênero' pareça ser uma entidade separada, talvez para algo como filmes ou livros, ou até mesmo para categorizar os leads de outra forma). O objetivo principal foi praticar a criação de endpoints, manipulação de dados e integração com banco de dados usando Spring Data JPA.

## Estrutura do Projeto

Eu organizei o projeto da seguinte forma:

- `src/main/java/br/com/edukacode/api`: Aqui estão os principais arquivos Java da minha aplicação. É onde a mágica acontece!
- `src/main/resources`: Contém arquivos de configuração e scripts de banco de dados.

Vamos dar uma olhada mais de perto nos arquivos Java que eu desenvolvi:

### `ApiApplication.java`

Este é o ponto de entrada da aplicação. É a classe principal que inicia o Spring Boot. Basicamente, ela diz ao Spring para "rodar" a aplicação. É bem padrão para projetos Spring Boot.

```java
package br.com.edukacode.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
```

### Entidades e DTOs (Data Transfer Objects)

Eu usei algumas classes para representar os dados e para transferir informações entre as camadas da aplicação. Isso ajuda a manter o código organizado e seguro.

#### `Lead.java`

Esta é a entidade principal para representar um 'Lead'. Ela deve ter campos como nome, email, telefone e CPF. É a representação do meu objeto no banco de dados.

#### `DadosCadastroLead.java`

Este é um Record (uma funcionalidade mais recente do Java que eu estou explorando!) que uso para receber os dados quando alguém quer cadastrar um novo Lead. Ele já vem com algumas validações (`@NotBlank`, `@Email`, `@Pattern`) para garantir que os dados que chegam na API são válidos antes de serem processados. Isso é super importante para evitar dados inconsistentes e erros!

```java
package br.com.edukacode.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroLead(
    @NotBlank
    String nome, 

    @NotBlank
    @Email
    String email, 

    @NotBlank
    @Pattern(regexp = "\\d{10,11}")
    String telefone,
    
    @NotBlank
    @Pattern(regexp = "\\d{12}")
    String cpf
    ) {
 
}
```

#### `DadosListagemLead.java`

Outro Record! Este eu uso para formatar os dados de um Lead quando eu quero listá-los. Ele pega as informações da entidade `Lead` e as apresenta de uma forma mais limpa, sem expor tudo que está na entidade, se eu não quiser. É uma boa prática para APIs.

```java
package br.com.edukacode.api;

public record DadosListagemLead(
    String nome,
    String email,
    String telefone,
    String cpf
) {
    // Construtor que recebe a entidade Lead e extrai os dados necessários
    public DadosListagemLead(Lead lead) {
        this(lead.getNome(),lead.getEmail(),lead.getTelefone(),lead.getCpf());
    }
}
```

#### `Genero.java`

Esta é a entidade para 'Gênero'. Ela tem um `id` e um `nome`. Eu usei anotações do JPA (`@Entity`, `@Table`, `@Id`, `@GeneratedValue`) para mapear essa classe para uma tabela no banco de dados. Também usei Lombok (`@Getter`, `@NoArgsConstructor`, `@AllArgsConstructor`, `@EqualsAndHashCode`) para reduzir o código boilerplate, o que é muito legal e economiza tempo!

```java
package br.com.edukacode.api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "genero")
@Entity(name = "Genero")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Genero {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public Genero(GeneroCadastro dados){
        this.nome = dados.nome();
    }

}
```

#### `GeneroCadastro.java`

Similar ao `DadosCadastroLead`, este Record é para receber os dados de um novo Gênero, com validação para o nome.

```java
package br.com.edukacode.api;

import jakarta.validation.constraints.NotBlank;

public record GeneroCadastro(
        @NotBlank
        String nome
) {
}
```

### Repositórios

Os repositórios são interfaces que me ajudam a interagir com o banco de dados. O Spring Data JPA faz a maior parte do trabalho pesado aqui, o que é incrível!

#### `GeneroRepository.java`

Esta interface estende `JpaRepository`, o que me dá acesso a métodos prontos para operações CRUD (Criar, Ler, Atualizar, Deletar) na tabela de 'Gêneros' sem precisar escrever uma linha de SQL! O Spring cuida de tudo.

```java
package br.com.edukacode.api;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroRepository extends JpaRepository<Genero, Long>{

}
```

#### `LeadRepository.java`

Mesma ideia do `GeneroRepository`, mas para a entidade `Lead`. Facilita muito a persistência e recuperação de dados.

### Controladores (Controllers)

Os controladores são as classes que recebem as requisições HTTP e definem como a API vai responder. Eles são o "cérebro" da API.

#### `HelloController.java`

Este é um controlador simples que eu criei para testar se a API estava funcionando. Ele tem um endpoint GET que retorna "Hello, World!" e um POST que recebe uma mensagem e a imprime no console. É um bom ponto de partida para verificar a conectividade.

```java
package br.com.edukacode.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String mostrarMensagem() {
        return "Hello, World!";
    }

    @PostMapping
    public String criarMensagemPost(@RequestBody String json) {
        System.out.println("Mensagem recebido: " + json);
        return "Mensagem criada com sucesso!";
    }
}
```

#### `GeneroController.java`

Este controlador lida com as operações relacionadas aos 'Gêneros'. Atualmente, ele tem um endpoint GET para listar (que só retorna uma string, mas a ideia é que ele liste os gêneros do banco) e um POST para criar um novo gênero. Eu usei `@Valid` para que as validações do `GeneroCadastro` sejam aplicadas automaticamente.

```java
package br.com.edukacode.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/generos")
public class GeneroController {

    @GetMapping
    public String listar() {
        return "listando Generos";
    }

    @PostMapping
    public String criar(@RequestBody @Valid GeneroCadastro dados){
        return "Genero Cadastrado";
    }
}
```

#### `LeadController.java`

Este controlador é para as operações de 'Leads'. Eu imagino que ele terá endpoints para cadastrar, listar, atualizar e excluir leads. É o coração da API para o gerenciamento de contatos.

## Como Rodar o Projeto (O que eu faria)

Para rodar este projeto, você precisaria:

1.  **Ter Java e Maven instalados:** O projeto é Java e usa Maven para gerenciar as dependências.
2.  **Configurar um banco de dados:** Como eu estou usando Spring Data JPA, você precisaria configurar um banco de dados (provavelmente H2 para desenvolvimento, ou PostgreSQL/MySQL para produção) e ajustar o `application.properties`.
3.  **Compilar e Rodar:**
    ```bash
    # Navegue até a pasta raiz do projeto (onde está o pom.xml)
    cd Gabriel/Gabriel/api
    # Compile o projeto
    mvn clean install
    # Rode a aplicação
    mvn spring-boot:run
    ```

Depois de rodar, a API estaria disponível em `http://localhost:8080` (ou a porta que você configurar).

## Próximos Passos (O que eu ainda quero fazer)

-   Implementar os métodos de listagem, atualização e exclusão completos para Leads e Gêneros.
-   Adicionar mais validações e tratamento de erros.
-   Implementar autenticação e autorização para proteger a API.
-   Escrever testes unitários e de integração para garantir que tudo funciona como esperado.
-   Documentar a API usando ferramentas como o Swagger/OpenAPI.

Este projeto é um passo importante na minha jornada de aprendizado em desenvolvimento de APIs com Spring Boot. Espero que este README ajude a entender o que eu fiz e o porquê!

