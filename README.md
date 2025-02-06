# Projeto de Automação - MJV School  

Este repositório contém a automação de testes realizada como parte do desafio final do curso de automação da MJV School. O projeto utiliza Selenium WebDriver, Page Factory e Cucumber para validar funcionalidades do site [PHP Travels](https://phptravels.com/demo).  

## 📌 Tecnologias Utilizadas  
- **Linguagem**: Java  
- **Ferramenta de Testes**: Selenium WebDriver  
- **Gerenciador de Dependências**: Maven  
- **Padrão de Projeto**: Page Factory  
- **IDE**: IntelliJ IDEA  

## 🔍 Funcionalidades Testadas  
Foram automatizados cenários de teste para as seguintes funcionalidades:  
1. **Sign Up** (Cadastro)  
2. **Login**  
3. **Facebook Link**  
4. **Talk to Sales**  
5. **Pricing**  

Cada funcionalidade conta com testes para verificar:  
✅ Exibição dos botões  
✅ Nome correto dos botões  
✅ Visibilidade dos elementos  
✅ Mudança de URL ao clicar  
✅ Fonte e cor dos botões  

## 🚀 Como Executar os Testes  
1. Abra o projeto no IntelliJ IDEA.  
2. Certifique-se de que as dependências do Maven estão instaladas corretamente.  
3. Execute os testes a partir da classe principal ou via terminal com:  
 ```sh
 mvn test

```md
## 📂 Estrutura do Projeto  

```bash
.
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── pages/                # Classes Page Object
│   │   │   ├── elements/             # Elementos mapeados da página
│   ├── test/
│   │   ├── java/
│   │   │   ├── steps/                # Definição dos passos do BDD
│   │   ├── resources/
│   │   │   ├── features/             # Arquivos .feature do Cucumber
├── pom.xml                           # Configuração do Maven e dependências
├── README.md                         # Documentação do projeto


