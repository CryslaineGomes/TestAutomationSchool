Feature: botao Pricing

  Scenario: validar que o nome do botão Pricing esteja correto
    Given que o usuário esteja na página PHPTRAVELS
    When localizar o botao Pricing
    Then validar que o nome do botão Pricing esteja correto

  Scenario: validar que o botão Pricing esteja visível
    Given que o usuário esteja na página PHPTRAVELS
    When localizar o botao Pricing
    Then validar que o botao Pricing esteja visivel

  Scenario: validar que o nome do botão Pricing esteja correto
    Given que o usuário esteja na página PHPTRAVELS
    When localizar o botao Pricing
    Then validar que a cor da fonte do botão Pricing esteja correto

  Scenario: validar a fonte do botao Pricing
    Given que o usuário esteja na página PHPTRAVELS
    When localizar o botao Pricing
    Then validar a fonte do botao Pricing

  Scenario: validar a cor botao Pricing
    Given que o usuário esteja na página PHPTRAVELS
    When localizar o botao Pricing
    Then validar a cor do botao Pricing


