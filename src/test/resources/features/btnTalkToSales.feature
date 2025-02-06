Feature: botao Talk To Sales

  Scenario: validar que o nome do botão Talk To Sales esteja correto
    Given que o usuário esteja na página PHPTRAVELS
    When localizar o botao Talk To Sales
    Then validar que o nome do botão Talk To Sales esteja correto

  Scenario:  validar que o botão Talk To Sales esteja visível
    Given que o usuário esteja na página PHPTRAVELS
    When localizar o botao Talk To Sales
    Then validar que o botao Talk To Sales esteja visivel

  Scenario: clicar no botao Talk To Sales
    Given que o usuário esteja na página PHPTRAVELS
    When clicar no botao Talk To Sales
    Then devera ser redirecionado a outra url Talk To Sales

  Scenario: validar a fonte do botao Talk To Sales
    Given que o usuário esteja na página PHPTRAVELS
    When localizar o botao Talk To Sales
    Then validar a fonte do botao Talk To Sales

  Scenario: validar a cor botao Talk To Sales
    Given que o usuário esteja na página PHPTRAVELS
    When localizar o botao Talk To Sales
    Then validar a cor do botao Talk To Sales


