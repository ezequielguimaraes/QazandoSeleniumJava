# language: pt

  Funcionalidade: Receber o cupom de desconto da qazando
    Eu como usuário da qazando
    Quero receber um cupom de desconto
    Para comprar um curso com valor reduzido

    Cenario: Vizualizar código de desconto
      Dado que estou no site da qazando
      Quando eu preencho meu e-mail
      E clico em ganhar cupom
      Entao eu vejo o código de desconto
