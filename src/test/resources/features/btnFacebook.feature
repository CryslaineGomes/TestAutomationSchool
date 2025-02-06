Feature: botao Facebook

  Scenario: validar que o nome do botão Login esteja correto
    Given que o usuário esteja na página PHPTRAVELS
    When localizar o botao Facebook
    Then validar que a cor da fonte do botão Facebook esteja correto

  Scenario:  validar que o botão Login esteja visível
    Given que o usuário esteja na página PHPTRAVELS
    When localizar o botao Facebook
    Then validar que o botao Facebook esteja visivel

  Scenario: clicar no botao Sign Up
    Given que o usuário esteja na página PHPTRAVELS
    When clicar no botao Facebook
    Then devera ser redirecionado a outra url Facebook

  Scenario: validar a fonte do botao Sign Up
    Given que o usuário esteja na página PHPTRAVELS
    When localizar o botao Facebook
    Then validar a fonte do botao Facebook

  Scenario: validar a cor botao Sign Up
    Given que o usuário esteja na página PHPTRAVELS
    When localizar o botao Facebook
    Then validar a cor do botao Facebook


