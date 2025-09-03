# Meu Repositório de Estudos e Projetos

E aí! Este repositório é um compilado dos meus estudos e projetos em Java, organizados por temas e datas. A ideia é mostrar um pouco do que eu venho aprendendo e aplicando, desde conceitos básicos até o desenvolvimento de APIs com Spring Boot. É como um diário do meu progresso!

## Visão Geral

Eu dividi tudo em algumas seções principais para ficar mais fácil de entender:

-   **Atividades (com datas):** São projetos maiores, geralmente APIs, que eu desenvolvi em datas específicas. Aqui eu aplico o que aprendi em contextos mais complexos.
-   **Partes (Parte1, Parte2, etc.):** São conjuntos de exercícios e desafios que eu resolvi para praticar conceitos de Java, desde lógica de programação até estruturas de dados. Cada "Parte" foca em um tipo de problema ou conceito.

Vamos dar uma olhada mais de perto em cada uma dessas seções!

## Atividades (Projetos de API com Spring Boot)

Nessas pastas, eu guardo os projetos de API que desenvolvi usando o framework Spring Boot. O objetivo aqui é aprender a criar serviços web, lidar com requisições HTTP, conectar com bancos de dados e usar as ferramentas que o Spring oferece.

### `Atividade 02-09-2025`

Este projeto é uma API RESTful que gerencia informações de `Leads` e `Gêneros`. Eu usei o Spring Boot para criar os endpoints, o Spring Data JPA para a persistência de dados e o Flyway para gerenciar as migrações do banco de dados. É um projeto bem completo para praticar o desenvolvimento de APIs.

**O que eu aprendi/apliquei aqui:**

-   **Estrutura de um projeto Spring Boot:** Como organizar as classes, controladores, serviços e repositórios.
-   **Entidades e DTOs:** Como modelar os dados (`Lead`, `Genero`) e como usar Data Transfer Objects (`DadosCadastroLead`, `DadosListagemLead`, `GeneroCadastro`) para receber e enviar informações de forma segura e validada.
-   **Validações:** Usei anotações do `jakarta.validation` para garantir que os dados de entrada estejam corretos (por exemplo, `@NotBlank`, `@Email`, `@Pattern`). Isso é crucial para a robustez da API.
-   **Spring Data JPA:** Facilita muito a interação com o banco de dados. Eu não preciso escrever SQL na mão para operações básicas como salvar, buscar ou deletar dados. As interfaces `LeadRepository` e `GeneroRepository` cuidam disso para mim.
-   **Controladores REST:** Criei `LeadController` e `GeneroController` para expor os endpoints da API. O `HelloController` foi um bom ponto de partida para testar se tudo estava funcionando.
-   **Migrações de Banco de Dados com Flyway:** Os arquivos `V1_create-table-lead.sql`, `V1_create-table-generos.sql` e outros em `src/main/resources/db/migration` mostram como eu gerenciei as alterações no esquema do banco de dados de forma versionada. Isso é super importante em projetos reais!

### `Atividade 28-08-2025`

Essa é uma versão anterior ou um projeto similar ao de 02-09-2025, focando também em uma API. Pelo que vi, ela também tem classes para `Lead` e `Genero`, e controladores. Provavelmente, foi onde comecei a explorar esses conceitos de API com Spring Boot, antes de adicionar mais funcionalidades e refinamentos.

**Diferenças/Evolução:**

-   Parece ser uma versão mais inicial, com menos arquivos de migração de banco de dados e talvez menos funcionalidades implementadas nos controladores.
-   É interessante ver como o projeto evoluiu de uma data para outra, adicionando mais complexidade e boas práticas.

## Partes (Exercícios de Lógica e Programação Java)

As pastas `Parte1` a `Parte6` contêm diversos exercícios que eu resolvi para consolidar meus conhecimentos em Java. Cada pasta representa um conjunto de desafios com foco em diferentes aspectos da programação.

### `Parte1`

Nesta seção, eu pratiquei conceitos mais básicos de Java e lógica de programação. Os exercícios incluem:

-   `AnoBissexto.java`: Verificar se um ano é bissexto.
-   `AprovacaoDoAluno.java`: Calcular a média de um aluno e verificar sua aprovação.
-   `CalculoImc.java`: Calcular o Índice de Massa Corporal (IMC).
-   `ConversorDeMoeda.java`: Converter valores entre diferentes moedas.
-   `LoginSimples.java`: Implementar um sistema de login básico.
-   `MaiorNumero.java`: Encontrar o maior entre alguns números.
-   `Media.java`: Calcular a média de um conjunto de números.
-   `ParOuImpar.java`: Verificar se um número é par ou ímpar.
-   `PositivoNegativoZero.java`: Determinar se um número é positivo, negativo ou zero.
-   `SomaSimples.java`: Realizar uma soma simples.

Esses exercícios me ajudaram a fixar a sintaxe básica do Java, o uso de condicionais (`if/else`), operadores e entrada/saída de dados.

### `Parte2`

Aqui, o foco foi em estruturas de repetição (`loops`) e algoritmos um pouco mais elaborados:

-   `AdvinheONumero.java`: Um jogo simples de adivinhação de números.
-   `Contagem10.java`: Contar de 1 a 10 (ou similar).
-   `ContagemDeParesEImpares.java`: Contar números pares e ímpares em um intervalo.
-   `Fatorial.java`: Calcular o fatorial de um número.
-   `MaiorEmenor.java`: Encontrar o maior e o menor número em uma sequência.
-   `NumerosPrimos.java`: Verificar e listar números primos.
-   `SequenciaFibonacci.java`: Gerar a sequência de Fibonacci.
-   `SomaComWhile.java`: Realizar somas usando o loop `while`.
-   `Tabuada.java`: Gerar a tabuada de um número.
-   `VerificadorDeSenha.java`: Implementar um verificador de senha com algumas regras.

