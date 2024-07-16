# Sistema de Saque Bancário

Este projeto Java foi desenvolvido para simular operações de saque em uma conta bancária, aplicando conceitos de exceções personalizadas para tratamento de erros específicos como saldo insuficiente ou limite de saque excedido. Implementado como parte do aprendizado em programação Java, utiliza Java 21 e foi desenvolvido no IntelliJ IDEA.

## Descrição do Projeto

O projeto consiste em um programa Java para realizar operações de saque em uma conta bancária, seguindo as seguintes diretrizes:

1. ### Cadastro de Conta Bancária:
   - Permite ao usuário inserir dados como número da conta, titular da conta, saldo inicial e limite de saque.
2. ### Saque na Conta Bancária:
   - Após o cadastro, o usuário pode realizar saques na conta bancária, verificando se o valor do saque não excede o saldo disponível nem ultrapassa o limite de saque estabelecido.
3. ### Tratamento de Exceções:
   - Utiliza exceções personalizadas (InsufficientBalanceException e WithdrawLimitExceededException) para indicar erros específicos durante as operações de saque.

## Funcionalidades Implementadas

- **Classe `Account`:** Representa uma conta bancária com métodos para depositar, sacar e consultar saldo.
- **Exceções Personalizadas:** `InsufficientBalanceException` é lançada quando o saldo na conta é insuficiente para o saque solicitado. `WithdrawLimitExceededException` é lançada quando o valor do saque excede o limite estabelecido.
- **Interface de Usuário por Console:** Interage com o usuário por meio de entradas e saídas no console, permitindo o cadastro de conta e operações de saque.

## Tecnologias Utilizadas

- Java 21
- IntelliJ IDEA

## Como Executar

1. Clone o repositório para o seu ambiente local.
2. Abra o projeto no IntelliJ IDEA.
3. Execute o programa a partir do método `main` na classe `Main`.

## Exemplo de Uso

Ao iniciar o programa, siga as instruções apresentadas no console para cadastrar uma conta bancária informando número da conta, titular, saldo inicial e limite de saque. Após o cadastro, insira o valor desejado para saque. O programa irá verificar se o saque é válido (dentro do limite e com saldo suficiente) e exibirá o saldo atualizado após o saque realizado com sucesso.
