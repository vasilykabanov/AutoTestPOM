package pages.computeruniverse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by yasup on 17.11.2019.
 */

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//INPUT[@id='aa-search-input']")
    public WebElement searchInput;

    @FindBy(xpath = "//INPUT[@id='serch-button']")
    public WebElement serchButton;

    @FindBy(xpath = "//*[@id=\"npacc-catalog\"]/div[2]/div[7]/div[8]/div[1]/div[2]/div[1]/a")
    public WebElement macBookMuhn2da;

    @FindBy(xpath = "//DIV[@class='product-price price-value-741451 at__productpricevalue']")
    public WebElement priceMacBookMuhn2da;

    @FindBy(xpath = "//*[@id=\"add-to-cart-button-741451\"]")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[@id=\"WA_success\"]/div[2]/input[2]")
    public WebElement toCartButton;

    @FindBy(xpath = "//*[@class='qty-input at__quantityselect']")
    public WebElement countOfProduct;

    @FindBy(xpath = "//TD[@class='subtotal at__subtotalprice']")
    public WebElement subTotalPrice;

    public void searchStringInput(String value) {
        searchInput.clear();
        searchInput.click();
        searchInput.sendKeys(value);
    }

    public void clickSearchButton() {
        serchButton.click();
    }

    public void productSearch(String searchValue) {
        this.searchStringInput(searchValue);
        this.clickSearchButton();
    }

    public void selectCountOfProductByValue(String value) {
        countOfProduct.click();
        Select select = new Select(countOfProduct);
        select.selectByValue(value);
    }
}
