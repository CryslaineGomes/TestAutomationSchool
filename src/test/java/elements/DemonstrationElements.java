package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemonstrationElements {

    @FindBy(xpath = "//a[@href='https://app.phptravels.com/signup' and contains(@class, 'btn') and contains(., 'Sign Up')]")
    public WebElement btnSignUp;

    @FindBy(xpath = "//a[@class='btn btn-primary text-white rounded-1 m-1 w-100 fs-6 px-0 fw-100 waves-effect' and @href='https://app.phptravels.com/login']")
    public WebElement btnLogin;

    @FindBy(xpath = "//a[@class='bg-light col-2 rounded-5 waves-effect' and @href='https://www.facebook.com/phptravels/']")
    public WebElement btnFacebook;

    @FindBy(xpath = "//a[@class='btn rounded-1 w-100 text-capitalize fs-6 px-0 fw-100 text-dark d-flex text-white waves-effect' and @href='https://calendly.com/phptravels']")
    public WebElement btnTalkToSales;

    @FindBy(xpath = "//a[@href='https://phptravels.com/pricing' and contains(@class, 'nav-link text-white')]")
    public WebElement btnPricing;

}
