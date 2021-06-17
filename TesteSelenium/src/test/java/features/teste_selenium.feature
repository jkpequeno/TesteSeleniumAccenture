#language: pt
#encoding: utf-8

Funcionalidade: Preencher abas e enviar email

Cenário: Preencher e enviar email
Dado que estou no site tricentis
E estou na aba <atual>
E preencho os dados <dados>
E clico no botão <next>
Então devo ir para a <próximaAba> 

Exemplos:
|atual                |dados     |next      |próximaAba           |
|"Enter Vehicle Data" |"vehicle" |"vehicle" |"Enter Insurant Data"|
|"Enter Insurant Data"|"insurant"|"insurant"|"Enter Product Data" |
|"Enter Product Data" |"product" |"product" |"Select Price Option"|
|"Select Price Option"|"price"   |"price"   |"Send Quote"         |