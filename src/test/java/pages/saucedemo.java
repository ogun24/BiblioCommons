package pages;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.configurationReader;

public class saucedemo extends BrowserUtils {

    public saucedemo(){PageFactory.initElements(driver, this); }
    Faker faker = new Faker();

    @FindBy(id = "user-name")
    private WebElement username;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "login-button")
    private WebElement loginbutton;
    @FindBy (id = "add-to-cart-sauce-labs-bike-light")
    private WebElement addtocart;
    @FindBy (id = "shopping_cart_container")
    private WebElement displaycart;
    @FindBy(id = "checkout")
    private WebElement checkout;
    @FindBy (id = "first-name")
    private WebElement firstname;
    @FindBy(id = "last-name")
    private WebElement lastname;
    @FindBy(id = "postal-code")
    private WebElement postalcode;
    @FindBy(id = "continue")
    private WebElement next;
    @FindBy(id = "finish")
    private WebElement finish;
    @FindBy(xpath = "//span[.='Checkout: Complete!']")
    public WebElement title;

    public void setUsername(){
        username.sendKeys(configurationReader.getProperties("userName"));
    }
    public void setPassword(){
        password.sendKeys(configurationReader.getProperties("password"));
    }

    public void setLoginbutton(){
        loginbutton.click();
    }
public void setAddtocart(){
        addtocart.click();
}
public void setDisplaycart(){
        displaycart.click();
}
public void setCheckout(){
        checkout.click();
}
public void setFirstname(){

       firstname.sendKeys(faker.name().name());
}
public void setLastname(){
        lastname.sendKeys(faker.name().lastName());
}
public void setPostalcode(){
        postalcode.sendKeys(faker.address().zipCode());
}
public void setNext(){
        next.click();
}
public void setFinish(){
        finish.click();

    }
    public void setTitle(String actual){
        String actuall = title.getText();

    }
}
