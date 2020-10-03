package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;

public class DslPage {

    WebDriver navegador;

    public DslPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public void choose(String linkTest) {
        navegador.findElement(By.linkText(linkTest)).click();
    }

    public void select(String xpath) {
        navegador.findElement(By.xpath(xpath)).click();
    }

    public void register(String id_field, String text) {
        navegador.findElement(By.id(id_field)).sendKeys(text);
    }

    public void confirm(String css) {
        navegador.findElement(By.cssSelector(css)).click();
    }

    public void fill(String id) {
        navegador.findElement(By.id(id)).click();
    }

    public void pay(String classname) {
        navegador.findElement(By.className(classname)).click();
    }

    public void inform(String name, String value) {
        navegador.findElement(By.name(name)).sendKeys(value);
    }


    //***********************************Validation****************************************************

    public WebElement validationProduct(String link) {
        WebElement confirMenssage = navegador.findElement(By.linkText(link));
        String menssage = confirMenssage.getText();
        assertEquals("Printed Dress", menssage);
        return confirMenssage;
    }
    public WebElement validationAddress(String xpath){
        WebElement addressCorrect = navegador.findElement(By.xpath(xpath));
        String address = addressCorrect.getText();
        assertEquals("Porto, California 90099", address);
        return addressCorrect;
    }
    public WebElement validationBuyValue(String id){
        WebElement buyValue = navegador.findElement(By.id(id));
        String value = buyValue.getText();
        assertEquals("$28.00", value);
        return buyValue;
    }
    public WebElement validationBuy(String css){
        WebElement buyDone = navegador.findElement(By.cssSelector(css));
        String buy = buyDone.getText();
        assertEquals("Your order on My Store is complete.", buy);
        return buyDone;
    }
}
