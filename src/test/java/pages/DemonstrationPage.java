package pages;

import elements.DemonstrationElements;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DemonstrationPage extends DemonstrationElements {
    private WebDriver driver;
    private WebDriverWait wait;


    public DemonstrationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void acessarSite() {
        Actions action = new Actions(driver);
        driver.manage().window().maximize();
        driver.get("https://phptravels.com/demo");
    }

    //feature Sign Up
    //cenario 1
    public void validarExibSignUp() {
        Assertions.assertTrue(btnSignUp.isDisplayed());
    }

    public void validarNomeSignUp() {
        String buttonText = btnSignUp.getText();
        Assertions.assertEquals("Sign Up", buttonText);
        driver.quit();
    }

    //cenario 2
    public void validarSignUpEstjaVisível() {
        Actions action = new Actions(driver);
        driver.manage().window().maximize();
        Assertions.assertTrue(btnSignUp.isDisplayed());
        driver.quit();
    }

    //cenario 3
    public void clicar_no_botao_Sign_Up() {
        btnSignUp.click();
    }

    public void urlSignUp() {

        Set<String> aba = driver.getWindowHandles();
        List<String> abasAbertas = new ArrayList<>(aba);
        driver.switchTo().window(abasAbertas.get(1));

        Assertions.assertEquals("https://app.phptravels.com/signup",driver.getCurrentUrl());

        driver.quit();
    }

    //cenario 4
    public void getFonteBotaoSignUp () {
        Assertions.assertTrue(btnSignUp.getCssValue("font-family").contains("Inter Medium"),
                "Fonte incorreta! Esperado: Inter Medium, encontrado: " + btnSignUp.getCssValue("font-family"));
        driver.quit();
    }
    //cenario 5
    public void getCorBotaoSignUp () {

        String corBotaoHex = Color.fromString(btnSignUp.getCssValue("background-color")).asHex();
        Assertions.assertEquals("#f8f9fa", corBotaoHex, "A cor do botão está incorreta!");
        driver.quit();
    }

    //feature Login
    //cenario 1
    public void validarExibLogin() {
        Assertions.assertTrue(btnLogin.isDisplayed());
    }

    public void validarNomeLogin() {
        String buttonText = btnLogin.getText();
        Assertions.assertEquals("Login", buttonText);
        driver.quit();
    }

    //cenario 2
    public void validarLoginEstjaVisível() {
        Actions action = new Actions(driver);
        driver.manage().window().maximize();
        Assertions.assertTrue(btnLogin.isDisplayed());
        driver.quit();
    }

    //cenario 3
    public void clicar_no_botao_Login () {
        btnLogin.click();
    }

    public void urlLogin () {

        Set<String> aba = driver.getWindowHandles();
        List<String> abasAbertas = new ArrayList<>(aba);
        driver.switchTo().window(abasAbertas.get(1));

        Assertions.assertEquals("https://app.phptravels.com/login",driver.getCurrentUrl());

        driver.quit();
    }

    //cenario 4
    public void getFonteBotaoLogin () {
        Assertions.assertTrue(btnLogin.getCssValue("font-family").contains("Inter Medium"),
                "Fonte incorreta! Esperado: Inter Medium, encontrado: " + btnSignUp.getCssValue("font-family"));
        driver.quit();
    }
    //cenario 5
    public void getCorBotaoLogin () {

        String corBotaoHex = Color.fromString(btnLogin.getCssValue("background-color")).asHex();
        Assertions.assertEquals("#0052e7", corBotaoHex, "A cor do botão está incorreta!");
        driver.quit();
    }

    //feature Facebook
    //cenario 1
    public void validarExibFacebook() {
        Assertions.assertTrue(btnFacebook.isDisplayed());
    }

    public void getCorFonteFacebook () {

        String corFonteHex = Color.fromString(btnFacebook.getCssValue("color")).asHex();
        Assertions.assertEquals("#0b1f45", corFonteHex, "A cor da fonte está incorreta!");
        driver.quit();

    }

    //cenario 2
    public void validarFacebookEstjaVisível() {
        Actions action = new Actions(driver);
        driver.manage().window().maximize();
        Assertions.assertTrue(btnFacebook.isDisplayed());
        driver.quit();
    }

    //cenario 3
    public void clicar_no_botao_Facebook() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnFacebook);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnFacebook));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnFacebook);
    }


    public void urlFacebook() {

        Set<String> aba = driver.getWindowHandles();
        List<String> abasAbertas = new ArrayList<>(aba);
        driver.switchTo().window(abasAbertas.get(1));

        Assertions.assertEquals("https://www.facebook.com/phptravels/",driver.getCurrentUrl());

        driver.quit();
    }

    //cenario 4
    public void getFonteBotaoFacebook () {
        Assertions.assertTrue(btnFacebook.getCssValue("font-family").contains("Inter Medium"),
                "Fonte incorreta! Esperado: Inter Medium, encontrado: " + btnFacebook.getCssValue("font-family"));
        driver.quit();
    }
    //cenario 5
    public void getCorBotaoFacebook () {

        String corBotaoHex = Color.fromString(btnFacebook.getCssValue("background-color")).asHex();
        Assertions.assertEquals("#ebeff3", corBotaoHex, "A cor do botão está incorreta!");
        driver.quit();
    }

    //feature Talk To Sales TalkToSales
    //cenario 1
    public void validarExibTalkToSales() {
        Assertions.assertTrue(btnTalkToSales.isDisplayed());
    }

    public void validarNomeTalkToSales() {
        String buttonText = btnTalkToSales.getText();
        Assertions.assertEquals("Talk To Sales", buttonText);
        driver.quit();
    }

    //cenario 2
    public void validarTalkToSalesEstjaVisível() {
        Actions action = new Actions(driver);
        driver.manage().window().maximize();
        Assertions.assertTrue(btnTalkToSales.isDisplayed());
        driver.quit();
    }

    //cenario 3
    public void clicar_no_botao_Talk_To_Sales () {
        btnTalkToSales.click();
    }

    public void urlTalkToSales () {

        Set<String> aba = driver.getWindowHandles();
        List<String> abasAbertas = new ArrayList<>(aba);
        driver.switchTo().window(abasAbertas.get(1));

        Assertions.assertEquals("https://calendly.com/phptravels",driver.getCurrentUrl());

        driver.quit();
    }

    //cenario 4
    public void getFonteBotaoTalkToSales () {
        Assertions.assertTrue(btnTalkToSales.getCssValue("font-family").contains("Inter Medium"),
                "Fonte incorreta! Esperado: Inter Medium, encontrado: " + btnTalkToSales.getCssValue("font-family"));
        driver.quit();
    }
    //cenario 5
    public void getCorBotaoTalkToSales () {

        String corBotaoHex = Color.fromString(btnTalkToSales.getCssValue("background-color")).asHex();
        Assertions.assertEquals("#000000", corBotaoHex, "A cor do botão está incorreta!");
        driver.quit();
    }

    //feature Pricing
    //cenario 1
    public void validarExibPricing() {
        Assertions.assertTrue(btnPricing.isDisplayed());
    }

    public void validarNomePricing() {
        String buttonText = btnPricing.getText();
        Assertions.assertEquals("Pricing", buttonText);
        driver.quit();
    }

    //cenario 2
    public void validarPricingEstjaVisível() {
        Actions action = new Actions(driver);
        driver.manage().window().maximize();
        Assertions.assertTrue(btnPricing.isDisplayed());
        driver.quit();
    }

    //cenario 3
    public void getCorFontePricing() {

        String corFonteHex = Color.fromString(btnPricing.getCssValue("color")).asHex();
        Assertions.assertEquals("#FFFFFF", corFonteHex, "A cor da fonte está incorreta!");
        driver.quit();
    }

    //cenario 4
    public void getFonteBotaoPricing () {
        Assertions.assertTrue(btnPricing.getCssValue("font-family").contains("Inter Medium"),
                "Fonte incorreta! Esperado: Inter Medium, encontrado: " + btnPricing.getCssValue("font-family"));
        driver.quit();
    }
    //cenario 5
    public void getCorBotaoPricing () {

        String corBotaoHex = Color.fromString(btnPricing.getCssValue("background-color")).asHex();
        Assertions.assertEquals("#000000", corBotaoHex, "A cor do botão está incorreta!");
        driver.quit();
    }

}







