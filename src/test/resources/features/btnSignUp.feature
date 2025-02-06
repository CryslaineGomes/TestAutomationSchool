Feature: botao Sign Up

Scenario: validar que o nome do botão Sign Up esteja correto
Given que o usuário esteja na página PHPTRAVELS
When localizar o botao Sign Up
Then validar que o nome do botão Sign Up esteja correto

Scenario:  validar que o botão sign up esteja visível
Given que o usuário esteja na página PHPTRAVELS
When localizar o botao Sign Up
Then validar que o botao Sign Up esteja visivel

Scenario: clicar no botao Sign Up
Given que o usuário esteja na página PHPTRAVELS
When clicar no botao Sign Up
Then devera ser redirecionado a outra url Sign Up

Scenario: validar a fonte do botao Sign Up
Given que o usuário esteja na página PHPTRAVELS
When localizar o botao Sign Up
Then validar a fonte do botao Sign Up

Scenario: validar a cor botao Sign Up
Given que o usuário esteja na página PHPTRAVELS
When localizar o botao Sign Up
Then validar a cor do botao Sign Up


