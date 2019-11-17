package computeruniverseTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.computeruniverse.MainPage;

/**
 * Created by yasup on 17.11.2019.
 */
public class FirstTest extends BaseTest {

    @Before
    public void init() {
        BaseTest.driver.get(BaseTest.baseURL);
    }

    MainPage mainPage = new MainPage(BaseTest.driver);

    @Test
    public void firstTest() throws InterruptedException {
        mainPage.productSearch("macbook pro");
        scrollIntoView(mainPage.macBookMuhn2da);
        mainPage.macBookMuhn2da.click();
        String priceMuhn2da = mainPage.priceMacBookMuhn2da.getText();
        mainPage.addToCartButton.click();
        mainPage.toCartButton.click();
        Assert.assertEquals(priceMuhn2da, BaseTest.driver.findElement(By.xpath("//DIV[@class='product-unit-price']")).getText());
        Assert.assertEquals(BaseTest.driver.findElement(By.xpath("//DIV[@class='product-unit-price']")).getText(), BaseTest.driver.findElement(By.xpath("//TD[@class='subtotal at__subtotalprice']")).getText());
        mainPage.selectCountOfProductByValue("2");
        waitForVisibilityElement(mainPage.subTotalPrice);

    }
}
