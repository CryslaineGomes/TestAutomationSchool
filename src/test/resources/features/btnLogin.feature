Feature: botao Login

  Scenario: validar que o nome do botão Login esteja correto
    Given que o usuário esteja na página PHPTRAVELS
    When localizar o botao Login
    Then validar que o nome do botão Login esteja correto

  Scenario:  validar que o botão Login esteja visível
    Given que o usuário esteja na página PHPTRAVELS
    When localizar o botao Login
    Then validar que o botao Login esteja visivel

  Scenario: clicar no botao Login
    Given que o usuário esteja na página PHPTRAVELS
    When clicar no botao Login
    Then devera ser redirecionado a outra url Login

  Scenario: validar a fonte do botao Login
    Given que o usuário esteja na página PHPTRAVELS
    When localizar o botao Login
    Then validar a fonte do botao Login

  Scenario: validar a cor botao Login
    Given que o usuário esteja na página PHPTRAVELS
    When localizar o botao Login
    Then validar a cor do botao Login


