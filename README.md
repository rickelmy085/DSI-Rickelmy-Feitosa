# Desenvolvimento de Software I
Aulas de Desenvolvimento de Software I com o professor João Siles utilizando Java

# 📃 Aulas de DS!
Aulas de Desenvolvimento de Software I utilizando java

# Aula 02 - Iniciando Variaveis 📈

## **1 - Criação de arquivo** 📝
No terminal do Vscode (```ctrl + '```), digite esses comandos para ele identificar seu arquivo e sua pasta:
```java
cd [nome da pasta] // navega pelas pastas, identificando-a
javac .\Main.java // "javac" serve para compilar o codigo
java .\Main.java // roda o codigo
```
## 2 - Regras do Java / resumo da aula⚒️

1 - Nessa aula, eu aprendi como o java diferencia variáveis, visto no exemplo abaixo:
```java
1 == 1 (um é igual a um?)
1 == "1" (um é igual a un?) // aqui ele so analisa o caractere
1 === "1' (um é exatamente igual a un?) // aqui ele analisa o tipo de variável q ele é 
```

2 - Aprendemos também a juntar strings e vimos o ```.concat```, como visto no projeto da aula 2.

# Aula 01 - Iniciando Java ✅

##  Configurando a máquina ⚙️

1. **Instalação do JDK**: Instalei o Java da [Adoptium (Temurin)](https://adoptium.net/)
2. **Configuração no VS Code**:
   - Instalei o *Extension Pack for Java* da Microsoft
   - Configurei o path do Vscode para reconhecer o JDK da Adoptium nas configurações  `java.jdt.ls.java.home`

## Regras do Java ⚒️

- **Letras maiúsculas**: O Java diferencia as letras maiúsculas de minúsculas, onde o `Main` (ou o nome do arquivo) precisa ser maiúsculo
- **Nomes dos Arquivos**: O nome do arquivo deve ser exatamente igual ao nome da classe pública (ex: `Main.java` para a classe `Main`).

## Explicação do Código  

Sobre o código `Main.java`:

```java
package aula01; //define q pertence a pasta aula01

public  class  Main {  //ca
// racteriza o arquivo, onde declara sua classe e seu nome (main)
	public  static  void  main(String[] args) {
		System.out.println("Hello World"); //exibe a frase na tela
	}
}
```
## Configurando o git ⚙️

1. **Instalando o GitBash**: Clique no [Git](https://git-scm.com/install/windows);
2. **Comandos do GitBash**: 
```
git config --global user.name  
git config --global user.email 
git clone 
code . 
ls
```

Pascal case - NomeVariavel //
Camel case - nomeVariavel // (para variaveis)
Snake case - nome_variavel | NOME_VARIAVEL // (para constantes)
Kebab case - nome-variavel | NOME_VARIAVEL 
// variaveis totalmente maiusculas são chamadas de screaming 

## Operadores novos que vimos
|| -> ou
&& -> e

## Tipos de dados em Java
**float e double**
Os tipos de dados float e double podem armazenar números fracionários. 
Exemplo de ponto flutuante
```java
	float myNum = 5.75f;
	System.out.println(myNum);
```
Exemplo de double
```java
	double myNum = 19.99d;
	System.out.println(myNum);
```
é mais seguro utilizá-lo doublepara a maioria dos cálculos, pois ele têm uma precisão de cerca de 16 dígitos. O float vai ate 6 a 7 dígitos. 
**Números científicos**
Um número de ponto flutuante também pode ser um número científico com um "e" para indicar a potência de 10: 
```java
	float f1 = 35e3f;
	double d1 = 12E4d;
	System.out.println(f1);
	System.out.println(d1);
```
**char**
O char tipo de dados é usado para armazenar um único caractere. 
```java
	char myGrade = 'B';
	System.out.println(myGrade);
```
**String**
O Stringtipo de dados é usado para armazenar uma sequência de caracteres (texto). 
```java
	String greeting = "Hello World";
	System.out.println(greeting);
```
# Aula 03 - Variaveis 

1. Temos varios tipos de variaveis
	- String - Texto
	- int - Número inteiro
	- float - Número decimal de ate 32 bits
	- double - Número deciaml de ate 64 bits(Mais utilizado)
	- char - Armazena apenas um caracter, como 'a' ou 'A'
	- boolean - Verdadeiro(true) ou falso(false)

2. Como declarar?
	- Escolha um tipo (como intou String)
	- Dê um nome à variável (como x, age, ou name).
	- Opcionalmente, atribua um valor a ele usando=
```java
	int age = 16;
	String name = "Rickelmy";
```

# Aula 04 - Exemplo de variaveis
Nos apenas fizemos um codigo brincado com os tipos de variaveis 

# Aula 05 - Casting
Significa converter um tipo de dado em outro. Transformamos um **int** em um **double**.
Mas existem 2 tipos de converte eles
**Ampliação de tamanho de fonte (automática)** - conversão de um tamanho de fonte menor para um tamanho maior byte-> short-> char-> int- long> - float> ->double

**Redução de tamanho de fonte (manual)** - converter um tipo de letra maior para um tamanho menor
double-> float-> long-> int-> char-> short->byte
exemplos: 
```java
	int myAge = 9;
	double myDouble = (myAge);
```
E tambem temos assim, nos colocamos o tipo antes dentro dos ():
```java
	double myDouble = 6.767;
	int myInt = (int) myDouble;
``` 
# Aula 06 - If e else
O if(Se) precisa que sua condição seja true ou false para funcionar, e o else(Se não) vem depois caso a condição não seja atendida
```java
	if (condição) {
    // Código executado se a condição for verdadeira
	} else {
    // Código executado se a condição for falsa
	}
```

# Aula 07 
Aprendemos como Usar o Switch, For e While 

**Switch** Em vez de escrever muitos if e else no nosso código, você pode usar o switch para contorna isso
Sintaxe:
```java
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
```

Vamos usar o ex de uma cafeteria, você só pode escolher entre o Café(Coffee) e o Chá(Tea):
```java
public class Main {
  public static void main(String[] args) {
    int choice = 1;

    // 1 = Coffee
    // 2 = Tea

    switch (choice) {
      case 1:
        System.out.println("You ordered Coffee");
        break;

      case 2:
        System.out.println("You ordered Tea");
        break;

      default:
        System.out.println("Invalid choice");
    }
  }
}
```

