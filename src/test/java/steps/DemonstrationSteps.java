package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DemonstrationPage;

public class DemonstrationSteps {
    private WebDriver driver;
    private DemonstrationPage demonstrationPageSignUp;

    @Given("que o usuário esteja na página PHPTRAVELS")
    public void queOUsuarioEstejaNaPaginaPHPTRAVELS() {
        driver = new ChromeDriver();
        demonstrationPageSignUp = new DemonstrationPage(driver);
        demonstrationPageSignUp.acessarSite();
    }

    //feature Sign Up
    //cenario 1
    @When("localizar o botao Sign Up")
    public void localizar_o_botao_Sign_Up () {
        demonstrationPageSignUp.validarExibSignUp();}

    @Then("validar que o nome do botão Sign Up esteja correto")
    public void validar_que_o_nome_do_botão_Sign_Up_esteja_correto() {
        demonstrationPageSignUp.validarNomeSignUp();
    }

    //cenario2
    @Then ("validar que o botao Sign Up esteja visivel")
    public void validar_que_o_botao_Sign_Up_esteja_visivel () {
        demonstrationPageSignUp.validarSignUpEstjaVisível();
    }

    //cenario 3
    @When("clicar no botao Sign Up")
    public void clicar_no_botao_Sign_Up () {
        demonstrationPageSignUp.clicar_no_botao_Sign_Up();
    }

    @Then("devera ser redirecionado a outra url Sign Up")
    public void devera_ser_redirecionado_a_outra_url_Sign_Up() {
        demonstrationPageSignUp.urlSignUp();
    }

    //cenario 4
    @Then("validar a fonte do botao Sign Up")
    public void validar_a_fonte_do_botao_Sign_Up() {
        demonstrationPageSignUp.getFonteBotaoSignUp();
    }

    //cenario 5
    @Then("validar a cor do botao Sign Up")
    public void validar_a_cor_do_botao_Sign_Up() {
        demonstrationPageSignUp.getCorBotaoSignUp();
    }

    //feature Login
    //cenario 1
    @When("localizar o botao Login")
    public void localizarOBotaoLogin() {
        demonstrationPageSignUp.validarExibLogin();
    }

    @Then("validar que o nome do botão Login esteja correto")
    public void validarQueONomeDoBotaoLoginEstejaCorreto() {
        demonstrationPageSignUp.validarNomeLogin();
    }

    //cenario 2
    @Then("validar que o botao Login esteja visivel")
    public void validarQueOBotaoLoginEstejaVisivel() {
        demonstrationPageSignUp.validarLoginEstjaVisível();
    }

    //cenario 3
    @When("clicar no botao Login")
    public void clicarNoBotaoLogin() {
        demonstrationPageSignUp.clicar_no_botao_Login();
    }

    @Then("devera ser redirecionado a outra url Login")
    public void deveraSerRedirecionadoAOutraUrlLogin() {
        demonstrationPageSignUp.urlLogin();
    }

    //cenario 4
    @Then("validar a fonte do botao Login")
    public void validarAFonteDoBotaoLogin() {
        demonstrationPageSignUp.getFonteBotaoLogin();
    }

    //cenario 5
    @Then("validar a cor do botao Login")
    public void validarACorDoBotaoLogin() {
        demonstrationPageSignUp.getCorBotaoLogin();
    }

    //feature Facebook
    //cenario 1
    @When("localizar o botao Facebook")
    public void localizarOBotaoFacebook() {
        demonstrationPageSignUp.validarExibFacebook();
    }

    @Then("validar que a cor da fonte do botão Facebook esteja correto")
    public void validarCorFonteBotaoFacebookEstejaCorreto() {
        demonstrationPageSignUp.getCorFonteFacebook();
    }

    //cenario 2
    @Then("validar que o botao Facebook esteja visivel")
    public void validarQueOBotaoFacebookEstejaVisivel() {
        demonstrationPageSignUp.validarFacebookEstjaVisível();
    }

    //cenario 3
    @When("clicar no botao Facebook")
    public void clicarNoBotaoFacebook() {
        demonstrationPageSignUp.clicar_no_botao_Facebook();
    }

    @Then("devera ser redirecionado a outra url Facebook")
    public void deveraSerRedirecionadoAOutraUrlFacebook() {
        demonstrationPageSignUp.urlFacebook();
    }

    //cenario 4
    @Then("validar a fonte do botao Facebook")
    public void validarAFonteDoBotaoFacebook() {
        demonstrationPageSignUp.getFonteBotaoFacebook();
    }

    //cenario 5
    @Then("validar a cor do botao Facebook")
    public void validarACorDoBotaoFacebook() {
        demonstrationPageSignUp.getCorBotaoFacebook();
    }

    //feature Talk To Sales
    //cenario 1
    @When("localizar o botao Talk To Sales")
    public void localizarOBotaoTalkToSales() {
        demonstrationPageSignUp.validarExibTalkToSales();
    }

    @Then("validar que o nome do botão Talk To Sales esteja correto")
    public void validarQueONomeDoBotaoTalkToSalesEstejaCorreto() {
        demonstrationPageSignUp.validarNomeTalkToSales();
    }

    //cenario 2
    @Then("validar que o botao Talk To Sales esteja visivel")
    public void validarQueOBotaoTalkToSalesEstejaVisivel() {
        demonstrationPageSignUp.validarTalkToSalesEstjaVisível();
    }

    //cenario 3
    @When("clicar no botao Talk To Sales")
    public void clicarNoBotaoTalkToSales() {
        demonstrationPageSignUp.clicar_no_botao_Talk_To_Sales();
    }

    @Then("devera ser redirecionado a outra url Talk To Sales")
    public void deveraSerRedirecionadoAOutraUrlTalkToSales() {
        demonstrationPageSignUp.urlTalkToSales();
    }

    //cenario 4
    @Then("validar a fonte do botao Talk To Sales")
    public void validarAFonteDoBotaoTalkToSales() {
        demonstrationPageSignUp.getFonteBotaoTalkToSales();
    }

    //cenario 5
    @Then("validar a cor do botao Talk To Sales")
    public void validarACorDoBotaoTalkToSales() {
        demonstrationPageSignUp.getCorBotaoTalkToSales();
    }

    //feature Pricing
    //cenario 1
    @When("localizar o botao Pricing")
    public void localizarOBotaoPricing() {
        demonstrationPageSignUp.validarExibPricing();
    }

    @Then("validar que o nome do botão Pricing esteja correto")
    public void validarQueONomeDoBotaoPricingEstejaCorreto() {
        demonstrationPageSignUp.validarNomePricing();
    }

    //cenario 2
    @Then("validar que o botao Pricing esteja visivel")
    public void validarQueOBotaoPricingEstejaVisivel() {
        demonstrationPageSignUp.validarPricingEstjaVisível();
    }

    //cenario 3
    @Then("validar que a cor da fonte do botão Pricing esteja correto")
    public void validar_que_a_cor_da_fonte_do_botão_Pricing_esteja_correto() {
        demonstrationPageSignUp.getCorBotaoPricing();
    }

    //cenario 4
    @Then("validar a fonte do botao Pricing")
    public void validarAFonteDoBotaoPricing() {
        demonstrationPageSignUp.getFonteBotaoPricing();
    }

    //cenario 5
    @Then("validar a cor do botao Pricing")
    public void validarACorDoBotaoPricing() {
        demonstrationPageSignUp.getCorBotaoPricing();
    }
}