Esses exercícios foram ótimos para praticar `for` e `while` loops, e desenvolver um pouco mais a lógica de algoritmos.

### `Parte3`

Nesta parte, eu explorei mais o uso de condicionais e a tomada de decisões em programas:

-   `CalculadoraSimples.java`: Uma calculadora que realiza operações básicas.
-   `Cardapio.java`: Simular um sistema de cardápio com opções.
-   `DiaDaSemana.java`: Dado um número, retornar o dia da semana correspondente.
-   `EstacoesDoAno.java`: Dado uma data, identificar a estação do ano.
-   `VogalOuConsoante.java`: Verificar se um caractere é vogal ou consoante.

O foco aqui foi em `if/else if/else` e `switch-case` para controlar o fluxo do programa.

### `Parte4`

Esta seção foi dedicada ao estudo de `Arrays` (vetores) em Java:

-   `AdivinheONumero.java`: Uma versão do jogo de adivinhação, talvez usando arrays para armazenar tentativas.
-   `ContarParesEImpares.java`: Contar pares e ímpares em um vetor.
-   `LerEImprimirVetor.java`: Ler elementos para um vetor e imprimi-los.
-   `MaiorElementoDoVetor.java`: Encontrar o maior elemento em um vetor.
-   `MaiorEMenor.java`: Encontrar o maior e o menor em um vetor.
-   `MediaDoVetor.java`: Calcular a média dos elementos de um vetor.
-   `SomaDosElementos.java`: Somar todos os elementos de um vetor.
-   `VetorInvertido.java`: Inverter a ordem dos elementos de um vetor.

Foi fundamental para entender como armazenar e manipular coleções de dados de forma eficiente.

### `Parte5`

Nesta parte, eu me aprofundei em `Matrizes` (arrays bidimensionais):

-   `ContarValorNaMatriz.java`: Contar ocorrências de um valor em uma matriz.
-   `JogoDaVelha.java`: Implementar um jogo da velha simples.
-   `MaiorValorDaMatriz.java`: Encontrar o maior valor em uma matriz.
-   `MatrizTransposta.java`: Calcular a matriz transposta.
-   `PrencherEImprimirMatriz.java`: Preencher e imprimir uma matriz.
-   `SomaDaDiagonalPrincipal.java`: Somar os elementos da diagonal principal de uma matriz.
-   `SomaDeLinhaEspecifica.java`: Somar os elementos de uma linha específica da matriz.
-   `SomaDeMatrizes.java`: Somar duas matrizes.
-   `SomaTotalDaMatriz.java`: Somar todos os elementos de uma matriz.
-   `VerificarMatrizIdentidade.java`: Verificar se uma matriz é uma matriz identidade.

Trabalhar com matrizes me ajudou a pensar em problemas com múltiplas dimensões e a usar loops aninhados.

### `Parte6`

Finalmente, nesta seção, eu explorei o conceito de `Funções` (métodos) em Java, que é essencial para organizar o código e torná-lo reutilizável:

-   `CadastroDeAlunosSimplificado.java`: Um sistema simples de cadastro de alunos, provavelmente usando funções para diferentes operações.
-   `FuncaoDeFatorial.java`: Implementar a função de cálculo de fatorial.
-   `FuncaoParaMediaDeValor.java`: Criar uma função para calcular a média.
-   `FuncaoParaMaiorValor.java`: Desenvolver uma função para encontrar o maior valor.
-   `FuncaoParaVerificarPrimo.java`: Criar uma função para verificar se um número é primo.

Essa parte foi crucial para entender a modularização do código e a importância de dividir problemas grandes em funções menores e mais gerenciáveis.

## Como Rodar os Projetos

### Projetos Spring Boot (Atividades)

Para rodar os projetos das pastas `Atividade 02-09-2025` e `Atividade 28-08-2025`:

1.  **Pré-requisitos:** Certifique-se de ter o Java Development Kit (JDK) instalado (versão 17 ou superior, geralmente) e o Maven.
2.  **Navegar até a pasta do projeto:** Por exemplo, `cd Repositorio-Prova-Basica/Atividade\ 02-09-2025/api`.
3.  **Compilar e Rodar:**
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```
    A API estará disponível em `http://localhost:8080` (ou a porta configurada no `application.properties`).

### Exercícios Java (Partes)

Para rodar os exercícios das pastas `Parte1` a `Parte6`:

1.  **Pré-requisitos:** Apenas o JDK instalado.
2.  **Navegar até a pasta do exercício:** Por exemplo, `cd Repositorio-Prova-Basica/Parte1/src`.
3.  **Compilar e Executar:** Para um arquivo como `SomaSimples.java`:
    ```bash
    javac SomaSimples.java
    java SomaSimples
    ```
    Você pode precisar ajustar o caminho se estiver rodando de um diretório diferente.

## Conclusão

Este repositório é um reflexo da minha jornada de aprendizado em programação Java e desenvolvimento de APIs. Cada arquivo e cada pasta representam um desafio superado e um novo conceito aprendido. Espero que ele seja útil para quem estiver começando ou para quem quiser ver um pouco do meu trabalho!

