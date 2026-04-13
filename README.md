# Desenvolvimento de Software I
Aulas de Desenvolvimento de Software I com o professor João Siles utilizando Java

Este repositório contém exemplos simples em Java organizados por aula.

Estrutura
- [README.md](README.md)
- [aula01/Main.java](aula01/Main.java) — classe [`aula01.Main`](aula01/Main.java)  
- [aula01/Main.class](aula01/Main.class)
- [aula02/Variaveis.java](aula02/Variaveis.java) — classe [`aula02.Variaveis`](aula02/Variaveis.java)  
- [aula02/Variaveis.class](aula02/Variaveis.class)
- [aula03/Variaveis.java](aula03/Variaveis.java) — classe [`Variaveis`](aula03/Variaveis.java) (sem package)  
- [aula03/Variaveis.class](aula03/Variaveis.class)

Descrição dos arquivos
- [`aula01.Main`](aula01/Main.java) — Programa "Hello World" dentro do package `aula01`.  
- [`aula02.Variaveis`](aula02/Variaveis.java) — Demonstra concatenação de strings e conversão entre tipos.  
- [`Variaveis`](aula03/Variaveis.java) — Exemplo simples de variáveis inteiras e soma.

Como compilar e executar
- A partir da raiz do repositório (requer JDK instalado):
  - Para a aula01 (package):
    - Compilar: javac aula01/Main.java
    - Executar: java -cp . aula01.Main
  - Para a aula02 (package):
    - Compilar: javac aula02/Variaveis.java
    - Executar: java -cp . aula02.Variaveis
  - Para a aula03 (sem package):
    - Compilar: javac aula03/Variaveis.java
    - Entrar na pasta ou executar a partir da raiz:
      - cd aula03
      - javac Variaveis.java
      - java Variaveis
    - Ou: javac aula03/Variaveis.java && java -cp . Variaveis

Observações
- Arquivos .class já compilados estão incluídos, mas é recomendável recompilar com sua versão do JDK se necessário.  
- Mantenha o package declarado nos arquivos Java consistente com a estrutura de pastas para evitar erros de execução.  
- Links para os arquivos e classes estão acima para referência rápida.